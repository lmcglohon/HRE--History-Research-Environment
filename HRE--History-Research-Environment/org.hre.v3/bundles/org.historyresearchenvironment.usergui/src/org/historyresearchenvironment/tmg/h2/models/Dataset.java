package org.historyresearchenvironment.tmg.h2.models;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the DATASET database table.
 *
 */
public class Dataset {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String SELECT = "SELECT DSID, DSNAME, DSLOCATION, DSTYPE, DSLOCKED, "
			+ "DSENABLED, PROPERTY, DSP, DSP2, DCOMMENT, HOST, NAMESTYLE, " + "PLACESTYLE FROM DATASET WHERE DSID = ?";

	private static final String DBDRIVER = "org.h2.Driver";

	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";

	public static void main(String[] args) {
		final Dataset ds = new Dataset(1);
		LOGGER.info(ds.toString());
	}

	private int dsid;
	private String dcomment;
	private String dsenabled;
	private String dslocation;
	private String dslocked;
	private String dsname;
	private String dsp;
	private String dsp2;
	private BigDecimal dstype;
	private String host;
	private int namestyle;
	private int placestyle;
	private String property;
	private String tt;
	private Connection conn = null;

	private PreparedStatement pst = null;

	public Dataset(int dsid) {

		this.dsid = dsid;

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
			pst = conn.prepareStatement(SELECT);

			pst.setInt(1, dsid);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setDcomment(rs.getString("DCOMMENT"));
				setDsenabled(rs.getString("DSENABLED"));
				setDslocation(rs.getString("DSLOCATION"));
				setDslocked(rs.getString("DSLOCKED"));
				setDsname(rs.getString("DSNAME"));
				setDsp(rs.getString("DSP"));
				setDsp2(rs.getString("DSP2"));
				setDstype(rs.getBigDecimal("DSTYPE"));
				setHost(rs.getString("HOST"));
				setNamestyle(rs.getInt("NAMESTYLE"));
				setPlacestyle(rs.getInt("PLACESTYLE"));
				setProperty(rs.getString("PROPERTY"));
			}

			try {
				pst.close();
			} catch (final Exception e) {
				// Do nothing
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	public String getDcomment() {
		return this.dcomment;
	}

	/**
	 * @return
	 */
	public String getDsenabled() {
		return this.dsenabled;
	}

	/**
	 * @return
	 */
	public int getDsid() {
		return this.dsid;
	}

	public String getDslocation() {
		return this.dslocation;
	}

	public String getDslocked() {
		return this.dslocked;
	}

	public String getDsname() {
		return this.dsname;
	}

	public String getDsp() {
		return this.dsp;
	}

	public String getDsp2() {
		return this.dsp2;
	}

	public BigDecimal getDstype() {
		return this.dstype;
	}

	public String getHost() {
		return this.host;
	}

	public int getNamestyle() {
		return this.namestyle;
	}

	public int getPlacestyle() {
		return this.placestyle;
	}

	public String getProperty() {
		return this.property;
	}

	public String getTt() {
		return this.tt;
	}

	public void setDcomment(String dcomment) {
		this.dcomment = dcomment;
	}

	public void setDsenabled(String dsenabled) {
		this.dsenabled = dsenabled;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setDslocation(String dslocation) {
		this.dslocation = dslocation;
	}

	public void setDslocked(String dslocked) {
		this.dslocked = dslocked;
	}

	public void setDsname(String dsname) {
		this.dsname = dsname;
	}

	public void setDsp(String dsp) {
		this.dsp = dsp;
	}

	public void setDsp2(String dsp2) {
		this.dsp2 = dsp2;
	}

	public void setDstype(BigDecimal dstype) {
		this.dstype = dstype;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setNamestyle(int namestyle) {
		this.namestyle = namestyle;
	}

	public void setPlacestyle(int placestyle) {
		this.placestyle = placestyle;
	}

	public void setProperty(String property) {
		this.property = property;
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
		return "Dataset [dsid=" + dsid + ", dcomment=" + dcomment + ", dsenabled=" + dsenabled + ", dslocation="
				+ dslocation + ", dslocked=" + dslocked + ", dsname=" + dsname + ", dsp=" + dsp + ", dsp2=" + dsp2
				+ ", dstype=" + dstype + ", host=" + host + ", namestyle=" + namestyle + ", placestyle=" + placestyle
				+ ", property=" + property + "]";
	}

}