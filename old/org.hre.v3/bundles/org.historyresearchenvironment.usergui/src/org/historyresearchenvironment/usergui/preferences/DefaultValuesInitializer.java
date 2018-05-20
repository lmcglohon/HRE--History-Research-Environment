package org.historyresearchenvironment.usergui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * Initialize preferences to default values.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class DefaultValuesInitializer extends AbstractPreferenceInitializer {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.historyresearchenvironment.usergui");

		store.setDefault("CSMODE", "DIRECT");
		store.setDefault("DBNAME", "./Sample");
		store.setDefault("HELPSYSTEMPORT", "8081");
		store.setDefault("HREFONT", "1|Segoe UI|12.0|0|WINDOWS|1|-16|0|0|0|400|0|0|0|0|3|2|1|34|Segoe UI");
		store.setDefault("H2PASSWORD", "");
		store.setDefault("H2USERID", "sa");
		store.setDefault("H2TRACELEVEL", "INFO");
		store.setDefault("LOGFILEPATH", ".");
		store.setDefault("LOGLEVEL", "INFO");
		store.setDefault("PERNAME", "John+Doe");
		store.setDefault("PERNO", "1");
		store.setDefault("POLREGID", "1");
		store.setDefault("SERVERADDRESS", "127.0.0.1:8000");
		store.setDefault("SERVERPORT", "8000");
		store.setDefault("TLS", false);
		store.setDefault("UPDATESITE", "http://www.myerichsen.net/HRE/Repository");
	}
}