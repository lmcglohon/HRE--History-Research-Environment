package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the PLACEPARTTYPE database table.
 *
 */
public class Placeparttype {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String DBDRIVER = "org.h2.Driver";
	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";
	private int id;
	private int dsid;
	private String shortvalue;
	private String system;
	private String tt;
	private int type;
	private String xvalue;
	private final String SELECT = "SELECT ID, TYPE, VALUE, SYSTEM, SHORTVALUE, TT, DSID "
			+ "FROM PLACEPARTTYPE WHERE ID = ?";
	private Connection conn = null;
	private PreparedStatement pst = null;

	public Placeparttype(int i) {
		id = i;

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
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

				conn.close();
			} catch (final Exception e) {
				// Do nothing
			}

		} catch (final Exception e) {

			e.printStackTrace();
			LOGGER.severe(e.getMessage());
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