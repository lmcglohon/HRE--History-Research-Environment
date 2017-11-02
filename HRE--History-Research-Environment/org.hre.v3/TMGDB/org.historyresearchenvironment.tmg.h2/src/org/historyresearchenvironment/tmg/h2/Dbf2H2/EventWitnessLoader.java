package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author michael
 *
 */
public class EventWitnessLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.EVENT_WITNESS;
	private static final String TABLE = "EVENTWITNESS";
	private static final String INSERT = "(EPER, GNUM, XPRIMARY, WSENTENCE, TT, "
			+ "ROLE, DSID, NAMEREC,  WITMEMO, SEQUENCE) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}