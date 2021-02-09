package org.modelio.module.utp.impl;

import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.parameter.IParameterEditionModel;
import org.modelio.api.module.parameter.impl.ParametersEditionModel;
import org.modelio.gproject.ramc.core.model.IModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;

public class UTPModule extends AbstractJavaModule {
    private UTPPeerModule peerMdac = null;

    private UTPSession session = null;

    public static UTPLogService logService;

    private static UTPModule instance;

    /**
     * Builds a new module.
     * This constructor must not be called by the user. It is automatically invoked by Modelio when the module is installed, selected or started.
     */
    public UTPModule(IModuleContext moduleContext) {
        super(moduleContext);
        this.session = new UTPSession(this);
        this.peerMdac = new UTPPeerModule(this, moduleContext.getPeerConfiguration());
        UTPModule.logService = new UTPLogService(this.getModuleContext().getLogService(), this);
        instance = this;
    }

    public static UTPModule getInstance() {
        return instance;
    }

    @Override
    public UTPPeerModule getPeerModule() {
        return this.peerMdac;
    }

    /**
     * Method automatically called just after the creation of the module.
     * The module is automatically instanciated at the beginning of the MDA lifecycle and constructor implementation is not accessible to the module developer.
     * The <code>init</code> method allows the developer to execute the desired initialization.
     */
    @Override
    public void init() {
    }

    @Override
    public IParameterEditionModel getParametersEditionModel() {
        if (this.parameterEditionModel == null) {
            ParametersEditionModel parameters = new ParametersEditionModel(this);
            this.parameterEditionModel = parameters;
        }
        return this.parameterEditionModel;
    }

    @Override
    public String getModuleImagePath() {
        return "/res/icon/module.png";
    }

    @Override
    public IModelComponentContributor getModelComponentContributor(IModelComponent mc) {
        return new UTPModelComponentContributor(this);
    }

    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.session;
    }

}
