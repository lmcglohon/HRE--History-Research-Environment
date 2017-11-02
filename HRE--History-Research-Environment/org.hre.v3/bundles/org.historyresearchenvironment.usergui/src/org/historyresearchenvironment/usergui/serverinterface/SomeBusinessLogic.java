package org.historyresearchenvironment.usergui.serverinterface;

import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.models.AncestorTreeModel;
import org.historyresearchenvironment.usergui.models.DescendantTreeModel;
import org.historyresearchenvironment.usergui.models.PersonNavigatorModel;
import org.historyresearchenvironment.usergui.models.PersonalEventModel;
import org.historyresearchenvironment.usergui.models.PersonalRelativesModel;

/**
 * @author michael
 *
 */
public class SomeBusinessLogic {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private ServerRequest serverRequest;

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
			PersonalEventModel model = (PersonalEventModel) serverRequest.getModel();
			int perNo = model.getId();
			model.readFromH2(perNo);
			resp = new ServerResponse(model, 0, "OK");
			LOGGER.finest(model.getIdentity());
		} else if (serverRequest.getModelName().equals("personalrelatives")) {
			PersonalRelativesModel model = (PersonalRelativesModel) serverRequest.getModel();
			int perNo = model.getId();
			model.readFromH2(perNo);
			resp = new ServerResponse(model, 0, "OK");
			LOGGER.finest(model.getIdentity());
		} else if (serverRequest.getModelName().equals("personlist")) {
			PersonNavigatorModel model = (PersonNavigatorModel) serverRequest.getModel();
			model.readFromH2(0);
			resp = new ServerResponse(model, 0, "OK");
			LOGGER.finest(model.toString());
		} else if (serverRequest.getModelName().equals("descendantlist")) {
			DescendantTreeModel model = (DescendantTreeModel) serverRequest.getModel();
			model.readFromH2(0);
			resp = new ServerResponse(model, 0, "OK");
			LOGGER.finest(model.getKey());
		} else if (serverRequest.getModelName().equals("ancestorlist")) {
			AncestorTreeModel model = (AncestorTreeModel) serverRequest.getModel();
			model.readFromH2(0);
			resp = new ServerResponse(model, 0, "OK");
			LOGGER.finest(model.getKey());
		}
		return resp;
	}
}