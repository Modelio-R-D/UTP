/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.opaqueaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
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
 * Proxy class to handle a {@link OpaqueAction} with << LogAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3e3aefa1-746b-4c7a-b25a-f93e239e7f44")
public class LogAction {
    @objid ("7f8187c0-0130-459e-b0c6-fb4504b1bb76")
    public static final String STEREOTYPE_NAME = "LogAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("3c33f24c-e45c-4a79-bf39-8e1ae966b56d")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link LogAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << LogAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("35d453f1-85cc-4f51-b57c-369668f89bed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, LogAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << LogAction >> then instantiate a {@link LogAction} proxy.
     * 
     * @return a {@link LogAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("8a4092c4-e4de-4eca-a7f6-7a2d009a6eea")
    public static LogAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.OpaqueAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, LogAction.STEREOTYPE_NAME);
        return LogAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link LogAction} proxy from a {@link OpaqueAction} stereotyped << LogAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link LogAction} proxy or <i>null</i>.
     */
    @objid ("689c436c-9ffe-4b14-a2b5-9706a6a95ada")
    public static LogAction instantiate(final OpaqueAction obj) {
        return LogAction.canInstantiate(obj) ? new LogAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LogAction} proxy from a {@link OpaqueAction} stereotyped << LogAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link LogAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cd17d970-a858-4663-a499-619d5d058098")
    public static LogAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (LogAction.canInstantiate(obj))
        	return new LogAction(obj);
        else
        	throw new IllegalArgumentException("LogAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("be992629-9a25-4414-8f97-abbea2e8bfcf")
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
        LogAction other = (LogAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("f0494aa5-cf7d-4cf0-8086-8438d48110d3")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("aa10d985-e8d8-422a-9616-8491bfc6c5a0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0952bb3e-aa85-4df5-93b4-d9c9bd6cffa5")
    protected LogAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("b35c9a43-b488-4ca4-9166-0cbaa03a0b8c")
    public static final class MdaTypes {
        @objid ("3b1234e0-845f-4b0a-824a-747541408b6b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8562d46c-7772-468a-afff-e685c18c7b43")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b8e20d0-e153-44e6-9824-6a06201f34dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("945445d5-b1b4-488f-a2d6-88ee9db692be")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "708b2e14-e339-11df-9694-0027103ea5f4");
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
