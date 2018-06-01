package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;

public class HreClientPreferencesPage extends FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 */
	public HreClientPreferencesPage() {
		super(GRID);
	}

	public HreClientPreferencesPage(int style) {
		super(style);
		// TODO Auto-generated constructor stub
	}

	public HreClientPreferencesPage(String title, int style) {
		super(title, style);
		// TODO Auto-generated constructor stub
	}

	public HreClientPreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor("rootPageValue", "Root page value : ", getFieldEditorParent()));

	}

}
