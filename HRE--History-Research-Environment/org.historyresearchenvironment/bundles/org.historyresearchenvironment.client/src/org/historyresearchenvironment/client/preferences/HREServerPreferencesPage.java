package org.historyresearchenvironment.client.preferences;

import java.util.logging.Logger;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * @version 2018-06-10
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HREServerPreferencesPage extends FieldEditorPreferencePage {
	private final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Constructor
	 *
	 */
	public HREServerPreferencesPage() {
		super(GRID);
	}

	@Override
	protected void createFieldEditors() {
		final Composite composite = getFieldEditorParent();

		final StringFieldEditor stringFieldEditorServerAddress = new StringFieldEditor("SERVERADDRESS",
				"Server IP Address and port", composite);
		// stringFieldEditorServerAddress.getTextControl(composite).setText("127.0.0.1:8000");
		addField(stringFieldEditorServerAddress);

		final BooleanFieldEditor booleanFieldEditorTls = new BooleanFieldEditor("TLS", "Secure Connection",
				BooleanFieldEditor.DEFAULT, composite);
		addField(booleanFieldEditorTls);
	}
}
