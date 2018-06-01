package org.historyresearchenvironment.client.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;

/** A sample preference page to show how it works */
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
