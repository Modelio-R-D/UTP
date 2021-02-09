/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class DataPoolClassifier {
    public static final String STEREOTYPE_NAME = "DataPool_Classifier";

    /**
     * The underlying {@link Classifier} represented by this proxy, never null.
     */
    protected final Classifier elt;

    /**
     * Tells whether a {@link DataPoolClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << DataPool_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, DataPoolClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << DataPool_Classifier >> then instantiate a {@link DataPoolClassifier} proxy.
     * 
     * @return a {@link DataPoolClassifier} proxy on the created {@link Classifier}.
     */
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
    public static DataPoolClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (DataPoolClassifier.canInstantiate(obj))
        	return new DataPoolClassifier(obj);
        else
        	throw new IllegalArgumentException("DataPoolClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public Classifier getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected DataPoolClassifier(final Classifier elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
