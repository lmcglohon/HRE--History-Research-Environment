/**
 * 
 */
package org.historyresearchenvironment.usergui.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.PathEditor;
import org.eclipse.jface.preference.ScaleFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @author michael
 *
 */
public class FieldEditorPreferencePage2 extends org.eclipse.jface.preference.FieldEditorPreferencePage {

	/**
	 * @wbp.parser.constructor
	 * 
	 */
	public FieldEditorPreferencePage2() {
	}

	/**
	 * @param style
	 */
	public FieldEditorPreferencePage2(int style) {
		super(style);
	}

	/**
	 * @param title
	 * @param image
	 * @param style
	 */
	public FieldEditorPreferencePage2(String title, ImageDescriptor image, int style) {
		super(title, image, style);
	}

	/**
	 * @param title
	 * @param style
	 */
	public FieldEditorPreferencePage2(String title, int style) {
		super(title, style);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		addField(new ScaleFieldEditor("id21", "New ScaleFieldEditor", getFieldEditorParent(), 0, 100, 1, 10));
		addField(new PathEditor("id22", "New PathEditor", "Select directory:", getFieldEditorParent()));
		addField(new DirectoryFieldEditor("id23", "New DirectoryFieldEditor", getFieldEditorParent()));
		addField(new FileFieldEditor("id24", "New FileFieldEditor", getFieldEditorParent()));
	}

}
