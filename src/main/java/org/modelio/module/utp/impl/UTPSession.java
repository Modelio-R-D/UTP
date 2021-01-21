package org.modelio.module.utp.impl;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.modelio.api.modelio.mc.IModelComponentDescriptor;
import org.modelio.api.modelio.mc.IModelComponentService;
import org.modelio.api.module.IModule;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

@objid ("5ec070f2-2fbd-4f4d-8473-6c0bfd323dc2")
public class UTPSession extends DefaultModuleLifeCycleHandler {
    @objid ("3cc16f44-51b0-48f3-ba7d-c60d9a0c6d3e")
    @Override
    public boolean start() throws ModuleException {
        install();
        return super.start();
    }

    @objid ("26f376f7-529c-4c1e-8132-5e9afc03298c")
    @Override
    public void upgrade(Version oldVersion, Map<String, String> oldParameters) throws ModuleException {
        super.upgrade(oldVersion, oldParameters);
    }

    @objid ("ac59fc4a-5b78-45b1-9637-24fb611683b2")
    public UTPSession(IModule module) {
        super(module);
    }

    @objid ("723d471c-edae-4c9e-8de7-0c83bda7046f")
    public void install() {
        installStyles();     
        installRamc();
    }

    @objid ("131e78e9-702f-4aaa-82cc-6fd529a877fe")
    private void installRamc() {
        Path mdaplugsPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();
        
        final IModelComponentService modelComponentService = this.module.getModuleContext().getModelioServices().getModelComponentService();
        for (IModelComponentDescriptor mc :  modelComponentService.getModelComponents()) {
            if (mc.getName().equals("UTP")) {
                if (new Version(mc.getVersion()).isOlderThan(new Version("3.8.00"))) {
                    modelComponentService.deployModelComponent(
                            new File(mdaplugsPath.resolve("res" + File.separator + "ramc" + File.separator + "UTP.ramc").toString()),
                            new NullProgressMonitor());
                } else {
                    // Ramc already deployed...
                    return;
                }
            }
        }
        
        
        //      No ramc found, deploy it
        modelComponentService.deployModelComponent(
                new File(mdaplugsPath.resolve("res" + File.separator + "ramc" + File.separator + "UTP.ramc").toString()),
                new NullProgressMonitor());
    }

    @objid ("c7df3a1c-d704-439e-a1f3-1655063b2d3b")
    private void installStyles() {
        Path mdaplugsPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();
        
        this.module.getModuleContext().getModelioServices()
        .getDiagramService()
        .registerStyle("utp", "default",
                new File(mdaplugsPath.resolve("res" + File.separator + "style" + File.separator + "utp.style").toString()));
    }

}
