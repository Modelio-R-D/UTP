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
 * Proxy class to handle a {@link OpaqueAction} with << TimeOutAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d7ab37ef-4c68-4481-991f-d658da5f40ab")
public class TimeOutAction {
    @objid ("a80214ce-14c3-4b00-a31c-73ec5ec6a17c")
    public static final String STEREOTYPE_NAME = "TimeOutAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("523a4e88-14ec-41f0-b8d5-1c0a0c0badea")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link TimeOutAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << TimeOutAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d36c1c4b-4a83-4799-bbb7-aad4d1eda96a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TimeOutAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << TimeOutAction >> then instantiate a {@link TimeOutAction} proxy.
     * 
     * @return a {@link TimeOutAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("7d647881-61e6-41e4-b420-aa64b07d6b9b")
    public static TimeOutAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.OpaqueAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TimeOutAction.STEREOTYPE_NAME);
        return TimeOutAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link TimeOutAction} proxy from a {@link OpaqueAction} stereotyped << TimeOutAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link TimeOutAction} proxy or <i>null</i>.
     */
    @objid ("7ccee1ae-e273-4e34-a2d1-0d6d8de65ebd")
    public static TimeOutAction instantiate(final OpaqueAction obj) {
        return TimeOutAction.canInstantiate(obj) ? new TimeOutAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimeOutAction} proxy from a {@link OpaqueAction} stereotyped << TimeOutAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link TimeOutAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f3776461-10cf-4998-b733-9ff3adc0bd7d")
    public static TimeOutAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (TimeOutAction.canInstantiate(obj))
        	return new TimeOutAction(obj);
        else
        	throw new IllegalArgumentException("TimeOutAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("569e1088-53b9-42cb-9528-f4b7f9ce5a28")
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
        TimeOutAction other = (TimeOutAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("21734e75-ed5a-478f-b446-fa5906fecb7d")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("cb473867-e78e-422a-93b2-8663f7323474")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d448b2cd-bf99-4ee6-98d5-6396da342da3")
    protected TimeOutAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("c630168d-17e3-42dd-8713-734d6267c9b3")
    public static final class MdaTypes {
        @objid ("9a5d3f61-f5e2-4293-8f7d-2a80907085a6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d9d1457e-49c5-4c91-b74f-6ddd462c635d")
        private static Stereotype MDAASSOCDEP;

        @objid ("420f29c1-f1e9-49bd-92a8-66b925e23e7c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ae011cf0-6cdd-433d-a0cc-d2b50cb3339a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0f55262d-e33a-11df-9694-0027103ea5f4");
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
