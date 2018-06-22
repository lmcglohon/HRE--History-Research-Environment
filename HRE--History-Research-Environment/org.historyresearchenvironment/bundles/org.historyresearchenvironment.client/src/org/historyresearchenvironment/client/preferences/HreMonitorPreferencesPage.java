package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @version 2018-06-21
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreMonitorPreferencesPage extends FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 */
	public HreMonitorPreferencesPage() {
		super(GRID);
	}

	public HreMonitorPreferencesPage(int style) {
		super(style);
		// TODO Auto-generated constructor stub
	}

	public HreMonitorPreferencesPage(String title, int style) {
		super(title, style);
		// TODO Auto-generated constructor stub
	}

	public HreMonitorPreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor("rootPageValue", "HreMonitorPreferencesPage: ", getFieldEditorParent()));

	}

}
