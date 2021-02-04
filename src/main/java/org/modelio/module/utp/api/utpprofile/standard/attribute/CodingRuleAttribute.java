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
 * Proxy class to handle a {@link Attribute} with << CodingRule_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a02ca011-8b2f-45b4-bcb0-eebe321b8454")
public class CodingRuleAttribute {
    @objid ("3d37af73-09bc-48c7-9796-09dc56fff773")
    public static final String STEREOTYPE_NAME = "CodingRule_Attribute";

    @objid ("1a5d25db-3547-4024-8ff3-e59a493a1405")
    public static final String CODING_TAGTYPE = "coding";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("ff31e155-4583-4244-8127-6381e6a36249")
    protected final Attribute elt;

    /**
     * Tells whether a {@link CodingRuleAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << CodingRule_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e6dac212-cdd0-4f24-a297-b9e19697ba73")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, CodingRuleAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << CodingRule_Attribute >> then instantiate a {@link CodingRuleAttribute} proxy.
     * 
     * @return a {@link CodingRuleAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("d4c0e291-e654-4e5c-b8a6-589b5aff9d7f")
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
    @objid ("4262a55e-cc6d-49a4-baa0-6ba1cb5fa7b7")
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
    @objid ("e6d71a7b-c2d0-41ae-a4e5-3a29fc8ac1da")
    public static CodingRuleAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (CodingRuleAttribute.canInstantiate(obj))
        	return new CodingRuleAttribute(obj);
        else
        	throw new IllegalArgumentException("CodingRuleAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6264228-d644-4ffa-8430-8a532a3820d3")
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
    @objid ("2d77f0dd-0a91-42cc-a197-4e32e2625465")
    public String getCoding() {
        return this.elt.getTagValue(CodingRuleAttribute.MdaTypes.CODING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("a9ab3d3d-e42b-4c59-8945-fece5b409f22")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("d6305b58-2128-469f-8d22-32ab4066c328")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'coding'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ce954ca-7c16-4af5-8650-bba5de82681a")
    public void setCoding(final String value) {
        this.elt.putTagValue(CodingRuleAttribute.MdaTypes.CODING_TAGTYPE_ELT, value);
    }

    @objid ("dbb03e94-426c-44f4-86a3-f2bd9f99ee64")
    protected CodingRuleAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("514867c8-db5e-40b5-bf3a-aa5d863f6aac")
    public static final class MdaTypes {
        @objid ("b3396f51-de88-4c9e-af90-ee617104a3db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("10579950-7a22-4581-8e82-c4ffc96b4e35")
        public static TagType CODING_TAGTYPE_ELT;

        @objid ("b8a36180-7c3e-45cf-b699-89bd47247da7")
        private static Stereotype MDAASSOCDEP;

        @objid ("a4f1b22a-1fb4-4c4c-85ff-770b033a94cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("352758cb-24b8-4a67-9228-54286082d837")
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
