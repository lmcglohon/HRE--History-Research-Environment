package org.historyresearchenvironment.client.handlers;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.osgi.service.prefs.Preferences;

import com.sun.net.httpserver.HttpServer;

/**
 * Start the embedded server
 * 
 * @version 2018-06-22
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
@SuppressWarnings("restriction")
public class ProjectStartEmbeddedServerHandler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");
	@Inject
	private IEventBroker eventBroker;

	/**
	 * 
	 */
	@Execute
	public void execute() {
		try {
			final HttpServer server = HttpServer.create(new InetSocketAddress(preferences.getInt("SERVERPORT", 8000)),
					0);
			// server.createContext("/org/historyresearchenvironment/personalevents", new
			// EventModelHandler());
			// server.createContext("/org/historyresearchenvironment/personalrelatives", new
			// RelativesModelHandler());
			// server.createContext("/org/historyresearchenvironment/personalconnections",
			// new ConnectionsModelHandler());
			// server.createContext("/org/historyresearchenvironment/eventassociates", new
			// AssociatesModelHandler());
			// server.createContext("/org/historyresearchenvironment/personlist", new
			// PersonListModelHandler());
			// server.createContext("/org/historyresearchenvironment/descendantlist", new
			// DescendantListModelHandler());
			// server.createContext("/org/historyresearchenvironment/ancestorlist", new
			// AncestorListModelHandler());
			server.setExecutor(null); // creates a default executor
			server.start();

			LOGGER.info("The server is running at " + server.getAddress());
			eventBroker.post("MESSAGE", "The server is running at " + server.getAddress());

		} catch (final IOException e) {
			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}
}