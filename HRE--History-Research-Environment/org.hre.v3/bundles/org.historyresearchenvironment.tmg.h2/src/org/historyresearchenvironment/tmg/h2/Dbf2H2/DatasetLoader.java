/**
 *
 */
package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author michael
 *
 */
public class DatasetLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.DATA_SET;
	private static final String TABLE = "DATASET";
	private static final String INSERT = "(DSID, DSNAME, DSLOCATION, DSTYPE, "
			+ "DSLOCKED, DSENABLED, PROPERTY, DSP, DSP2, DCOMMENT, HOST, "
			+ "NAMESTYLE, PLACESTYLE, TT) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}