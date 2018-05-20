package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import java.util.logging.Logger;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * Import Style table from TMG9 into H2.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class StyleLoader {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String type = TmgTypes.STYLE;

	private static final String TABLE = "STYLE";
	@SuppressWarnings("unused")
	private static final String INSERT_US = "(STYLEID, ST_DISPLAY, ST_OUTPUT, XGROUP,  SRNAMESORT, SRNAMEDISP, "
			+ "GVNAMESORT, GVNAMEDISP, OTHERDISP, TT, DSID, STYLENAME) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public StyleLoader(String dbName, String project, IProgressMonitor monitor) {
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
		String fullPathName = FilenameUtils.getFullPath(project) + FilenameUtils.getBaseName(project).replace("_", "")
				+ "_" + type + ".dbf";
		DbfFieldAnalyser analyser = new DbfFieldAnalyser(fullPathName);
		String INSERT = analyser.getFieldNames();
		LOGGER.info(INSERT);
		final TableLoader ld = new TableLoader(project, type, TABLE, INSERT, dbName);
		ld.run();

	}
}