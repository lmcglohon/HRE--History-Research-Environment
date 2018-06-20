
package org.historyresearchenvironment.client.handlers;

import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.help.internal.base.BaseHelpSystem;
import org.osgi.service.prefs.Preferences;

/**
 * @version 2018-06-20
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
@SuppressWarnings("restriction")
public class HelpContentsHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");

	/**
	 * 
	 */
	@Execute
	public void execute() {
		try {
			BaseHelpSystem.ensureWebappRunning();
			final String helpURL = "http://127.0.0.1:" + preferences.getInt("HELPSYSTEMPORT", 8081) + "/help/index.jsp";

			BaseHelpSystem.getHelpBrowser(true).displayURL(helpURL);
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
		}
	}

}