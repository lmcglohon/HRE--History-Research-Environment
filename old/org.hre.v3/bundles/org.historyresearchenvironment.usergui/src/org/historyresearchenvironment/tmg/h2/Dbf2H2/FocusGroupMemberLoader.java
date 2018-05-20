package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class FocusGroupMemberLoader {
	private static final String type = TmgTypes.FOCUS_GROUP_MEMBER;
	private static final String TABLE = "FOCUSGROUPMEMBER";
	private static final String INSERT = "(GROUPNUM, MEMBERNUM, TT, DSID) " + "VALUES (?, ?, ?, ?)";

	private final String dbName;
	private final String project;

	/**
	 * @param dbName2
	 * @param project2
	 */
	public FocusGroupMemberLoader(String dbName, String project, IProgressMonitor monitor) {
		super();
		this.dbName = dbName;
		this.project = project;
		final SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
		subMonitor.beginTask("Loading tables", 1);
		subMonitor.subTask("Loading " + TABLE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */

	public void run() {
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT, dbName);
		ld.run();

	}
}