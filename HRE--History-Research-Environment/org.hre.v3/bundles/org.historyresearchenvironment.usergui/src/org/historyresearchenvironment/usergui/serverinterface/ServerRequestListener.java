package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;

import com.sun.net.httpserver.HttpServer;

/**
 * @author michael
 *
 */
public class ServerRequestListener {
	@Inject
	private IEventBroker eventBroker;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * 
	 */
	@Execute
	public void execute() {
		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
			server.createContext("/hre/v1/personalevents", new EventModelHandler());
			server.createContext("/hre/v1/personalrelatives", new RelativesModelHandler());
			server.createContext("/hre/v1/personalconnections", new ConnectionsModelHandler());
			server.createContext("/hre/v1/eventassociates", new AssociatesModelHandler());
			server.createContext("/hre/v1/personlist", new PersonListModelHandler());
			server.createContext("/hre/v1/descendantlist", new DescendantListModelHandler());
			server.createContext("/hre/v1/ancestorlist", new AncestorListModelHandler());
			server.setExecutor(null); // creates a default executor
			server.start();

			LOGGER.info("The server is running at " + server.getAddress());
			eventBroker.post("MESSAGE", "The server is running at " + server.getAddress());

		} catch (IOException e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}
	}
}