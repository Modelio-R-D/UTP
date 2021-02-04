/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.opaqueaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("92ec1af9-16a9-4a52-bb19-d983002b5152")
public class GetTimezoneActionOpaqueAction {
    @objid ("e51dc2c8-d251-49a9-9db6-40618dc09fdf")
    public static final String STEREOTYPE_NAME = "GetTimezoneAction_OpaqueAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("c2f63f12-15fb-4e22-86f8-a5826c0c9c5a")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link GetTimezoneActionOpaqueAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << GetTimezoneAction_OpaqueAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0d975401-b241-4533-ab61-5f0ac0ca7f12")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, GetTimezoneActionOpaqueAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << GetTimezoneAction_OpaqueAction >> then instantiate a {@link GetTimezoneActionOpaqueAction} proxy.
     * 
     * @return a {@link GetTimezoneActionOpaqueAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("f5a13f6d-6eb2-45e0-8e89-9818717a2422")
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
    @objid ("4cc33c87-9389-4595-9768-33894e9b921b")
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
    @objid ("1040066f-0998-4a8d-a027-d9e47fc429cc")
    public static GetTimezoneActionOpaqueAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (GetTimezoneActionOpaqueAction.canInstantiate(obj))
        	return new GetTimezoneActionOpaqueAction(obj);
        else
        	throw new IllegalArgumentException("GetTimezoneActionOpaqueAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c67acf1-78d1-46b4-8e32-0abb93fa5f2f")
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
    @objid ("0487c731-6beb-433c-85f8-9e1716f31e00")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("57a75135-07eb-45ba-9972-b12d4e00e7b1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2905fe85-7170-460d-9f31-42acc12e0389")
    protected GetTimezoneActionOpaqueAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("220e202a-b612-403c-9886-6974fb8a7154")
    public static final class MdaTypes {
        @objid ("48165f35-0006-45fb-824f-c13d98bdb86a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("050a5084-8916-406c-b50a-9f6fada018a9")
        private static Stereotype MDAASSOCDEP;

        @objid ("a57717e7-2281-46ac-8867-7056157ef43d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4329f983-1069-4ef8-913f-cf8ca885b2e1")
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
