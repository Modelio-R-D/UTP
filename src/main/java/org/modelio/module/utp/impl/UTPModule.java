package org.modelio.module.utp.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.parameter.IParameterEditionModel;
import org.modelio.api.module.parameter.impl.ParametersEditionModel;
import org.modelio.gproject.ramc.core.model.IModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;

@objid ("7eb74b24-34bd-45c3-a00d-836064b6e0c4")
public class UTPModule extends AbstractJavaModule {
    @objid ("90f6ff44-c8eb-4e54-aa32-867747ef1e4c")
    private UTPPeerModule peerMdac = null;

    @objid ("ad764770-4334-4b6d-b2a9-340715b438ce")
    private UTPSession session = null;

    @objid ("becb4643-d4e5-4701-a5a8-930615a98999")
    public static UTPLogService logService;

    @objid ("2d6c0c81-39b4-4239-80d1-f31cb6bb2863")
    private static UTPModule instance;

    /**
     * Builds a new module.
     * This constructor must not be called by the user. It is automatically invoked by Modelio when the module is installed, selected or started.
     */
    @objid ("ddfd4fc5-819b-43e7-a758-4b4b85e40701")
    public UTPModule(IModuleContext moduleContext) {
        super(moduleContext);
        this.session = new UTPSession(this);
        this.peerMdac = new UTPPeerModule(this, moduleContext.getPeerConfiguration());
        UTPModule.logService = new UTPLogService(this.getModuleContext().getLogService(), this);
        instance = this;
    }

    @objid ("6c9b16a2-ea84-40a7-8d9e-ec5811808f4f")
    public static UTPModule getInstance() {
        return instance;
    }

    @objid ("99812497-5c3d-4b37-8bfa-92df70ceed63")
    @Override
    public UTPPeerModule getPeerModule() {
        return this.peerMdac;
    }

    /**
     * Method automatically called just after the creation of the module.
     * The module is automatically instanciated at the beginning of the MDA lifecycle and constructor implementation is not accessible to the module developer.
     * The <code>init</code> method allows the developer to execute the desired initialization.
     */
    @objid ("9a5b5da9-c977-4813-b7a2-9eb4374544d1")
    @Override
    public void init() {
    }

    @objid ("20343816-0b57-40e7-920c-42a80306225f")
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        if (this.parameterEditionModel == null) {
            ParametersEditionModel parameters = new ParametersEditionModel(this);
            this.parameterEditionModel = parameters;
        }
        return this.parameterEditionModel;
    }

    @objid ("f4e029b9-66d3-44f2-9e79-4ca56e3eb0e2")
    @Override
    public String getModuleImagePath() {
        return "/res/icon/module.png";
    }

    @objid ("f44390e2-6b6d-42a4-a2aa-774a5ceb2952")
    @Override
    public IModelComponentContributor getModelComponentContributor(IModelComponent mc) {
        return new UTPModelComponentContributor(this);
    }

    @objid ("1fd58885-c2e5-4c57-a446-b57ea4787454")
    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.session;
    }

}
