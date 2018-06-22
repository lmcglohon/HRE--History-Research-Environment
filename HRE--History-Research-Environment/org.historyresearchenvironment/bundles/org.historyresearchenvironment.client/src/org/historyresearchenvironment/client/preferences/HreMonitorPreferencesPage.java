package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * 'Not yet populated.
 * 
 * @version 2018-06-21
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
/**
 * @version 2018-06-22
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
/**
 * @version 2018-06-22
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
/**
 * @version 2018-06-22
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

	/**
	 * Constructor
	 *
	 * @param style
	 */
	public HreMonitorPreferencesPage(int style) {
		super(style);
	}

	public HreMonitorPreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
	}

	public HreMonitorPreferencesPage(String title, int style) {
		super(title, style);
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor("rootPageValue", "HreMonitorPreferencesPage: ", getFieldEditorParent()));

	}

}
