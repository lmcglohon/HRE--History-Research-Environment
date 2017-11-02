package org.historyresearchenvironment.tmg.h2.models;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the TAGTYPE database table.
 *
 */
public class Tagtype {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final static String SELECT = "SELECT ISPICKED, DSID, ACTIVE, ETYPENUM, "
			+ "ORIGETYPE, ADMIN, LDSONLY, ETYPENAME, GEDCOM_TAG, ISREPORT, TSENTENCE, "
			+ "ABBREV, WITDISP, PASTTENSE, WITROLE, MAXYEAR, MINYEAR, REMINDERS, "
			+ "PROPERTIES FROM TAGTYPE WHERE ETYPENUM = ?";
	private static final String DBDRIVER = "org.h2.Driver";
	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";
	private int etypenum;
	private String abbrev;
	private String active;
	private BigDecimal admin;
	private int dsid;
	private String etypename;
	private String gedcomTag;
	private String ispicked;
	private String isreport;
	private String ldsonly;
	private BigDecimal maxyear;
	private BigDecimal minyear;
	private int origetype;
	private String pasttense;
	private String place4;
	private String prinrole;
	private String properties;
	private String reminders;
	private String tsentence;
	private String tt;
	private String witdisp;
	private String witrole;
	private Connection conn = null;
	private PreparedStatement pst = null;

	public Tagtype(int i) {
		this.etypenum = i;

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
			pst = conn.prepareStatement(SELECT);

			pst.setInt(1, etypenum);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setDsid(rs.getInt("DSID"));
				setEtypename(rs.getString("ETYPENAME").trim());
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

	public String getAbbrev() {
		return this.abbrev;
	}

	public String getActive() {
		return this.active;
	}

	public BigDecimal getAdmin() {
		return this.admin;
	}

	public int getDsid() {
		return this.dsid;
	}

	public String getEtypename() {
		return this.etypename;
	}

	public int getEtypenum() {
		return this.etypenum;
	}

	public String getGedcomTag() {
		return this.gedcomTag;
	}

	public String getIspicked() {
		return this.ispicked;
	}

	public String getIsreport() {
		return this.isreport;
	}

	public String getLdsonly() {
		return this.ldsonly;
	}

	public BigDecimal getMaxyear() {
		return this.maxyear;
	}

	public BigDecimal getMinyear() {
		return this.minyear;
	}

	public int getOrigetype() {
		return this.origetype;
	}

	public String getPasttense() {
		return this.pasttense;
	}

	public String getPlace4() {
		return this.place4;
	}

	public String getPrinrole() {
		return this.prinrole;
	}

	public String getProperties() {
		return this.properties;
	}

	public String getReminders() {
		return this.reminders;
	}

	public String getTsentence() {
		return this.tsentence;
	}

	public String getTt() {
		return this.tt;
	}

	public String getWitdisp() {
		return this.witdisp;
	}

	public String getWitrole() {
		return this.witrole;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public void setAdmin(BigDecimal admin) {
		this.admin = admin;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setEtypename(String etypename) {
		this.etypename = etypename;
	}

	public void setEtypenum(int etypenum) {
		this.etypenum = etypenum;
	}

	public void setGedcomTag(String gedcomTag) {
		this.gedcomTag = gedcomTag;
	}

	public void setIspicked(String ispicked) {
		this.ispicked = ispicked;
	}

	public void setIsreport(String isreport) {
		this.isreport = isreport;
	}

	public void setLdsonly(String ldsonly) {
		this.ldsonly = ldsonly;
	}

	public void setMaxyear(BigDecimal maxyear) {
		this.maxyear = maxyear;
	}

	public void setMinyear(BigDecimal minyear) {
		this.minyear = minyear;
	}

	public void setOrigetype(int origetype) {
		this.origetype = origetype;
	}

	public void setPasttense(String pasttense) {
		this.pasttense = pasttense;
	}

	public void setPlace4(String place4) {
		this.place4 = place4;
	}

	public void setPrinrole(String prinrole) {
		this.prinrole = prinrole;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public void setReminders(String reminders) {
		this.reminders = reminders;
	}

	public void setTsentence(String tsentence) {
		this.tsentence = tsentence;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setWitdisp(String witdisp) {
		this.witdisp = witdisp;
	}

	public void setWitrole(String witrole) {
		this.witrole = witrole;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tagtype [etypenum=" + etypenum + ", " + (abbrev != null ? "abbrev=" + abbrev + ", " : "")
				+ (active != null ? "active=" + active + ", " : "") + (admin != null ? "admin=" + admin + ", " : "")
				+ "dsid=" + dsid + ", " + (etypename != null ? "etypename=" + etypename + ", " : "")
				+ (gedcomTag != null ? "gedcomTag=" + gedcomTag + ", " : "")
				+ (ispicked != null ? "ispicked=" + ispicked + ", " : "")
				+ (isreport != null ? "isreport=" + isreport + ", " : "")
				+ (ldsonly != null ? "ldsonly=" + ldsonly + ", " : "")
				+ (maxyear != null ? "maxyear=" + maxyear + ", " : "")
				+ (minyear != null ? "minyear=" + minyear + ", " : "") + "origetype=" + origetype + ", "
				+ (pasttense != null ? "pasttense=" + pasttense + ", " : "")
				+ (place4 != null ? "place4=" + place4 + ", " : "")
				+ (prinrole != null ? "prinrole=" + prinrole + ", " : "")
				+ (properties != null ? "properties=" + properties + ", " : "")
				+ (reminders != null ? "reminders=" + reminders + ", " : "")
				+ (tsentence != null ? "tsentence=" + tsentence + ", " : "")
				+ (witdisp != null ? "witdisp=" + witdisp + ", " : "") + (witrole != null ? "witrole=" + witrole : "")
				+ "]";
	}

}