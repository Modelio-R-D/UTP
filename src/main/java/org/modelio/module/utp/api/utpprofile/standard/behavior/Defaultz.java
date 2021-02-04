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
 * Proxy class to handle a {@link Behavior} with << Default >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5db0b1a-ca46-47f0-82d6-0ac472cf7fbf")
public class Defaultz {
    @objid ("f982b9d8-104f-442e-80fa-9c22a8dc4bc4")
    public static final String STEREOTYPE_NAME = "Default";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("494fec4b-90f9-44b3-8d43-850ffc87af58")
    protected final Behavior elt;

    /**
     * Tells whether a {@link Defaultz proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << Default >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5edb098d-b5c0-431c-a65e-b5c321a596c8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, Defaultz.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << Default >> then instantiate a {@link Defaultz} proxy.
     * 
     * @return a {@link Defaultz} proxy on the created {@link Behavior}.
     */
    @objid ("678d4a77-77a2-4bff-9c84-756873144e78")
    public static Defaultz create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, Defaultz.STEREOTYPE_NAME);
        return Defaultz.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link Defaultz} proxy from a {@link Behavior} stereotyped << Default >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link Defaultz} proxy or <i>null</i>.
     */
    @objid ("f7794ba2-d54e-41d4-9925-9b990cc70484")
    public static Defaultz instantiate(final Behavior obj) {
        return Defaultz.canInstantiate(obj) ? new Defaultz(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Defaultz} proxy from a {@link Behavior} stereotyped << Default >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link Defaultz} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f26baa5b-aa75-4bf1-a6f3-e9bb61850495")
    public static Defaultz safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (Defaultz.canInstantiate(obj))
        	return new Defaultz(obj);
        else
        	throw new IllegalArgumentException("Defaultz: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("315b63de-ca98-4c03-a5a3-43a2a49b2f4d")
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
        Defaultz other = (Defaultz) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("720ec194-3683-4725-a4e7-fea0d40e2178")
    public Behavior getElement() {
        return this.elt;
    }

    @objid ("67246543-0608-44e3-8ee9-fd9969819bcd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("41a1acc4-d4ef-4098-b4f9-5ecfd9821446")
    protected Defaultz(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("d2f3071e-3961-422c-a59f-883e1a37bc10")
    public static final class MdaTypes {
        @objid ("2a051e85-513b-4972-9720-e1b7bd549a44")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("54d7db80-a5a1-48a2-9c7b-b0f778b5ca20")
        private static Stereotype MDAASSOCDEP;

        @objid ("2742f813-fadf-4058-9062-2b7be6b8674e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("659d4328-379f-4bc0-8342-179c6085b2e6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "43efe2e6-e339-11df-9694-0027103ea5f4");
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
