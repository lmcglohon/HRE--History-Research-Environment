package org.historyresearchenvironment.usergui;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.osgi.service.environment.EnvironmentInfo;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * Eclipse plug-in life cycle control. Sets up the logger. Starts and stops the
 * Help System.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class Activator implements BundleActivator {
	private final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static BundleContext context;

	/**
	 * @return bundle context
	 */
	static BundleContext getContext() {
		return context;
	}

	/*
	 * Set up the Logger. Start the Help System.
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		HRELogger.setup();

		final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.historyresearchenvironment.usergui");

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

		LOGGER.info("Command line arguments:");
		// ServiceReference<?> ser =
		// context.getServiceReference(IApplicationContext.class);
		// IApplicationContext iac = (IApplicationContext) context.getService(ser);
		// String[] arguments = (String[])
		// iac.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		// for (int i = 0; i < arguments.length; i++) {
		// LOGGER.info(i + ": " + arguments[i]);
		// }

		ServiceReference<EnvironmentInfo> envRef = context.getServiceReference(EnvironmentInfo.class);
		EnvironmentInfo envInfo = context.getService(envRef);
		String[] args = envInfo.getCommandLineArgs();
		for (int i = 0; i < args.length; i++) {
			System.out.println("CLI " + i + ": " + args[i]);
		}

		final String csMode = store.getString("CSMODE");
		LOGGER.info("Client/server mode " + csMode);
		LOGGER.info("HRE Absolute path: " + new File(".").getAbsolutePath());
		LOGGER.info("HRE Font: " + store.getString("HREFONT"));

		final String command = "java -classpath plugins\\org.eclipse.help.base_4.2.102.v20171130-0510.jar org.eclipse.help.standalone.Infocenter -command start -port "
				+ store.getInt("HELPSYSTEMPORT") + " -product org.historyresearchenvironment.helpsystem -clean";

		try {
			LOGGER.info("Help System is being started at port " + store.getInt("HELPSYSTEMPORT"));
			Runtime.getRuntime().exec(command);
			LOGGER.info("Has started " + command);
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
		}
	}

	/*
	 * Stop the Help System.
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		final String command = "java -classpath plugins\\org.eclipse.help.base_4.2.102.v20171130-0510.jar org.eclipse.help.standalone.Infocenter -command shutdown";

		try {
			Runtime.getRuntime().exec(command);
			LOGGER.info("Help System is being stopped");
			HreH2ConnectionPool.dispose();
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
		}

	}
}
