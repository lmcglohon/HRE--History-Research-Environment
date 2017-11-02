package org.historyresearchenvironment.usergui.preferences;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.PathEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;

/** 
 * 
 */
public class HrePreferencesPage extends FieldEditorPreferencePage {
	private Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private ComboFieldEditor comboFieldEditorCsMode;
	private ComboFieldEditor comboFieldEditorLogLevel;

	/**
	 * 
	 */
	public HrePreferencesPage() {
		super(GRID);
		setTitle("HRE Preferences");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
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
			Composite composite = getFieldEditorParent();

			StringFieldEditor stringFieldEditorServerAddress = new StringFieldEditor("SERVERADDRESS",
					"Server IP Address and port", composite);
			stringFieldEditorServerAddress.getTextControl(composite).setText("127.0.0.1:8000");
			addField(stringFieldEditorServerAddress);
		}
		{
			Composite composite = getFieldEditorParent();
			StringFieldEditor stringFieldEditorDbDriver = new StringFieldEditor("DBDRIVER", "Database driver", -1,
					StringFieldEditor.VALIDATE_ON_KEY_STROKE, composite);
			stringFieldEditorDbDriver.getTextControl(composite).setText("org.h2.Driver");
			addField(stringFieldEditorDbDriver);
		}
		{
			Composite composite = getFieldEditorParent();
			StringFieldEditor stringFieldEditorDbName = new StringFieldEditor("DBNAME", "Database name", -1,
					StringFieldEditor.VALIDATE_ON_KEY_STROKE, composite);
			stringFieldEditorDbName.getTextControl(composite).setText("jdbc:h2:./TMG9");
			addField(stringFieldEditorDbName);
		}
		{
			Composite composite = getFieldEditorParent();
			StringFieldEditor stringFieldEditorUserid = new StringFieldEditor("USERID", "User id", -1,
					StringFieldEditor.VALIDATE_ON_KEY_STROKE, composite);
			stringFieldEditorUserid.getTextControl(composite).setText("sa");
			addField(stringFieldEditorUserid);
		}
		{
			StringFieldEditor stringFieldEditorPassword = new StringFieldEditor("PASSWORD", "Password", -1,
					StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent());
			addField(stringFieldEditorPassword);
		}
		{
			BooleanFieldEditor booleanFieldEditorTls = new BooleanFieldEditor("TLS", "Secure Connection",
					BooleanFieldEditor.DEFAULT, getFieldEditorParent());
			addField(booleanFieldEditorTls);
		}
		{
			comboFieldEditorLogLevel = new ComboFieldEditor("LOGLEVEL", "Log Level",
					new String[][] { { "OFF", "OFF" }, { "SEVERE", "SEVERE" }, { "WARNING", "WARNING" },
							{ "INFO", "INFO" }, { "CONFIG", "CONFIG" }, { "FINE", "FINE" }, { "FINER", "FINER" },
							{ "FINEST", "FINEST" }, { "ALL", "ALL" } },
					getFieldEditorParent());
			addField(comboFieldEditorLogLevel);
		}
		addField(new PathEditor("LOGFILEPATH", "Log File Path", "Select directory:", getFieldEditorParent()));
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
		IEclipsePreferences iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");

		if (event.getSource() == comboFieldEditorCsMode) {
			String newValue = event.getNewValue().toString();

			if ((newValue.equals("DIRECT")) || (newValue.equals("SERVER"))) {

				String dbDriver = iep.get("DBDRIVER", "org.h2.Driver");
				String dbName = iep.get("DBNAME", "./TMG9");
				String userId = iep.get("USERID", "sa");
				String passWord = iep.get("PASSWORD", "");

				Connection conn = null;
				try {
					Class.forName(dbDriver);
					conn = DriverManager.getConnection("jdbc:h2:" + dbName, userId, passWord);
				} catch (Exception e) {
					LOGGER.severe(e.getMessage());
				}
				LOGGER.info("Database connection " + conn);
			}
		} else if (event.getSource() == comboFieldEditorLogLevel) {
			String levelName = event.getNewValue().toString();

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

			LOGGER.info("Cs mode " + levelName);
		}
	}
}
