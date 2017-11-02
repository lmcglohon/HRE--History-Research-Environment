package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author michael
 *
 */
public class FocusGroupLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.FOCUS_GROUP;
	private static final String TABLE = "FOCUSGROUP";
	private static final String INSERT = "(GROUPNUM, GROUPNAME, RECENT, TT) "
			+ "VALUES (?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}