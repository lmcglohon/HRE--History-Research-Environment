package org.historyresearchenvironment.client.handlers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.client.HreConstants;
import org.historyresearchenvironment.client.HreH2ConnectionPool;
import org.historyresearchenvironment.client.dialogs.ProjectNameSummaryDialog;
import org.historyresearchenvironment.client.models.ProjectList;
import org.historyresearchenvironment.client.models.ProjectModel;
import org.historyresearchenvironment.client.providers.NewDatabaseProvider;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Create a new HRE project database and open it
 * 
 * @version 2018-06-11
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ProjectNewHandler {
	@Inject
	private static IEventBroker eventBroker;
	@Inject
	MApplication application;
	@Inject
	EModelService modelService;

	private Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private NewDatabaseProvider provider;

	/**
	 * Create a new database and open it
	 * 
	 * @param shell
	 *            The application shell
	 * @throws SQLException
	 *             When failing
	 */
	@Execute
	public void execute(Shell shell) throws SQLException {
		// Open file dialog
		final FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		dialog.setText("Create new HRE Project");
		dialog.setFilterPath("~\\");
		final String[] extensions = { "*.h2.db", "*.mv.db", "*.*" };
		dialog.setFilterExtensions(extensions);
		dialog.open();

		final String shortName = dialog.getFileName();
		final String[] parts = shortName.split("\\.");
		final String dbName = dialog.getFilterPath() + "\\" + parts[0];

		try {
			// Create the new database
			provider = new NewDatabaseProvider(dbName);

			provider.provide();

			// Disconnect from any currently connected database
			Connection conn = null;

			conn = HreH2ConnectionPool.getConnection();

			if (conn != null) {
				conn.createStatement().execute("SHUTDOWN");
				conn.close();
				HreH2ConnectionPool.dispose();
			}

			try {
				preferences.put("DBNAME", dbName);
				preferences.flush();
			} catch (BackingStoreException e) {
				LOGGER.severe(e.getMessage());
				e.printStackTrace();
			}
			
			// Connect to the new database
			conn = HreH2ConnectionPool.getConnection(dbName);
			// Not valid before H2 V1.4
			// final PreparedStatement ps = conn
			// .prepareStatement("SELECT TABLE_NAME, ROW_COUNT_ESTIMATE FROM
			// INFORMATION_SCHEMA.TABLES "
			// + "WHERE TABLE_TYPE = 'TABLE' ORDER BY TABLE_NAME");
			final PreparedStatement ps = conn.prepareStatement("SELECT TABLE_NAME, 0 FROM INFORMATION_SCHEMA.TABLES "
					+ "WHERE TABLE_TYPE = 'TABLE' ORDER BY TABLE_NAME");
			ps.executeQuery();
			conn.close();

			// Open a dialog for summary
			ProjectNameSummaryDialog pnsDialog = new ProjectNameSummaryDialog(shell);
			pnsDialog.open();

			// Update the HRE properties
			LocalDateTime now = LocalDateTime.now();
			ZonedDateTime zdt = now.atZone(ZoneId.systemDefault());
			Date timestamp = Date.from(zdt.toInstant());
			ProjectModel model = new ProjectModel(pnsDialog.getProjectName(), timestamp, pnsDialog.getProjectSummary(),
					"LOCAL", shortName);
			ProjectList.add(model);

			// Set database name in title bar
			final MWindow window = (MWindow) modelService.find("org.historyresearchenvironment.client.window.main",
					application);
			window.setLabel("HRE v0.1 - " + pnsDialog.getProjectName());

			eventBroker.post(HreConstants.DATABASE_UPDATE_TOPIC, dbName);
			eventBroker.post("MESSAGE", "Database " + dbName + " has been opened");
		} catch (final Exception e1) {
			eventBroker.post("MESSAGE", e1.getMessage());
			LOGGER.severe(e1.getMessage());
			e1.printStackTrace();
		}

	}
}