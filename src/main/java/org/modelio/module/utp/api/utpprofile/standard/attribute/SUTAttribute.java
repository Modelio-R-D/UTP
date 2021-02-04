/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SUT_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5040808d-34a3-4985-adea-cf4e91e03a6a")
public class SUTAttribute {
    @objid ("8f4d6b09-a92d-402f-b586-09c90cbeeff9")
    public static final String STEREOTYPE_NAME = "SUT_Attribute";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("54119714-4248-4b89-afa2-26be0f125175")
    protected final Attribute elt;

    /**
     * Tells whether a {@link SUTAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SUT_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9ad32c60-608a-4daa-8f31-3eafc357206a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, SUTAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SUT_Attribute >> then instantiate a {@link SUTAttribute} proxy.
     * 
     * @return a {@link SUTAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("fd5f0048-48d2-4e37-aaac-285c159bb404")
    public static SUTAttribute create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, SUTAttribute.STEREOTYPE_NAME);
        return SUTAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SUTAttribute} proxy from a {@link Attribute} stereotyped << SUT_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SUTAttribute} proxy or <i>null</i>.
     */
    @objid ("c600c8f9-672d-4b1e-ad21-a5c2e2b51c54")
    public static SUTAttribute instantiate(final Attribute obj) {
        return SUTAttribute.canInstantiate(obj) ? new SUTAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SUTAttribute} proxy from a {@link Attribute} stereotyped << SUT_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SUTAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f637c103-c5d6-4c08-81cc-bdcc3465c808")
    public static SUTAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SUTAttribute.canInstantiate(obj))
        	return new SUTAttribute(obj);
        else
        	throw new IllegalArgumentException("SUTAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6ed4b873-5f17-4752-902d-5f2fb4acd692")
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
        SUTAttribute other = (SUTAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("fcba61f0-8d66-456f-a643-78f190be1105")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("04c4711a-232a-4eaa-a86b-9fa43a75715d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ccf7e5e5-8ec3-41c1-b431-3ed27e3f2ebd")
    protected SUTAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("3af1b020-e71a-4e08-bed0-1f07603f7617")
    public static final class MdaTypes {
        @objid ("442d655d-de6a-40fc-b121-b7edc8bbb1c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a01af192-ac87-48ac-b6e8-4967fe24ab28")
        private static Stereotype MDAASSOCDEP;

        @objid ("6a09333a-c566-4091-ad97-1317812d43f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("583ec3bd-3584-4033-8f28-bb2ec6e33a8b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5ce79f75-e279-11df-b95d-0027103ea5f4");
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
