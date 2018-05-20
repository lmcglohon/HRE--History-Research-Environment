package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the EVENT database table.
 *
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TmgEvent {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String SELECT = "SELECT ETYPE, DSID, PER1SHOW, PER2SHOW, "
			+ "PER1, PER2, EDATE, PLACENUM, EFOOT, ENSURE, ESSURE, EDSURE, EPSURE, "
			+ "EFSURE, RECNO, SENTENCE, SRTDATE, TT, REF_ID " + "FROM EVENT " + "WHERE RECNO = ?";

	private int recno;
	private int dsid;
	private String edate;
	private String edsure;
	private String efoot;
	private String efsure;
	private String ensure;
	private String epsure;
	private String essure;
	private int etype;
	private int per1;
	private String per1show;
	private int per2;
	private String per2show;
	private int placenum;
	private int refId;

	private String sentence;
	private String srtdate;
	private Placepartvalue ppv;
	private String placestring = "";
	private Tagtype tagtype;
	private PreparedStatement pst = null;

	public TmgEvent() {
	}

	public TmgEvent(Connection conn, int i) {
		this.recno = i;
		try {
			pst = conn.prepareStatement(SELECT);

			pst.setInt(1, recno);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setDsid(rs.getInt("DSID"));
				setEdate(rs.getString("EDATE").trim());
				setEdsure(rs.getString("EDSURE"));
				setEfoot(rs.getString("EFOOT"));
				setEnsure(rs.getString("ENSURE"));
				setEpsure(rs.getString("EPSURE"));
				setEssure(rs.getString("ESSURE"));
				setEtype(rs.getInt("ETYPE"));
				setTagtype(new Tagtype(conn, etype));
				setPer1(rs.getInt("PER1"));
				setPer1show(rs.getString("PER1SHOW"));
				setPer2(rs.getInt("PER2"));
				setPer2show(rs.getString("PER2SHOW"));
				setPlacenum(rs.getInt("PLACENUM"));
				setPpv(new Placepartvalue(conn, placenum));
				setRefId(rs.getInt("REF_ID"));
				setSentence(rs.getString("SENTENCE"));
				setSrtdate(rs.getString("SRTDATE").trim());
			}

			try {
				pst.close();
			} catch (final Exception e) {
				// Do nothing
			}
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}

	public int getDsid() {
		return this.dsid;
	}

	public String getEdate() {
		return this.edate;
	}

	public String getEdsure() {
		return this.edsure;
	}

	public String getEfoot() {
		return this.efoot;
	}

	public String getEfsure() {
		return this.efsure;
	}

	public String getEnsure() {
		return this.ensure;
	}

	public String getEpsure() {
		return this.epsure;
	}

	public String getEssure() {
		return this.essure;
	}

	public int getEtype() {
		return this.etype;
	}

	public int getPer1() {
		return this.per1;
	}

	public String getPer1show() {
		return this.per1show;
	}

	public int getPer2() {
		return this.per2;
	}

	public String getPer2show() {
		return this.per2show;
	}

	public int getPlacenum() {
		return this.placenum;
	}

	/**
	 * @return the placestring
	 */
	public String getPlacestring() {
		return placestring;
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

	public int getRefId() {
		return this.refId;
	}

	public String getSentence() {
		return this.sentence;
	}

	public String getSrtdate() {
		return this.srtdate;
	}

	/**
	 * @return the tagtype
	 */
	public Tagtype getTagtype() {
		return tagtype;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setEdate(String string) {
		this.edate = string;
	}

	public void setEdsure(String edsure) {
		this.edsure = edsure;
	}

	public void setEfoot(String efoot) {
		this.efoot = efoot;
	}

	public void setEfsure(String efsure) {
		this.efsure = efsure;
	}

	public void setEnsure(String ensure) {
		this.ensure = ensure;
	}

	public void setEpsure(String epsure) {
		this.epsure = epsure;
	}

	public void setEssure(String essure) {
		this.essure = essure;
	}

	public void setEtype(int etype) {
		this.etype = etype;
	}

	public void setPer1(int per1) {
		this.per1 = per1;
	}

	public void setPer1show(String per1show) {
		this.per1show = per1show;
	}

	public void setPer2(int per2) {
		this.per2 = per2;
	}

	public void setPer2show(String per2show) {
		this.per2show = per2show;
	}

	public void setPlacenum(int int1) {
		placenum = int1;
	}

	/**
	 * @param placestring
	 *            the placestring to set
	 */
	public void setPlacestring(String placestring) {
		this.placestring = placestring;
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

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public void setSrtdate(String srtdate) {
		this.srtdate = srtdate;
	}

	/**
	 * @param tagtype
	 *            the tagtype to set
	 */
	public void setTagtype(Tagtype tagtype) {
		this.tagtype = tagtype;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TmgEvent [recno=" + recno + ", dsid=" + dsid + ", " + (edate != null ? "edate=" + edate + ", " : "")
				+ (edsure != null ? "edsure=" + edsure + ", " : "") + (efoot != null ? "efoot=" + efoot + ", " : "")
				+ (efsure != null ? "efsure=" + efsure + ", " : "") + (ensure != null ? "ensure=" + ensure + ", " : "")
				+ (epsure != null ? "epsure=" + epsure + ", " : "") + (essure != null ? "essure=" + essure + ", " : "")
				+ "etype=" + etype + ", per1=" + per1 + ", " + (per1show != null ? "per1show=" + per1show + ", " : "")
				+ "per2=" + per2 + ", " + (per2show != null ? "per2show=" + per2show + ", " : "") + "placenum="
				+ placenum + ", refId=" + refId + ", " + (sentence != null ? "sentence=" + sentence + ", " : "")
				+ (srtdate != null ? "srtdate=" + srtdate + ", " : "") + (ppv != null ? "ppv=" + ppv + ", " : "")
				+ (tagtype != null ? "tagtype=" + tagtype : "") + "]";
	}

}