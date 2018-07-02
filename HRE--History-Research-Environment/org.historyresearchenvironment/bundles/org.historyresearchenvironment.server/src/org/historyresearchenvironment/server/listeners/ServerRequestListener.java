package org.historyresearchenvironment.server.listeners;

import org.eclipse.e4.core.di.annotations.Execute;

/**
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class ServerRequestListener {
	// private final static Logger LOGGER =
	// Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	// private static Preferences preferences =
	// InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");
	//
	// @Inject
	// private IEventBroker eventBroker;

	/**
	 * 
	 */
	@Execute
	public void execute() {
		// try {
		// final HttpServer server = HttpServer.create(new
		// InetSocketAddress(preferences.getInt("SERVERPORT", 8000)),
		// 0);
		// // server.createContext("/hre/v1/samplemodelevents", new
		// SampleModelHandler());
		// // server.createContext("/hre/v1/personalrelatives", new
		// // RelativesModelHandler());
		// // server.createContext("/hre/v1/personalconnections", new
		// // ConnectionsModelHandler());
		// // server.createContext("/hre/v1/eventassociates", new
		// // AssociatesModelHandler());
		// // server.createContext("/hre/v1/personlist", new PersonListModelHandler());
		// // server.createContext("/hre/v1/descendantlist", new
		// // DescendantListModelHandler());
		// // server.createContext("/hre/v1/ancestorlist", new
		// AncestorListModelHandler());
		// server.setExecutor(null); // creates a default executor
		// server.start();
		//
		// LOGGER.info("The server is running at " + server.getAddress());
		// eventBroker.post("MESSAGE", "The server is running at " +
		// server.getAddress());
		//
		// } catch (final IOException e) {
		// e.printStackTrace();
		// LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " +
		// e.getStackTrace()[0].getLineNumber());
		// }
	}
}