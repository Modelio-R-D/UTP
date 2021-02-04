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
 * Proxy class to handle a {@link Classifier} with << DataPool_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ea4a9114-153b-4b98-b94f-054334ffcf14")
public class DataPoolClassifier {
    @objid ("ade85cc7-9ca1-4b13-8e19-9358be47b1bb")
    public static final String STEREOTYPE_NAME = "DataPool_Classifier";

    /**
     * The underlying {@link Classifier} represented by this proxy, never null.
     */
    @objid ("6ae99914-64ea-4904-aae2-14fd37bc92ba")
    protected final Classifier elt;

    /**
     * Tells whether a {@link DataPoolClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << DataPool_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fbd514a1-b2d7-4718-b6e8-cb8d7e09b385")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, DataPoolClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << DataPool_Classifier >> then instantiate a {@link DataPoolClassifier} proxy.
     * 
     * @return a {@link DataPoolClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("f366e0ee-d334-4f1b-b873-04b77d4ff70b")
    public static DataPoolClassifier create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, DataPoolClassifier.STEREOTYPE_NAME);
        return DataPoolClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link DataPoolClassifier} proxy from a {@link Classifier} stereotyped << DataPool_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link DataPoolClassifier} proxy or <i>null</i>.
     */
    @objid ("9e6415b8-64e7-4861-8cee-f59a1f8a6a0a")
    public static DataPoolClassifier instantiate(final Classifier obj) {
        return DataPoolClassifier.canInstantiate(obj) ? new DataPoolClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataPoolClassifier} proxy from a {@link Classifier} stereotyped << DataPool_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link DataPoolClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("80d8735b-1ebf-4a88-9787-c244c202e45d")
    public static DataPoolClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (DataPoolClassifier.canInstantiate(obj))
        	return new DataPoolClassifier(obj);
        else
        	throw new IllegalArgumentException("DataPoolClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e33348dd-fcfe-4ec2-8901-5f7b9f3e7c77")
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
        DataPoolClassifier other = (DataPoolClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("cc4ec70d-7dab-4787-8655-6423ef1e9f07")
    public Classifier getElement() {
        return this.elt;
    }

    @objid ("31475a83-23f6-4a7c-8a47-cb7140a124b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("12c0f6c8-9738-43b5-8bd2-b07e985aa062")
    protected DataPoolClassifier(final Classifier elt) {
        this.elt = elt;
    }

    @objid ("2197253f-7461-4be2-ad65-64a8d14ca4bf")
    public static final class MdaTypes {
        @objid ("63a87a63-1e9c-4250-aaee-ea9e6a0f7e64")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4f453d15-68dc-40ce-85b9-bca4a37fff2b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7cca7b91-422a-45ae-95b2-c5f68c4a1dbf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b59e5593-9811-4c77-bbd7-9faed12bfc53")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0fba242a-e364-11df-a678-0027103ea5f4");
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
