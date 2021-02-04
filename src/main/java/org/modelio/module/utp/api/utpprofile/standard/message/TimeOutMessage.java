/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: UTP v4.1.00

 * This file was generated on 2/4/21 5:48 PM by Modelio Studio.
 */
package org.modelio.module.utp.api.utpprofile.standard.message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
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
 * Proxy class to handle a {@link Message} with << TimeOutMessage >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("193fc1f3-a2f2-4a81-94ea-6510e4c25ece")
public class TimeOutMessage {
    @objid ("cd8fce5d-f8c5-4c48-9097-fbb1870ae0ed")
    public static final String STEREOTYPE_NAME = "TimeOutMessage";

    /**
     * The underlying {@link Message} represented by this proxy, never null.
     */
    @objid ("4a9fb67d-7c65-4dca-951c-709fc8c2ed72")
    protected final Message elt;

    /**
     * Tells whether a {@link TimeOutMessage proxy} can be instantiated from a {@link MObject} checking it is a {@link Message} stereotyped << TimeOutMessage >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c85662ee-afd0-47c6-9d22-d1fcaf9a0e91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Message) && ((Message) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TimeOutMessage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Message} stereotyped << TimeOutMessage >> then instantiate a {@link TimeOutMessage} proxy.
     * 
     * @return a {@link TimeOutMessage} proxy on the created {@link Message}.
     */
    @objid ("d828539e-fb20-4dd9-a4d1-395a59270bb4")
    public static TimeOutMessage create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Message");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TimeOutMessage.STEREOTYPE_NAME);
        return TimeOutMessage.instantiate((Message)e);
    }

    /**
     * Tries to instantiate a {@link TimeOutMessage} proxy from a {@link Message} stereotyped << TimeOutMessage >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Message
     * @return a {@link TimeOutMessage} proxy or <i>null</i>.
     */
    @objid ("3ad3d735-8cd7-412c-b9b3-7504912f30d9")
    public static TimeOutMessage instantiate(final Message obj) {
        return TimeOutMessage.canInstantiate(obj) ? new TimeOutMessage(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimeOutMessage} proxy from a {@link Message} stereotyped << TimeOutMessage >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Message}
     * @return a {@link TimeOutMessage} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d9e271ed-4d39-4d3b-af14-ea9da87cf564")
    public static TimeOutMessage safeInstantiate(final Message obj) throws IllegalArgumentException {
        if (TimeOutMessage.canInstantiate(obj))
        	return new TimeOutMessage(obj);
        else
        	throw new IllegalArgumentException("TimeOutMessage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e0933515-20b7-46bb-a02e-1fbded1ee881")
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
        TimeOutMessage other = (TimeOutMessage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Message}. 
     * @return the Message represented by this proxy, never null.
     */
    @objid ("47609fa5-b383-4a15-bf8b-1ba83fa07200")
    public Message getElement() {
        return this.elt;
    }

    @objid ("28d809d5-97ee-4fa3-bc1f-b51b4a60c428")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("876d13c3-1584-4ff1-84e3-4c0098f8c2e3")
    protected TimeOutMessage(final Message elt) {
        this.elt = elt;
    }

    @objid ("ad06f5ad-4056-4484-8f15-27b5ee4cabfa")
    public static final class MdaTypes {
        @objid ("6b3f1c11-2393-4776-afa6-2590a7ad99ef")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0356365b-da55-45e9-be05-8e95e17ee7ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("40cd8219-6208-478a-806c-e9c6b9f023b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b0e92b04-722f-4327-9969-7075bf13745c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0180e89e-e33a-11df-9694-0027103ea5f4");
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
