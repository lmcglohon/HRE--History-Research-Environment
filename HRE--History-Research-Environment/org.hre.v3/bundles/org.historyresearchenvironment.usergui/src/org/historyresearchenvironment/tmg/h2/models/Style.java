package org.historyresearchenvironment.tmg.h2.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 * The persistent class for the STYLE database table.
 *
 * )
 */
public class Style {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String DBDRIVER = "org.h2.Driver";
	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";
	private int styleid;
	private int dsid;
	private String gvnamedisp;
	private String gvnamesort;
	private String otherdisp;
	private String srnamedisp;
	private String srnamesort;
	private String stDisplay;
	private String stOutput;
	private String stylename;
	private String tt;
	private String xgroup;
	private final String SELECT = "SELECT STYLEID, ST_DISPLAY, ST_OUTPUT, XGROUP, "
			+ "SRNAMESORT, SRNAMEDISP, GVNAMESORT, GVNAMEDISP, OTHERDISP, TT, DSID, "
			+ "STYLENAME FROM STYLE WHERE STYLEID = ?";
	private Connection conn = null;
	private PreparedStatement pst = null;

	public Style(int i) {
		styleid = i;

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
			pst = conn.prepareStatement(SELECT);
			pst.setInt(1, styleid);

			final ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				setDsid(rs.getInt("DSID"));
				setGvnamedisp(rs.getString("GVNAMEDISP"));
				setGvnamesort(rs.getString("GVNAMESORT"));
				setOtherdisp(rs.getString("OTHERDISP"));
				setSrnamedisp(rs.getString("SRNAMEDISP"));
				setSrnamesort(rs.getString("SRNAMESORT"));
				setStDisplay(rs.getString("ST_DISPLAY"));
				setStOutput(rs.getString("ST_OUTPUT"));
				setStylename(rs.getString("STYLENAME"));
				setXgroup(rs.getString("XGROUP"));
			} else {
				setStyleid(0);
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

	public String getGvnamedisp() {
		return this.gvnamedisp;
	}

	public String getGvnamesort() {
		return this.gvnamesort;
	}

	public String getOtherdisp() {
		return this.otherdisp;
	}

	public String getSrnamedisp() {
		return this.srnamedisp;
	}

	public String getSrnamesort() {
		return this.srnamesort;
	}

	public String getStDisplay() {
		return this.stDisplay;
	}

	public String getStOutput() {
		return this.stOutput;
	}

	public int getStyleid() {
		return this.styleid;
	}

	public String getStylename() {
		return this.stylename;
	}

	public String getTt() {
		return this.tt;
	}

	public String getXgroup() {
		return this.xgroup;
	}

	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	public void setGvnamedisp(String gvnamedisp) {
		this.gvnamedisp = gvnamedisp;
	}

	public void setGvnamesort(String gvnamesort) {
		this.gvnamesort = gvnamesort;
	}

	public void setOtherdisp(String otherdisp) {
		this.otherdisp = otherdisp;
	}

	public void setSrnamedisp(String srnamedisp) {
		this.srnamedisp = srnamedisp;
	}

	public void setSrnamesort(String srnamesort) {
		this.srnamesort = srnamesort;
	}

	public void setStDisplay(String stDisplay) {
		this.stDisplay = stDisplay;
	}

	public void setStOutput(String stOutput) {
		this.stOutput = stOutput;
	}

	public void setStyleid(int styleid) {
		this.styleid = styleid;
	}

	public void setStylename(String stylename) {
		this.stylename = stylename;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public void setXgroup(String xgroup) {
		this.xgroup = xgroup;
	}

}