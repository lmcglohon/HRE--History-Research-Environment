package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class ResearchLogLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.RESEARCH_LOG;
	private static final String TABLE = "RESEARCHLOG";
	private static final String INSERT = "(RLTYPE, RLNUM, RLPER1, RLPER2, RLGTYPE, "
			+ "TASK, RLEDITED,  DESIGNED, BEGUN, PROGRESS, COMPLETED, PLANNED, "
			+ "EXPENSES, COMMENTS, RLNOTE, KEYWORDS, DSID, ID_PERSON, ID_EVENT, "
			+ "ID_SOURCE, ID_REPOS, TT, REFERENCE, NUM_REC, S) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ "?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}