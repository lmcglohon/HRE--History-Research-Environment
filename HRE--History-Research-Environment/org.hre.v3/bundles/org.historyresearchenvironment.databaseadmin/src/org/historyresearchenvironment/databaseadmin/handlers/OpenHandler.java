package org.historyresearchenvironment.databaseadmin.handlers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.databaseadmin.HreDbadminConstants;
import org.historyresearchenvironment.databaseadmin.HreH2ConnectionPool;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Handler to open an existing database
 * 
 * @version 2018-05-22
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class OpenHandler {
	@Inject
	private static IEventBroker eventBroker;
	@Inject
	MApplication application;
	@Inject
	EModelService modelService;

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Select a database and open it
	 * 
	 * @param shell
	 *            The application shell
	 * @throws SQLException
	 *             When failed
	 * @throws BackingStoreException
	 *             Preferences data access failure
	 */
	@Execute
	public void execute(Shell shell) throws SQLException, BackingStoreException {
		Preferences preferences = ConfigurationScope.INSTANCE.getNode("org.historyresearchenvironment.databaseadmin");
		Connection conn = null;

		final FileDialog dialog = new FileDialog(shell);
		final String[] extensions = { "*.db", "*.*" };
		dialog.setFilterExtensions(extensions);
		dialog.open();

		final String shortName = dialog.getFileName();
		final String[] parts = shortName.split("\\.");
		final String dbName = dialog.getFilterPath() + "\\" + parts[0];
		preferences.put("DBNAME", dbName);
		LOGGER.info("Database name: " + dbName);

		preferences.flush();

		try {
			conn = HreH2ConnectionPool.getConnection();

			if (conn != null) {
				conn.createStatement().execute("SHUTDOWN");
				conn.close();
				conn = null;
				HreH2ConnectionPool.dispose();
			}
		} catch (final Exception e1) {
			eventBroker.post("MESSAGE", e1.getMessage());
			LOGGER.severe(e1.getMessage());
		}

		conn = HreH2ConnectionPool.getConnection(dbName);

		if (conn != null) {
			final PreparedStatement ps = conn
					.prepareStatement("SELECT TABLE_NAME, ROW_COUNT_ESTIMATE FROM INFORMATION_SCHEMA.TABLES "
							+ "WHERE TABLE_TYPE = 'TABLE' ORDER BY TABLE_NAME");
			ps.executeQuery();
			conn.close();
		}

		final MWindow window = (MWindow) modelService
				.find("org.historyresearchenvironment.databaseadmin.v010.window.main", application);
		window.setLabel("HRE H2 Database Administration - " + dbName);

		eventBroker.post(HreDbadminConstants.DATABASE_UPDATE_TOPIC, dbName);
		eventBroker.post("MESSAGE", "Database " + dbName + " has been opened");
	}
}
