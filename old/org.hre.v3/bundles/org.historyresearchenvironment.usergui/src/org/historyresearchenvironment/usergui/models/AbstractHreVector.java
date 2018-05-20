package org.historyresearchenvironment.usergui.models;

import java.sql.PreparedStatement;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public abstract class AbstractHreVector {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	protected ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			"org.historyresearchenvironment.usergui");

	protected PreparedStatement pst = null;
}
