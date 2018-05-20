package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.historyresearchenvironment.usergui.businesslogic.SomeBusinessLogic;
import org.historyresearchenvironment.usergui.providers.AncestorTreeProvider;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class AncestorListModelHandler implements HttpHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/* (non-Javadoc)
	 * @see com.sun.net.httpserver.HttpHandler#handle(com.sun.net.httpserver.HttpExchange)
	 */
	@Override
	public void handle(HttpExchange t) throws IOException {
		String s;

		// FIX ME Unnecessary???
		AncestorTreeProvider provider = new AncestorTreeProvider();

		final ServerRequest request = new ServerRequest(t.getRequestMethod(), "ancestorlist", provider);
		final SomeBusinessLogic sbl = new SomeBusinessLogic(request);
		final ServerResponse response = sbl.doSomethingWithRequest();

		provider = (AncestorTreeProvider) response.getProvider();

		s = provider.writeJson(provider.getClass().getName());

		LOGGER.fine("Server returning ancestorlist " + s);

		final Headers headers = t.getResponseHeaders();
		headers.add("Content-Type", "application/json");
		t.sendResponseHeaders(200, s.length());

		final OutputStream os = t.getResponseBody();
		os.write(s.getBytes());
		os.close();
	}

}