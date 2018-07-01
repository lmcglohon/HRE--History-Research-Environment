/**
 * 
 */
package org.historyresearchenvironment.client.serverinterface;

import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.Preferences;

/**
 * Factory class to create a Business Layer Interface class.
 * 
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class BusinessLayerInterfaceFactory {
	private static Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * @return
	 */
	public static BusinessLayerInterface getBusinessLayerInterface() {
		final String servertype = preferences.get("CSMODE", "DIRECT");

		if (servertype.equals("DIRECT")) {
			return new DirectBusinessLayerInterface();
		} else if (servertype.equals("SERVER")) {
			return new ServerBusinessLayerInterface();
		} else {
			LOGGER.severe("Invalid CSMODE: " + servertype);
			return null;
		}
	}

	/**
	 * Constructor
	 *
	 */
	public BusinessLayerInterfaceFactory() {
		super();
	}

}
