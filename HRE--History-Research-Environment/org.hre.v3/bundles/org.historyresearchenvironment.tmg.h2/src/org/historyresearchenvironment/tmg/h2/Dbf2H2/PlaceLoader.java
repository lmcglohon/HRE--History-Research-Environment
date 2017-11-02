package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class PlaceLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.PLACE;
	private static final String TABLE = "PLACE";
	private static final String INSERT = "(RECNO, STYLEID, DSID, TT, STARTYEAR,"
			+ "ENDYEAR, COMMENT, SHORTPLACE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}