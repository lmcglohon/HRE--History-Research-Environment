package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author Michael Erichsen
 *
 */
public class NameDictionaryLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.NAME_DICTIONARY;
	private static final String TABLE = "NAMEDICTIONARY";
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
