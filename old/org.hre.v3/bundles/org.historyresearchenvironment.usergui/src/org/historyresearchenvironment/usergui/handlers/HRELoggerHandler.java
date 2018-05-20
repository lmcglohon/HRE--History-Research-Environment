package org.historyresearchenvironment.usergui.handlers;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import org.eclipse.core.internal.runtime.InternalPlatform;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.osgi.framework.BundleContext;

public class HRELoggerHandler extends Handler {
	private static IEventBroker eventBroker;

	/**
	 * 
	 */
	public HRELoggerHandler() {
		super();
		final BundleContext context = InternalPlatform.getDefault().getBundleContext();
		final IEclipseContext ecf = EclipseContextFactory.getServiceContext(context);
		eventBroker = (IEventBroker) ecf.get(IEventBroker.class.getName());
		System.out.println("Constructed logger handler");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.logging.Handler#close()
	 */
	@Override
	public void close() throws SecurityException {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.logging.Handler#flush()
	 */
	@Override
	public void flush() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.logging.Handler#publish(java.util.logging.LogRecord)
	 */
	@Override
	public void publish(LogRecord record) {
		final BundleContext context = InternalPlatform.getDefault().getBundleContext();
		final IEclipseContext ecf = EclipseContextFactory.getServiceContext(context);
		eventBroker = (IEventBroker) ecf.get(IEventBroker.class.getName());
		eventBroker.post("LOG", record);
		eventBroker.post("MESSAGE", record);
		System.out.println("Called console for logger");
	}
}