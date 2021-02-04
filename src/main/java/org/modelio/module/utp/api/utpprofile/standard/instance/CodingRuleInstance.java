/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.instance;

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
@objid ("1f833071-18c7-4b36-a803-b53ce42cceb4")
public class CodingRuleInstance {
    @objid ("18fc5d54-05dd-44ee-a1ad-c99e192026d8")
    public static final String STEREOTYPE_NAME = "CodingRule_Instance";

    @objid ("6656fbe5-762d-4b8c-925f-9d2f908286f0")
    public static final String CODING_TAGTYPE = "coding";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("d363651a-1371-4d75-a8e2-86099e2a1b40")
    protected final Instance elt;

    /**
     * Tells whether a {@link CodingRuleInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << CodingRule_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cb06560d-797e-4ede-a86a-560d81dc0cbb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, CodingRuleInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << CodingRule_Instance >> then instantiate a {@link CodingRuleInstance} proxy.
     * 
     * @return a {@link CodingRuleInstance} proxy on the created {@link Instance}.
     */
    @objid ("f5cc5862-1bf9-4ac3-ae96-ab83380a6344")
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
    @objid ("b0918648-80fe-4003-a22c-494595dede6b")
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
    @objid ("dc34424c-c666-4bcd-b866-b4dddddbc409")
    public static CodingRuleInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (CodingRuleInstance.canInstantiate(obj))
        	return new CodingRuleInstance(obj);
        else
        	throw new IllegalArgumentException("CodingRuleInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4f3b1d7c-b216-42fd-9a52-0984846b82bc")
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
    @objid ("f65c7271-945c-4fa5-9275-ccbb698375a7")
    public String getCoding() {
        return this.elt.getTagValue(CodingRuleInstance.MdaTypes.CODING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("e0dc2a41-1244-4c9b-8583-ab3df2a7b97d")
    public Instance getElement() {
        return this.elt;
    }

    @objid ("b26fc7f3-8db9-49b3-a03b-7bc7a41d6251")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'coding'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17e3beb2-b0f0-4348-82b2-67db007f8ee2")
    public void setCoding(final String value) {
        this.elt.putTagValue(CodingRuleInstance.MdaTypes.CODING_TAGTYPE_ELT, value);
    }

    @objid ("c97ecbc4-8e58-48ca-ab3e-96dda229db82")
    protected CodingRuleInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("978f8541-e45f-475a-b923-3b8041e55177")
    public static final class MdaTypes {
        @objid ("ee5fc7ca-42d5-4d80-b3d8-43ed63db5052")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4af97538-d3cc-4762-a587-d2fed807d5a6")
        public static TagType CODING_TAGTYPE_ELT;

        @objid ("dce8d342-c5be-49a9-97cd-642d05c0999f")
        private static Stereotype MDAASSOCDEP;

        @objid ("bb2e5ecd-ac3d-44ea-a5bd-ce22efbcfa1a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b89f0a6-e726-45d7-bcac-195e3b58f27d")
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
