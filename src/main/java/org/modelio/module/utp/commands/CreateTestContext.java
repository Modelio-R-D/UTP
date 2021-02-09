package org.modelio.module.utp.commands;

import java.util.Collection;
import java.util.List;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MMetamodel;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CreateTestContext extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        
        try(ITransaction tr = session.createTransaction("CreateTestContext")) {
        
            Package selectedPackage= (Package) selectedElements.get(0);
            Class testcontext;
            try {
                testcontext = session.getModel().createClass("TestContext", selectedPackage, IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCONTEXT);
        
                createAttribute("Arbiter", testcontext, module);
                createAttribute("Scheduler", testcontext, module);
        
                // Create a part for each TestComponent
                for(Classifier classifier : selectedPackage.getOwnedElement(Classifier.class)){
                    if(classifier.isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCOMPONENT)){
                        BindableInstance targetinstance = session.getModel().createBindableInstance();
                        targetinstance.setName(classifier.getName().toLowerCase());
                        targetinstance.setBase(classifier);
                        testcontext.getInternalStructure().add(targetinstance);
                        targetinstance.setInternalOwner(testcontext);
                    }
                }
        
        
                // Create a part for each Classifier available on the tested package
                for(PackageImport packageImport : selectedPackage.getOwnedPackageImport()){
                    Package importedPackage = packageImport.getImportedPackage();
        
                    for(Class classelement : importedPackage.getOwnedElement(Class.class)){
                        try {
                            BindableInstance targetinstance = session.getModel().createBindableInstance();
                            targetinstance.getExtension().add(session.getMetamodelExtensions().getStereotype(IUTPPeerModule.MODULE_NAME, UTPStereotypes.SUT_BINDABLEINSTANCE, targetinstance.getMClass()));
                            targetinstance.setName(classelement.getName().toLowerCase());
                            targetinstance.setBase(classelement);
                            testcontext.getInternalStructure().add(targetinstance);
                            targetinstance.setInternalOwner(testcontext);
                        } catch (Exception e) {
                            UTPModule.logService.error(e);
                        }
                    }
                }
        
                createDiagram(testcontext, module);
        
                for(AbstractDiagram product: selectedPackage.getProduct()){
                    if(product instanceof StaticDiagram){
                        for (IDiagramGraphic graphic : module.getModuleContext().getModelioServices().getDiagramService().getDiagramHandle(product).unmask(testcontext,0,0)){
                            if (graphic instanceof IDiagramNode){
                                ((IDiagramNode) graphic).fitToContent();
                            }
                        }
                    }
                }    
        
                module.getModuleContext().getModelioServices().getNavigationService().fireNavigate(testcontext);        
            } catch (ExtensionNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            tr.commit();
        }
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        return (selectedElements.size() == 1) && 
                ((Package) selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTSET);
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

    private static void createAttribute(String classname, Classifier classifier, IModule module) {
        IModelingSession session =  module.getModuleContext().getModelingSession();
        MMetamodel mm = module.getModuleContext().getModelioServices().getMetamodelService().getMetamodel();
        Collection< ? extends MObject> elements = session.findByAtt(mm.getMClass(Interface.class), "Name", classname);
        
        if(elements.size() > 0){
            IUmlModel model = session.getModel();
            Interface attributeType = (Interface) elements.toArray()[0];
            model.createElementImport(classifier, attributeType);
            model.createAttribute(classname.toLowerCase(),attributeType, classifier).setVisibility(VisibilityMode.PRIVATE);
        }
    }

    private static void createDiagram(Class aclass, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        MMetamodel mm = module.getModuleContext().getModelioServices().getMetamodelService().getMetamodel();
        AbstractDiagram diagram = session.getModel().createObjectDiagram(aclass.getName() + " Diagram", 
                aclass, 
                session.getMetamodelExtensions().getStereotype("collaboration", mm.getMClass(ObjectDiagram.class)));
        
        try( IDiagramHandle representation = module.getModuleContext().getModelioServices().getDiagramService().getDiagramHandle(diagram);){
        
            for(BindableInstance internalinstance : aclass.getInternalStructure()){
                representation.getDiagramNode().setProperty("stereotype", "test");
                representation.unmask(internalinstance,0,0);
            }
        
            representation.save();
            representation.close();
        
            module.getModuleContext().getModelioServices().getEditionService().openEditor(diagram);
        }
    }

}
