package org.modelio.module.utp.commands;

import java.util.List;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.vcore.smkernel.mapi.MObject;

public class ApplySUT extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        
        try(  ITransaction tr = session.createTransaction("ApplySUT");) {
        
            Instance instance = (Instance) selectedElements.get(0);
            instance.getExtension().add(session.getMetamodelExtensions().getStereotype(IUTPPeerModule.MODULE_NAME, UTPStereotypes.SUT_BINDABLEINSTANCE, instance.getMClass()));
            tr.commit();
        
        }
    }

    /**
     * This methods authorizes a command to be displayed in a defined context.
     * The commands are displayed, by default, depending on the kind of metaclass on which the command has been launched.
     */
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        return selectedElements.size()==1 &&
                selectedElements.get(0) instanceof BindableInstance &&
                !((ModelElement)selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.SUT_BINDABLEINSTANCE);
    }

    /**
     * This method specifies whether or not a command must be deactivated.
     * If the command has to be displayed (which means that the accept method has returned a positive value, it is sometimes needed to desactivate the command depending on specific constraints that are specific to the module.
     */
    @Override
    public boolean isActiveFor(List<MObject> selectedElements, IModule module) {
        return true;
    }

}
