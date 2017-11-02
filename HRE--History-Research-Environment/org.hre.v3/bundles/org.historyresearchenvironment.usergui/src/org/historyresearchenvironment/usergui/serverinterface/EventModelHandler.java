package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.models.PersonalEventModel;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * @author michael
 *
 */
class EventModelHandler implements HttpHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Override
	public void handle(HttpExchange t) throws IOException {
		String s = t.getRequestURI().getPath();
		String parts[] = s.split("/");

		PersonalEventModel model = new PersonalEventModel();
		s = parts[(parts.length - 1)];
		model.setId(Integer.parseInt(s));

		ServerRequest request = new ServerRequest(t.getRequestMethod(), "personalevents", model);
		SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		ServerResponse response = sbl.doSomethingWithRequest();

		model = (PersonalEventModel) response.getModel();

		s = model.writeJson(model.getClass().getName());

		LOGGER.info("Server returning personalevents " + s);
		
		t.sendResponseHeaders(200, s.length());

		OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}