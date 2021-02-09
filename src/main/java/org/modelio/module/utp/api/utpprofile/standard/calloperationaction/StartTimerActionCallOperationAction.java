/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.calloperationaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CallOperationAction} with << StartTimerAction_CallOperationAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class StartTimerActionCallOperationAction {
    public static final String STEREOTYPE_NAME = "StartTimerAction_CallOperationAction";

    /**
     * The underlying {@link CallOperationAction} represented by this proxy, never null.
     */
    protected final CallOperationAction elt;

    /**
     * Tells whether a {@link StartTimerActionCallOperationAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallOperationAction} stereotyped << StartTimerAction_CallOperationAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallOperationAction) && ((CallOperationAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, StartTimerActionCallOperationAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallOperationAction} stereotyped << StartTimerAction_CallOperationAction >> then instantiate a {@link StartTimerActionCallOperationAction} proxy.
     * 
     * @return a {@link StartTimerActionCallOperationAction} proxy on the created {@link CallOperationAction}.
     */
    public static StartTimerActionCallOperationAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CallOperationAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, StartTimerActionCallOperationAction.STEREOTYPE_NAME);
        return StartTimerActionCallOperationAction.instantiate((CallOperationAction)e);
    }

    /**
     * Tries to instantiate a {@link StartTimerActionCallOperationAction} proxy from a {@link CallOperationAction} stereotyped << StartTimerAction_CallOperationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallOperationAction
     * @return a {@link StartTimerActionCallOperationAction} proxy or <i>null</i>.
     */
    public static StartTimerActionCallOperationAction instantiate(final CallOperationAction obj) {
        return StartTimerActionCallOperationAction.canInstantiate(obj) ? new StartTimerActionCallOperationAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StartTimerActionCallOperationAction} proxy from a {@link CallOperationAction} stereotyped << StartTimerAction_CallOperationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CallOperationAction}
     * @return a {@link StartTimerActionCallOperationAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static StartTimerActionCallOperationAction safeInstantiate(final CallOperationAction obj) throws IllegalArgumentException {
        if (StartTimerActionCallOperationAction.canInstantiate(obj))
        	return new StartTimerActionCallOperationAction(obj);
        else
        	throw new IllegalArgumentException("StartTimerActionCallOperationAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        StartTimerActionCallOperationAction other = (StartTimerActionCallOperationAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CallOperationAction}. 
     * @return the CallOperationAction represented by this proxy, never null.
     */
    public CallOperationAction getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected StartTimerActionCallOperationAction(final CallOperationAction elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1a87576b-e33a-11df-9694-0027103ea5f4");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(UTPModule.getInstance() != null) {
			init(UTPModule.getInstance().getModuleContext());
		}
	}
    }

}
