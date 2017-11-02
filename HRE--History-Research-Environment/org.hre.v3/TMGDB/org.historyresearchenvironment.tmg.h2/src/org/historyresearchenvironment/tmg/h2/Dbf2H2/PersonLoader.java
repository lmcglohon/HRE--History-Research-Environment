package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class PersonLoader {
	private static final String project = "Sample";
	private static final String type = TmgTypes.PERSON;
	private static final String TABLE = "PERSON";
	private static final String INSERT = "(PER_NO, FATHER, MOTHER, LAST_EDIT, "
			+ "DSID, REF_ID, REFERENCE, SPOULAST, SCBUFF, PBIRTH, PDEATH, SEX, "
			+ "LIVING, BIRTHORDER, MULTIBIRTH, ADOPTED, "
			+ "ANCE_INT, DESC_INT, RELATE, RELATEFO,TT, FLAG1) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ "?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}