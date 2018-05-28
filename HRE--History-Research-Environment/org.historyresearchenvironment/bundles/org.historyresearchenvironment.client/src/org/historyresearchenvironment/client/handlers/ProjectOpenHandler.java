
package org.historyresearchenvironment.client.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.dialogs.GUI_ProjectOpenDialog;

/**
 * @version 28. maj 2018
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ProjectOpenHandler {
	@Execute
	public void execute(Shell shell) {
		GUI_ProjectOpenDialog dialog = new GUI_ProjectOpenDialog(shell);
		dialog.open();
	}

}