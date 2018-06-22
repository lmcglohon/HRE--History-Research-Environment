package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * Preference page for GUI language selection
 * 
 * @version 2018-06-22
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreGuiLanguagePreferencesPage extends FieldEditorPreferencePage {
	private ComboFieldEditor comboGuiLanguage;

	/**
	 * @wbp.parser.constructor
	 */
	public HreGuiLanguagePreferencesPage() {
		super(GRID);
	}

	/**
	 * Constructor
	 *
	 * @param style
	 */
	public HreGuiLanguagePreferencesPage(int style) {
		super(style);
	}

	/**
	 * Constructor
	 *
	 * @param title
	 * @param style
	 */
	public HreGuiLanguagePreferencesPage(String title, int style) {
		super(title, style);
	}

	/**
	 * Constructor
	 *
	 * @param title
	 * @param image
	 * @param style
	 */
	public HreGuiLanguagePreferencesPage(String title, ImageDescriptor image, int style) {
		super(title, image, style);
	}

	@Override
	protected void createFieldEditors() {
		comboGuiLanguage = new ComboFieldEditor(
				"GUILANGUAGE", "GUI Language", new String[][] { { "Australian", "AUSTRALIAN" }, { "Dansk", "DANISH" },
						{ "English", "ENGLISH" }, { "Norsk", "NORWEGIAN" }, { "US English", "USENGLISH" } },
				getFieldEditorParent());
		addField(comboGuiLanguage);
	}

}
