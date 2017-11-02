package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class StyleLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.STYLE;
	private static final String TABLE = "STYLE";
	private static final String INSERT = "(STYLEID, DSID, STYLENAME, ST_DISPLAY, "
			+ "ST_OUTPUT, XGROUP, SRNAMESORT, SRNAMEDISP,  GVNAMESORT, "
			+ "GVNAMEDISP, OTHERDISP, TT) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}