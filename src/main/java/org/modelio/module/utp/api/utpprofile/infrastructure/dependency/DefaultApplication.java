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
 * Proxy class to handle a {@link Dependency} with << DefaultApplication >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1ec3b54d-4fce-448e-a90f-ab7b3d72df11")
public class DefaultApplication {
    @objid ("3f58faf6-68e8-4ff3-8545-f7e62c91c388")
    public static final String STEREOTYPE_NAME = "DefaultApplication";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c94174db-2b1c-4066-a32c-0fda60d6cfd7")
    protected final Dependency elt;

    /**
     * Tells whether a {@link DefaultApplication proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << DefaultApplication >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("79fec4f0-6ab7-4b43-a594-5b1be6b010fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, DefaultApplication.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << DefaultApplication >> then instantiate a {@link DefaultApplication} proxy.
     * 
     * @return a {@link DefaultApplication} proxy on the created {@link Dependency}.
     */
    @objid ("e8fa7ac7-ceba-4cc5-a00b-10b3b9ea51f7")
    public static DefaultApplication create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, DefaultApplication.STEREOTYPE_NAME);
        return DefaultApplication.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link DefaultApplication} proxy from a {@link Dependency} stereotyped << DefaultApplication >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link DefaultApplication} proxy or <i>null</i>.
     */
    @objid ("8d977560-cb96-4389-99ed-6b34dd52af79")
    public static DefaultApplication instantiate(final Dependency obj) {
        return DefaultApplication.canInstantiate(obj) ? new DefaultApplication(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DefaultApplication} proxy from a {@link Dependency} stereotyped << DefaultApplication >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link DefaultApplication} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e9393f15-8302-413e-9285-be06efa4beff")
    public static DefaultApplication safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (DefaultApplication.canInstantiate(obj))
        	return new DefaultApplication(obj);
        else
        	throw new IllegalArgumentException("DefaultApplication: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("71c8aa8b-dd5d-4d44-a288-3b0e34c89257")
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
        DefaultApplication other = (DefaultApplication) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("24bc7b57-7a8a-485b-9a41-8716dbca9871")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("4b57e5bb-e03b-4853-8c35-9b2d12c24569")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("78ba2795-c070-4515-a71a-e11b5bf5c6a3")
    protected DefaultApplication(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("4a25a654-403f-4d59-b27a-1ac366f18c07")
    public static final class MdaTypes {
        @objid ("2bc1a358-59ea-40b3-8bba-31b8c2ac98fb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1f3f5438-aa5d-43cb-a9ab-a3471830ce05")
        private static Stereotype MDAASSOCDEP;

        @objid ("16aa7b83-d24c-47a6-9580-4380d5450404")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("83b5e660-1ba6-45ca-9d29-1cbd52290d71")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "50726a80-e339-11df-9694-0027103ea5f4");
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
