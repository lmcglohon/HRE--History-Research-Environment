/**
 *
 */
package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class EventLoader {
	private static final String type = TmgTypes.EVENT;
	private static final String TABLE = "EVENT";
	private static final String INSERT = "(ETYPE, DSID, PER1SHOW, PER2SHOW, PER1, "
			+ "PER2, EDATE, PLACENUM, EFOOT, ENSURE, ESSURE, EDSURE, EPSURE, "
			+ "EFSURE, RECNO, SENTENCE, SRTDATE, TT, REF_ID) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName2
	 * @param project2
	 */
	public EventLoader(String dbName, String project, IProgressMonitor monitor) {
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