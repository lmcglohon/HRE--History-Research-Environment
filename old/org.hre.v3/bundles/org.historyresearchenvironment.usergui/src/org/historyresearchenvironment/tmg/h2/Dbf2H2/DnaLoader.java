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
public class DnaLoader {
	private static final String type = TmgTypes.DNA;
	private static final String TABLE = "DNA";
	private static final String INSERT = "(DSID, ID_DNA, ID_PERSON, DNANAME, "
			+ "COMMENTS, DESCRIPT, RESULT, URL, LOGO, TT, KITNUMBER, TYPE, " + "NAMEREC) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public DnaLoader(String dbName, String project, IProgressMonitor monitor) {
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
