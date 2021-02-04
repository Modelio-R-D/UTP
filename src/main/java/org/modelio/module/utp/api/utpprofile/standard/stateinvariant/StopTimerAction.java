/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.stateinvariant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
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
 * Proxy class to handle a {@link StateInvariant} with << StopTimerAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("965e1a3e-9be1-476f-981c-67a3a163eb4c")
public class StopTimerAction {
    @objid ("805c142f-971e-400e-a8ab-e406e8b2f025")
    public static final String STEREOTYPE_NAME = "StopTimerAction";

    /**
     * The underlying {@link StateInvariant} represented by this proxy, never null.
     */
    @objid ("cf7b3cda-8a6a-416f-a173-0b63890102eb")
    protected final StateInvariant elt;

    /**
     * Tells whether a {@link StopTimerAction proxy} can be instantiated from a {@link MObject} checking it is a {@link StateInvariant} stereotyped << StopTimerAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bfeb4270-6f07-4fd2-b8bd-d730a3708a5b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StateInvariant) && ((StateInvariant) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, StopTimerAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link StateInvariant} stereotyped << StopTimerAction >> then instantiate a {@link StopTimerAction} proxy.
     * 
     * @return a {@link StopTimerAction} proxy on the created {@link StateInvariant}.
     */
    @objid ("95168fa1-da74-42a5-befc-d305da8bd955")
    public static StopTimerAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.StateInvariant");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, StopTimerAction.STEREOTYPE_NAME);
        return StopTimerAction.instantiate((StateInvariant)e);
    }

    /**
     * Tries to instantiate a {@link StopTimerAction} proxy from a {@link StateInvariant} stereotyped << StopTimerAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StateInvariant
     * @return a {@link StopTimerAction} proxy or <i>null</i>.
     */
    @objid ("79c6499c-3a31-45e9-b89c-e27c217e9193")
    public static StopTimerAction instantiate(final StateInvariant obj) {
        return StopTimerAction.canInstantiate(obj) ? new StopTimerAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StopTimerAction} proxy from a {@link StateInvariant} stereotyped << StopTimerAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StateInvariant}
     * @return a {@link StopTimerAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6c9ecdcc-059c-496c-b079-cdc39438bf94")
    public static StopTimerAction safeInstantiate(final StateInvariant obj) throws IllegalArgumentException {
        if (StopTimerAction.canInstantiate(obj))
        	return new StopTimerAction(obj);
        else
        	throw new IllegalArgumentException("StopTimerAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("20533d40-2670-44e2-a123-cac4c87b9b1a")
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
        StopTimerAction other = (StopTimerAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StateInvariant}. 
     * @return the StateInvariant represented by this proxy, never null.
     */
    @objid ("ae02ecdd-e830-4e67-bd6b-564587514f54")
    public StateInvariant getElement() {
        return this.elt;
    }

    @objid ("d2bea961-c66d-4061-ad85-ead9a8f17989")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5f0d645f-8b47-4fba-80bc-76f726b1a72c")
    protected StopTimerAction(final StateInvariant elt) {
        this.elt = elt;
    }

    @objid ("a9c63b5f-0f7d-4a6a-bd4d-bb9f1aba38ec")
    public static final class MdaTypes {
        @objid ("49423cad-56e6-46b7-acd7-fd645e37bf2f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("328c9658-98cc-4965-811c-419aa57b4434")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ddcf377-40fa-4666-9cac-ea0e2f87dddc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ba25873-3943-4ebe-ae46-05d4ccfab5ca")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b3c1b78a-e69d-11df-87fb-0027103ea5f4");
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
