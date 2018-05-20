package org.historyresearchenvironment.usergui.preferences;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.historyresearchenvironment.usergui.HreH2ConnectionPool;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class H2PreferencesPage extends org.eclipse.jface.preference.FieldEditorPreferencePage {
	private final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private ComboFieldEditor comboFieldEditorH2TraceLevel;
	private StringFieldEditor stringFieldEditorUserid;
	private StringFieldEditor stringFieldEditorPassword;

	/**
	 * Constructor
	 */
	public H2PreferencesPage() {
		super(GRID);
		setTitle("H2 Preferences");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		final Composite composite = getFieldEditorParent();

		stringFieldEditorUserid = new StringFieldEditor("H2USERID", "User Id", -1,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE, composite);
		stringFieldEditorUserid.getTextControl(composite).setText("sa");
		addField(stringFieldEditorUserid);

		stringFieldEditorPassword = new StringFieldEditor("H2PASSWORD", "Password", -1,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent());
		addField(stringFieldEditorPassword);

		comboFieldEditorH2TraceLevel = new ComboFieldEditor("H2TRACELEVEL", "Trace Level",
				new String[][] { { "OFF", "OFF" }, { "ERROR", "ERROR" }, { "INFO", "INFO" }, { "DEBUG", "DEBUG" } },
				getFieldEditorParent());
		addField(comboFieldEditorH2TraceLevel);
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

		if (event.getSource() == comboFieldEditorH2TraceLevel) {
			int h2TraceLevel = 2;
			String levelName = event.getNewValue().toString();

			if (levelName.equals("OFF")) {
				h2TraceLevel = 0;
			} else if (levelName.equals("ERROR")) {
				h2TraceLevel = 1;
			} else {
				h2TraceLevel = 3;
			}

			try {
				Connection conn = HreH2ConnectionPool.getConnection();
				PreparedStatement prep = conn.prepareStatement("SET TRACE_LEVEL_SYSTEM_OUT ?");
				prep.setInt(1, h2TraceLevel);
				prep.executeUpdate();
				prep = conn.prepareStatement("SET TRACE_LEVEL_FILE ?");
				prep.setInt(1, h2TraceLevel);
				prep.executeUpdate();
				prep.close();
				conn.close();
			} catch (final SQLException e) {
				LOGGER.severe(e.getMessage() + ", " + e.getErrorCode() + ", " + e.getSQLState());
			}

			LOGGER.info("H2 trace level: " + h2TraceLevel);
		}
	}
}