package org.historyresearchenvironment.databaseadmin;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.h2.jdbcx.JdbcConnectionPool;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Singleton calls that instantiates a JDBC Connection Pool and returns a
 * connection to it.
 * 
 * @version 2018-05-20
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreH2ConnectionPool {
	private static JdbcConnectionPool connectionPool = null;
	private static Preferences preferences = ConfigurationScope.INSTANCE
			.getNode("org.historyresearchenvironment.databaseadmin");
	private static int h2TraceLevel = preferences.getInt("H2TRACELEVEL", 2);
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Dispose connection pool and recreate to create a new data base.
	 * 
	 * @param dbName
	 *            Name of the database
	 */
	public static void createNew(String dbName) {
		connectionPool.dispose();
		final String jdbcUrl = "jdbc:h2:" + dbName + ";TRACE_LEVEL_FILE=" + h2TraceLevel + ";TRACE_LEVEL_SYSTEM_OUT="
				+ h2TraceLevel;
		LOGGER.info("JDBC URL: " + jdbcUrl);
		connectionPool = JdbcConnectionPool.create(jdbcUrl, "sa", "");
		LOGGER.info("Connection pool has been created");
		connectionPool.setMaxConnections(500);
		preferences.put("DBNAME", dbName);
		LOGGER.info("Preferences dbname set to " + dbName);
		try {
			preferences.flush();
			LOGGER.info("Preferences has been flushed");
		} catch (BackingStoreException e) {
			LOGGER.severe(e.getMessage());
		}
	}

	/**
	 * Dispose the connection pool.
	 */
	public static void dispose() {
		try {
			connectionPool.dispose();
		} catch (final Exception e) {
			LOGGER.severe(e.getMessage());
		}
		connectionPool = null;
	}

	/**
	 * @return A JDBC connection
	 */
	public static Connection getConnection() {
		String dbName = preferences.get("DBNAME", "~/HRE");

		try {
			if (connectionPool == null) {
				final String jdbcUrl = "jdbc:h2:" + dbName + ";IFEXISTS=TRUE;TRACE_LEVEL_FILE=" + h2TraceLevel
						+ ";TRACE_LEVEL_SYSTEM_OUT=" + h2TraceLevel;
				LOGGER.info("JDBC URL: " + jdbcUrl);
				connectionPool = JdbcConnectionPool.create(jdbcUrl, "sa", "");
				connectionPool.setMaxConnections(500);
			}

			LOGGER.info("Reusing connection pool");
			return connectionPool.getConnection();
		} catch (final SQLException e) {
			LOGGER.severe(e.getMessage());
			return null;
		}
	}

	/**
	 * Get a JDBCconnection
	 * 
	 * @param dbName
	 *            Name of database
	 * @return A JDBC Connection
	 */
	public static Connection getConnection(String dbName) {
		try {
			final String jdbcUrl = "jdbc:h2:" + dbName + ";IFEXISTS=TRUE;TRACE_LEVEL_FILE=" + h2TraceLevel
					+ ";TRACE_LEVEL_SYSTEM_OUT=" + h2TraceLevel;
			LOGGER.info("JDBC URL: " + jdbcUrl);
			connectionPool = JdbcConnectionPool.create(jdbcUrl, "sa", "");
			connectionPool.setMaxConnections(500);
			LOGGER.info("Connection pool has been created");

			return connectionPool.getConnection();
		} catch (final SQLException e) {
			LOGGER.severe(e.getMessage());
			return null;
		}
	}

	/**
	 * Exists only to defeat instantiation
	 */
	protected HreH2ConnectionPool() {
	}
}