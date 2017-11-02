package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.models.AncestorTreeModel;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class AncestorListModelHandler implements HttpHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Override
	public void handle(HttpExchange t) throws IOException {
		String s;

		AncestorTreeModel model = new AncestorTreeModel();

		ServerRequest request = new ServerRequest(t.getRequestMethod(), "ancestorlist", model);
		SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		ServerResponse response = sbl.doSomethingWithRequest();

		model = (AncestorTreeModel) response.getModel();

		s = model.writeJson(model.getClass().getName());

		LOGGER.fine( "Server returning ancestorlist " + s);

		t.sendResponseHeaders(200, s.length());

		OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}