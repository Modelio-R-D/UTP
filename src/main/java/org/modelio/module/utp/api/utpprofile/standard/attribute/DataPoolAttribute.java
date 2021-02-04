/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.module.utp.api.UTPProxyFactory;
import org.modelio.module.utp.impl.UTPModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << DataPool_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6c650a68-335f-40c9-a79b-a2426efb232f")
public class DataPoolAttribute {
    @objid ("a6d50afa-0b8b-4166-aaaf-e1621d6d531a")
    public static final String STEREOTYPE_NAME = "DataPool_Attribute";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("472cd753-42a2-4d2d-a821-34f0e56f616c")
    protected final Attribute elt;

    /**
     * Tells whether a {@link DataPoolAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << DataPool_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("93d5d888-162a-4e85-b95a-15eee5e01490")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, DataPoolAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << DataPool_Attribute >> then instantiate a {@link DataPoolAttribute} proxy.
     * 
     * @return a {@link DataPoolAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("508bd25e-0fcb-40ba-83c0-487bba89c29c")
    public static DataPoolAttribute create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, DataPoolAttribute.STEREOTYPE_NAME);
        return DataPoolAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link DataPoolAttribute} proxy from a {@link Attribute} stereotyped << DataPool_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link DataPoolAttribute} proxy or <i>null</i>.
     */
    @objid ("5b4cbe02-8d3d-4117-92b3-2b585fefa6e7")
    public static DataPoolAttribute instantiate(final Attribute obj) {
        return DataPoolAttribute.canInstantiate(obj) ? new DataPoolAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataPoolAttribute} proxy from a {@link Attribute} stereotyped << DataPool_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link DataPoolAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4fb6a036-3b52-44b5-abec-3e9968e33a8a")
    public static DataPoolAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (DataPoolAttribute.canInstantiate(obj))
        	return new DataPoolAttribute(obj);
        else
        	throw new IllegalArgumentException("DataPoolAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67711490-d275-4f2d-b9c0-4debb4280bf9")
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
        DataPoolAttribute other = (DataPoolAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("5d6e5279-b155-4c66-ab2e-202f9f0a9297")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("825e59d0-3886-459a-bf0d-1803aa4fe5df")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3f97659f-0490-4ad1-be03-90dfd3d6c79e")
    protected DataPoolAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("5b98d66e-2cf9-4ac3-b418-9c94f262d5b6")
    public static final class MdaTypes {
        @objid ("f73a2093-a829-4acc-bb87-da50b632964b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("214b7c44-cf5e-4c3f-a4cd-758cd7ac1e1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("07e6d9bd-92f8-4f0d-b446-a8af311179d1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e54f026a-6a6d-431f-ad32-2ced2a0db17f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1878d458-e364-11df-a678-0027103ea5f4");
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
