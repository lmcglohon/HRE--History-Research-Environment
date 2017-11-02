package org.historyresearchenvironment.usergui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class PersonPerspectiveHandler {
	@Execute
	public void execute(MApplication app, EPartService partService, EModelService modelService) {

		partService.switchPerspective("org.historyresearchenvironment.usergui.perspective.persons");
	}
}