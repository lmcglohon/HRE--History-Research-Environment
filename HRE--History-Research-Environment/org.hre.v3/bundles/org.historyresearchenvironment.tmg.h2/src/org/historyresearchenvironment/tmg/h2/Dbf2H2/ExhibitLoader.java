/**
 *
 */
package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author michael
 *
 */
public class ExhibitLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.EXHIBIT;
	private static final String TABLE = "EXHIBIT";
	private static final String INSERT = "(IDEXHIBIT, IDREF, RLTYPE, RLNUM, "
			+ "XNAME, VFILENAME, IFILENAME, AFILENAME, TFILENAME, REFERENCE, "
			+ "TEXT, IMAGE, AUDIO, DESCRIPT, RLPER1, RLPER2, RLGTYPE, OLE_OBJECT, "
			+ "XPRIMARY, VIDEO, PROPERTY, DSID, TT, ID_PERSON, RECNO, ID_EVENT, "
			+ "ID_SOURCE, ID_REPOS, THUMB, ID_CIT, ID_PLACE, CAPTION, SORTEXH, "
			+ "IMAGEFORE, IMAGEBACK, TRANSPAR) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}