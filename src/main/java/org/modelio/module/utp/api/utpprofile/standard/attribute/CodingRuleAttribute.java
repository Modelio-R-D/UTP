/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
 * Proxy class to handle a {@link Attribute} with << CodingRule_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CodingRuleAttribute {
    public static final String STEREOTYPE_NAME = "CodingRule_Attribute";

    public static final String CODING_TAGTYPE = "coding";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    protected final Attribute elt;

    /**
     * Tells whether a {@link CodingRuleAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << CodingRule_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, CodingRuleAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << CodingRule_Attribute >> then instantiate a {@link CodingRuleAttribute} proxy.
     * 
     * @return a {@link CodingRuleAttribute} proxy on the created {@link Attribute}.
     */
    public static CodingRuleAttribute create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, CodingRuleAttribute.STEREOTYPE_NAME);
        return CodingRuleAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link CodingRuleAttribute} proxy from a {@link Attribute} stereotyped << CodingRule_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link CodingRuleAttribute} proxy or <i>null</i>.
     */
    public static CodingRuleAttribute instantiate(final Attribute obj) {
        return CodingRuleAttribute.canInstantiate(obj) ? new CodingRuleAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CodingRuleAttribute} proxy from a {@link Attribute} stereotyped << CodingRule_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link CodingRuleAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CodingRuleAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (CodingRuleAttribute.canInstantiate(obj))
        	return new CodingRuleAttribute(obj);
        else
        	throw new IllegalArgumentException("CodingRuleAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CodingRuleAttribute other = (CodingRuleAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'coding'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCoding() {
        return this.elt.getTagValue(CodingRuleAttribute.MdaTypes.CODING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    public Attribute getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'coding'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCoding(final String value) {
        this.elt.putTagValue(CodingRuleAttribute.MdaTypes.CODING_TAGTYPE_ELT, value);
    }

    protected CodingRuleAttribute(final Attribute elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CODING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "164b939b-e361-11df-a678-0027103ea5f4");
            CODING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8b8cb701-e364-11df-a678-0027103ea5f4");
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
