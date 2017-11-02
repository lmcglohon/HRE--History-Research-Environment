/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;

/**
 * @author michael
 *
 */
public abstract class AbstractHreVector {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	protected IEclipsePreferences iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");
	protected String dbDriver = iep.get("DBDRIVER", "org.h2.Driver");
	protected String dbName = iep.get("DBNAME", "./TMG9");
	protected String userId = iep.get("USERID", "sa");
	protected String passWord = iep.get("PASSWORD", "");

	protected Connection conn = null;
	protected PreparedStatement pst = null;

	/**
	 * No arg c:tor
	 */
	public AbstractHreVector() {
		super();
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection("jdbc:h2:" + dbName, userId, passWord);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
