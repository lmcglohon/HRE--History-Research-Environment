package org.historyresearchenvironment.usergui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.usergui.dialogs.AboutDialog;

public class AboutHandler {
	@Execute
	public void execute(Shell shell) {
		AboutDialog dialog = new AboutDialog(shell);
		dialog.open();
	}
}
