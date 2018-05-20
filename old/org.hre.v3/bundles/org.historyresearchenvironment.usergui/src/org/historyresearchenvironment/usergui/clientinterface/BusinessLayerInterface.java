package org.historyresearchenvironment.usergui.clientinterface;

import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public interface BusinessLayerInterface {
	/**
	 * @param request
	 * @return
	 */
	public abstract ServerResponse callBusinessLayer(ServerRequest request);
}
