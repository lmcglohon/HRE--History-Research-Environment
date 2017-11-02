/**
 * 
 */
package org.historyresearchenvironment.usergui.serverinterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.historyresearchenvironment.usergui.models.AbstractHreModel;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @author michael
 * 
 */
public class ServerBusinessLayerInterface implements BusinessLayerInterface {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

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
		IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.historyresearchenvironment.usergui");

		String serverAddress = "http://" + store.getString("SERVERADDRESS") + "/hre/v1/";
		StringBuilder sb = new StringBuilder();
		String s = "";

		try {

			if (request.getOperation().equals("GET")) {
				LOGGER.fine("Calling " + serverAddress + request.getModelName() + "/" + request.getModel().getKey());

				URL url = new URL(serverAddress + request.getModelName() + "/" + request.getModel().getKey());
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

				while (null != (s = br.readLine())) {
					sb.append(s);
				}

				br.close();
			}
		} catch (Exception e) {
			LOGGER.severe("Server call error: " + e.getMessage());
			return new ServerResponse(request.getModel(), 999, e.getMessage());
		}

		AbstractHreModel model = request.getModel();
		model.readJson(sb.toString());
		return new ServerResponse(model, 0, "OK");
	}
}