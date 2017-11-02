/**
 *
 */
package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author michael
 */
public class DnaLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.DNA;
	private static final String TABLE = "DNA";
	private static final String INSERT = "(DSID, ID_DNA, ID_PERSON, DNANAME, "
			+ "COMMENTS, DESCRIPT, RESULT, URL, LOGO, TT, KITNUMBER, TYPE, "
			+ "NAMEREC) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}
