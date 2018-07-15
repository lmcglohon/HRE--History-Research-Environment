package org.historyresearchenvironment.databaseadmin.handlers;

import java.util.logging.Logger;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

/**
 * Switch perspective to Database Administration.
 * 
 * @version 2018-07-15
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class AdministrationPerspectiveHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * @param app
	 * @param partService
	 * @param modelService
	 */
	@Execute
	public void execute(MApplication app, EPartService partService, EModelService modelService) {
		LOGGER.info("Opening db admin perspective");
		partService.switchPerspective("org.historyresearchenvironment.perspective.databaseadministration");
	}
}