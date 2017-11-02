package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class ParentChildRealationshipLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.PARENT_CHILD_RELATIONSHIP;
	private static final String TABLE = "PARENTCHILDRELATIONSHIP";
	private static final String INSERT = "(XPRIMARY, CHILD, PARENT, PTYPE, PNOTE, "
			+ "PSURE, FSURE, RECNO, TT, DSID) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}