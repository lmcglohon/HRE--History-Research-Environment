package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * Read all files in a TMG9 project.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ReadAllDbfTables {
	static private TMG9Reader tmg9r = new TMG9Reader();
	static private String project;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: ReadAllDbfTables project (with path, without qualifier and extension");
			return;
		}

		project = args[0] + '_';

		readTable(TmgTypes.PERSON);
		readTable(TmgTypes.SOURCE_TYPE);
		readTable(TmgTypes.FOCUS_GROUP_MEMBER);
		readTable(TmgTypes.FLAG);
		readTable(TmgTypes.DATA_SET);
		readTable(TmgTypes.DNA);
		readTable(TmgTypes.EVENT_WITNESS);
		readTable(TmgTypes.PARENT_CHILD_RELATIONSHIP);
		readTable(TmgTypes.EVENT);
		readTable(TmgTypes.EXHIBIT);
		readTable(TmgTypes.TIMELINE_LOCK);
		readTable(TmgTypes.RESEARCH_LOG);
		readTable(TmgTypes.SOURCE);
		readTable(TmgTypes.NAME);
		readTable(TmgTypes.NAME_DICTIONARY);
		readTable(TmgTypes.NAME_PART_TYPE);
		readTable(TmgTypes.NAME_PART_VALUE);
		readTable(TmgTypes.FOCUS_GROUP);
		readTable(TmgTypes.PLACE);
		readTable(TmgTypes.PLACE_DICTIONARY);
		readTable(TmgTypes.PLACE_PART_TYPE);
		readTable(TmgTypes.PLACE_PART_VALUE);
		readTable(TmgTypes.REPOSITORY);
		readTable(TmgTypes.SOURCE_CITATION);
		readTable(TmgTypes.STYLE);
		readTable(TmgTypes.TAG_TYPE);
		readTable(TmgTypes.SOURCE_ELEMENT);
		readTable(TmgTypes.REPOSITORY_LINK);
		readTable(TmgTypes.EXCLUDED_PAIR);
	}

	static void readTable(String type) {
		final String tableName = project + type + ".dbf";
		tmg9r.read(tableName);
		return;
	}
}
