package org.historyresearchenvironment.client.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.client.dialogs.AboutDialog;

/**
 * @version 2018-06-09
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class AboutHandler {
	/**
	 * @param shell
	 */
	@Execute
	public void execute(Shell shell) {
		final AboutDialog dialog = new AboutDialog(shell);
		dialog.open();
	}
}
