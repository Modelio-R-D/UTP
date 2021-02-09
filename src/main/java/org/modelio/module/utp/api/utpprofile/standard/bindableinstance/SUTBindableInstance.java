/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.bindableinstance;

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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BindableInstance} with << SUT_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SUTBindableInstance {
    public static final String STEREOTYPE_NAME = "SUT_BindableInstance";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link SUTBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << SUT_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, SUTBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << SUT_BindableInstance >> then instantiate a {@link SUTBindableInstance} proxy.
     * 
     * @return a {@link SUTBindableInstance} proxy on the created {@link BindableInstance}.
     */
    public static SUTBindableInstance create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.BindableInstance");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, SUTBindableInstance.STEREOTYPE_NAME);
        return SUTBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link SUTBindableInstance} proxy from a {@link BindableInstance} stereotyped << SUT_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link SUTBindableInstance} proxy or <i>null</i>.
     */
    public static SUTBindableInstance instantiate(final BindableInstance obj) {
        return SUTBindableInstance.canInstantiate(obj) ? new SUTBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SUTBindableInstance} proxy from a {@link BindableInstance} stereotyped << SUT_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BindableInstance}
     * @return a {@link SUTBindableInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SUTBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (SUTBindableInstance.canInstantiate(obj))
        	return new SUTBindableInstance(obj);
        else
        	throw new IllegalArgumentException("SUTBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SUTBindableInstance other = (SUTBindableInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link BindableInstance}. 
     * @return the BindableInstance represented by this proxy, never null.
     */
    public BindableInstance getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected SUTBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "483cdbe9-7e6f-41ae-8d2a-6ecd2e79ce1b");
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
