
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.databaseadmin.HreDbadminConstants;
import org.historyresearchenvironment.databaseadmin.HreH2ConnectionPool;
import org.historyresearchenvironment.databaseadmin.providers.NewDatabaseProvider;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Create a new HRE project database and open it
 * 
 * @version 2018-05-24
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class NewHandler {
	@Inject
	private static IEventBroker eventBroker;
	@Inject
	MApplication application;
	@Inject
	EModelService modelService;

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private NewDatabaseProvider provider;

	/**
	 * Create a new database and open it
	 * 
	 * @param shell
	 *            The application shell
	 * @throws SQLException When failing
	 */
	@Execute
	public void execute(Shell shell) throws SQLException {
		final FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		dialog.setText("Create");
		dialog.setFilterPath("~\\");
		final String[] filterExt = { "*.db", "*.*" };
		dialog.setFilterExtensions(filterExt);
		dialog.open();

		final String shortName = dialog.getFileName();
		final String[] parts = shortName.split("\\.");
		final String dbName = dialog.getFilterPath() + "\\" + parts[0];

		Preferences preferences = ConfigurationScope.INSTANCE.getNode("org.historyresearchenvironment.databaseadmin");
		preferences.put("DBNAME", dbName);
		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			LOGGER.severe(e.getMessage());
			e.printStackTrace();
		}

		provider = new NewDatabaseProvider(dbName);

		try {
			provider.provide();

			Connection conn = null;

			conn = HreH2ConnectionPool.getConnection();

			if (conn != null) {
				conn.createStatement().execute("SHUTDOWN");
				conn.close();
				HreH2ConnectionPool.dispose();
			}

			conn = HreH2ConnectionPool.getConnection(dbName);
			// final PreparedStatement ps = conn
			// .prepareStatement("SELECT TABLE_NAME, ROW_COUNT_ESTIMATE FROM
			// INFORMATION_SCHEMA.TABLES "
			// + "WHERE TABLE_TYPE = 'TABLE' ORDER BY TABLE_NAME");
			final PreparedStatement ps = conn.prepareStatement("SELECT TABLE_NAME, 0 FROM INFORMATION_SCHEMA.TABLES "
					+ "WHERE TABLE_TYPE = 'TABLE' ORDER BY TABLE_NAME");
			ps.executeQuery();
			conn.close();

			final MWindow window = (MWindow) modelService
					.find("org.historyresearchenvironment.databaseadmin.v010.window.main", application);
			window.setLabel("HRE H2 Database Administration - " + dbName);

			eventBroker.post(HreDbadminConstants.DATABASE_UPDATE_TOPIC, dbName);
			eventBroker.post("MESSAGE", "Database " + dbName + " has been opened");
		} catch (final Exception e1) {
			eventBroker.post("MESSAGE", e1.getMessage());
			// e1.printStackTrace();
			LOGGER.severe(e1.getMessage());
		}

	}
}