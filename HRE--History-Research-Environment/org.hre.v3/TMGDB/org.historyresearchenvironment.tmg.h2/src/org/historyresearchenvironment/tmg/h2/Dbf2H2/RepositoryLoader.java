package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class RepositoryLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.REPOSITORY;
	private static final String TABLE = "REPOSITORY";
	private static final String INSERT = "(DSID, NAME, RECNO, REF_ID, ABBREV, "
			+ "ADDRESS, RNOTE, RPERNO,  ISPICKED, TT ) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}