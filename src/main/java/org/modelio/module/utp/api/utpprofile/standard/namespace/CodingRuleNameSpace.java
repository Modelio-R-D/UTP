/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.namespace;

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
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link NameSpace} with << CodingRule_NameSpace >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CodingRuleNameSpace {
    public static final String STEREOTYPE_NAME = "CodingRule_NameSpace";

    public static final String CODING_TAGTYPE = "coding";

    /**
     * The underlying {@link NameSpace} represented by this proxy, never null.
     */
    protected final NameSpace elt;

    /**
     * Tells whether a {@link CodingRuleNameSpace proxy} can be instantiated from a {@link MObject} checking it is a {@link NameSpace} stereotyped << CodingRule_NameSpace >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof NameSpace) && ((NameSpace) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, CodingRuleNameSpace.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link NameSpace} stereotyped << CodingRule_NameSpace >> then instantiate a {@link CodingRuleNameSpace} proxy.
     * 
     * @return a {@link CodingRuleNameSpace} proxy on the created {@link NameSpace}.
     */
    public static CodingRuleNameSpace create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.NameSpace");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, CodingRuleNameSpace.STEREOTYPE_NAME);
        return CodingRuleNameSpace.instantiate((NameSpace)e);
    }

    /**
     * Tries to instantiate a {@link CodingRuleNameSpace} proxy from a {@link NameSpace} stereotyped << CodingRule_NameSpace >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a NameSpace
     * @return a {@link CodingRuleNameSpace} proxy or <i>null</i>.
     */
    public static CodingRuleNameSpace instantiate(final NameSpace obj) {
        return CodingRuleNameSpace.canInstantiate(obj) ? new CodingRuleNameSpace(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CodingRuleNameSpace} proxy from a {@link NameSpace} stereotyped << CodingRule_NameSpace >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link NameSpace}
     * @return a {@link CodingRuleNameSpace} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CodingRuleNameSpace safeInstantiate(final NameSpace obj) throws IllegalArgumentException {
        if (CodingRuleNameSpace.canInstantiate(obj))
        	return new CodingRuleNameSpace(obj);
        else
        	throw new IllegalArgumentException("CodingRuleNameSpace: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CodingRuleNameSpace other = (CodingRuleNameSpace) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'coding'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCoding() {
        return this.elt.getTagValue(CodingRuleNameSpace.MdaTypes.CODING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link NameSpace}. 
     * @return the NameSpace represented by this proxy, never null.
     */
    public NameSpace getElement() {
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
        this.elt.putTagValue(CodingRuleNameSpace.MdaTypes.CODING_TAGTYPE_ELT, value);
    }

    protected CodingRuleNameSpace(final NameSpace elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CODING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6d93ea4e-e362-11df-a678-0027103ea5f4");
            CODING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8fc9e038-e364-11df-a678-0027103ea5f4");
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
