package org.modelio.module.utp.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f28bfcd6-a5d8-40a9-b693-952aa706e41f")
public class ApplyTestContext extends DefaultModuleCommandHandler {
    @objid ("8c77a988-2aa4-4919-8971-dfd3623cbb9b")
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        
        try (ITransaction tr = session.createTransaction("ApplyTestContext");) {
             
            Class classifier = (Class) selectedElements.get(0);           
            classifier.getExtension().add(session.getMetamodelExtensions().getStereotype(UTPStereotypes.TESTCONTEXT, classifier.getMClass()));
        
            tr.commit();
        
        }
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @objid ("e9dab4ac-c15b-4fba-a695-ae7610e52182")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        return selectedElements.size()==1 &&
                (selectedElements.get(0) instanceof Class) &&
                !(selectedElements.get(0) instanceof Component) &&
                !((ModelElement)selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCONTEXT)&&
                !((ModelElement)selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCOMPONENT);
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @objid ("cc549a99-3280-44aa-9b37-55144ab6a90b")
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

}
