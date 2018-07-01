package org.historyresearchenvironment.server.businesslogic;

import java.util.logging.Logger;
import org.historyresearchenvironment.sample.providers.SampleModelProvider;
import org.historyresearchenvironment.server.ServerRequest;
import org.historyresearchenvironment.server.ServerResponse;

/**
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleBusinessLogic {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final ServerRequest serverRequest;

	/**
	 * @param request
	 */
	public SampleBusinessLogic(org.historyresearchenvironment.server.ServerRequest request) {
		super();
		this.serverRequest = request;
	}

	/**
	 * @return
	 */
	public ServerResponse doSomethingWithRequest() {
		ServerResponse resp = null;

		if (serverRequest.getModelName().equals("samplemodelevents")) {
			final SampleModelProvider provider = (SampleModelProvider) serverRequest.getProvider();
			final int perNo = provider.getId();
			provider.readFromH2(perNo);
			resp = new ServerResponse(provider, 0, "OK");
			LOGGER.finest(provider.getIdentity());

			return resp;
		}
		return resp;
	}
}