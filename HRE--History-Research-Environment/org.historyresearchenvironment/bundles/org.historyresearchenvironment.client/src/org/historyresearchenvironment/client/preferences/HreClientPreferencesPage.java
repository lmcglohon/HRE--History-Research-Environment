package org.historyresearchenvironment.client.preferences;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;

/**
 * @version 2018-06-09
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreClientPreferencesPage extends FieldEditorPreferencePage {
	private final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private ComboFieldEditor comboFieldEditorCsMode;
	private ComboFieldEditor comboFieldEditorLogLevel;

	/**
	 * @wbp.parser.constructor
	 */
	public HreClientPreferencesPage() {
		super(GRID);
	}

	public HreClientPreferencesPage(int style) {
		super(style);
	}

	public HreClientPreferencesPage(String title, int style) {
		super(title, style);
	}

	public HreClientPreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
	}

	@Override
	protected void createFieldEditors() {
		{
			comboFieldEditorCsMode = new ComboFieldEditor(
					"CSMODE", "Client/Server Mode", new String[][] { { "TEST (Hardcoded Values)", "TEST" },
							{ "DIRECT (Not using TCP/IP)", "DIRECT" }, { "SERVER (Call using TCP/IP)", "SERVER" } },
					getFieldEditorParent());

			addField(comboFieldEditorCsMode);
		}

		{
			final Composite composite = getFieldEditorParent();
			final StringFieldEditor stringFieldEditorUserid = new StringFieldEditor("USERID", "H2 User Id", -1,
					StringFieldEditor.VALIDATE_ON_KEY_STROKE, composite);
			stringFieldEditorUserid.getTextControl(composite).setText("sa");
			addField(stringFieldEditorUserid);
		}
		{
			final StringFieldEditor stringFieldEditorPassword = new StringFieldEditor("PASSWORD", "H2 Password", -1,
					StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent());
			addField(stringFieldEditorPassword);
		}
		{
			comboFieldEditorLogLevel = new ComboFieldEditor("LOGLEVEL", "Log Level",
					new String[][] { { "OFF", "OFF" }, { "SEVERE", "SEVERE" }, { "WARNING", "WARNING" },
							{ "INFO", "INFO" }, { "CONFIG", "CONFIG" }, { "FINE", "FINE" }, { "FINER", "FINER" },
							{ "FINEST", "FINEST" }, { "ALL", "ALL" } },
					getFieldEditorParent());
			addField(comboFieldEditorLogLevel);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.preference.FieldEditorPreferencePage#propertyChange(org.
	 * eclipse.jface.util.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		final IEclipsePreferences iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");

		if (event.getSource() == comboFieldEditorCsMode) {
			final String newValue = event.getNewValue().toString();

			if ((newValue.equals("DIRECT")) || (newValue.equals("SERVER"))) {

				final String dbName = iep.get("DBNAME", "./TMG9");
				final String userId = iep.get("USERID", "sa");
				final String passWord = iep.get("PASSWORD", "");

				Connection conn = null;
				try {
					conn = DriverManager.getConnection("jdbc:h2:" + dbName, userId, passWord);
				} catch (final Exception e) {
					LOGGER.severe(e.getClass() + " " + e.getMessage());
				}
				LOGGER.info("Database connection " + conn);
			}
		} else if (event.getSource() == comboFieldEditorLogLevel) {
			final String levelName = event.getNewValue().toString();

			if (levelName.equals("OFF")) {
				LOGGER.setLevel(Level.OFF);
			} else if (levelName.equals("SEVERE")) {
				LOGGER.setLevel(Level.SEVERE);
			} else if (levelName.equals("WARNING")) {
				LOGGER.setLevel(Level.WARNING);
			} else if (levelName.equals("CONFIG")) {
				LOGGER.setLevel(Level.CONFIG);
			} else if (levelName.equals("FINE")) {
				LOGGER.setLevel(Level.FINE);
			} else if (levelName.equals("FINER")) {
				LOGGER.setLevel(Level.FINER);
			} else if (levelName.equals("FINEST")) {
				LOGGER.setLevel(Level.FINEST);
			} else if (levelName.equals("ALL")) {
				LOGGER.setLevel(Level.ALL);
			} else
				LOGGER.setLevel(Level.INFO);

			LOGGER.info("Client/server mode " + levelName);
		}
	}
}
