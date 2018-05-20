
package org.historyresearchenvironment.usergui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.usergui.dialogs.PersonSelectionDialog;

public class PersonSelectionHandler {
	@Execute
	public void execute(Shell shell) {
		final PersonSelectionDialog dialog = new PersonSelectionDialog(shell);
		dialog.open();
	}

}