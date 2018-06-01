package org.historyresearchenvironment.client.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

/**
 * @version 1. jun. 2018
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SaveHandler {

	/**
	 * @param partService
	 * @return
	 */
	@CanExecute
	public boolean canExecute(EPartService partService) {
		if (partService != null) {
			return !partService.getDirtyParts().isEmpty();
		}
		return false;
	}

	@Execute
	public void execute(EPartService partService) {
		partService.saveAll(false);
	}
}