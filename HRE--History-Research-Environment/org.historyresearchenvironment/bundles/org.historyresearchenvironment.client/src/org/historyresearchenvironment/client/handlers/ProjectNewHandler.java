
package org.historyresearchenvironment.client.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * @version 1. jun. 2018
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ProjectNewHandler {
	/**
	 * @param shell
	 */
	@Execute
	public void execute(Shell shell) {
		final FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		dialog.setText("Create New Project");
		dialog.setFilterPath("~\\");
		final String[] filterExt = { "*.h2.db", "*.*" };
		dialog.setFilterExtensions(filterExt);
		dialog.open();
	}

}