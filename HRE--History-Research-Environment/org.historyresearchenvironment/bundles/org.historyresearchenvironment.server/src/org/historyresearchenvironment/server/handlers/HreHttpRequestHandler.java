package org.historyresearchenvironment.server.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;

/**
 * HTTP request handler for Jetty server
 * 
 * @version 2018-07-02
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreHttpRequestHandler implements Handler {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

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

	/**
	 * Constructor
	 *
	 */
	public HreHttpRequestHandler() {
		LOGGER.info("Jetty server");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jetty.util.component.LifeCycle#addLifeCycleListener(org.eclipse.
	 * jetty.util.component.LifeCycle.Listener)
	 */
	@Override
	public void addLifeCycleListener(Listener arg0) {
		LOGGER.info("Jetty server");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.server.Handler#destroy()
	 */
	@Override
	public void destroy() {
		LOGGER.info("Jetty server");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.server.Handler#getServer()
	 */
	@Override
	public Server getServer() {
		LOGGER.info("Jetty server");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.server.Handler#handle(java.lang.String,
	 * org.eclipse.jetty.server.Request, javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		LOGGER.info("Jetty server");
		response.setContentType("text/html; charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);

		LOGGER.info(target);
		LOGGER.info(baseRequest.getRequestURI());
		LOGGER.info(request.getRequestURI());

		PrintWriter out = response.getWriter();

		out.println("<h1>HRE</h1>");
		out.println("<p>Response from HRE" + request.getMethod() + "</p>");

		baseRequest.setHandled(true);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#isFailed()
	 */
	@Override
	public boolean isFailed() {
		LOGGER.info("Jetty server");
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#isRunning()
	 */
	@Override
	public boolean isRunning() {
		LOGGER.info("Jetty server");
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#isStarted()
	 */
	@Override
	public boolean isStarted() {
		LOGGER.info("Jetty server");
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#isStarting()
	 */
	@Override
	public boolean isStarting() {
		LOGGER.info("Jetty server");
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#isStopped()
	 */
	@Override
	public boolean isStopped() {
		LOGGER.info("Jetty server");
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#isStopping()
	 */
	@Override
	public boolean isStopping() {
		LOGGER.info("Jetty server");
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#removeLifeCycleListener(org.
	 * eclipse.jetty.util.component.LifeCycle.Listener)
	 */
	@Override
	public void removeLifeCycleListener(Listener arg0) {
		LOGGER.info("Jetty server");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jetty.server.Handler#setServer(org.eclipse.jetty.server.Server)
	 */
	@Override
	public void setServer(Server server) {
		LOGGER.info("Jetty server");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#start()
	 */
	@Override
	public void start() throws Exception {
		LOGGER.info("Jetty server");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jetty.util.component.LifeCycle#stop()
	 */
	@Override
	public void stop() throws Exception {
		LOGGER.info("Jetty server");

	}

}
