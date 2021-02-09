package org.modelio.module.utp.commands;

import java.util.List;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.style.IStyleHandle;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CreateTestPackage extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        
        try(ITransaction tr = session.createTransaction("CreateTestPackage")) {
        
            Package testPackage = null;
            
            for(MObject element : selectedElements){
                
                Package selectedPackage = (Package) element;
                
                if(testPackage == null){
                    
                    //Create Test Package
                    MObject owner = selectedPackage.getCompositionOwner();
                    String name = selectedPackage.getName() + "Test";
                    testPackage = session.getModel().createPackage();
                    testPackage.setName(name);
                    testPackage.getExtension().add(module.getModuleContext().getModelingSession().getMetamodelExtensions()
                            .getStereotype(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTSET, selectedPackage.getMClass()));
        
                    //Attach Test Package
                    if (owner instanceof Package) { 
                        testPackage.setOwner((Package) owner); 
                    } else if (owner instanceof Project){                   
                        testPackage.setRepresented((Project) owner);
                    }
                }
        
                session.getModel().createPackageImport(testPackage, selectedPackage);
            }
            
            createClassDiagram(testPackage, module);      
            tr.commit();       
        }
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        for (MObject selectedElt : selectedElements){
            if (selectedElt instanceof Package){
                Package selectedPck = (Package) selectedElt;
                MObject owner = selectedPck.getCompositionOwner();
                return (owner != null) && 
                        ((owner instanceof Package) || (owner instanceof Project)) &&
                        (!(selectedPck.isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTSET)));
            }
        }
        return false;
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

    private void createClassDiagram(Package thepackage, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        IDiagramService ds = module.getModuleContext().getModelioServices().getDiagramService();        
        
        try (ITransaction transaction = session.createTransaction("Test Diagram"); ) {
        
            AbstractDiagram diagram = session.getModel().createClassDiagram(thepackage.getName()+" Diagram", thepackage, null);
        
            try(IDiagramHandle representation = ds.getDiagramHandle(diagram);){
        
                IDiagramDG dg = representation.getDiagramNode();
        
                for (IStyleHandle style : ds.listStyles()){
                    if (style.getName().equals("utp")){
                        dg.setStyle(style);
                        break;
                    }
                }
        
                int y = 0;
                List<IDiagramGraphic> graphics = representation.unmask(thepackage, 0 , y);
                for (IDiagramGraphic graphic : graphics){
                    if (graphic.getElement().equals(thepackage) 
                            && (graphic instanceof IDiagramNode)){
                        ((IDiagramNode) graphic).fitToContent();
                    }
        
                }
        
                for(PackageImport packageImport : thepackage.getOwnedPackageImport()){
                    y+= 100;
                    representation.unmask(packageImport, 300 , y);
                }
        
                representation.save();
                representation.close();
        
                module.getModuleContext().getModelioServices().getEditionService().openEditor(diagram);
            }
            
            transaction.commit ();        
        }
    }

}
