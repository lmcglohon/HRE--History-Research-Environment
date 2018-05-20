package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import java.util.logging.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

/**
 * Import DATASET table from TMG9 into H2.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class DatasetLoader {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static final String type = TmgTypes.DATA_SET;
	private static final String TABLE = "DATASET";
	private final String dbName;
	private final String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public DatasetLoader(String dbName, String project, IProgressMonitor monitor) {
		super();
		this.dbName = dbName;
		this.project = project;
		LOGGER.info("C:tor");
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
		LOGGER.info("Run");
		// TODO Removed
		// final TableLoader ld = new TableLoader(project, type, TABLE, dbName);
		// ld.run();
	}
}