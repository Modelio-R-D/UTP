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
 * Proxy class to handle a {@link CallOperationAction} with << ReadTimerAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("88312025-9e90-4948-8da9-b5c481c2139e")
public class ReadTimerAction {
    @objid ("489f1e2e-4996-4c69-aa0c-ba2645e122b5")
    public static final String STEREOTYPE_NAME = "ReadTimerAction";

    /**
     * The underlying {@link CallOperationAction} represented by this proxy, never null.
     */
    @objid ("c027f438-7bbb-4a35-9bef-28ccedddc376")
    protected final CallOperationAction elt;

    /**
     * Tells whether a {@link ReadTimerAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallOperationAction} stereotyped << ReadTimerAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f2626e8d-b0a0-43c7-b10b-b9db5dc657b8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallOperationAction) && ((CallOperationAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, ReadTimerAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallOperationAction} stereotyped << ReadTimerAction >> then instantiate a {@link ReadTimerAction} proxy.
     * 
     * @return a {@link ReadTimerAction} proxy on the created {@link CallOperationAction}.
     */
    @objid ("06c9543c-2b3d-4467-ae72-3397bbbbd1ad")
    public static ReadTimerAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CallOperationAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, ReadTimerAction.STEREOTYPE_NAME);
        return ReadTimerAction.instantiate((CallOperationAction)e);
    }

    /**
     * Tries to instantiate a {@link ReadTimerAction} proxy from a {@link CallOperationAction} stereotyped << ReadTimerAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallOperationAction
     * @return a {@link ReadTimerAction} proxy or <i>null</i>.
     */
    @objid ("29b85f44-b972-4628-a2a4-d855fe1032ed")
    public static ReadTimerAction instantiate(final CallOperationAction obj) {
        return ReadTimerAction.canInstantiate(obj) ? new ReadTimerAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ReadTimerAction} proxy from a {@link CallOperationAction} stereotyped << ReadTimerAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CallOperationAction}
     * @return a {@link ReadTimerAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e99e7831-aeeb-41cb-9997-970aa2bf7ffc")
    public static ReadTimerAction safeInstantiate(final CallOperationAction obj) throws IllegalArgumentException {
        if (ReadTimerAction.canInstantiate(obj))
        	return new ReadTimerAction(obj);
        else
        	throw new IllegalArgumentException("ReadTimerAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("17b0752b-5d46-49ad-9f2c-983e91985b46")
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
        ReadTimerAction other = (ReadTimerAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CallOperationAction}. 
     * @return the CallOperationAction represented by this proxy, never null.
     */
    @objid ("bf8fc9f7-6918-409b-9ff1-1213e20b5641")
    public CallOperationAction getElement() {
        return this.elt;
    }

    @objid ("c134c99d-803d-4f03-b134-e48f82008e34")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("76510a66-36e1-4cb3-8483-402704dd63c3")
    protected ReadTimerAction(final CallOperationAction elt) {
        this.elt = elt;
    }

    @objid ("ac5153cb-b247-4756-a27d-c4691d507bae")
    public static final class MdaTypes {
        @objid ("acbaa407-c463-4728-a49a-5d7f725e3589")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb3b5cf8-1df0-4b7c-8454-c486e98c1593")
        private static Stereotype MDAASSOCDEP;

        @objid ("48f0b524-4781-4e0a-b785-4b75b3f2dc4f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("951da1ed-cd7b-46b3-a74f-9e24f354ed98")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2daef040-e33a-11df-9694-0027103ea5f4");
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
