package org.historyresearchenvironment.client.handlers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.client.HreH2ConnectionPool;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Handler to open an existing project.
 * 
 * @version 2018-06-12
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ProjectOpenHandler {
	@Inject
	private static IEventBroker eventBroker;

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Select a database and open it
	 * 
	 * @param partService
	 * @param application
	 * @param modelService
	 * @param shell
	 * @throws SQLException
	 * @throws BackingStoreException
	 */
	@Execute
	public void execute(EPartService partService, MApplication application, EModelService modelService, Shell shell)
			throws SQLException, BackingStoreException {
		Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");
		Connection conn = null;

		final FileDialog dialog = new FileDialog(shell);
		final String[] extensions = { "*.h2.db", "*.mv.db", "*.*" };
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
			// final PreparedStatement ps = conn
			// .prepareStatement("SELECT TABLE_NAME, ROW_COUNT_ESTIMATE FROM
			// INFORMATION_SCHEMA.TABLES "
			// + "WHERE TABLE_TYPE = 'TABLE' ORDER BY TABLE_NAME");
			final PreparedStatement ps = conn.prepareStatement("SELECT TABLE_NAME, 0 FROM INFORMATION_SCHEMA.TABLES "
					+ "WHERE TABLE_TYPE = 'TABLE' ORDER BY TABLE_NAME");
			ps.executeQuery();
			conn.close();
		}

		final MWindow window = (MWindow) modelService.find("org.historyresearchenvironment.client.window.main",
				application);
		window.setLabel("HRE v0.1 - " + dbName);

		final MPart part = MBasicFactory.INSTANCE.createPart();
		part.setLabel("Database Tables");
		part.setContainerData("650");
		part.setCloseable(true);
		part.setVisible(true);
		part.setContributionURI(
				"bundleclass://org.historyresearchenvironment.client/org.historyresearchenvironment.databaseadmin.parts.H2DatabaseNavigator");
		final List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		stacks.get(stacks.size() - 2).getChildren().add(part);
		partService.showPart(part, PartState.ACTIVATE);

		eventBroker.post(org.historyresearchenvironment.client.HreConstants.DATABASE_UPDATE_TOPIC, dbName);
		eventBroker.post("MESSAGE", "Database " + dbName + " has been opened");
	}
}
