package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class NamePartTypeLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.NAME_PART_TYPE;
	private static final String TABLE = "NAMEPARTTYPE";
	private static final String INSERT = " (TEMPLATE, ID, XVALUE, SYSTEM, TYPE, "
			+ "SHORTVALUE, TT, DSID) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}