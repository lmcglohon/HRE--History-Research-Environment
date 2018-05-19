package org.historyresearchenvironment.databaseadmin.providers;

import java.sql.Connection;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.historyresearchenvironment.databaseadmin.HreH2ConnectionPool;
import org.osgi.service.prefs.Preferences;

/**
 * Abstract superclass for providers
 * 
 * @version 2018-05-20
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public abstract class AbstractHreProvider {
	protected Connection conn = null;
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	protected Preferences preferences = ConfigurationScope.INSTANCE
			.getNode("org.historyresearchenvironment.databaseadmin");

	/**
	 * Constructor
	 *
	 */
	public AbstractHreProvider() {
		super();

		try {
			conn = HreH2ConnectionPool.getConnection();
		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}
	}
}