package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.historyresearchenvironment.usergui.providers.PersonalEventProvider;

public class StatusToolControl {
	@Inject
	IEventBroker eventBroker;

	private Text textStatus;

	@PostConstruct
	public void createControls(Composite parent) {
		textStatus = new Text(parent, SWT.NONE);
		textStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		textStatus.setEditable(false);
		textStatus.setSize(1000, 200);
		textStatus.setText("                                                                               "
				+ "                                                                                         ");
	}

	@Inject
	@Optional
	public void messageHandler(@UIEventTopic("PEM") PersonalEventProvider pem) {
		setMessage("PEM Identity: " + pem.getIdentity());
	}

	@Inject
	@Optional
	public void messageHandler(@UIEventTopic("MESSAGE") String s) {
		setMessage(s);
	}

	public void setMessage(String s) {
		if (s != null) {
			textStatus.setText(s);
		}
	}
}