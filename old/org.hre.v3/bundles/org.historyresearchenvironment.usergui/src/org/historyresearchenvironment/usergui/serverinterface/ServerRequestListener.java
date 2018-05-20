package org.historyresearchenvironment.usergui.serverinterface;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.sun.net.httpserver.HttpServer;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class ServerRequestListener {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			"org.historyresearchenvironment.usergui");
	@Inject
	private IEventBroker eventBroker;

	/**
	 * 
	 */
	@Execute
	public void execute() {
		try {
			final HttpServer server = HttpServer.create(new InetSocketAddress(store.getInt("SERVERPORT")), 0);
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

		} catch (final IOException e) {
			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}
}