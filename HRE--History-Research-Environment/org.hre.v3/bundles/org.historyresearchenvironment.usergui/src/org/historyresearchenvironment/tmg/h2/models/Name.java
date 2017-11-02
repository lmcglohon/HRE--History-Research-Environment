package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Logger;

public class Name {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String DBDRIVER = "org.h2.Driver";
	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";
	private int recno;
	private int altype;
	private int dsid;
	private String dsure;
	private String fsure;
	private int givid;
	private String gvnamesort;
	private String infg;
	private String infs;
	private String ispicked;
	private Date lastEdit;
	private String ndate;
	private String nnote;
	private int nper;
	private String nsure;
	private String pbirth;
	private String pdeath;
	private int prefId;
	private String refer;
	private String sentence;
	private String sndxgvn;
	private String sndxsurn;
	private String srnamedisp;
	private String srnamesort;

	private String srtdate;
	private int styleid;
	private int surid;
	private String xprimary;

	/**
	 * @param nper
	 */
	public Name(int nper) {
		Connection conn = null;
		PreparedStatement pst = null;
		final String SELECT = "SELECT NPER, ALTYPE, ISPICKED, INFS, INFG, XPRIMARY, NSURE, FSURE, NNOTE, RECNO, "
				+ "SENTENCE, NDATE, SRTDATE, DSURE, DSID, TT, SRNAMESORT, GVNAMESORT, STYLEID, SURID, GIVID, "
				+ "SRNAMEDISP, SNDXSURN, SNDXGVN, PBIRTH, PDEATH, REFER, PREF_ID, LAST_EDIT "
				+ "FROM NAME WHERE NPER = ?";

		this.nper = nper;

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
			pst = conn.prepareStatement(SELECT);

			/*
			 * SELECT NPER, ALTYPE, ISPICKED, INFS, INFG, XPRIMARY, NSURE, FSURE, NNOTE,
			 * RECNO, " +
			 * "SENTENCE, NDATE, SRTDATE, DSURE, DSID, TT, SRNAMESORT, GVNAMESORT, STYLEID, SURID, GIVID, "
			 * + "SRNAMEDISP, SNDXSURN, SNDXGVN, PBIRTH, PDEATH, REFER, PREF_ID, LAST_EDIT "
			 * + "FROM NAME WHERE NPER = ?"
			 */
			pst.setInt(1, nper);

			// execute select SQL stetement
			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setSrnamedisp(rs.getString("SRNAMEDISP"));
			} else {
				setSrnamedisp("");
			}

			try {
				pst.close();
				//
				// conn.close();
			} catch (final Exception e) {
				// Do nothing
			}
		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}
	}

	public int getAltype() {
		return this.altype;
	}

	public int getDsid() {
		return this.dsid;
	}

	public String getDsure() {
		return this.dsure;
	}

	public String getFsure() {
		return this.fsure;
	}

	public int getGivid() {
		return this.givid;
	}

	public String getGvnamesort() {
		return this.gvnamesort;
	}

	public String getInfg() {
		return this.infg;
	}

	public String getInfs() {
		return this.infs;
	}

	public String getIspicked() {
		return this.ispicked;
	}

	public Date getLastEdit() {
		return this.lastEdit;
	}

	public String getNdate() {
		return this.ndate;
	}

	public String getNnote() {
		return this.nnote;
	}

	public int getNper() {
		return this.nper;
	}

	public String getNsure() {
		return this.nsure;
	}

	public String getPbirth() {
		return this.pbirth;
	}

	public String getPdeath() {
		return this.pdeath;
	}

	public int getPrefId() {
		return this.prefId;
	}

	public int getRecno() {
		return this.recno;
	}

	public String getRefer() {
		return this.refer;
	}

	public String getSentence() {
		return this.sentence;
	}

	public String getSndxgvn() {
		return this.sndxgvn;
	}

	public String getSndxsurn() {
		return this.sndxsurn;
	}

	public String getSrnamedisp() {
		return this.srnamedisp;
	}

	public String getSrnamesort() {
		return this.srnamesort;
	}

	public String getSrtdate() {
		return this.srtdate;
	}

	public int getStyleid() {
		return this.styleid;
	}

	public int getSurid() {
		return this.surid;
	}

	public String getXprimary() {
		return this.xprimary;
	}

	public void setAltype(int altype) {
		this.altype = altype;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setDsure(String dsure) {
		this.dsure = dsure;
	}

	public void setFsure(String fsure) {
		this.fsure = fsure;
	}

	public void setGivid(int givid) {
		this.givid = givid;
	}

	public void setGvnamesort(String gvnamesort) {
		this.gvnamesort = gvnamesort;
	}

	public void setInfg(String infg) {
		this.infg = infg;
	}

	public void setInfs(String infs) {
		this.infs = infs;
	}

	public void setIspicked(String ispicked) {
		this.ispicked = ispicked;
	}

	public void setLastEdit(Date lastEdit) {
		this.lastEdit = lastEdit;
	}

	public void setNdate(String ndate) {
		this.ndate = ndate;
	}

	public void setNnote(String nnote) {
		this.nnote = nnote;
	}

	public void setNper(int nper) {
		this.nper = nper;
	}

	public void setNsure(String nsure) {
		this.nsure = nsure;
	}

	public void setPbirth(String pbirth) {
		this.pbirth = pbirth;
	}

	public void setPdeath(String pdeath) {
		this.pdeath = pdeath;
	}

	public void setPrefId(int prefId) {
		this.prefId = prefId;
	}

	public void setRecno(int recno) {
		this.recno = recno;
	}

	public void setRefer(String refer) {
		this.refer = refer;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public void setSndxgvn(String sndxgvn) {
		this.sndxgvn = sndxgvn;
	}

	public void setSndxsurn(String sndxsurn) {
		this.sndxsurn = sndxsurn;
	}

	public void setSrnamedisp(String srnamedisp) {
		this.srnamedisp = srnamedisp;
	}

	public void setSrnamesort(String srnamesort) {
		this.srnamesort = srnamesort;
	}

	public void setSrtdate(String srtdate) {
		this.srtdate = srtdate;
	}

	public void setStyleid(int styleid) {
		this.styleid = styleid;
	}

	public void setSurid(int surid) {
		this.surid = surid;
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
		return "Name [recno=" + recno + ", altype=" + altype + ", dsid=" + dsid + ", "
				+ (dsure != null ? "dsure=" + dsure + ", " : "") + (fsure != null ? "fsure=" + fsure + ", " : "")
				+ "givid=" + givid + ", " + (gvnamesort != null ? "gvnamesort=" + gvnamesort + ", " : "")
				+ (infg != null ? "infg=" + infg + ", " : "") + (infs != null ? "infs=" + infs + ", " : "")
				+ (ispicked != null ? "ispicked=" + ispicked + ", " : "")
				+ (lastEdit != null ? "lastEdit=" + lastEdit + ", " : "")
				+ (ndate != null ? "ndate=" + ndate + ", " : "") + (nnote != null ? "nnote=" + nnote + ", " : "")
				+ "nper=" + nper + ", " + (nsure != null ? "nsure=" + nsure + ", " : "")
				+ (pbirth != null ? "pbirth=" + pbirth + ", " : "") + (pdeath != null ? "pdeath=" + pdeath + ", " : "")
				+ "prefId=" + prefId + ", " + (refer != null ? "refer=" + refer + ", " : "")
				+ (sentence != null ? "sentence=" + sentence + ", " : "")
				+ (sndxgvn != null ? "sndxgvn=" + sndxgvn + ", " : "")
				+ (sndxsurn != null ? "sndxsurn=" + sndxsurn + ", " : "")
				+ (srnamedisp != null ? "srnamedisp=" + srnamedisp + ", " : "")
				+ (srnamesort != null ? "srnamesort=" + srnamesort + ", " : "")
				+ (srtdate != null ? "srtdate=" + srtdate + ", " : "") + "styleid=" + styleid + ", surid=" + surid
				+ ", " + (xprimary != null ? "xprimary=" + xprimary : "") + "]";
	}

}