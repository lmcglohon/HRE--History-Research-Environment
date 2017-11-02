package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class TimelineLockLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.TIMELINE_LOCK;
	private static final String TABLE = "TIMELINELOCK";
	private static final String INSERT = "(IDLOCK, TNAME, DSID, TT, PLACES) "
			+ "VALUES (?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}