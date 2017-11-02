package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;

import org.historyresearchenvironment.usergui.models.PersonalRelativesModel;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * @author michael
 *
 */
class RelativesModelHandler implements HttpHandler {
	@Override
	public void handle(HttpExchange t) throws IOException {
		String s = t.getRequestURI().getPath();
		String parts[] = s.split("/");

		PersonalRelativesModel model = new PersonalRelativesModel();
		s = parts[(parts.length - 1)];
		model.setId(Integer.parseInt(s));

		ServerRequest request = new ServerRequest(t.getRequestMethod(), "personalrelatives", model);
		SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		ServerResponse response = sbl.doSomethingWithRequest();

		model = (PersonalRelativesModel) response.getModel();

		s = model.writeJson(model.getClass().getName());

		t.sendResponseHeaders(200, s.length());

		OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}