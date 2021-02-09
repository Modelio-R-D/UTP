/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.package_;

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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << U2TPTypes >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class U2TPTypes {
    public static final String STEREOTYPE_NAME = "U2TPTypes";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    protected final Package elt;

    /**
     * Tells whether a {@link U2TPTypes proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << U2TPTypes >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, U2TPTypes.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << U2TPTypes >> then instantiate a {@link U2TPTypes} proxy.
     * 
     * @return a {@link U2TPTypes} proxy on the created {@link Package}.
     */
    public static U2TPTypes create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, U2TPTypes.STEREOTYPE_NAME);
        return U2TPTypes.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link U2TPTypes} proxy from a {@link Package} stereotyped << U2TPTypes >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link U2TPTypes} proxy or <i>null</i>.
     */
    public static U2TPTypes instantiate(final Package obj) {
        return U2TPTypes.canInstantiate(obj) ? new U2TPTypes(obj) : null;
    }

    /**
     * Tries to instantiate a {@link U2TPTypes} proxy from a {@link Package} stereotyped << U2TPTypes >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link U2TPTypes} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static U2TPTypes safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (U2TPTypes.canInstantiate(obj))
        	return new U2TPTypes(obj);
        else
        	throw new IllegalArgumentException("U2TPTypes: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        U2TPTypes other = (U2TPTypes) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    public Package getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected U2TPTypes(final Package elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7141dc50-e69e-11df-87fb-0027103ea5f4");
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
