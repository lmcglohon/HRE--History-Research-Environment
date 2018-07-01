package org.historyresearchenvironment.client.serverinterface;

import org.historyresearchenvironment.server.ServerRequest;
import org.historyresearchenvironment.server.ServerResponse;
import org.historyresearchenvironment.server.businesslogic.SampleBusinessLogic;

/**
 * Direct business layer interface for direct, local calls.
 * 
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
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
		// FIXME Needs some logic to select the right business logic class
		final SampleBusinessLogic sbl = new SampleBusinessLogic(request);
		final ServerResponse response = sbl.doSomethingWithRequest();
		return response;
	}
}
