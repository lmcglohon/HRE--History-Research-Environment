package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.businesslogic.SomeBusinessLogic;
import org.historyresearchenvironment.usergui.providers.PersonNavigatorProvider;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
class PersonListModelHandler implements HttpHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	@Override
	public void handle(HttpExchange t) throws IOException {
		String s;

		PersonNavigatorProvider model = new PersonNavigatorProvider();

		final ServerRequest request = new ServerRequest(t.getRequestMethod(), "personlist", model);
		final SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		final ServerResponse response = sbl.doSomethingWithRequest();

		model = (PersonNavigatorProvider) response.getProvider();

		s = model.writeJson(model.getClass().getName());

		LOGGER.info("Server returning personlist " + s);

		final Headers headers = t.getResponseHeaders();
		headers.add("Content-Type", "application/json");
		t.sendResponseHeaders(200, s.length());

		final OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}