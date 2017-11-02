/**
 * 
 */
package org.historyresearchenvironment.usergui.parts;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterface;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

/**
 * @author michael
 *
 */
public abstract class AbstractHREGuiPart {
	@Inject
	protected IEventBroker eventBroker;
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	protected IEclipsePreferences iep;
	protected BusinessLayerInterface bli;
	protected ServerRequest req;
	protected ServerResponse resp;

	protected abstract void callBusinessLayer(int i);

	protected abstract void updateGui();

}
