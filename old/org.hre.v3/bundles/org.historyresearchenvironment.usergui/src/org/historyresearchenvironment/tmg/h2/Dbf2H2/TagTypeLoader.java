package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TagTypeLoader {
	private static final String type = TmgTypes.TAG_TYPE;

	private static final String TABLE = "TAGTYPE";
	// private static final String INSERT = "(ISPICKED, DSID, ACTIVE, ETYPENUM, "
	// + "ORIGETYPE, ADMIN, LDSONLY, ETYPENAME, GEDCOM_TAG, ISREPORT, "
	// + "TSENTENCE, ABBREV, WITDISP, PASTTENSE, PRINROLE, WITROLE,"
	// + "MAXYEAR, MINYEAR, TT, PROPERTIES,REMINDERS) " + "VALUES (?, ?, ?, ?, ?, ?,
	// ?, ?, ?, ?, ?, "
	// + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public TagTypeLoader(String dbName, String project, IProgressMonitor monitor) {
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
		final TableLoader ld = new TableLoader(project, type, TABLE, dbName);
		ld.run();

	}
}