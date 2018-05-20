package org.historyresearchenvironment.usergui.handlers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.usergui.HreH2ConnectionPool;
import org.historyresearchenvironment.usergui.models.HreEventConstants;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
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
	private ScopedPreferenceStore store;

	/**
	 * @param shell
	 */
	@Execute
	public void execute(Shell shell) {
		store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
		store.getString("H2USERID");
		store.getString("H2PASSWORD");
		String dbName = store.getString("DBNAME");

		try {
			final Connection conn = HreH2ConnectionPool.getConnection();
			conn.createStatement().execute("SHUTDOWN");
			conn.close();
			HreH2ConnectionPool.dispose();
		} catch (final SQLException e) {
			final String message = e.getClass() + ": " + e.getMessage() + ": " + e.getSQLState() + ", "
					+ e.getErrorCode();
			LOGGER.severe(message);
			eventBroker.post("MESSAGE", message);
		}

		LOGGER.info(dbName);
		final FileDialog dialog = new FileDialog(shell);
		final String[] extensions = { "*.db", "*.*" };
		dialog.setFilterExtensions(extensions);
		dialog.open();

		final String shortname = dialog.getFileName();
		final String[] parts = shortname.split("\\.");

		dbName = dialog.getFilterPath() + "/" + parts[0];
		LOGGER.info(dbName);
		store.putValue("DBNAME", dbName);

		MWindow window = (MWindow) modelService.find(
				"org.historyresearchenvironment.usergui.trimmedwindow.historyresourceenvironmentguimockup",
				application);
		window.setLabel("History Resource Environment Mock Up V0.0.5 - " + dbName);

		try {
			Connection conn = HreH2ConnectionPool.getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT MIN(PER_NO) SMALLEST FROM PERSON");
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				String perno = rs.getString("SMALLEST");
				LOGGER.info("Smallest person number: " + perno);
				store.putValue("PERNO", perno);
				eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, Integer.parseInt(perno));
			} else {
				eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, 1);
			}
			conn.close();
		} catch (SQLException e) {
			eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, 1);
		}
	}
}
