/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.activityaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
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
 * Proxy class to handle a {@link ActivityAction} with << FinishAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5690b12d-4cf2-43c7-b4a6-ef1ccdb3b588")
public class FinishAction {
    @objid ("faf82d4f-a102-4f17-a85e-6fe0d7aef5e0")
    public static final String STEREOTYPE_NAME = "FinishAction";

    /**
     * The underlying {@link ActivityAction} represented by this proxy, never null.
     */
    @objid ("0b29bea1-f992-4a82-ac8c-59473ea2fa5a")
    protected final ActivityAction elt;

    /**
     * Tells whether a {@link FinishAction proxy} can be instantiated from a {@link MObject} checking it is a {@link ActivityAction} stereotyped << FinishAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6255cb0e-4b56-44e7-a1db-02341a2d19cd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ActivityAction) && ((ActivityAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, FinishAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ActivityAction} stereotyped << FinishAction >> then instantiate a {@link FinishAction} proxy.
     * 
     * @return a {@link FinishAction} proxy on the created {@link ActivityAction}.
     */
    @objid ("a6ded722-749e-4bd4-905c-e4bd9517fcd8")
    public static FinishAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ActivityAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, FinishAction.STEREOTYPE_NAME);
        return FinishAction.instantiate((ActivityAction)e);
    }

    /**
     * Tries to instantiate a {@link FinishAction} proxy from a {@link ActivityAction} stereotyped << FinishAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ActivityAction
     * @return a {@link FinishAction} proxy or <i>null</i>.
     */
    @objid ("ae483c01-8f5b-4ba8-a0f9-94a79f3a3159")
    public static FinishAction instantiate(final ActivityAction obj) {
        return FinishAction.canInstantiate(obj) ? new FinishAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FinishAction} proxy from a {@link ActivityAction} stereotyped << FinishAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ActivityAction}
     * @return a {@link FinishAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7b44855e-883a-4499-8128-123de9eb31d0")
    public static FinishAction safeInstantiate(final ActivityAction obj) throws IllegalArgumentException {
        if (FinishAction.canInstantiate(obj))
        	return new FinishAction(obj);
        else
        	throw new IllegalArgumentException("FinishAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4517ed5d-555a-4783-a16b-06f9fc6bec4d")
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
        FinishAction other = (FinishAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ActivityAction}. 
     * @return the ActivityAction represented by this proxy, never null.
     */
    @objid ("a2e3e10b-9c7c-4d8f-9776-4e238e3f0c51")
    public ActivityAction getElement() {
        return this.elt;
    }

    @objid ("91a85484-aa65-4ee1-954c-f51cf28b3300")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d70c9bbb-6761-4e68-a985-df02064888f9")
    protected FinishAction(final ActivityAction elt) {
        this.elt = elt;
    }

    @objid ("be2abb32-42e3-4650-b681-412b9ad167a0")
    public static final class MdaTypes {
        @objid ("ce1460b6-d4d5-4a89-a7b8-d4a7e28d5900")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4a0fa333-97f5-4075-b85c-a132b5146f3b")
        private static Stereotype MDAASSOCDEP;

        @objid ("af6d103e-baee-442c-951b-20eeb66e1b2f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5bc42445-d125-4f55-ad37-d1a621f907bd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "639bd821-e339-11df-9694-0027103ea5f4");
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
