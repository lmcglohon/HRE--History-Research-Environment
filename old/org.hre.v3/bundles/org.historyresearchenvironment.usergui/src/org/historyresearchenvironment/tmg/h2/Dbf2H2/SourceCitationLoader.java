package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class SourceCitationLoader {
	private static final String type = TmgTypes.SOURCE_CITATION;

	private static final String TABLE = "SOURCECITATION";
	private static final String INSERT = "(RECNO, STYPE, REFREC, MAJSOURCE, "
			+ "SUBSOURCE, SNSURE, SSSURE, SDSURE, SPSURE, SFSURE, ISPICKED, "
			+ "SEQUENCE, CITMEMO, EXCLUDE, TT, DSID, CITREF) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public SourceCitationLoader(String dbName, String project, IProgressMonitor monitor) {
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