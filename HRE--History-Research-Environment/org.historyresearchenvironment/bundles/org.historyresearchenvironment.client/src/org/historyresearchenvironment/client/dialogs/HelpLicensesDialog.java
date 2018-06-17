package org.historyresearchenvironment.client.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * @version 2018-06-15
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HelpLicensesDialog extends Dialog {

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public HelpLicensesDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Licenses");
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		StyledText styledText = new StyledText(container, SWT.BORDER | SWT.WRAP);
		styledText.setDoubleClickEnabled(false);
		styledText.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.BOLD));
		styledText.setAlwaysShowScrollBars(false);
		styledText.setEditable(false);
		styledText.setText(
				"Preference code used from https://github.com/opcoach/e4preferences\r\nWhich is licensed under the Eclipse Public License 1.0");
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(553, 300);
	}

}
