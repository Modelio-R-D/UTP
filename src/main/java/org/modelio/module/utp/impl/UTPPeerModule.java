package org.modelio.module.utp.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.module.utp.api.IUTPPeerModule;
import org.modelio.vbasic.version.Version;

@objid ("9e062b00-c32f-43cb-9f22-d8eb98678a90")
public class UTPPeerModule implements IUTPPeerModule {
    @objid ("7d7534a7-9ca6-4fbf-bf93-1a4b4bd99111")
    private UTPModule module = null;

    @objid ("4add0106-8883-4677-a20b-7d4aa301d7aa")
    private IModuleAPIConfiguration peerConfiguration;

    @objid ("46681345-522b-43f1-8fa5-ecadff0e2afe")
    public UTPPeerModule(UTPModule module, IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    @objid ("5bf34ba2-ddb0-4a94-80a2-1c2ac0a3950b")
    @Override
    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    @objid ("d1d0e8da-b9b2-4742-a88f-6b7fc645ef91")
    @Override
    public String getDescription() {
        return this.module.getDescription();
    }

    @objid ("5c7f4414-d17d-4265-a0d2-c6ac269d07bb")
    @Override
    public String getName() {
        return this.module.getName();
    }

    @objid ("1c3d6f4b-dc2c-4e69-a150-8d2f81861b55")
    @Override
    public Version getVersion() {
        return this.module.getVersion();
    }

}
