/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.infrastructure.dependency;

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
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << TestObjective >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8b3c240e-2708-4699-a229-89f434365009")
public class TestObjective {
    @objid ("7d5d2069-7eec-4c56-a396-66660eeec552")
    public static final String STEREOTYPE_NAME = "TestObjective";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e843b6f7-816d-463c-81ed-ad81d891e70c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link TestObjective proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << TestObjective >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cc3ce136-cdb5-456c-8ba7-6c9e852127a3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TestObjective.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << TestObjective >> then instantiate a {@link TestObjective} proxy.
     * 
     * @return a {@link TestObjective} proxy on the created {@link Dependency}.
     */
    @objid ("8ec68bec-86db-47a2-b410-57f069d87f81")
    public static TestObjective create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TestObjective.STEREOTYPE_NAME);
        return TestObjective.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link TestObjective} proxy from a {@link Dependency} stereotyped << TestObjective >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link TestObjective} proxy or <i>null</i>.
     */
    @objid ("478ccbbc-1a1c-428e-9a61-698c88443c66")
    public static TestObjective instantiate(final Dependency obj) {
        return TestObjective.canInstantiate(obj) ? new TestObjective(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TestObjective} proxy from a {@link Dependency} stereotyped << TestObjective >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link TestObjective} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e8d1497a-9491-4650-b862-dd8c58aabf34")
    public static TestObjective safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (TestObjective.canInstantiate(obj))
        	return new TestObjective(obj);
        else
        	throw new IllegalArgumentException("TestObjective: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0138cf8a-3527-4e90-b0f0-67d7b0ec7117")
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
        TestObjective other = (TestObjective) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("be09148a-1e96-4820-8d5d-68ebbe93f96a")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("fc4b579a-ca09-40df-8337-f711a5cf33e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e8910a73-cae6-42e5-936b-a1ea64aec588")
    protected TestObjective(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d94ffeb5-8c07-4c87-b3cd-9200592fa25c")
    public static final class MdaTypes {
        @objid ("415c364d-0cda-4746-9001-c81fbed10297")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4b274df9-17d4-45a5-b5b1-8e98c99d08e8")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ae401cb-ba61-46ad-b30c-01b83f1d9ca2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3b592150-7324-4076-937a-7941a01418cb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "452c5975-e279-11df-b95d-0027103ea5f4");
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
