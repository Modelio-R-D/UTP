/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.stateinvariant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class StopTimerAction {
    public static final String STEREOTYPE_NAME = "StopTimerAction";

    /**
     * The underlying {@link StateInvariant} represented by this proxy, never null.
     */
    protected final StateInvariant elt;

    /**
     * Tells whether a {@link StopTimerAction proxy} can be instantiated from a {@link MObject} checking it is a {@link StateInvariant} stereotyped << StopTimerAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StateInvariant) && ((StateInvariant) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, StopTimerAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link StateInvariant} stereotyped << StopTimerAction >> then instantiate a {@link StopTimerAction} proxy.
     * 
     * @return a {@link StopTimerAction} proxy on the created {@link StateInvariant}.
     */
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
    public static StopTimerAction safeInstantiate(final StateInvariant obj) throws IllegalArgumentException {
        if (StopTimerAction.canInstantiate(obj))
        	return new StopTimerAction(obj);
        else
        	throw new IllegalArgumentException("StopTimerAction: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        StopTimerAction other = (StopTimerAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StateInvariant}. 
     * @return the StateInvariant represented by this proxy, never null.
     */
    public StateInvariant getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected StopTimerAction(final StateInvariant elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
