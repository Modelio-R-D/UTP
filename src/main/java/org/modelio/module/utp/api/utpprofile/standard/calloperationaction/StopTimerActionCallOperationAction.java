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
 * Proxy class to handle a {@link CallOperationAction} with << StopTimerAction_CallOperationAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d703326c-30df-41d6-bd46-9e8d5e7aa5cc")
public class StopTimerActionCallOperationAction {
    @objid ("664b868a-1903-4037-bfb1-c6e8b44ebcf1")
    public static final String STEREOTYPE_NAME = "StopTimerAction_CallOperationAction";

    /**
     * The underlying {@link CallOperationAction} represented by this proxy, never null.
     */
    @objid ("7f69b187-403b-4f1f-9680-66a5b9856a93")
    protected final CallOperationAction elt;

    /**
     * Tells whether a {@link StopTimerActionCallOperationAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallOperationAction} stereotyped << StopTimerAction_CallOperationAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1a291c7f-2a45-4e81-841b-a8c57d118ae1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallOperationAction) && ((CallOperationAction) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, StopTimerActionCallOperationAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallOperationAction} stereotyped << StopTimerAction_CallOperationAction >> then instantiate a {@link StopTimerActionCallOperationAction} proxy.
     * 
     * @return a {@link StopTimerActionCallOperationAction} proxy on the created {@link CallOperationAction}.
     */
    @objid ("99099692-588a-422b-8e7e-9506ba5e18bc")
    public static StopTimerActionCallOperationAction create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CallOperationAction");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, StopTimerActionCallOperationAction.STEREOTYPE_NAME);
        return StopTimerActionCallOperationAction.instantiate((CallOperationAction)e);
    }

    /**
     * Tries to instantiate a {@link StopTimerActionCallOperationAction} proxy from a {@link CallOperationAction} stereotyped << StopTimerAction_CallOperationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallOperationAction
     * @return a {@link StopTimerActionCallOperationAction} proxy or <i>null</i>.
     */
    @objid ("058fad0f-5acf-4d17-8350-49305d61d7b0")
    public static StopTimerActionCallOperationAction instantiate(final CallOperationAction obj) {
        return StopTimerActionCallOperationAction.canInstantiate(obj) ? new StopTimerActionCallOperationAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StopTimerActionCallOperationAction} proxy from a {@link CallOperationAction} stereotyped << StopTimerAction_CallOperationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CallOperationAction}
     * @return a {@link StopTimerActionCallOperationAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a86db963-dc09-44f6-bff4-2668c30a5629")
    public static StopTimerActionCallOperationAction safeInstantiate(final CallOperationAction obj) throws IllegalArgumentException {
        if (StopTimerActionCallOperationAction.canInstantiate(obj))
        	return new StopTimerActionCallOperationAction(obj);
        else
        	throw new IllegalArgumentException("StopTimerActionCallOperationAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6d04c80f-182b-4f3b-865e-38c8441225ef")
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
        StopTimerActionCallOperationAction other = (StopTimerActionCallOperationAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CallOperationAction}. 
     * @return the CallOperationAction represented by this proxy, never null.
     */
    @objid ("73d2e5b4-b01d-41cc-b9a2-aedbbfa6e286")
    public CallOperationAction getElement() {
        return this.elt;
    }

    @objid ("3cd20de2-46ab-48e5-aa3c-9d567de875aa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0d38135c-a084-4192-9987-8a4295cbc173")
    protected StopTimerActionCallOperationAction(final CallOperationAction elt) {
        this.elt = elt;
    }

    @objid ("06ce1043-6f8c-4e91-b303-9755432731f9")
    public static final class MdaTypes {
        @objid ("2b58e118-b1ef-4cee-9c7d-250f3c2ba97d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17d5132b-cdb3-492b-8668-4e025d305305")
        private static Stereotype MDAASSOCDEP;

        @objid ("5c264bb4-8589-430a-bfce-632728ff1516")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d515733e-d257-4041-9fb3-d1c709240695")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "242e98cd-e33a-11df-9694-0027103ea5f4");
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
