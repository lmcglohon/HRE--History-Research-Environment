/**
 *
 */
package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class NameLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.NAME;
	private static final String TABLE = "NAME";
	private static final String INSERT = "(NPER, ALTYPE, ISPICKED, INFS, INFG, XPRIMARY, NSURE, FSURE,  NNOTE, "
			+ "RECNO, SENTENCE, NDATE, SRTDATE, DSURE, DSID, TT, SRNAMESORT, GVNAMESORT, STYLEID, SURID, GIVID, "
			+ "SRNAMEDISP, SNDXSURN, SNDXGVN, PBIRTH, PDEATH, REFER, PREF_ID, LAST_EDIT) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}