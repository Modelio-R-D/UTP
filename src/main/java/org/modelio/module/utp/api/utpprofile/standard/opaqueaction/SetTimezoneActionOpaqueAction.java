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
 * Proxy class to handle a {@link OpaqueAction} with << SetTimezoneAction_OpaqueAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c51da37f-ed1c-488b-afc8-3c085670d578")
public class SetTimezoneActionOpaqueAction {
    @objid ("9445e766-91ad-417b-86a0-b2c94485c3ba")
    public static final String STEREOTYPE_NAME = "SetTimezoneAction_OpaqueAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("36cfda76-3bd4-46c5-9620-996372d304a2")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link SetTimezoneActionOpaqueAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << SetTimezoneAction_OpaqueAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aac27348-d5a7-448b-90a3-d710cf12f495")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, SetTimezoneActionOpaqueAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << SetTimezoneAction_OpaqueAction >> then instantiate a {@link SetTimezoneActionOpaqueAction} proxy.
     * 
     * @return a {@link SetTimezoneActionOpaqueAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("3a979d8c-66e3-4519-8dd0-fac98b1fbf5f")
    public static SetTimezoneActionOpaqueAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.OpaqueAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, SetTimezoneActionOpaqueAction.STEREOTYPE_NAME);
        return SetTimezoneActionOpaqueAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link SetTimezoneActionOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << SetTimezoneAction_OpaqueAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link SetTimezoneActionOpaqueAction} proxy or <i>null</i>.
     */
    @objid ("f22ea184-68b2-4c93-85eb-eff81b5a90e6")
    public static SetTimezoneActionOpaqueAction instantiate(final OpaqueAction obj) {
        return SetTimezoneActionOpaqueAction.canInstantiate(obj) ? new SetTimezoneActionOpaqueAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SetTimezoneActionOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << SetTimezoneAction_OpaqueAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link SetTimezoneActionOpaqueAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fafd78c9-1c49-4fa1-8efb-b6bd8860fcf7")
    public static SetTimezoneActionOpaqueAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (SetTimezoneActionOpaqueAction.canInstantiate(obj))
        	return new SetTimezoneActionOpaqueAction(obj);
        else
        	throw new IllegalArgumentException("SetTimezoneActionOpaqueAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9c77f08a-4a2f-4f36-b28c-c43095136158")
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
        SetTimezoneActionOpaqueAction other = (SetTimezoneActionOpaqueAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("b7a5cc3c-de27-410a-b00a-993e99c6ac62")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("18245096-3343-499c-ad4b-6cd847ab8ebf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cc1d47e0-0725-4c67-a4e3-aeafe8e940e4")
    protected SetTimezoneActionOpaqueAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("5259db6f-5d3f-45d9-9e75-0a18707f5953")
    public static final class MdaTypes {
        @objid ("1f1bef25-a11e-4f4a-a17c-ec1b0417d353")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c03836b-bb82-4f73-bb3d-2143b2f206a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("9224c42a-963a-423b-80b1-aa224bdedaec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("20d19eb5-63bd-4869-ab0a-843732306f5c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5e3a7b2d-e33a-11df-9694-0027103ea5f4");
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
