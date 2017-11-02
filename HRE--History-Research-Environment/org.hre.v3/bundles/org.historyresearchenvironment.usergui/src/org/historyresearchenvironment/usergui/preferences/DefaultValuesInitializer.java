package org.historyresearchenvironment.usergui.preferences;

import java.io.File;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @author michael
 *
 */
public class DefaultValuesInitializer extends AbstractPreferenceInitializer {
	/**
	 * 
	 */
	public DefaultValuesInitializer() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.historyresearchenvironment.usergui");

		store.setDefault("CSMODE", "DIRECT");
		store.setDefault("SERVERADDRESS", "127.0.0.1:8000");
		store.setDefault("DBDRIVER", "org.h2.Driver");

		// String DbPath = new File(".").getAbsolutePath();
		// DbPath = "file:///" + DbPath.substring(0, DbPath.length() - 1) + "TMG9";
		// DbPath = DbPath.replace("\\", "/");
		// System.out.println("DBPATH: " + DbPath);
		//
		// // jdbc:h2:file:///C:/Program Files/HRE/Eclipse/TMG9
		//
		// store.setDefault("DBNAME", DbPath);
		// store.setDefault("DBNAME", "./TMG9");
		store.setDefault("USERID", "sa");
		store.setDefault("PASSWORD", "");
		store.setDefault("PERNO", "1");
		store.setDefault("TLS", true);
		store.setDefault("LOGLEVEL", "INFO");
		store.setDefault("LOGFILEPATH", "c:\\temp");
	}
}