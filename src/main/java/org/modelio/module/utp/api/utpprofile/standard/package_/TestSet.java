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
 * Proxy class to handle a {@link Package} with << TestSet >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c05bc33a-d7b3-4b45-973d-2ddb1f123130")
public class TestSet {
    @objid ("e1a25b3a-532f-4686-b27d-a7064dc064e1")
    public static final String STEREOTYPE_NAME = "TestSet";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("abf67c65-80aa-4a90-9182-f24fe1e0d3cf")
    protected final Package elt;

    /**
     * Tells whether a {@link TestSet proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TestSet >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ff3ce5f8-b48b-4c07-81fa-98fdf873faa5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IUTPPeerModule.MODULE_NAME, TestSet.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TestSet >> then instantiate a {@link TestSet} proxy.
     * 
     * @return a {@link TestSet} proxy on the created {@link Package}.
     */
    @objid ("2f4d372c-5ad0-432c-8400-ea7005ab724d")
    public static TestSet create() {
        ModelElement e = (ModelElement)UTPModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(IUTPPeerModule.MODULE_NAME, TestSet.STEREOTYPE_NAME);
        return TestSet.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link TestSet} proxy from a {@link Package} stereotyped << TestSet >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link TestSet} proxy or <i>null</i>.
     */
    @objid ("a121d702-7dc3-481e-aad1-bd4acbc06a15")
    public static TestSet instantiate(final Package obj) {
        return TestSet.canInstantiate(obj) ? new TestSet(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TestSet} proxy from a {@link Package} stereotyped << TestSet >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link TestSet} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("229f133b-08a5-462d-b2c3-74a9369396ad")
    public static TestSet safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TestSet.canInstantiate(obj))
        	return new TestSet(obj);
        else
        	throw new IllegalArgumentException("TestSet: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("11a5bed9-9ae3-4b80-870e-9c9910a1141e")
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
        TestSet other = (TestSet) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("643a87be-fb21-4726-967e-aaf1755701d4")
    public Package getElement() {
        return this.elt;
    }

    @objid ("311a736b-aef5-41c7-8c7b-05db95dae617")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5f75e815-fa00-4285-9edd-e89ca91cb75b")
    protected TestSet(final Package elt) {
        this.elt = elt;
    }

    @objid ("12eea1ce-2ec0-471c-a4dd-762594db8b6b")
    public static final class MdaTypes {
        @objid ("85fb5fa0-d013-43a4-bae0-f3d50b650d92")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cbd6ec49-7bcf-4c87-80a9-8be5fa7fffe9")
        private static Stereotype MDAASSOCDEP;

        @objid ("bea1b7e6-3c4b-4404-95f0-17272b930a01")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf737ae9-b859-4909-8fe6-221b740fa675")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6cff6aed-e279-11df-b95d-0027103ea5f4");
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
