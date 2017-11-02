/**
 *
 */
package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author michael Key ruleset + sourtype
 */
public class EventLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.EVENT;
	private static final String TABLE = "EVENT";
	private static final String INSERT = "(ETYPE, DSID, PER1SHOW, PER2SHOW, PER1, "
			+ "PER2, EDATE, PLACENUM, EFOOT, ENSURE, ESSURE, EDSURE, EPSURE, "
			+ "EFSURE, RECNO, SENTENCE, SRTDATE, TT, REF_ID) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}