package org.modelio.module.utp.commands;

import java.util.List;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPStereotypes;
import org.modelio.vcore.smkernel.mapi.MObject;

public class ApplyTestComponent extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(List<MObject> selectedElements, IModule module) {
        IModelingSession session = module.getModuleContext().getModelingSession();
        
        try (ITransaction tr =  session.createTransaction("ApplyTestComponent")){
        
            Classifier classifier = (Classifier) selectedElements.get(0);
            classifier.getExtension().add(session.getMetamodelExtensions().getStereotype(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCOMPONENT, classifier.getMClass()));
        
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
                selectedElements.get(0) instanceof Component &&
                !((ModelElement)selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCONTEXT) &&
                !((ModelElement)selectedElements.get(0)).isStereotyped(IUTPPeerModule.MODULE_NAME, UTPStereotypes.TESTCOMPONENT);
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
