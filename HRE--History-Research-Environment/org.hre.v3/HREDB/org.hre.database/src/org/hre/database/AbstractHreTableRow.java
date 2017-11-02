package org.hre.database;
/**
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;

/**
 * @author michael
 *
 */
public abstract class AbstractHreTableRow {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	protected final static IEclipsePreferences iep = InstanceScope.INSTANCE
			.getNode("org.historyresearchenvironment.usergui");
	protected final static String dbDriver = iep.get("DBDRIVER", "org.h2.Driver");
	protected final static String dbName = iep.get("DBNAME", "~/HREDB");
	protected final static String userId = iep.get("USERID", "sa");
	protected final static String passWord = iep.get("PASSWORD", "");
	protected final static String DELETE_STATEMENT = "";

	protected static Connection conn = null;
	protected PreparedStatement pst = null;

	/**
	 * @param recordNum
	 * @return
	 * @throws Exception
	 */
	protected abstract int delete(int recordNum) throws Exception;

	/**
	 * @param recordNum
	 * @return
	 * @throws Exception
	 */
	protected abstract AbstractHreTableRow get(int recordNum) throws Exception;

	/**
	 * @param row
	 * @return
	 * @throws Exception
	 */
	protected abstract int post() throws Exception;

	/**
	 * @param row
	 * @return
	 * @throws Exception
	 */
	protected abstract int put() throws Exception;
}
