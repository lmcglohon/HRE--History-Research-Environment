package org.historyresearchenvironment.client;

import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;

/**
 * @version 2018-06-10
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class Activator implements BundleActivator {
	private static BundleContext context;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");

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

		HreLogger.setup();

		preferences.putInt("projectcount", preferences.getInt("projectcount", 1));
		preferences.put("project.0.name", preferences.get("project.0.name", "HRE"));
		preferences.put("project.0.lastupdated", preferences.get("project.0.lastupdated", "2000.01.01 01.01.01"));
		preferences.put("project.0.summary", preferences.get("project.0.summary", "This is the default project"));
		preferences.put("project.0.localserver", preferences.get("project.0.localserver", "LOCAL"));
		preferences.put("project.0.path", preferences.get("project.0.path", "c:/client/temp/HRE"));

		LOGGER.info("HRE v0.1 has been started");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		HreH2ConnectionPool.dispose();
		Activator.context = null;
	}

}
