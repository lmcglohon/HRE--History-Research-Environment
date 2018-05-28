package org.historyresearchenvironment.client.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
/**
 * @version 1. jun. 2018
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class OpenHandler {

	/**
	 * @param shell
	 */
	@Execute
	public void execute(Shell shell){
		FileDialog dialog = new FileDialog(shell);
		final String[] extensions = { "*.h2.db", "*.mv.db", "*.*" };
		dialog.setFilterExtensions(extensions);
		dialog.open();
	}
}
