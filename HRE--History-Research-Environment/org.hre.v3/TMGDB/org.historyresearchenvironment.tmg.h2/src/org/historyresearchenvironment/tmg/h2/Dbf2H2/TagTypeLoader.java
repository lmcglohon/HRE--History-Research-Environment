package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class TagTypeLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.TAG_TYPE;
	private static final String TABLE = "TAGTYPE";
	private static final String INSERT = "(ISPICKED, DSID, ACTIVE, ETYPENUM, "
			+ "ORIGETYPE, ADMIN, LDSONLY, ETYPENAME, GEDCOM_TAG, ISREPORT, "
			+ "TSENTENCE, ABBREV, WITDISP, PASTTENSE, PRINROLE,  WITROLE,"
			+ "MAXYEAR, MINYEAR, TT, PROPERTIES,REMINDERS) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}