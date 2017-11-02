/**
 * 
 */
package org.historyresearchenvironment.usergui.serverinterface;

/**
 * @author michael
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
		SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		ServerResponse response = sbl.doSomethingWithRequest();
		return response;
	}
}
