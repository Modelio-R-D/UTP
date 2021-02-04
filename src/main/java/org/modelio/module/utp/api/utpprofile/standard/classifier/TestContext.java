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
 * Proxy class to handle a {@link Classifier} with << TestContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0ea66210-a760-46fb-83ed-2b9eb7915956")
public class TestContext {
    @objid ("c8e29e0f-4d63-4cd0-b7e1-b19825e93949")
    public static final String STEREOTYPE_NAME = "TestContext";

    /**
     * The underlying {@link Classifier} represented by this proxy, never null.
     */
    @objid ("ea2b46bb-ee10-40b8-8c94-db9e04e0e34c")
    protected final Classifier elt;

    /**
     * Tells whether a {@link TestContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << TestContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("88101802-b88b-4fe1-9ed7-d22119035bb7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TestContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << TestContext >> then instantiate a {@link TestContext} proxy.
     * 
     * @return a {@link TestContext} proxy on the created {@link Classifier}.
     */
    @objid ("e1148591-0099-49e3-9832-201ac7e0057e")
    public static TestContext create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TestContext.STEREOTYPE_NAME);
        return TestContext.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link TestContext} proxy from a {@link Classifier} stereotyped << TestContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link TestContext} proxy or <i>null</i>.
     */
    @objid ("79dd8ee4-4c52-46ba-aa83-ae425736f538")
    public static TestContext instantiate(final Classifier obj) {
        return TestContext.canInstantiate(obj) ? new TestContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TestContext} proxy from a {@link Classifier} stereotyped << TestContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link TestContext} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0fe10c59-d985-4034-aeb5-a1cf677206e8")
    public static TestContext safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (TestContext.canInstantiate(obj))
        	return new TestContext(obj);
        else
        	throw new IllegalArgumentException("TestContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d673a49e-b5f5-4180-92de-fc48f6b6c696")
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
        TestContext other = (TestContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("63122b79-dc15-4af7-854c-d0e184090d8a")
    public Classifier getElement() {
        return this.elt;
    }

    @objid ("08782da1-db75-410c-b52a-11226d49f471")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b5f00fd4-abd6-4782-9dfb-a8393f84a01b")
    protected TestContext(final Classifier elt) {
        this.elt = elt;
    }

    @objid ("55a5906f-8b00-455c-8e31-1632c032c076")
    public static final class MdaTypes {
        @objid ("bc8c904a-6c89-480e-9435-bd30efabf383")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("189a1b51-2730-48b1-85a9-fa4c208cac35")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa723815-641e-41d0-b182-629afff6f490")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9526e59-0bc9-4a3e-9d74-7a78b6406cd5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dd5475f6-e278-11df-b95d-0027103ea5f4");
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
