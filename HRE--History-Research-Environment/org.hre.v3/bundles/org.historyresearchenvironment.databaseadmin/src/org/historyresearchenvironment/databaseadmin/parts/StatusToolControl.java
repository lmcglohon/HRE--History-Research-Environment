package org.historyresearchenvironment.databaseadmin.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * Status line field
 * 
 * @version 2018-04-21
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class StatusToolControl {
	@Inject
	IEventBroker eventBroker;

	private Text textStatus;

	/**
	 * Create the message text field
	 * 
	 * @param parent Shell
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		textStatus = new Text(parent, SWT.NONE);
		textStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		textStatus.setEditable(false);
		textStatus.setSize(1000, 200);
		textStatus.setText("                                                                               "
				+ "                                                                                         ");
	}

	/**
	 * @param s Message string
	 */
	@Inject
	@Optional
	public void messageHandler(@UIEventTopic("MESSAGE") String s) {
		setMessage(s);
	}

	/**
	 * @param s Message string
	 */
	public void setMessage(String s) {
		if (s != null) {
			textStatus.setText(s);
		}
	}
}