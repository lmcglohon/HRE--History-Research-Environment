package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * Import Exhibit table from TMG9 into H2.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ExhibitLoader {
	private static final String type = TmgTypes.EXHIBIT;

	private static final String TABLE = "EXHIBIT";
	// private static final String INSERT = "(IDEXHIBIT, IDREF, RLTYPE, RLNUM, "
	// + "XNAME, VFILENAME, IFILENAME, AFILENAME, TFILENAME, REFERENCE, "
	// + "TEXT, IMAGE, AUDIO, DESCRIPT, RLPER1, RLPER2, RLGTYPE, OLE_OBJECT, "
	// + "XPRIMARY, VIDEO, PROPERTY, DSID, TT, ID_PERSON, ID_EVENT, "
	// + "ID_SOURCE, ID_REPOS, THUMB, ID_CIT, ID_PLACE, CAPTION, SORTEXH, " +
	// "IMAGEFORE, IMAGEBACK, TRANSPAR) "
	// + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
	// + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String dbName;
	private final String project;

	public ExhibitLoader(String dbName, String project, IProgressMonitor monitor) {
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