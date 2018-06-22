package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;

/**
 * @version 2018-06-21
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreUserPreferencesPage extends FieldEditorPreferencePage
{
	
	public HreUserPreferencesPage()
	{
		super(GRID);
	}

	@Override
	protected void createFieldEditors()
	{
	
		addField(new StringFieldEditor("page1", "HreUserPreferencesPage value : ", getFieldEditorParent()));
	}

}
