package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class Console {
	@Inject
	IEventBroker eventBroker;
	private Table tableMessages;

	public Console() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		tableMessages = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableMessages.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tableMessages.setHeaderVisible(true);
		tableMessages.setLinesVisible(true);

		TableColumn tblclmnMessage = new TableColumn(tableMessages, SWT.NONE);
		tblclmnMessage.setText("Message");
		tblclmnMessage.setWidth(836);

	}

	@PreDestroy
	public void dispose() {
	}

	@Inject
	@Optional
	public void messageHandler(@UIEventTopic("LOG") String s) {
		TableItem tableItem = new TableItem(tableMessages, SWT.NONE);
		tableItem.setText(s);
		tableMessages.setSelection(tableItem);
	}

	@Focus
	public void setFocus() {
	}
}
