/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.calloperationaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
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
 * Proxy class to handle a {@link CallOperationAction} with << ValidationAction_CallOperationAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("64ed03ab-a087-46bb-915d-a54fc4513578")
public class ValidationActionCallOperationAction {
    @objid ("4fc96e43-0339-4de7-85d8-f5e6f61e59fa")
    public static final String STEREOTYPE_NAME = "ValidationAction_CallOperationAction";

    /**
     * The underlying {@link CallOperationAction} represented by this proxy, never null.
     */
    @objid ("d3c5c105-8fc1-4f7c-bb38-5d86582de900")
    protected final CallOperationAction elt;

    /**
     * Tells whether a {@link ValidationActionCallOperationAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallOperationAction} stereotyped << ValidationAction_CallOperationAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("addde2b1-4042-404b-ba94-324ebfd0f911")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallOperationAction) && ((CallOperationAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, ValidationActionCallOperationAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallOperationAction} stereotyped << ValidationAction_CallOperationAction >> then instantiate a {@link ValidationActionCallOperationAction} proxy.
     * 
     * @return a {@link ValidationActionCallOperationAction} proxy on the created {@link CallOperationAction}.
     */
    @objid ("24922a7b-11be-4947-9fc1-4bad2bf11843")
    public static ValidationActionCallOperationAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CallOperationAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, ValidationActionCallOperationAction.STEREOTYPE_NAME);
        return ValidationActionCallOperationAction.instantiate((CallOperationAction)e);
    }

    /**
     * Tries to instantiate a {@link ValidationActionCallOperationAction} proxy from a {@link CallOperationAction} stereotyped << ValidationAction_CallOperationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallOperationAction
     * @return a {@link ValidationActionCallOperationAction} proxy or <i>null</i>.
     */
    @objid ("f8b824c3-81b7-4b47-b1f5-ef2bcbca7716")
    public static ValidationActionCallOperationAction instantiate(final CallOperationAction obj) {
        return ValidationActionCallOperationAction.canInstantiate(obj) ? new ValidationActionCallOperationAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ValidationActionCallOperationAction} proxy from a {@link CallOperationAction} stereotyped << ValidationAction_CallOperationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CallOperationAction}
     * @return a {@link ValidationActionCallOperationAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("062a2383-6d1e-4cbe-b97a-344c087939db")
    public static ValidationActionCallOperationAction safeInstantiate(final CallOperationAction obj) throws IllegalArgumentException {
        if (ValidationActionCallOperationAction.canInstantiate(obj))
        	return new ValidationActionCallOperationAction(obj);
        else
        	throw new IllegalArgumentException("ValidationActionCallOperationAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("51584174-65d6-4372-b534-b06b1e279713")
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
        ValidationActionCallOperationAction other = (ValidationActionCallOperationAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CallOperationAction}. 
     * @return the CallOperationAction represented by this proxy, never null.
     */
    @objid ("a3b7aa47-4e91-4b28-82fc-33751cee0a9f")
    public CallOperationAction getElement() {
        return this.elt;
    }

    @objid ("f59fcf72-622f-4338-9642-c1baedb342ba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7e7bc3d0-e872-4a08-b973-e16cf6149890")
    protected ValidationActionCallOperationAction(final CallOperationAction elt) {
        this.elt = elt;
    }

    @objid ("a83b525b-c955-47ab-914b-150decaa491f")
    public static final class MdaTypes {
        @objid ("7ff53f9e-c100-4a60-b5f5-fd402b4fa69f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96baa607-b755-4c41-9d36-7071d8d8a58b")
        private static Stereotype MDAASSOCDEP;

        @objid ("3bd9b5b4-7264-4bde-80f5-8798b5c9ecb4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("948dc239-b149-4754-8af5-54d4e10b3212")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5824d3f0-e339-11df-9694-0027103ea5f4");
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
