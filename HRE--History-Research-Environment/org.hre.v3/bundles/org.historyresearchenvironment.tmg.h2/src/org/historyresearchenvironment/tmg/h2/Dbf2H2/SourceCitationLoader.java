package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class SourceCitationLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.SOURCE_CITATION;
	private static final String TABLE = "SOURCECITATION";
	private static final String INSERT = "(RECNO, STYPE, REFREC, MAJSOURCE, "
			+ "SUBSOURCE, SNSURE, SSSURE, SDSURE, SPSURE, SFSURE, ISPICKED, "
			+ "SEQUENCE, CITMEMO, EXCLUDE, TT, DSID, CITREF) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}