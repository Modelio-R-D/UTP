package org.modelio.module.utp.impl;

import java.io.File;
import java.nio.file.Path;
import java.util.Map;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.modelio.api.modelio.mc.IModelComponentDescriptor;
import org.modelio.api.modelio.mc.IModelComponentService;
import org.modelio.api.module.IModule;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

public class UTPSession extends DefaultModuleLifeCycleHandler {
    @Override
    public boolean start() throws ModuleException {
        install();
        return super.start();
    }

    @Override
    public void upgrade(Version oldVersion, Map<String, String> oldParameters) throws ModuleException {
        super.upgrade(oldVersion, oldParameters);
    }

    public UTPSession(IModule module) {
        super(module);
    }

    public void install() {
        installStyles();
        installRamc();
    }

    private void installRamc() {
        Path mdaplugsPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();

        final IModelComponentService modelComponentService = this.module.getModuleContext().getModelioServices().getModelComponentService();
        for (IModelComponentDescriptor mc :  modelComponentService.getModelComponents()) {
            if (mc.getName().equals("UTP")) {
                if (new Version(mc.getVersion()).isOlderThan(new Version("4.1.00"))) {
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

    private void installStyles() {
        Path mdaplugsPath = this.module.getModuleContext().getConfiguration().getModuleResourcesPath();

        this.module.getModuleContext().getModelioServices()
        .getDiagramService()
        .registerStyle("utp", "default",
                new File(mdaplugsPath.resolve("res" + File.separator + "style" + File.separator + "utp.style").toString()));
    }

}
