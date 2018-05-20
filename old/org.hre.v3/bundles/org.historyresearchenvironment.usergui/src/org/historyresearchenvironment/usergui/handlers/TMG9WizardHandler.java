package org.historyresearchenvironment.usergui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.historyresearchenvironment.usergui.wizards.TMG9ProjectWizard;

/**
 * Invokes TMG9ProjectWizard.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TMG9WizardHandler {
	/**
	 * @param shell
	 */
	@Execute
	public void execute(Shell shell) {
		final WizardDialog wizardDialog = new WizardDialog(shell, new TMG9ProjectWizard());
		if (wizardDialog.open() == Window.OK) {
			System.out.println("Ok pressed");
		} else {
			System.out.println("Cancel pressed");
		}
	}
}
