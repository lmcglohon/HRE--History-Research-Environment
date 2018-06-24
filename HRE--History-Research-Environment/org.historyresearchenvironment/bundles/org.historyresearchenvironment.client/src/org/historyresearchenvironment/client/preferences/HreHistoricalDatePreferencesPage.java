package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * Not yet populated.
 * 
 * @version 2018-06-24
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreHistoricalDatePreferencesPage extends FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 */
	public HreHistoricalDatePreferencesPage() {
		super(GRID);
	}

	/**
	 * Constructor
	 *
	 * @param style
	 */
	public HreHistoricalDatePreferencesPage(int style) {
		super(style);
	}

	/**
	 * Constructor
	 *
	 * @param title
	 * @param image
	 * @param style
	 */
	public HreHistoricalDatePreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
	}

	/**
	 * Constructor
	 *
	 * @param title
	 * @param style
	 */
	public HreHistoricalDatePreferencesPage(String title, int style) {
		super(title, style);
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor("rootPageValue", "HreHistoricalDatePreferencesPage: ", getFieldEditorParent()));

	}

}
