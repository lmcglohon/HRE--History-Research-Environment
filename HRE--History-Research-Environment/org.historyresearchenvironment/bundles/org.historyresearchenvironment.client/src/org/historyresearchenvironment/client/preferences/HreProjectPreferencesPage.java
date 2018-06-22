package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @version 2018-06-21
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreProjectPreferencesPage extends FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 */
	public HreProjectPreferencesPage() {
		super(GRID);
	}

	/**
	 * Constructor
	 *
	 * @param style
	 */
	public HreProjectPreferencesPage(int style) {
		super(style);
	}

	/**
	 * Constructor
	 *
	 * @param title
	 * @param style
	 */
	public HreProjectPreferencesPage(String title, int style) {
		super(title, style);
	}

	/**
	 * Constructor
	 *
	 * @param title
	 * @param image
	 * @param style
	 */
	public HreProjectPreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor("rootPageValue", "HreProjectPreferencesPage: ", getFieldEditorParent()));

	}

}
