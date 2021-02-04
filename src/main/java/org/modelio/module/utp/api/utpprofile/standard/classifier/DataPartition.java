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
 * Proxy class to handle a {@link Classifier} with << DataPartition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a0f50f57-88a2-45bc-b533-44d4964268a7")
public class DataPartition {
    @objid ("39d48306-2ba6-4db6-b18e-a65b240073f7")
    public static final String STEREOTYPE_NAME = "DataPartition";

    /**
     * The underlying {@link Classifier} represented by this proxy, never null.
     */
    @objid ("009e9841-9627-4f4f-b720-f8931675f7c0")
    protected final Classifier elt;

    /**
     * Tells whether a {@link DataPartition proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << DataPartition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("16235b48-c6a4-4989-8264-61bfc033f88e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, DataPartition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << DataPartition >> then instantiate a {@link DataPartition} proxy.
     * 
     * @return a {@link DataPartition} proxy on the created {@link Classifier}.
     */
    @objid ("e7e06ed9-585c-495e-9ffe-48cf53ae8ed7")
    public static DataPartition create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, DataPartition.STEREOTYPE_NAME);
        return DataPartition.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link DataPartition} proxy from a {@link Classifier} stereotyped << DataPartition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link DataPartition} proxy or <i>null</i>.
     */
    @objid ("8db7a88c-7b84-4ca9-930c-aaf039c7d6b7")
    public static DataPartition instantiate(final Classifier obj) {
        return DataPartition.canInstantiate(obj) ? new DataPartition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataPartition} proxy from a {@link Classifier} stereotyped << DataPartition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link DataPartition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5397d405-182c-4a46-8d6b-00352ec77cdf")
    public static DataPartition safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (DataPartition.canInstantiate(obj))
        	return new DataPartition(obj);
        else
        	throw new IllegalArgumentException("DataPartition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("974ad22e-6ac1-4ef5-b039-b45a1b375729")
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
        DataPartition other = (DataPartition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("ba8c7b2f-3002-4483-8060-68997006fbb1")
    public Classifier getElement() {
        return this.elt;
    }

    @objid ("a11ee2b1-621e-4951-9451-7dfed33ced84")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a7e501f1-f740-4cd4-9b6e-69c2890acaa9")
    protected DataPartition(final Classifier elt) {
        this.elt = elt;
    }

    @objid ("9c47a61f-f65d-4c8e-bf81-3302ba44428f")
    public static final class MdaTypes {
        @objid ("2da12f52-0632-499e-ace6-e69872e45f75")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e3ca42a7-44df-431d-a17c-3bb2f9e101c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("48b8ce78-2c3c-4310-ac2a-fa176796205c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1a44c3f-03b9-4bac-b254-45406289a01e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2f1d9cda-e364-11df-a678-0027103ea5f4");
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
