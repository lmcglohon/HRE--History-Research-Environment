package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the PLACE database table.
 *
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class Place {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private int recno;
	private String comment;
	private int dsid;
	private String endyear;
	private String shortplace;
	private String startyear;
	private int styleid;
	private String tt;
	private final String SELECT = "SELECT RECNO, STYLEID, DSID, TT, STARTYEAR, ENDYEAR, "
			+ "COMMENT, SHORTPLACE FROM PLACE WHERE RECNO = ?";
	private PreparedStatement pst = null;
	private Placepartvalue ppv;

	/**
	 * @param i
	 *
	 *            recno is set to 0, if no rows are found
	 */
	public Place(Connection conn, int i) {
		recno = i;

		try {
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, recno);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setComment(rs.getString("COMMENT"));
				setDsid(rs.getInt("DSID"));
				setEndyear(rs.getString("ENDYEAR"));
				setShortplace(rs.getString("SHORTPLACE"));
				setStartyear(rs.getString("STARTYEAR"));
				setStyleid(rs.getInt("STYLEID"));
				setPpv(new Placepartvalue(conn, recno));
			} else {
				setRecno(0);
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

	public String getComment() {
		return this.comment;
	}

	public int getDsid() {
		return this.dsid;
	}

	public String getEndyear() {
		return this.endyear;
	}

	/**
	 * @return the ppv
	 */
	public Placepartvalue getPpv() {
		return ppv;
	}

	public int getRecno() {
		return this.recno;
	}

	public String getShortplace() {
		return this.shortplace;
	}

	public String getStartyear() {
		return this.startyear;
	}

	public int getStyleid() {
		return this.styleid;
	}

	public String getTt() {
		return this.tt;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setEndyear(String endyear) {
		this.endyear = endyear;
	}

	/**
	 * @param ppv
	 *            the ppv to set
	 */
	public void setPpv(Placepartvalue ppv) {
		this.ppv = ppv;
	}

	public void setRecno(int recno) {
		this.recno = recno;
	}

	public void setShortplace(String shortplace) {
		this.shortplace = shortplace;
	}

	public void setStartyear(String startyear) {
		this.startyear = startyear;
	}

	public void setStyleid(int styleid) {
		this.styleid = styleid;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Place [recno=" + recno + ", " + (comment != null ? "comment=" + comment + ", " : "") + "dsid=" + dsid
				+ ", " + (endyear != null ? "endyear=" + endyear + ", " : "")
				+ (shortplace != null ? "shortplace=" + shortplace + ", " : "")
				+ (startyear != null ? "startyear=" + startyear + ", " : "") + "styleid=" + styleid + "]";
	}

}