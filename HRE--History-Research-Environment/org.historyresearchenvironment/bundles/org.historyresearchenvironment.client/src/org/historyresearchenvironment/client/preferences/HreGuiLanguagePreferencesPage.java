package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;

public class HreGuiLanguagePreferencesPage extends FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 */
	public HreGuiLanguagePreferencesPage() {
		super(GRID);
	}

	public HreGuiLanguagePreferencesPage(int style) {
		super(style);
		// TODO Auto-generated constructor stub
	}

	public HreGuiLanguagePreferencesPage(String title, int style) {
		super(title, style);
		// TODO Auto-generated constructor stub
	}

	public HreGuiLanguagePreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor("rootPageValue", "Root page value : ", getFieldEditorParent()));

	}

}
