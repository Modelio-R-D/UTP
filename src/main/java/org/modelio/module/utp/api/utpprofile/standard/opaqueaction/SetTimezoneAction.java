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
 * Proxy class to handle a {@link OpaqueAction} with << SetTimezoneAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e7d57891-d331-4dd3-a3c4-699a0055d8fc")
public class SetTimezoneAction {
    @objid ("6ed90317-d727-4146-bd1d-720756c3f1a6")
    public static final String STEREOTYPE_NAME = "SetTimezoneAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("27a56ac3-f58f-4367-a542-23d7d331203f")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link SetTimezoneAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << SetTimezoneAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7e22692b-6c62-453d-a66e-65e92d005be1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, SetTimezoneAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << SetTimezoneAction >> then instantiate a {@link SetTimezoneAction} proxy.
     * 
     * @return a {@link SetTimezoneAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("568ece3b-bdd4-438c-884c-679abe00051f")
    public static SetTimezoneAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.OpaqueAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, SetTimezoneAction.STEREOTYPE_NAME);
        return SetTimezoneAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link SetTimezoneAction} proxy from a {@link OpaqueAction} stereotyped << SetTimezoneAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link SetTimezoneAction} proxy or <i>null</i>.
     */
    @objid ("7064e345-3be4-4e2d-834e-4768fec672e2")
    public static SetTimezoneAction instantiate(final OpaqueAction obj) {
        return SetTimezoneAction.canInstantiate(obj) ? new SetTimezoneAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SetTimezoneAction} proxy from a {@link OpaqueAction} stereotyped << SetTimezoneAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link SetTimezoneAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("16106d4f-a3ca-4529-883c-869f44146ca3")
    public static SetTimezoneAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (SetTimezoneAction.canInstantiate(obj))
        	return new SetTimezoneAction(obj);
        else
        	throw new IllegalArgumentException("SetTimezoneAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ea701d27-c336-4849-b0a2-253c52a09d93")
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
        SetTimezoneAction other = (SetTimezoneAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("bb171810-de12-4c98-a928-0757cb7da5c8")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("be7c3fcb-bcef-40e1-b21a-4a979ffe84c9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("95faeaf9-62e5-4e0a-a51f-af0076aed926")
    protected SetTimezoneAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("c8a35abe-e014-4933-aeb2-8203eb921a1c")
    public static final class MdaTypes {
        @objid ("e19b6b25-9f8f-4840-82b4-ec5d4eff3717")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("025a6884-3dff-4419-8a14-948217578ceb")
        private static Stereotype MDAASSOCDEP;

        @objid ("403b168a-d314-4c78-b421-03f7a45cbf61")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e161380f-0ec8-4952-a62c-ccf968654e77")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "715a99c1-e33a-11df-9694-0027103ea5f4");
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
