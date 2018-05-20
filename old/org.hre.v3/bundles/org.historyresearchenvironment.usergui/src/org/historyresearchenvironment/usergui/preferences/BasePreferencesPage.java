package org.historyresearchenvironment.usergui.preferences;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FontFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 * @version 0.0.4
 *
 */
public class BasePreferencesPage extends FieldEditorPreferencePage {
	private final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private ComboFieldEditor comboFieldEditorCsMode;
	private ComboFieldEditor comboFieldEditorLogLevel;
	private FontFieldEditor fontFieldEditor;
	private StringFieldEditor updateSiteFieldEditor;
	private DirectoryFieldEditor directoryFieldEditor;
	private IntegerFieldEditor helpportIntegerFieldEditor;
	private IntegerFieldEditor serverportIntegerFieldEditor;

	/**
	 * Constructor
	 */
	public BasePreferencesPage() {
		super(GRID);
		setTitle("Base Preferences");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		comboFieldEditorCsMode = new ComboFieldEditor(
				"CSMODE", "Client/Server Mode", new String[][] { { "TEST (Hardcoded Values)", "TEST" },
						{ "DIRECT (Not using TCP/IP)", "DIRECT" }, { "SERVER (Call using TCP/IP)", "SERVER" } },
				getFieldEditorParent());

		addField(comboFieldEditorCsMode);

		final Composite composite = getFieldEditorParent();

		final StringFieldEditor stringFieldEditorServerAddress = new StringFieldEditor("SERVERADDRESS",
				"Server IP Address and port", composite);
		stringFieldEditorServerAddress.getTextControl(composite).setText("127.0.0.1:8000");
		addField(stringFieldEditorServerAddress);

		final BooleanFieldEditor booleanFieldEditorTls = new BooleanFieldEditor("TLS", "Secure Connection",
				BooleanFieldEditor.DEFAULT, getFieldEditorParent());
		addField(booleanFieldEditorTls);

		directoryFieldEditor = new DirectoryFieldEditor("LOGFILEPATH", "Log file directory", getFieldEditorParent());
		addField(directoryFieldEditor);

		comboFieldEditorLogLevel = new ComboFieldEditor("LOGLEVEL", "Log Level",
				new String[][] { { "OFF", "OFF" }, { "SEVERE", "SEVERE" }, { "WARNING", "WARNING" }, { "INFO", "INFO" },
						{ "CONFIG", "CONFIG" }, { "FINE", "FINE" }, { "FINER", "FINER" }, { "FINEST", "FINEST" },
						{ "ALL", "ALL" } },
				getFieldEditorParent());
		addField(comboFieldEditorLogLevel);

		fontFieldEditor = new FontFieldEditor("HREFONT", "Font Selection", null, getFieldEditorParent());
		addField(fontFieldEditor);

		updateSiteFieldEditor = new StringFieldEditor("UPDATESITE", "HRE Update Site", -1,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent());
		addField(updateSiteFieldEditor);

		helpportIntegerFieldEditor = new IntegerFieldEditor("HELPSYSTEMPORT", "Port number for Help System",
				getFieldEditorParent());
		addField(helpportIntegerFieldEditor);

		serverportIntegerFieldEditor = new IntegerFieldEditor("SERVERPORT", "Port Number for local HRE Server",
				getFieldEditorParent());
		addField(serverportIntegerFieldEditor);
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

		if (event.getSource() == fontFieldEditor) {
			LOGGER.info("New font: " + event.getNewValue().toString());
		} else if (event.getSource() == updateSiteFieldEditor) {
			LOGGER.info("New update site: " + event.getNewValue().toString());
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
			} else {
				LOGGER.setLevel(Level.INFO);
			}
			LOGGER.info("Logger level: " + levelName);
		}
	}
}
