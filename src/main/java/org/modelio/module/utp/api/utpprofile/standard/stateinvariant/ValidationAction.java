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
 * Proxy class to handle a {@link StateInvariant} with << ValidationAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("091b5c6d-d548-4923-83e9-bf96f29645e6")
public class ValidationAction {
    @objid ("86e5cf03-bfe9-4feb-b5a4-200c8d37e8f3")
    public static final String STEREOTYPE_NAME = "ValidationAction";

    /**
     * The underlying {@link StateInvariant} represented by this proxy, never null.
     */
    @objid ("04c7ad45-3f37-43c3-bae7-2554c639a381")
    protected final StateInvariant elt;

    /**
     * Tells whether a {@link ValidationAction proxy} can be instantiated from a {@link MObject} checking it is a {@link StateInvariant} stereotyped << ValidationAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b604f77d-88bf-4746-8346-75dd1533055b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StateInvariant) && ((StateInvariant) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, ValidationAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link StateInvariant} stereotyped << ValidationAction >> then instantiate a {@link ValidationAction} proxy.
     * 
     * @return a {@link ValidationAction} proxy on the created {@link StateInvariant}.
     */
    @objid ("8d856e58-8732-47c5-84e9-6eb0772b184c")
    public static ValidationAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.StateInvariant");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, ValidationAction.STEREOTYPE_NAME);
        return ValidationAction.instantiate((StateInvariant)e);
    }

    /**
     * Tries to instantiate a {@link ValidationAction} proxy from a {@link StateInvariant} stereotyped << ValidationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StateInvariant
     * @return a {@link ValidationAction} proxy or <i>null</i>.
     */
    @objid ("2bf8c484-708a-45c8-8acd-a5c0a84d0ed9")
    public static ValidationAction instantiate(final StateInvariant obj) {
        return ValidationAction.canInstantiate(obj) ? new ValidationAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ValidationAction} proxy from a {@link StateInvariant} stereotyped << ValidationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StateInvariant}
     * @return a {@link ValidationAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("72e6d8af-468e-4ef6-ab14-d23f59f42684")
    public static ValidationAction safeInstantiate(final StateInvariant obj) throws IllegalArgumentException {
        if (ValidationAction.canInstantiate(obj))
        	return new ValidationAction(obj);
        else
        	throw new IllegalArgumentException("ValidationAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("83fb5937-f8d3-4edc-a060-3e4e2a19c15a")
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
        ValidationAction other = (ValidationAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StateInvariant}. 
     * @return the StateInvariant represented by this proxy, never null.
     */
    @objid ("e4ae84cc-d27f-4b20-ba76-98d21f251add")
    public StateInvariant getElement() {
        return this.elt;
    }

    @objid ("71aac72d-715e-4120-a71a-5783427b891b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e63495a3-b1c7-4d03-a463-3edb9b62be0d")
    protected ValidationAction(final StateInvariant elt) {
        this.elt = elt;
    }

    @objid ("9a52b0c7-d99d-46a2-949d-67bd50e5440b")
    public static final class MdaTypes {
        @objid ("da48cce6-e8d6-4ffb-aac2-08ee3e9b71fd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30bb8c04-c4db-42c5-a221-13f44cb1e029")
        private static Stereotype MDAASSOCDEP;

        @objid ("247f11e8-55b0-4dde-bec9-4339dd11495a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dc3144cd-5e74-4e9a-8b57-a5ed9783fa6a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e48dbbe4-e69d-11df-87fb-0027103ea5f4");
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
