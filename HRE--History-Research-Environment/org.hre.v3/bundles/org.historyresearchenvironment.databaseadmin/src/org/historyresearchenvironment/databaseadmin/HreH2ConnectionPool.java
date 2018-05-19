package org.historyresearchenvironment.databaseadmin;

import java.sql.Connection;
import java.sql.SQLException;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.h2.jdbcx.JdbcConnectionPool;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Singleton calls that instantiates a JDBC Connection Pool and returns a
 * connection to it.
 * 
 * @version 2018-05-19
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreH2ConnectionPool {
	private static JdbcConnectionPool connectionPool = null;
	private static int h2TraceLevel = 1;
	private static Preferences preferences = ConfigurationScope.INSTANCE
			.getNode("org.historyresearchenvironment.databaseadmin");

	/**
	 * Dispose connection pool and recreate to create a new data base.
	 */
	public static void createNew(String dbName) {
		connectionPool.dispose();
		final String jdbcUrl = "jdbc:h2:" + dbName + ";TRACE_LEVEL_FILE=" + h2TraceLevel + ";TRACE_LEVEL_SYSTEM_OUT="
				+ h2TraceLevel;
		connectionPool = JdbcConnectionPool.create(jdbcUrl, "sa", "");
		connectionPool.setMaxConnections(500);
		preferences.put("DBNAME", dbName);
		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Dispose the connection pool.
	 */
	public static void dispose() {
		try {
			connectionPool.dispose();
		} catch (final Exception e) {
			e.printStackTrace();
		}
		connectionPool = null;
	}

	/**
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() {
		String dbName = preferences.get("DBNAME", "~/HRE");

		try {
			if (connectionPool == null) {
				final String jdbcUrl = "jdbc:h2:" + dbName + ";IFEXISTS=TRUE;TRACE_LEVEL_FILE=" + h2TraceLevel
						+ ";TRACE_LEVEL_SYSTEM_OUT=" + h2TraceLevel;
				connectionPool = JdbcConnectionPool.create(jdbcUrl, "sa", "");
				connectionPool.setMaxConnections(500);
			}

			return connectionPool.getConnection();
		} catch (final SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @return A JDBC Connection
	 */
	public static Connection getConnection(String dbName) {
		try {
			// if (connectionPool == null) {
			final String jdbcUrl = "jdbc:h2:" + dbName + ";IFEXISTS=TRUE;TRACE_LEVEL_FILE=" + h2TraceLevel
					+ ";TRACE_LEVEL_SYSTEM_OUT=" + h2TraceLevel;
			connectionPool = JdbcConnectionPool.create(jdbcUrl, "sa", "");
			connectionPool.setMaxConnections(500);
			// }

			return connectionPool.getConnection();
		} catch (final SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Exists only to defeat instantiation
	 */
	protected HreH2ConnectionPool() {
	}
}