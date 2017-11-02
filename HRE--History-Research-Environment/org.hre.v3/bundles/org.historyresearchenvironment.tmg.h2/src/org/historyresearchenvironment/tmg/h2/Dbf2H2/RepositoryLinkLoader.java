package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class RepositoryLinkLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.REPOSITORY_LINK;
	private static final String TABLE = "REPOSITORYLINK";
	private static final String INSERT = "(RNUMBER, MNUMBER, REFERENCE, XPRIMARY, "
			+ "TT, DSID ) " + "VALUES (?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}