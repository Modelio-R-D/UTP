package org.modelio.module.utp.i18n;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.module.utp.impl.UTPModule;

/**
 * Message service
 * <br>Use of "i18n/messages"
 */
@objid ("9578ad40-b693-4603-8d0d-b75324f95c95")
public class I18nMessageService {
    @objid ("ce5a8870-be82-4135-9035-0621fec995e9")
    private static final String FILE_NAME_MESSAGES = "org.modelio.module.utp.i18n.messages";

    @objid ("82df417e-17cd-46f6-a0ca-f72968dca119")
    private static I18nMessageService instance;

    @objid ("5cf76ee3-965b-4da3-ab75-7d7bf01d467c")
    private ResourceBundle messageResource;

    /**
     * Private constructor.
     */
    @objid ("cd699c57-82e2-4fe0-b713-5a5c1b3eae02")
    private I18nMessageService() {
        this.messageResource = ResourceBundle.getBundle(FILE_NAME_MESSAGES);
    }

    /**
     * Singleton creation.
     */
    @objid ("3e27167a-33ab-4d64-9a6b-d2aa632e6ddd")
    private static I18nMessageService getInstance() {
        if (null == instance) { // Premier appel
            instance = new I18nMessageService();
        }
        return instance;
    }

    /**
     * @return the messageResource
     */
    @objid ("a7aa2abf-effa-4830-9aa3-dc086e008b41")
    private ResourceBundle getMessageResource() {
        return this.messageResource;
    }

    /**
     * Get message value from key.
     * 
     * @param key the key for the desired string.
     * @return the string for the given key.
     */
    @objid ("c71e5968-e855-4d62-87c8-9db4a83df507")
    public static String getString(String key) {
        String message = null;
        try {
            message = getInstance().getMessageResource().getString(key);
        } catch (MissingResourceException e) {
            UTPModule.logService.warning(e);
            message = '!' + key + '!';
        }
        return message;
    }

    /**
     * Get list of messages values from key with parameters.
     * 
     * @param key the key for the desired string.
     * @param params an array of objects to be formatted and substituted.
     * @return the string for the given key.
     */
    @objid ("7f3283e4-8784-40ce-b808-6b306256fbfd")
    public static String getString(String key, String... params) {
        String message = null;
        try {
            String value = getString(key);
            message = MessageFormat.format(value, (Object[]) params);
        } catch (MissingResourceException e) {
            UTPModule.logService.warning(e);
            message = '!' + key + '!';
        }
        return message;
    }

}
