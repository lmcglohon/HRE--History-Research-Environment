package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the EVENTWITNESS database table.
 *
 */
public class Eventwitness {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String DBDRIVER = "org.h2.Driver";

	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";

	public static void main(String[] args) {
		final Eventwitness ew = new Eventwitness(1);
		LOGGER.info(ew.toString());
	}

	private int dsid;
	private int eper;
	private int gnum;
	private int namerec;
	private String role;
	private int sequence;
	private String tt;
	private String witmemo;
	private String wsentence;
	private String xprimary;
	private final String SELECT = "SELECT EPER, GNUM, XPRIMARY, WSENTENCE, ROLE, "
			+ "DSID, NAMEREC, WITMEMO, SEQUENCE FROM EVENTWITNESS " + "WHERE EPER = ?";
	private Connection conn = null;
	private PreparedStatement pst = null;
	private TmgEvent event;
	private Name name;

	public Eventwitness() {
	}

	public Eventwitness(int i) {
		this.eper = i;

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
			pst = conn.prepareStatement(SELECT);

			pst.setInt(1, eper);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setDsid(rs.getInt("DSID"));
				setGnum(rs.getInt("GNUM"));
				setEvent(new TmgEvent(gnum));
				setNamerec(rs.getInt("NAMEREC"));
				setName(new Name(namerec));
				setRole(rs.getString("ROLE"));
				setSequence(rs.getInt("SEQUENCE"));
				setWsentence(rs.getString("WSENTENCE"));
				setXprimary(rs.getString("XPRIMARY"));
			}

			try {
				pst.close();
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

	public int getEper() {
		return this.eper;
	}

	/**
	 * @return the event
	 */
	public TmgEvent getEvent() {
		return event;
	}

	public int getGnum() {
		return this.gnum;
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}

	public int getNamerec() {
		return this.namerec;
	}

	public String getRole() {
		return this.role;
	}

	public int getSequence() {
		return this.sequence;
	}

	public String getTt() {
		return this.tt;
	}

	public String getWitmemo() {
		return this.witmemo;
	}

	public String getWsentence() {
		return this.wsentence;
	}

	public String getXprimary() {
		return this.xprimary;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setEper(int eper) {
		this.eper = eper;
	}

	/**
	 * @param event
	 *            the event to set
	 */
	public void setEvent(TmgEvent event) {
		this.event = event;
	}

	public void setGnum(int gnum) {
		this.gnum = gnum;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}

	public void setNamerec(int namerec) {
		this.namerec = namerec;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setWitmemo(String witmemo) {
		this.witmemo = witmemo;
	}

	public void setWsentence(String wsentence) {
		this.wsentence = wsentence;
	}

	public void setXprimary(String xprimary) {
		this.xprimary = xprimary;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Eventwitness [dsid=" + dsid + ", eper=" + eper + ", gnum=" + gnum + ", namerec=" + namerec + ", "
				+ (role != null ? "role=" + role + ", " : "") + "sequence=" + sequence + ", "
				+ (tt != null ? "tt=" + tt + ", " : "") + (witmemo != null ? "witmemo=" + witmemo + ", " : "")
				+ (wsentence != null ? "wsentence=" + wsentence + ", " : "")
				+ (xprimary != null ? "xprimary=" + xprimary + ", " : "")
				+ (event != null ? "event=" + event + ", " : "") + (name != null ? "name=" + name : "") + "]";
	}

}