/**
 * 
 */
package org.historyresearchenvironment.usergui.clientinterface;

import org.historyresearchenvironment.usergui.businesslogic.SomeBusinessLogic;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class DirectBusinessLayerInterface implements BusinessLayerInterface {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterface
	 * #callBusinessLayer(org.historyresearchenvironment.usergui.serverinterface.
	 * ServerRequest)
	 */
	@Override
	public ServerResponse callBusinessLayer(ServerRequest request) {
		final SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		final ServerResponse response = sbl.doSomethingWithRequest();
		return response;
	}
}
