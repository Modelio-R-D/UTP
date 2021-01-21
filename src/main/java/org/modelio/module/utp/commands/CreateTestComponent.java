package org.modelio.module.utp.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("4aff10b6-8bcd-4266-834d-c16b8f3745ab")
public class CreateTestComponent extends DefaultModuleCommandHandler {
    @objid ("db76af0f-6133-4425-b1e3-2e9a3add6e0a")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        
        try(ITransaction tr = session.createTransaction("CreateTestComponent")) {
        
            Package selectedPackage= (Package) selectedElements.get(0);
        
            Classifier testcomponent;
            try {
                testcomponent = session.getModel().createComponent("TestComponent", selectedPackage, IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCOMPONENT);
        
                for(AbstractDiagram product: selectedPackage.getProduct()){
                    if(product instanceof StaticDiagram){
                        module.getModuleContext().getModelioServices().getDiagramService().getDiagramHandle(product).unmask(testcomponent,0,0);
                    }
                }
        
                module.getModuleContext().getModelioServices().getNavigationService().fireNavigate(testcomponent); 
        
            } catch (ExtensionNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tr.commit();
        
        }
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @objid ("220d39a0-f89b-4473-b75e-c9f2aa19ebe4")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        return selectedElements.size()==1 &&
                                ((ModelElement)selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTSET);
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @objid ("07bef32b-9001-47d3-a8ca-1ad7902eab8c")
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

}
