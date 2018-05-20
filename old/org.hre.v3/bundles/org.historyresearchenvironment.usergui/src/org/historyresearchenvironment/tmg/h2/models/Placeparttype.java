package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * The persistent class for the PLACEPARTTYPE database table.
 *
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class Placeparttype {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private int id;
	private int dsid;
	private String shortvalue;
	private String system;
	private String tt;
	private int type;
	private String xvalue;
	private final String SELECT = "SELECT ID, TYPE, VALUE, SYSTEM, SHORTVALUE, TT, DSID "
			+ "FROM PLACEPARTTYPE WHERE ID = ?";
	private PreparedStatement pst = null;

	public Placeparttype(Connection conn, int i) {
		id = i;

		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, id);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setDsid(rs.getInt("DSID"));
				setShortvalue(rs.getString("SHORTVALUE"));
				setSystem(rs.getString("SYSTEM"));
				setType(rs.getInt("TYPE"));
				setXvalue(rs.getString("VALUE"));
			} else {
				setId(0);
			}

			try {
				pst.close();
			} catch (final Exception e) {
				// Do nothing
			}

		} catch (final Exception e) {

			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}

	public int getDsid() {
		return this.dsid;
	}

	public int getId() {
		return this.id;
	}

	public String getShortvalue() {
		return this.shortvalue;
	}

	public String getSystem() {
		return this.system;
	}

	public String getTt() {
		return this.tt;
	}

	public int getType() {
		return this.type;
	}

	public String getXvalue() {
		return this.xvalue;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setShortvalue(String shortvalue) {
		this.shortvalue = shortvalue;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setXvalue(String xvalue) {
		this.xvalue = xvalue;
	}

}