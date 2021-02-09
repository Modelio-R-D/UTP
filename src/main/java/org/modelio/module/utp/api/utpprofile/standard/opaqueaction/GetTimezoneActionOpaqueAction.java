/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.opaqueaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
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
 * Proxy class to handle a {@link OpaqueAction} with << GetTimezoneAction_OpaqueAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GetTimezoneActionOpaqueAction {
    public static final String STEREOTYPE_NAME = "GetTimezoneAction_OpaqueAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link GetTimezoneActionOpaqueAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << GetTimezoneAction_OpaqueAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, GetTimezoneActionOpaqueAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << GetTimezoneAction_OpaqueAction >> then instantiate a {@link GetTimezoneActionOpaqueAction} proxy.
     * 
     * @return a {@link GetTimezoneActionOpaqueAction} proxy on the created {@link OpaqueAction}.
     */
    public static GetTimezoneActionOpaqueAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.OpaqueAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, GetTimezoneActionOpaqueAction.STEREOTYPE_NAME);
        return GetTimezoneActionOpaqueAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link GetTimezoneActionOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << GetTimezoneAction_OpaqueAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link GetTimezoneActionOpaqueAction} proxy or <i>null</i>.
     */
    public static GetTimezoneActionOpaqueAction instantiate(final OpaqueAction obj) {
        return GetTimezoneActionOpaqueAction.canInstantiate(obj) ? new GetTimezoneActionOpaqueAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GetTimezoneActionOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << GetTimezoneAction_OpaqueAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link GetTimezoneActionOpaqueAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GetTimezoneActionOpaqueAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (GetTimezoneActionOpaqueAction.canInstantiate(obj))
        	return new GetTimezoneActionOpaqueAction(obj);
        else
        	throw new IllegalArgumentException("GetTimezoneActionOpaqueAction: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GetTimezoneActionOpaqueAction other = (GetTimezoneActionOpaqueAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    public OpaqueAction getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected GetTimezoneActionOpaqueAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "534b4816-e33a-11df-9694-0027103ea5f4");
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
