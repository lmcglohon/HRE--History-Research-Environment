package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class SourceElementLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.SOURCE_ELEMENT;
	private static final String TABLE = "SOURCEELEMENT";
	private static final String INSERT = "(RECNO, DSID, ELEMENT, GROUPNUM, TT) "
			+ "VALUES (?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}