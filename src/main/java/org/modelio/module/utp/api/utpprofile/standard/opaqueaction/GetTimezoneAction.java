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
 * Proxy class to handle a {@link OpaqueAction} with << GetTimezoneAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ac979bcc-dc2e-4e38-907d-686ff6573459")
public class GetTimezoneAction {
    @objid ("24993d0f-52cb-4b7d-b79f-69711b60f88c")
    public static final String STEREOTYPE_NAME = "GetTimezoneAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("c1ffba72-8448-48df-8a11-25256e6e7835")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link GetTimezoneAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << GetTimezoneAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("83a0b14c-7480-4c15-a8e3-3d1a8950639b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, GetTimezoneAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << GetTimezoneAction >> then instantiate a {@link GetTimezoneAction} proxy.
     * 
     * @return a {@link GetTimezoneAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("b4908a17-d8bc-4da3-b9f3-998b83f3e138")
    public static GetTimezoneAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.OpaqueAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, GetTimezoneAction.STEREOTYPE_NAME);
        return GetTimezoneAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link GetTimezoneAction} proxy from a {@link OpaqueAction} stereotyped << GetTimezoneAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link GetTimezoneAction} proxy or <i>null</i>.
     */
    @objid ("1538d4f6-0f79-483e-b4cd-25bf99accf31")
    public static GetTimezoneAction instantiate(final OpaqueAction obj) {
        return GetTimezoneAction.canInstantiate(obj) ? new GetTimezoneAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GetTimezoneAction} proxy from a {@link OpaqueAction} stereotyped << GetTimezoneAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link GetTimezoneAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d2de662e-01ba-4476-8a42-ae7631199cf6")
    public static GetTimezoneAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (GetTimezoneAction.canInstantiate(obj))
        	return new GetTimezoneAction(obj);
        else
        	throw new IllegalArgumentException("GetTimezoneAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("673baa81-b561-4506-914f-3a4a74c74f5f")
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
        GetTimezoneAction other = (GetTimezoneAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("1bd7be64-6482-4627-aa5c-a1fcd1084b89")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("3b1669fb-e5c3-423d-b57b-2fdd7f68dff5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0fb94033-4e39-404a-84f7-16eca41f149d")
    protected GetTimezoneAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("7431867b-bbdc-4350-adc2-3a0f7e105d79")
    public static final class MdaTypes {
        @objid ("13ca035b-973c-4219-b833-c1bab8aa3612")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4effcf7-3838-4908-9fad-3bac2bcc9674")
        private static Stereotype MDAASSOCDEP;

        @objid ("9b4a304b-bbba-45b6-86bc-24be9a05e3b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("884f364f-0ff0-496f-96f5-1bec9a91640c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6a3d2121-e33a-11df-9694-0027103ea5f4");
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
