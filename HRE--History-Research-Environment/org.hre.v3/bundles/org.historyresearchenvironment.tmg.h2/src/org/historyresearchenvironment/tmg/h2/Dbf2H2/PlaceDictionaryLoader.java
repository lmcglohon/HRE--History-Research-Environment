package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class PlaceDictionaryLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.PLACE_DICTIONARY;
	private static final String TABLE = "PLACEDICTIONARY";
	private static final String INSERT = "(UID, XVALUE, SDX, TT) "
			+ "VALUES (?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}