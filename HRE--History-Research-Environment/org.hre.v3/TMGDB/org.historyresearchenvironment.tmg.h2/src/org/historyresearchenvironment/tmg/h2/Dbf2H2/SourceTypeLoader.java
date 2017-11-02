package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */

public class SourceTypeLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.SOURCE_TYPE;
	private static final String TABLE = "SOURCETYPE";
	private static final String INSERT = "(RULESET, DSID, SOURTYPE, "
			+ "TRANS_TO, NAME, FOOT, SHORT, BIB, CUSTFOOT, CUSTSHORT, CUSTBIB, "
			+ "SAMEAS, SAMEASMSG, XPRIMARY, TT, REMINDERS) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}