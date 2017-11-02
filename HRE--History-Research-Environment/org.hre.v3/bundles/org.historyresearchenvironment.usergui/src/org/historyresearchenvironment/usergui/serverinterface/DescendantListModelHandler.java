package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.models.DescendantTreeModel;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class DescendantListModelHandler implements HttpHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	@Override
	public void handle(HttpExchange t) throws IOException {
		String s;

		DescendantTreeModel model = new DescendantTreeModel();

		ServerRequest request = new ServerRequest(t.getRequestMethod(), "descendantlist", model);
		SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		ServerResponse response = sbl.doSomethingWithRequest();

		model = (DescendantTreeModel) response.getModel();

		s = model.writeJson(model.getClass().getName());
		
		LOGGER.info("Server returning descendantlist " + s);

		t.sendResponseHeaders(200, s.length());

		OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}