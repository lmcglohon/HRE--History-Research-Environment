package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.models.PersonNavigatorModel;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * @author michael
 *
 */
class PersonListModelHandler implements HttpHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	@Override
	public void handle(HttpExchange t) throws IOException {
		String s;

		PersonNavigatorModel model = new PersonNavigatorModel();

		ServerRequest request = new ServerRequest(t.getRequestMethod(), "personlist", model);
		SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		ServerResponse response = sbl.doSomethingWithRequest();

		model = (PersonNavigatorModel) response.getModel();

		s = model.writeJson(model.getClass().getName());

		LOGGER.info("Server returning personlist " + s);

		t.sendResponseHeaders(200, s.length());

		OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}