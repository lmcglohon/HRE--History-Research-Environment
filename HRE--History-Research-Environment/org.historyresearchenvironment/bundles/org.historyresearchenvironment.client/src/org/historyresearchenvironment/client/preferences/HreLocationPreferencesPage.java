package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;

public class HreLocationPreferencesPage extends FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 */
	public HreLocationPreferencesPage() {
		super(GRID);
	}

	public HreLocationPreferencesPage(int style) {
		super(style);
		// TODO Auto-generated constructor stub
	}

	public HreLocationPreferencesPage(String title, int style) {
		super(title, style);
		// TODO Auto-generated constructor stub
	}

	public HreLocationPreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor("rootPageValue", "Root page value : ", getFieldEditorParent()));

	}

}
