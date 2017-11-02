package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the PLACEDICTIONARY database table.
 *
 */
public class Placedictionary {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String DBDRIVER = "org.h2.Driver";
	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";
	private int uid;
	private String soundex;
	private String tt;
	private String xvalue;
	private final String SELECT = "SELECT XVALUE, SDX FROM PLACEDICTIONARY WHERE UID = ?";
	private Connection conn = null;
	private PreparedStatement pst = null;

	public Placedictionary(int i) {
		uid = i;

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, uid);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setSoundex(rs.getString("SDX"));
				setXvalue(rs.getString("XVALUE"));
			} else {
				setUid(0);
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

	public String getSoundex() {
		return this.soundex;
	}

	public String getTt() {
		return this.tt;
	}

	public int getUid() {
		return this.uid;
	}

	public String getXvalue() {
		return this.xvalue;
	}

	public void setSoundex(String sdx) {
		this.soundex = sdx;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public void setXvalue(String xvalue) {
		this.xvalue = xvalue;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Placedictionary [uid=" + uid + ", " + (soundex != null ? "soundex=" + soundex + ", " : "")
				+ (xvalue != null ? "xvalue=" + xvalue : "") + "]";
	}

}