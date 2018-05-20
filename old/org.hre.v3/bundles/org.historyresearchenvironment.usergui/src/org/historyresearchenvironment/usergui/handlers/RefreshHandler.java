
package org.historyresearchenvironment.usergui.handlers;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.historyresearchenvironment.usergui.models.HreEventConstants;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

public class RefreshHandler {
	@Inject
	private static IEventBroker eventBroker;

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private ScopedPreferenceStore store;

	@Execute
	public void execute() {
		store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
		final String perNo = store.getString("PERNO");
		LOGGER.info("Refreshing Person number " + perNo);
		eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, Integer.parseInt(perNo));
	}

}