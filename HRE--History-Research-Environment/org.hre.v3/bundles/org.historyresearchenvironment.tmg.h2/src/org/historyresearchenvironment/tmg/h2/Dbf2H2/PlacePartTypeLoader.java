package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class PlacePartTypeLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.PLACE_PART_TYPE;
	private static final String TABLE = "PLACEPARTTYPE";
	private static final String INSERT = "(ID, TYPE, XVALUE, SYSTEM, SHORTVALUE, "
			+ "TT, DSID) " + "VALUES (?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}