/**
 * 
 */
package org.historyresearchenvironment.usergui.clientinterface;

import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 * @version 0.0.4
 *
 */
public class BusinessLayerInterfaceFactory {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static BusinessLayerInterface getBusinessLayerInterface() {
		final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.historyresearchenvironment.usergui");
		final String servertype = store.getString("CSMODE");

		if (servertype.equals("TEST")) {
			return new TestBusinessLayerInterface();
		} else if (servertype.equals("DIRECT")) {
			return new DirectBusinessLayerInterface();
		} else if (servertype.equals("SERVER")) {
			return new ServerBusinessLayerInterface();
		} else {
			LOGGER.severe("Invalid CSMODE: " + servertype);
			return null;
		}
	}

	/**
	 * 
	 */
	public BusinessLayerInterfaceFactory() {
		super();
	}
}
