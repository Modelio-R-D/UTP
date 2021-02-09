package org.modelio.module.utp.impl;

import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.vbasic.version.Version;

public class UTPPeerModule implements IUTPPeerModule {
    private UTPModule module = null;

    private IModuleAPIConfiguration peerConfiguration;

    public UTPPeerModule(UTPModule module, IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    @Override
    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    @Override
    public String getDescription() {
        return this.module.getDescription();
    }

    @Override
    public String getName() {
        return this.module.getName();
    }

    @Override
    public Version getVersion() {
        return this.module.getVersion();
    }

}
