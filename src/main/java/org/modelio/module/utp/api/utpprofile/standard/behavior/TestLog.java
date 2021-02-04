/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << TestLog >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("04ba212b-f260-42de-8231-853cc2645c7a")
public class TestLog {
    @objid ("e104a65e-3245-4c77-8462-cdf297beaa40")
    public static final String STEREOTYPE_NAME = "TestLog";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("b087d241-d842-473a-bfdf-47d0cce2c1fa")
    protected final Behavior elt;

    /**
     * Tells whether a {@link TestLog proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << TestLog >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("349fa270-f132-497a-ac82-28bd554ca9db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TestLog.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << TestLog >> then instantiate a {@link TestLog} proxy.
     * 
     * @return a {@link TestLog} proxy on the created {@link Behavior}.
     */
    @objid ("d472fd82-87e4-4223-aef0-2bed93287338")
    public static TestLog create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TestLog.STEREOTYPE_NAME);
        return TestLog.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link TestLog} proxy from a {@link Behavior} stereotyped << TestLog >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link TestLog} proxy or <i>null</i>.
     */
    @objid ("693adc97-c8ea-4cf6-9b3b-5a41a1f21b2a")
    public static TestLog instantiate(final Behavior obj) {
        return TestLog.canInstantiate(obj) ? new TestLog(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TestLog} proxy from a {@link Behavior} stereotyped << TestLog >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link TestLog} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b7523cdf-dff6-492a-875d-2a8c3e57bd2c")
    public static TestLog safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (TestLog.canInstantiate(obj))
        	return new TestLog(obj);
        else
        	throw new IllegalArgumentException("TestLog: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e4b366f1-3b71-40a6-8b50-3d1efba303a1")
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
        TestLog other = (TestLog) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("0daf7e23-58a6-4cea-a1d6-0f074dfaf863")
    public Behavior getElement() {
        return this.elt;
    }

    @objid ("3e7e6103-019c-4418-861e-98315611d25d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("31a99197-4622-43ae-8c6b-73a38bcc316f")
    protected TestLog(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("7b90d0a4-19d4-4e45-b9a5-9f294ef8a1e1")
    public static final class MdaTypes {
        @objid ("e09e95dc-a697-467e-9bce-0a422e42f2e1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5495297-a75d-477b-b97c-375d24110c74")
        private static Stereotype MDAASSOCDEP;

        @objid ("3d19cb9f-c095-4fc6-9f07-4f5d59ace7f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("efc68b65-5eea-49aa-ac24-9c0ceb53aa23")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "71ed0cf4-e2ab-11df-b4b4-0027103ea5f4");
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
