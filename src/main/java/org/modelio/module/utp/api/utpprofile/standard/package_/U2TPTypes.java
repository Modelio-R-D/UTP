/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.package_;

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
@objid ("1fb5879f-a4af-4105-8ae4-3641a8d5db04")
public class U2TPTypes {
    @objid ("1bbc77f5-3b0a-476a-a700-d9797e95904d")
    public static final String STEREOTYPE_NAME = "U2TPTypes";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("777899ec-bf39-4946-8b31-d3f392a25dac")
    protected final Package elt;

    /**
     * Tells whether a {@link U2TPTypes proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << U2TPTypes >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e268bc6a-4676-43fb-8932-d0b66c665c89")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, U2TPTypes.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << U2TPTypes >> then instantiate a {@link U2TPTypes} proxy.
     * 
     * @return a {@link U2TPTypes} proxy on the created {@link Package}.
     */
    @objid ("d35d51f5-dabe-4ff1-a92e-ef1b2ad1cb76")
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
    @objid ("363d5bba-9fe1-414b-bd83-e9eb5287f8e8")
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
    @objid ("b43b3efb-59df-4870-8158-086885454596")
    public static U2TPTypes safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (U2TPTypes.canInstantiate(obj))
        	return new U2TPTypes(obj);
        else
        	throw new IllegalArgumentException("U2TPTypes: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("112f45d3-3066-4530-b3d2-f4664664dcc4")
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
    @objid ("ce27b994-a225-420f-8709-faf9ef4f3298")
    public Package getElement() {
        return this.elt;
    }

    @objid ("4ef39c0c-ca37-4ebe-b686-89ca918bd46b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d181866e-dc6c-4c38-b27e-3045941524cc")
    protected U2TPTypes(final Package elt) {
        this.elt = elt;
    }

    @objid ("2df65fdf-340a-4585-bf00-fc5bac322518")
    public static final class MdaTypes {
        @objid ("674fdb6d-e63a-45ee-93e2-e19ceba66598")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b999837-01a3-4aae-8818-dd5c799a657a")
        private static Stereotype MDAASSOCDEP;

        @objid ("9b0ebf76-ab22-4919-8240-301f92133e98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("498bb0c4-67d8-48e3-b96e-729705591c73")
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
