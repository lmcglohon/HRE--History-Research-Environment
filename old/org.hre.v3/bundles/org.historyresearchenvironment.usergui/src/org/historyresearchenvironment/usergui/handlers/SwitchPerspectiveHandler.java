package org.historyresearchenvironment.usergui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SwitchPerspectiveHandler {
	@Execute
	public void execute(MApplication app, EPartService partService, EModelService modelService) {
		final MWindow window = modelService.getTopLevelWindowFor(app.getSelectedElement());
		final MPerspective mp = modelService.getActivePerspective(window);

		if (mp.getLabel().equals("Person")) {
			partService.switchPerspective("org.historyresearchenvironment.usergui.perspective.location");
		} else {
			partService.switchPerspective("org.historyresearchenvironment.usergui.perspective.person");
		}
	}
}