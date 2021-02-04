/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << TestComponent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("74bb15a2-407a-471d-8511-e04289e61da5")
public class TestComponent {
    @objid ("128dc3bb-4bef-41e7-8341-3f8c4983c197")
    public static final String STEREOTYPE_NAME = "TestComponent";

    /**
     * The underlying {@link Classifier} represented by this proxy, never null.
     */
    @objid ("5c979295-fdaf-4761-bba0-6308edd46d2e")
    protected final Classifier elt;

    /**
     * Tells whether a {@link TestComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << TestComponent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8df82d1d-3e3a-401b-a506-786df12630af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TestComponent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << TestComponent >> then instantiate a {@link TestComponent} proxy.
     * 
     * @return a {@link TestComponent} proxy on the created {@link Classifier}.
     */
    @objid ("c970a8f5-3b64-4827-8b62-43a8a06d5ea9")
    public static TestComponent create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TestComponent.STEREOTYPE_NAME);
        return TestComponent.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link TestComponent} proxy from a {@link Classifier} stereotyped << TestComponent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link TestComponent} proxy or <i>null</i>.
     */
    @objid ("678db02b-364b-44c8-9e5c-6afeac71134f")
    public static TestComponent instantiate(final Classifier obj) {
        return TestComponent.canInstantiate(obj) ? new TestComponent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TestComponent} proxy from a {@link Classifier} stereotyped << TestComponent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link TestComponent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8b6b35c4-54ea-418a-9ad3-b2c8c2c59b59")
    public static TestComponent safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (TestComponent.canInstantiate(obj))
        	return new TestComponent(obj);
        else
        	throw new IllegalArgumentException("TestComponent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c1f50109-26d5-4017-bc58-04ca9fac1d7b")
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
        TestComponent other = (TestComponent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("11e99a48-5894-480f-b237-0989ed09ed7c")
    public Classifier getElement() {
        return this.elt;
    }

    @objid ("455501f1-435e-4938-888b-a75c726e8d06")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7ada0f70-4f37-48d6-b337-6bb619695698")
    protected TestComponent(final Classifier elt) {
        this.elt = elt;
    }

    @objid ("1eda8baf-907a-4046-8a05-c3db28f53dc0")
    public static final class MdaTypes {
        @objid ("d98f016c-b14f-460d-927b-3d278ef1f293")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a86396a1-1d32-4fca-aade-7eeb9029b5bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("e873d977-bcd7-4b9c-b1af-17bac6c8838c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c4025f54-6a0f-4add-9f8f-252e1839c8c7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "13de32b1-e279-11df-b95d-0027103ea5f4");
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
