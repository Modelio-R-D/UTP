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
 * Proxy class to handle a {@link StateInvariant} with << StartTimerAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3685e378-0051-4113-a0f8-ab18e4020040")
public class StartTimerAction {
    @objid ("025da474-0bea-43ae-af21-84e5a958a726")
    public static final String STEREOTYPE_NAME = "StartTimerAction";

    /**
     * The underlying {@link StateInvariant} represented by this proxy, never null.
     */
    @objid ("d952c4e7-7407-4f86-99ef-839912833fec")
    protected final StateInvariant elt;

    /**
     * Tells whether a {@link StartTimerAction proxy} can be instantiated from a {@link MObject} checking it is a {@link StateInvariant} stereotyped << StartTimerAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a049b91d-8fa4-444d-8cb3-cac3ebd74dd6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StateInvariant) && ((StateInvariant) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, StartTimerAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link StateInvariant} stereotyped << StartTimerAction >> then instantiate a {@link StartTimerAction} proxy.
     * 
     * @return a {@link StartTimerAction} proxy on the created {@link StateInvariant}.
     */
    @objid ("79fa4e33-17c9-4938-9a61-eb2bd5afb87d")
    public static StartTimerAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.StateInvariant");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, StartTimerAction.STEREOTYPE_NAME);
        return StartTimerAction.instantiate((StateInvariant)e);
    }

    /**
     * Tries to instantiate a {@link StartTimerAction} proxy from a {@link StateInvariant} stereotyped << StartTimerAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StateInvariant
     * @return a {@link StartTimerAction} proxy or <i>null</i>.
     */
    @objid ("a2f36b97-588b-4381-b4b0-d222dfec6e00")
    public static StartTimerAction instantiate(final StateInvariant obj) {
        return StartTimerAction.canInstantiate(obj) ? new StartTimerAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StartTimerAction} proxy from a {@link StateInvariant} stereotyped << StartTimerAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StateInvariant}
     * @return a {@link StartTimerAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9392dedc-ae69-4329-a586-9c70deb69ee8")
    public static StartTimerAction safeInstantiate(final StateInvariant obj) throws IllegalArgumentException {
        if (StartTimerAction.canInstantiate(obj))
        	return new StartTimerAction(obj);
        else
        	throw new IllegalArgumentException("StartTimerAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c37cd28d-d8ba-4591-a279-2faa8c6dbbef")
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
        StartTimerAction other = (StartTimerAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StateInvariant}. 
     * @return the StateInvariant represented by this proxy, never null.
     */
    @objid ("a69d4091-2754-4e8a-8371-f720d39b5963")
    public StateInvariant getElement() {
        return this.elt;
    }

    @objid ("a15885ac-1d46-4c2d-99d2-ef212c2d699a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ec0cfc88-d615-4ea5-bf53-6e6e36d561be")
    protected StartTimerAction(final StateInvariant elt) {
        this.elt = elt;
    }

    @objid ("ffeb3ce3-c725-4238-b6be-6619c32f2cb5")
    public static final class MdaTypes {
        @objid ("3a27a9ea-6aec-4d6a-b8b2-7a0520514677")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ec1bd79-f97b-417a-91aa-5b9ac168df1d")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e1151de-fe01-46b7-a643-c7666093ef98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d04b981-84ce-4efc-98b4-df2b995432fc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d74be1ee-e69b-11df-87fb-0027103ea5f4");
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
