package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class PlacePartValueLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.PLACE_PART_VALUE;
	private static final String TABLE = "PLACEPARTVALUE";
	private static final String INSERT = "(RECNO, UID, TYPE, ID, TT, DSID) "
			+ "VALUES (?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}