package org.historyresearchenvironment.usergui;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	private Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		HRELogger.setup();

		IEclipsePreferences iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");

		String levelName = iep.get("LOGLEVEL", "INFO");

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
		} else
			LOGGER.setLevel(Level.INFO);

		String csMode = iep.get("CSMODE", "TEST");
		LOGGER.info("Client/server mode " + csMode);
		LOGGER.info("HRE Absolute path: " + new File(".").getAbsolutePath());

		if ((csMode.equals("DIRECT")) || (csMode.equals("SERVER"))) {
			String dbDriver = iep.get("DBDRIVER", "org.h2.Driver");
			String dbName = iep.get("DBNAME", "./TMG9");
			String userId = iep.get("USERID", "sa");
			String passWord = iep.get("PASSWORD", "");

			Class.forName(dbDriver);
			Connection conn = DriverManager.getConnection("jdbc:h2:" + dbName, userId, passWord);
			LOGGER.info("Database connection " + conn);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
}
