
package org.historyresearchenvironment.usergui.handlers;

import java.util.List;
import java.util.logging.Logger;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class PolRegHandler {
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * @param partService
	 * @param application
	 * @param modelService
	 */
	@Execute
	public void execute(EPartService partService, MApplication application, EModelService modelService) {
		LOGGER.info("execute");
		final MPart part = MBasicFactory.INSTANCE.createPart();
		part.setLabel("Cph Police Registry Search");
		part.setContainerData("500");
		part.setCloseable(true);
		part.setVisible(true);
		part.setContributionURI(
				"bundleclass://org.historyresearchenvironment.usergui/org.historyresearchenvironment.usergui.parts.PolRegExplorer");
		final List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		stacks.get(stacks.size() - 1).getChildren().add(part);
		partService.showPart(part, PartState.ACTIVATE);
	}
}