package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @author michael
 *
 */
public class FocusGroupMemberLoader {
	private static final String project = "Sieg";
	private static final String type = TmgTypes.FOCUS_GROUP_MEMBER;
	private static final String TABLE = "FOCUSGROUPMEMBER";
	private static final String INSERT = "(GROUPNUM, MEMBERNUM, TT, DSID) "
			+ "VALUES (?, ?, ?, ?)";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT);
		ld.run();
	}
}