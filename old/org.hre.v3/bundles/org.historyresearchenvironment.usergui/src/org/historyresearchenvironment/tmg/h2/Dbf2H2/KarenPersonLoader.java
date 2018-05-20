package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * @author Michael Erichsen, (c) History Research Environment Ltd.
 *
 */
public class KarenPersonLoader {
	private static final String type = TmgTypes.PERSON;

	private static final String TABLE = "PERSON";
	private static final String INSERT = "(PER_NO, FATHER, MOTHER, LAST_EDIT, "
			+ "DSID, REF_ID, REFERENCE, SPOULAST, SCBUFF, PBIRTH, PDEATH, RELATE, RELATEFO, TT, SEX, "
			+ "LIVING, BIRTHORDER, MULTIBIRTH, ADOPTED, " + "ANCE_INT, DESC_INT) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public KarenPersonLoader(String dbName, String project, IProgressMonitor monitor) {
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