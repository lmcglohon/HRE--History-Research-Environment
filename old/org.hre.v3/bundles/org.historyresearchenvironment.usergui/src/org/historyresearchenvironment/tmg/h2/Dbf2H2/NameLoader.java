/**
 *
 */
package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * @author Michael Erichsen, (c) History Research Environment Ltd.
 *
 */
public class NameLoader {
	private static final String type = TmgTypes.NAME;

	private static final String TABLE = "NAME";
	private static final String INSERT = "(NPER, ALTYPE, ISPICKED, INFS, INFG, XPRIMARY, NSURE, FSURE,  NNOTE, "
			+ "RECNO, SENTENCE, NDATE, SRTDATE, DSURE, DSID, TT, SRNAMESORT, GVNAMESORT, STYLEID, SURID, GIVID, "
			+ "SRNAMEDISP, SNDXSURN, SNDXGVN, PBIRTH, PDEATH, REFER, PREF_ID, LAST_EDIT) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public NameLoader(String dbName, String project, IProgressMonitor monitor) {
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