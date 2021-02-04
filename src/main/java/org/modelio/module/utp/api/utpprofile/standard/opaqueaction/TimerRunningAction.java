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
 * Proxy class to handle a {@link OpaqueAction} with << TimerRunningAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0641014a-8084-489b-ae54-a60332b71336")
public class TimerRunningAction {
    @objid ("d0ccf38f-43b1-4eef-abfc-77cdb9e987fd")
    public static final String STEREOTYPE_NAME = "TimerRunningAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("66aa3fb3-6ae8-48db-8c4c-3682891dadc2")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link TimerRunningAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << TimerRunningAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8159cbe0-0cb3-4b2c-9b38-b9b1917d545e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TimerRunningAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << TimerRunningAction >> then instantiate a {@link TimerRunningAction} proxy.
     * 
     * @return a {@link TimerRunningAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("a398c99f-8cc7-4561-aeeb-839dedf3795a")
    public static TimerRunningAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.OpaqueAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TimerRunningAction.STEREOTYPE_NAME);
        return TimerRunningAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link TimerRunningAction} proxy from a {@link OpaqueAction} stereotyped << TimerRunningAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link TimerRunningAction} proxy or <i>null</i>.
     */
    @objid ("5bf5dac5-7032-4019-9b10-31237fb01dea")
    public static TimerRunningAction instantiate(final OpaqueAction obj) {
        return TimerRunningAction.canInstantiate(obj) ? new TimerRunningAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerRunningAction} proxy from a {@link OpaqueAction} stereotyped << TimerRunningAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link TimerRunningAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("97b682ea-2114-46c9-abc5-7ea3ea2f6f35")
    public static TimerRunningAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (TimerRunningAction.canInstantiate(obj))
        	return new TimerRunningAction(obj);
        else
        	throw new IllegalArgumentException("TimerRunningAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("efb74a8e-634e-42fe-9f38-3e6cc4ec4404")
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
        TimerRunningAction other = (TimerRunningAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("6a6174aa-0e66-46f3-894b-5af762a31fed")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("7c644e1d-2960-4656-91f9-d2d51f6c7797")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("553af51a-4403-4f58-88ea-bf9df03d1a06")
    protected TimerRunningAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("bb8b4662-7ede-465b-81cc-5665d84f90b5")
    public static final class MdaTypes {
        @objid ("1eed224b-f833-4291-9046-e2e3c4b87d73")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11db8bc7-1ae9-4379-a708-4a61db2ffbc3")
        private static Stereotype MDAASSOCDEP;

        @objid ("83baa142-eb4f-40b7-a59d-30a790924884")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("65a4c6a9-122c-4cf4-81c9-edf1f5783ac5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "41d5d72e-e33a-11df-9694-0027103ea5f4");
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
