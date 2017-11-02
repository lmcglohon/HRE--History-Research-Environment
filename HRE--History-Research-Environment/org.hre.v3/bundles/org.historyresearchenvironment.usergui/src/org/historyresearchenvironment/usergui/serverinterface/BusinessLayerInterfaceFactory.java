/**
 * 
 */
package org.historyresearchenvironment.usergui.serverinterface;

import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @author michael
 *
 */
public class BusinessLayerInterfaceFactory {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static BusinessLayerInterface getBusinessLayerInterface() {
		IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.historyresearchenvironment.usergui");
		String servertype = store.getString("CSMODE");

		if (servertype.equals("TEST"))
			return new TestBusinessLayerInterface();
		else if (servertype.equals("DIRECT"))
			return new DirectBusinessLayerInterface();
		else if (servertype.equals("SERVER"))
			return new ServerBusinessLayerInterface();
		else {
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
