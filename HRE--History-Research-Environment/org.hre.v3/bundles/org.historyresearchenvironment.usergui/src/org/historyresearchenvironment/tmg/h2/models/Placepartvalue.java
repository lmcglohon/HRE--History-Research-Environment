package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the PLACEPARTVALUE database table.
 *
 */
public class Placepartvalue {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String DBDRIVER = "org.h2.Driver";
	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";
	private int dsid;
	private int id;
	private int recno;
	private int type;
	private int uid;
	private Placedictionary pd;
	private final String SELECT = "SELECT RECNO, UID, TYPE, ID, DSID FROM PLACEPARTVALUE WHERE RECNO = ?";
	private Connection conn = null;
	private PreparedStatement pst = null;

	public Placepartvalue(int i) {
		recno = i;

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, recno);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setDsid(rs.getInt("DSID"));
				setId(rs.getInt("ID"));
				setType(rs.getInt("TYPE"));
				setUid(rs.getInt("UID"));
				setPd(new Placedictionary(uid));
			} else {
				setRecno(0);
			}

			try {
				pst.close();
				//
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

	/**
	 * @return the pd
	 */
	public Placedictionary getPd() {
		return pd;
	}

	public int getRecno() {
		return this.recno;
	}

	public int getType() {
		return this.type;
	}

	public int getUid() {
		return this.uid;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param pd
	 *            the pd to set
	 */
	public void setPd(Placedictionary pd) {
		this.pd = pd;
	}

	public void setRecno(int recno) {
		this.recno = recno;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Placepartvalue [dsid=" + dsid + ", id=" + id + ", recno=" + recno + ", type=" + type + ", uid=" + uid
				+ ", " + (pd != null ? "pd=" + pd : "") + "]";
	}

}