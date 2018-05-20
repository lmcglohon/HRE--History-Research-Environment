package org.historyresearchenvironment.usergui.businesslogic;

import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.models.PersonalRelativesProvider;
import org.historyresearchenvironment.usergui.providers.AncestorTreeProvider;
import org.historyresearchenvironment.usergui.providers.DescendantTreeProvider;
import org.historyresearchenvironment.usergui.providers.PersonNavigatorProvider;
import org.historyresearchenvironment.usergui.providers.PersonalEventProvider;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SomeBusinessLogic {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final ServerRequest serverRequest;

	/**
	 * @param serverRequest
	 */
	public SomeBusinessLogic(ServerRequest serverRequest) {
		super();
		this.serverRequest = serverRequest;
	}

	/**
	 * @return
	 */
	public ServerResponse doSomethingWithRequest() {
		ServerResponse resp = null;

		if (serverRequest.getModelName().equals("personalevents")) {
			final PersonalEventProvider provider = (PersonalEventProvider) serverRequest.getProvider();
			final int perNo = provider.getId();
			provider.readFromH2(perNo);
			resp = new ServerResponse(provider, 0, "OK");
			LOGGER.finest(provider.getIdentity());
		} else if (serverRequest.getModelName().equals("personalrelatives")) {
			final PersonalRelativesProvider provider = (PersonalRelativesProvider) serverRequest.getProvider();
			final int perNo = provider.getId();
			provider.readFromH2(perNo);
			resp = new ServerResponse(provider, 0, "OK");
			LOGGER.finest(provider.getIdentity());
		} else if (serverRequest.getModelName().equals("personlist")) {
			final PersonNavigatorProvider provider = (PersonNavigatorProvider) serverRequest.getProvider();
			provider.readFromH2(0);
			resp = new ServerResponse(provider, 0, "OK");
			LOGGER.finest(provider.toString());
		} else if (serverRequest.getModelName().equals("descendantlist")) {
			final DescendantTreeProvider provider = (DescendantTreeProvider) serverRequest.getProvider();
			provider.readFromH2(0);
			resp = new ServerResponse(provider, 0, "OK");
			LOGGER.finest(provider.getKey());
		} else if (serverRequest.getModelName().equals("ancestorlist")) {
			final AncestorTreeProvider provider = (AncestorTreeProvider) serverRequest.getProvider();
			provider.readFromH2(0);
			resp = new ServerResponse(provider, 0, "OK");
			LOGGER.finest(provider.getKey());
		}
		return resp;
	}
}