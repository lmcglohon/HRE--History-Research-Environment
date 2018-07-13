package org.historyresearchenvironment.client.serverinterface;

import org.historyresearchenvironment.server.ServerRequest;
import org.historyresearchenvironment.server.ServerResponse;
import org.historyresearchenvironment.server.businesslogic.AbstractHreBusinessLogic;

/**
 * Direct business layer interface for direct, local calls.
 * 
 * @version 2018-07-13
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
		AbstractHreBusinessLogic businessLogic = request.getBusinessLogic();
		final ServerResponse response = businessLogic.execute(request);
		return response;
	}
}
