package org.historyresearchenvironment.usergui;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.h2.jdbcx.JdbcConnectionPool;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * Instantiates a JDBC Connection Pool and returns a connection to it.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreH2ConnectionPool {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			"org.historyresearchenvironment.usergui");
	private static JdbcConnectionPool connectionPool = null;
	private static int h2TraceLevel;

	/**
	 * @return A JDBC Connection
	 */
	public static Connection getConnection() {

		h2TraceLevel = 0;

		if (store.getString("H2TRACELEVEL").equals("OFF")) {
			h2TraceLevel = 0;
		} else if (store.getString("H2TRACELEVEL").equals("ERROR")) {
			h2TraceLevel = 1;
		} else if (store.getString("H2TRACELEVEL").equals("DEBUG")) {
			h2TraceLevel = 3;
		} else {
			h2TraceLevel = 2;
		}

		try {
			if (connectionPool == null) {
				final String jdbcUrl = "jdbc:h2:" + store.getString("DBNAME") + ";IFEXISTS=TRUE;TRACE_LEVEL_FILE="
						+ h2TraceLevel + ";TRACE_LEVEL_SYSTEM_OUT=" + h2TraceLevel;
				LOGGER.fine("JDBC URL: " + jdbcUrl);
				connectionPool = JdbcConnectionPool.create(jdbcUrl, store.getString("H2USERID"),
						store.getString("H2PASSWORD"));
				LOGGER.info("Pool created for " + store.getString("DBNAME"));
				connectionPool.setMaxConnections(500);
			}

			LOGGER.info("Active H2 Connections: " + connectionPool.getActiveConnections());
			return connectionPool.getConnection();
		} catch (final SQLException e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + ": " + e.getSQLState());
			return null;
		}
	}

	/**
	 * Exists only to defeat instantiation
	 */
	protected HreH2ConnectionPool() {
	}

	/**
	 * Dispose the connection pool.
	 */
	public static void dispose() {
		connectionPool.dispose();
		connectionPool = null;
	}

	/**
	 * Dispose connection pool and recreate to create a new data base.
	 */
	public static void createNew() {
		connectionPool.dispose();

		final String jdbcUrl = "jdbc:h2:" + store.getString("DBNAME") + ";TRACE_LEVEL_FILE="
				+ h2TraceLevel + ";TRACE_LEVEL_SYSTEM_OUT=" + h2TraceLevel;
		LOGGER.fine("JDBC URL: " + jdbcUrl);
		connectionPool = JdbcConnectionPool.create(jdbcUrl, store.getString("H2USERID"), store.getString("H2PASSWORD"));
		LOGGER.fine("Pool created for " + store.getString("DBNAME"));
		connectionPool.setMaxConnections(500);
	}
}