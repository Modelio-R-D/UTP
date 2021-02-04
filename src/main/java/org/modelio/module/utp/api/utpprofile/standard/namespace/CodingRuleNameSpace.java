/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.namespace;

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
@objid ("095dcee9-70e1-44ac-9309-070efa5757cb")
public class CodingRuleNameSpace {
    @objid ("731b9c96-46be-4a03-a19c-656516b41815")
    public static final String STEREOTYPE_NAME = "CodingRule_NameSpace";

    @objid ("da4818dc-ed67-4520-8cb1-7d473deefcfb")
    public static final String CODING_TAGTYPE = "coding";

    /**
     * The underlying {@link NameSpace} represented by this proxy, never null.
     */
    @objid ("23ab197c-f354-43c1-a2c8-aba715e68f52")
    protected final NameSpace elt;

    /**
     * Tells whether a {@link CodingRuleNameSpace proxy} can be instantiated from a {@link MObject} checking it is a {@link NameSpace} stereotyped << CodingRule_NameSpace >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("534104e7-1f1b-485e-baa2-d32d31b377a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof NameSpace) && ((NameSpace) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, CodingRuleNameSpace.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link NameSpace} stereotyped << CodingRule_NameSpace >> then instantiate a {@link CodingRuleNameSpace} proxy.
     * 
     * @return a {@link CodingRuleNameSpace} proxy on the created {@link NameSpace}.
     */
    @objid ("973a4147-b85a-4d97-a12f-d87cf8121e72")
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
    @objid ("e1809b53-a48f-4ce7-932f-c7dceb27303a")
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
    @objid ("97514870-5f73-4962-a746-4ec3092813e5")
    public static CodingRuleNameSpace safeInstantiate(final NameSpace obj) throws IllegalArgumentException {
        if (CodingRuleNameSpace.canInstantiate(obj))
        	return new CodingRuleNameSpace(obj);
        else
        	throw new IllegalArgumentException("CodingRuleNameSpace: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cc926058-a81d-4eac-aa07-ba647a422b45")
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
    @objid ("9fc69f7d-f091-4217-992b-28bdf7f019bb")
    public String getCoding() {
        return this.elt.getTagValue(CodingRuleNameSpace.MdaTypes.CODING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link NameSpace}. 
     * @return the NameSpace represented by this proxy, never null.
     */
    @objid ("e580dc69-2bbf-4ed6-b8ff-f28fa9f933a3")
    public NameSpace getElement() {
        return this.elt;
    }

    @objid ("335ac1c8-8564-4686-b4e2-cb040c796788")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'coding'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94a8f687-77a8-4742-ab1b-547262804692")
    public void setCoding(final String value) {
        this.elt.putTagValue(CodingRuleNameSpace.MdaTypes.CODING_TAGTYPE_ELT, value);
    }

    @objid ("3a8fb0e9-6454-4fd0-8dac-a56ac617567f")
    protected CodingRuleNameSpace(final NameSpace elt) {
        this.elt = elt;
    }

    @objid ("815d057f-da1e-44f1-a4c9-a42017302c7a")
    public static final class MdaTypes {
        @objid ("15827167-b1b5-4463-beb8-4fad8bd9812a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4b8a569-5cff-4551-bc9f-f077c52156cf")
        public static TagType CODING_TAGTYPE_ELT;

        @objid ("4a76cf22-010b-47dc-9f1a-a5f441460f6c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d86dcc35-ebcb-4591-ac64-57bdbc02251e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7bbe42b0-aab1-4ba0-b6aa-54c30e9d6002")
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
