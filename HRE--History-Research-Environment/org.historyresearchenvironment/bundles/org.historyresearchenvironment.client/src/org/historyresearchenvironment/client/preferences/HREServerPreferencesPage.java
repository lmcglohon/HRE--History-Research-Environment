package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * @version 2018-06-15
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HREServerPreferencesPage extends FieldEditorPreferencePage {

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
		addField(stringFieldEditorServerAddress);

		final BooleanFieldEditor booleanFieldEditorTls = new BooleanFieldEditor("TLS", "Secure Connection",
				BooleanFieldEditor.DEFAULT, composite);
		addField(booleanFieldEditorTls);
	}
}
