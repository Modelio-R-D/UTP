/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.operation;

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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << TestCase_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("27e5e9d0-5a8e-4c58-861f-3940bc2f3c8b")
public class TestCaseOperation {
    @objid ("ee26e7eb-2dc3-41cf-bc28-2e42b1c50fa2")
    public static final String STEREOTYPE_NAME = "TestCase_Operation";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    @objid ("d3013266-2c3d-4ac4-9e2f-6d62cfa5c56a")
    protected final Operation elt;

    /**
     * Tells whether a {@link TestCaseOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << TestCase_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7e9d7700-d447-472f-a4f9-0b6d3f187b18")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TestCaseOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << TestCase_Operation >> then instantiate a {@link TestCaseOperation} proxy.
     * 
     * @return a {@link TestCaseOperation} proxy on the created {@link Operation}.
     */
    @objid ("26ee4c39-5ed0-4c75-868c-e3ecd9e6ecc9")
    public static TestCaseOperation create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TestCaseOperation.STEREOTYPE_NAME);
        return TestCaseOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link TestCaseOperation} proxy from a {@link Operation} stereotyped << TestCase_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link TestCaseOperation} proxy or <i>null</i>.
     */
    @objid ("42e14a1a-13d0-4722-85a1-02eac545ddd7")
    public static TestCaseOperation instantiate(final Operation obj) {
        return TestCaseOperation.canInstantiate(obj) ? new TestCaseOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TestCaseOperation} proxy from a {@link Operation} stereotyped << TestCase_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link TestCaseOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("12896617-5ea6-412d-9cf2-eccdfc2e7754")
    public static TestCaseOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (TestCaseOperation.canInstantiate(obj))
        	return new TestCaseOperation(obj);
        else
        	throw new IllegalArgumentException("TestCaseOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b964dbf-6f70-43e2-9ed6-719d3ae61728")
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
        TestCaseOperation other = (TestCaseOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("c76c6eb7-ce2e-4b7d-b7b0-76b772b1634c")
    public Operation getElement() {
        return this.elt;
    }

    @objid ("a4e98763-e118-4d51-a935-c076bd1bcd83")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f41b6886-fffa-42e0-8c8f-2f092d19b926")
    protected TestCaseOperation(final Operation elt) {
        this.elt = elt;
    }

    @objid ("24cc5914-81ca-479f-a05a-41cbf6b0c280")
    public static final class MdaTypes {
        @objid ("339c9f55-f59b-43ea-8f74-777f55c054ed")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dcaaadb6-39ce-47f2-a209-e812ec1d8e67")
        private static Stereotype MDAASSOCDEP;

        @objid ("262ebf47-fe33-45ae-80a0-b021cfd87957")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("38b541f4-bd73-4d77-b32d-53ac38396d8a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ed653299-e278-11df-b95d-0027103ea5f4");
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
