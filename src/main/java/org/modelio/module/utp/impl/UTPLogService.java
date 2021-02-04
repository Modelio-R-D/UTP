package org.modelio.module.utp.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.log.ILogService;

/**
 * Proxy for the Modelio {@link ILogService}, configuring the ModelingWizardMdac.
 */
@objid ("bb8c11cd-2edb-4498-9f78-f7b71510b761")
public class UTPLogService {
    @objid ("f9def642-dee7-48d0-8a6c-10fcda334d51")
    private UTPModule module;

    @objid ("d64bd7a4-4aa8-4866-90d6-c6bf7e3875c4")
    private ILogService logService;

    /**
     * Default constructor.
     * 
     * @param logService the Modelio log service.
     * @param module the current instance of {@link UTPModule}.
     */
    @objid ("d518d23d-c81a-41cf-b6ec-4afbd457701c")
    public UTPLogService(ILogService logService, UTPModule module) {
        this.logService = logService;
        this.module = module;
    }

    /**
     * Output an information message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("46b77043-3ff6-4351-80d2-d2d8713cdc95")
    public void info(final String msg) {
        this.logService.info(msg);
    }

    /**
     * Output a warning message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("e2c478d4-f905-44eb-b7c1-a111e99db823")
    public void warning(final String msg) {
        this.logService.warning(msg);
    }

    /**
     * Output an error message in the Modelio console.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * 
     * @param msg a message to be displayed as a log.
     */
    @objid ("78c0c33e-4533-4e8b-9ccd-d2a23aeade68")
    public void error(final String msg) {
        this.logService.error(msg);
    }

    /**
     * Log the given exception with its stack trace as an information.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param t an exception to be displayed as a log.
     */
    @objid ("ddd32f90-674c-4e2f-a6f1-5ed56588103f")
    public void info(final Throwable e) {
        this.logService.info(e);
    }

    /**
     * Log the given exception with its stack trace as a warning.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param t an exception to be displayed as a log.
     */
    @objid ("cbb86dde-6dc1-4d58-84d4-dd4b0539d301")
    public void warning(final Throwable e) {
        this.logService.warning(e);
    }

    /**
     * Log the given exception with its stack trace as an error.
     * <p>
     * This method send logs on Modelio console only if the logs have been activated. The file and line of the log is
     * displayed in the Modelio console before the message.
     * @param t an exception to be displayed as a log.
     */
    @objid ("0cea767a-4c27-4853-9191-ea1195a9064a")
    public void error(final Throwable e) {
        this.logService.error(e);
    }

}
