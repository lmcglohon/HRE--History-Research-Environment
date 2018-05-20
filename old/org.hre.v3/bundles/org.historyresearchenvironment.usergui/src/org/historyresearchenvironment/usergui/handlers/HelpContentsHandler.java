package org.historyresearchenvironment.usergui.handlers;

import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;

//import java.util.logging.Logger;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.help.internal.base.BaseHelpSystem;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
@SuppressWarnings("restriction")
public class HelpContentsHandler {
	private final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * 
	 */
	@Execute
	public void execute() {
		try {
			final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
					"org.historyresearchenvironment.usergui");

			BaseHelpSystem.ensureWebappRunning();
			final String helpURL = "http://127.0.0.1:" + store.getInt("HELPSYSTEMPORT") + "/help/index.jsp";

			BaseHelpSystem.getHelpBrowser(true).displayURL(helpURL);
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
		}
	}

}
