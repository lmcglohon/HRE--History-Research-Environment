package org.historyresearchenvironment.client.serverinterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider;
import org.historyresearchenvironment.server.ServerRequest;
import org.historyresearchenvironment.server.ServerResponse;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * Flows a request from client to server.
 * 
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
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
		final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
				"org.historyresearchenvironment.usergui");

		final String serverAddress = "http://" + store.getString("SERVERADDRESS") + "/hre/v1/";
		final StringBuilder sb = new StringBuilder();
		String s = "";

		try {

			if (request.getOperation().equals("GET")) {
				LOGGER.fine("Calling " + serverAddress + request.getProvider().getClass().getSimpleName() + "/"
						+ request.getProvider().getKey());

				final URL url = new URL(serverAddress + request.getProvider().getClass().getSimpleName() + "/"
						+ request.getProvider().getKey());
				final BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

				while (null != (s = br.readLine())) {
					sb.append(s);
				}

				br.close();
			}
		} catch (final Exception e) {
			LOGGER.severe("Server call error: " + e.getClass() + " " + e.getMessage());
			return new ServerResponse(request.getProvider(), 999, e.getClass() + " " + e.getMessage());
		}

		final AbstractHreProvider provider = request.getProvider();
		provider.readJson(sb.toString());
		return new ServerResponse(provider, 0, "OK");
	}
}