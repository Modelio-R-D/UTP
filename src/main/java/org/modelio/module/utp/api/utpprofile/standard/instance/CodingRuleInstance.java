/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << CodingRule_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CodingRuleInstance {
    public static final String STEREOTYPE_NAME = "CodingRule_Instance";

    public static final String CODING_TAGTYPE = "coding";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    protected final Instance elt;

    /**
     * Tells whether a {@link CodingRuleInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << CodingRule_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, CodingRuleInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << CodingRule_Instance >> then instantiate a {@link CodingRuleInstance} proxy.
     * 
     * @return a {@link CodingRuleInstance} proxy on the created {@link Instance}.
     */
    public static CodingRuleInstance create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, CodingRuleInstance.STEREOTYPE_NAME);
        return CodingRuleInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link CodingRuleInstance} proxy from a {@link Instance} stereotyped << CodingRule_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link CodingRuleInstance} proxy or <i>null</i>.
     */
    public static CodingRuleInstance instantiate(final Instance obj) {
        return CodingRuleInstance.canInstantiate(obj) ? new CodingRuleInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CodingRuleInstance} proxy from a {@link Instance} stereotyped << CodingRule_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link CodingRuleInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CodingRuleInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (CodingRuleInstance.canInstantiate(obj))
        	return new CodingRuleInstance(obj);
        else
        	throw new IllegalArgumentException("CodingRuleInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CodingRuleInstance other = (CodingRuleInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'coding'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCoding() {
        return this.elt.getTagValue(CodingRuleInstance.MdaTypes.CODING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    public Instance getElement() {
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
        this.elt.putTagValue(CodingRuleInstance.MdaTypes.CODING_TAGTYPE_ELT, value);
    }

    protected CodingRuleInstance(final Instance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CODING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2034a31-e363-11df-a678-0027103ea5f4");
            CODING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "932de1f0-e364-11df-a678-0027103ea5f4");
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
