package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;

import org.historyresearchenvironment.usergui.models.PersonalConnectionsModel;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * @author michael
 *
 */
class ConnectionsModelHandler implements HttpHandler {
	@Override
	public void handle(HttpExchange t) throws IOException {
		String s = t.getRequestURI().getPath();
		String parts[] = s.split("/");

		PersonalConnectionsModel model = new PersonalConnectionsModel();
		s = parts[(parts.length - 1)];
		model.setId(Integer.parseInt(s));

		ServerRequest request = new ServerRequest(t.getRequestMethod(), "personalrelatives", model);
		SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		ServerResponse response = sbl.doSomethingWithRequest();

		model = (PersonalConnectionsModel) response.getModel();

		s = model.writeJson(model.getClass().getName());

		t.sendResponseHeaders(200, s.length());

		OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}