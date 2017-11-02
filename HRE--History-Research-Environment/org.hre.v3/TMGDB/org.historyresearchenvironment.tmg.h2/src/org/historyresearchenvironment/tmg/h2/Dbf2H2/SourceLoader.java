package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class SourceLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.SOURCE;
	private static final String TABLE = "SOURCE";
	private static final String INSERT = "(MACTIVE, MAJNUM, REF_ID, ABBREV, "
			+ "DEFSURE, TITLE, TYPE, RECORDER, MEDIA, FIDELITY, INDEXED, STATUS, "
			+ "TEXT, SPERNO, ISPICKED, INFO, FFORM, SFORM, BFORM, CITED, "
			+ "IBIDTYPE, SUBJECTID, COMPILER, EDITORID, SPERNO2, UNCITEDFLD, "
			+ "CUSTTYPE, FIRSTCD, DSID, TT, REMINDERS) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}