package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.businesslogic.SomeBusinessLogic;
import org.historyresearchenvironment.usergui.providers.PersonalEventProvider;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
class EventModelHandler implements HttpHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	@Override
	public void handle(HttpExchange t) throws IOException {
		String s = t.getRequestURI().getPath();
		final String parts[] = s.split("/");

		PersonalEventProvider model = new PersonalEventProvider();
		s = parts[(parts.length - 1)];
		model.setId(Integer.parseInt(s));

		final ServerRequest request = new ServerRequest(t.getRequestMethod(), "personalevents", model);
		final SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		final ServerResponse response = sbl.doSomethingWithRequest();

		model = (PersonalEventProvider) response.getProvider();

		s = model.writeJson(model.getClass().getName());

		LOGGER.info("Server returning personalevents " + s);

		final Headers headers = t.getResponseHeaders();
		headers.add("Content-Type", "application/json");
		t.sendResponseHeaders(200, s.length());

		final OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}