/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
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
 * Proxy class to handle a {@link Event} with << TimeOut >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimeOut {
    public static final String STEREOTYPE_NAME = "TimeOut";

    /**
     * The underlying {@link Event} represented by this proxy, never null.
     */
    protected final Event elt;

    /**
     * Tells whether a {@link TimeOut proxy} can be instantiated from a {@link MObject} checking it is a {@link Event} stereotyped << TimeOut >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Event) && ((Event) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TimeOut.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Event} stereotyped << TimeOut >> then instantiate a {@link TimeOut} proxy.
     * 
     * @return a {@link TimeOut} proxy on the created {@link Event}.
     */
    public static TimeOut create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Event");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TimeOut.STEREOTYPE_NAME);
        return TimeOut.instantiate((Event)e);
    }

    /**
     * Tries to instantiate a {@link TimeOut} proxy from a {@link Event} stereotyped << TimeOut >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Event
     * @return a {@link TimeOut} proxy or <i>null</i>.
     */
    public static TimeOut instantiate(final Event obj) {
        return TimeOut.canInstantiate(obj) ? new TimeOut(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimeOut} proxy from a {@link Event} stereotyped << TimeOut >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Event}
     * @return a {@link TimeOut} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimeOut safeInstantiate(final Event obj) throws IllegalArgumentException {
        if (TimeOut.canInstantiate(obj))
        	return new TimeOut(obj);
        else
        	throw new IllegalArgumentException("TimeOut: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimeOut other = (TimeOut) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Event}. 
     * @return the Event represented by this proxy, never null.
     */
    public Event getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected TimeOut(final Event elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f8f7c8bf-e339-11df-9694-0027103ea5f4");
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
