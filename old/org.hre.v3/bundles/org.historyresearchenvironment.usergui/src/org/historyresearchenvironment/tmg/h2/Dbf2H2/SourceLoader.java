package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class SourceLoader {
	private static final String type = TmgTypes.SOURCE;

	private static final String TABLE = "SOURCE";
	private static final String INSERT = "(MACTIVE, MAJNUM, REF_ID, ABBREV, "
			+ "DEFSURE, TITLE, TYPE, RECORDER, MEDIA, FIDELITY, INDEXED, STATUS, "
			+ "TEXT, SPERNO, ISPICKED, INFO, FFORM, SFORM, BFORM, CITED, "
			+ "IBIDTYPE, SUBJECTID, COMPILER, EDITORID, SPERNO2, UNCITEDFLD, "
			+ "CUSTTYPE, FIRSTCD, DSID, TT, REMINDERS) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public SourceLoader(String dbName, String project, IProgressMonitor monitor) {
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