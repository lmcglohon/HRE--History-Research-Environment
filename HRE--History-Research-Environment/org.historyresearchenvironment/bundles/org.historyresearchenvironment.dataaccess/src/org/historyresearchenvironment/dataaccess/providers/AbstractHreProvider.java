package org.historyresearchenvironment.dataaccess.providers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.historyresearchenvironment.dataaccess.HreH2ConnectionPool;
import org.osgi.service.prefs.Preferences;

/**
 * Abstract superclass for providers
 * 
 * @version 2018-06-30
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public abstract class AbstractHreProvider {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	protected Connection conn = null;
	protected Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");

	/**
	 * Constructor
	 * 
	 * @throws SQLException
	 *             When failed
	 *
	 */
	public AbstractHreProvider() throws SQLException {
		super();
		conn = HreH2ConnectionPool.getConnection();
	}

	/**
	 * @param string
	 */
	public abstract void readJson(String string);

	/**
	 * @param string
	 * @return
	 */
	public abstract int importCsv(String string);

	/**
	 * @return
	 */
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}
}