package org.historyresearchenvironment.usergui;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.eclipse.core.runtime.preferences.InstanceScope;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * Set up logger using the path from the preferences and the file name format
 * "hre-log.%u.%g.txt".
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HRELogger {
	static private FileHandler handler;

	/**
	 * @throws IOException
	 */
	static public void setup() throws IOException {
		final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.historyresearchenvironment.usergui");
		final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

		final String levelName = store.getString("LOGLEVEL");

		if (levelName.equals("OFF")) {
			LOGGER.setLevel(Level.OFF);
		} else if (levelName.equals("SEVERE")) {
			LOGGER.setLevel(Level.SEVERE);
		} else if (levelName.equals("WARNING")) {
			LOGGER.setLevel(Level.WARNING);
		} else if (levelName.equals("CONFIG")) {
			LOGGER.setLevel(Level.CONFIG);
		} else if (levelName.equals("FINE")) {
			LOGGER.setLevel(Level.FINE);
		} else if (levelName.equals("FINER")) {
			LOGGER.setLevel(Level.FINER);
		} else if (levelName.equals("FINEST")) {
			LOGGER.setLevel(Level.FINEST);
		} else if (levelName.equals("ALL")) {
			LOGGER.setLevel(Level.ALL);
		} else {
			LOGGER.setLevel(Level.INFO);
		}

		String logFilePath = store.getString("LOGFILEPATH");

		if (logFilePath.endsWith(";")) {
			logFilePath = logFilePath.substring(0, logFilePath.length() - 1);
		}

		System.out.println("Log file path: " + logFilePath);

		handler = new FileHandler(logFilePath + "hre-log.%u.%g.txt", 1024 * 1024, 10, true);
		handler.setFormatter(new SimpleFormatter());
		LOGGER.addHandler(handler);
	}
}