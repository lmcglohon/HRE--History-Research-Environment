package org.historyresearchenvironment.databaseadmin.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Handler to quit the application
 * 
 * @version 2018-04-21
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class QuitHandler {

	/**
	 * Quit the application
	 * 
	 * @param workbench
	 * @param shell
	 */
	@Execute
	public void execute(IWorkbench workbench, Shell shell) {
		if (MessageDialog.openConfirm(shell, "Confirmation", "Do you want to exit?")) {
			workbench.close();
		}
	}
}
