package org.historyresearchenvironment.usergui.parts;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.models.PersonItem;
import org.historyresearchenvironment.usergui.models.PersonNavigatorModel;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;

/**
 * @author michael
 *
 */
public class PersonNavigator extends AbstractHREGuiPart {
	private Table tablePerson;
	private PersonNavigatorModel personNavigatorModel;
	private TableItem tableItem;
	private PersonItem person;
	private int perNo = 1;

	/**
	 * No arg c:tor
	 */
	public PersonNavigator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int perNo) {
		iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		personNavigatorModel = new PersonNavigatorModel();

		req = new ServerRequest("GET", "personlist", personNavigatorModel);

		long before = System.nanoTime();

		resp = bli.callBusinessLayer(req);

		long after = System.nanoTime();
		LOGGER.info("Elapsed time in milliseconds: " + ((after - before) / 1000000));

		if (resp == null) {
			eventBroker.post("MESSAGE", "Call not successful");
			LOGGER.severe("Call not successful");
		} else if (resp.getReturnCode() != 0) {
			eventBroker.post("MESSAGE", resp.getReturnMessage());
			LOGGER.severe(resp.getReturnMessage());

		} else {
			personNavigatorModel = (PersonNavigatorModel) resp.getModel();

			try {
				if (tablePerson != null) {
					this.perNo = perNo;
					updateGui();
				}
			} catch (Exception e2) {
				LOGGER.severe(
						"Error in request " + req.getOperation() + " " + req.getModelName() + ", " + e2.getMessage());
				eventBroker.post("MESSAGE", e2.getMessage());
			}
		}
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		tablePerson = new Table(parent, SWT.BORDER | SWT.SINGLE);
		tablePerson.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event e) {
				TableItem[] selection = tablePerson.getSelection();
				TableItem ti = selection[0];
				String string = ti.getText(1);
				perNo = Integer.parseInt(string);
			}
		});

		tablePerson.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, perNo);
			}
		});
		tablePerson.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tablePerson.setHeaderVisible(true);
		tablePerson.setLinesVisible(true);

		final TableColumn tblclmnPersonName = new TableColumn(tablePerson, SWT.NONE);
		tblclmnPersonName.setWidth(175);
		tblclmnPersonName.setText("Person Name");

		final TableColumn tblclmnPersonId = new TableColumn(tablePerson, SWT.NONE);
		tblclmnPersonId.setWidth(75);
		tblclmnPersonId.setText("Person ID");

		final TableColumn tblclmnBorn = new TableColumn(tablePerson, SWT.NONE);
		tblclmnBorn.setWidth(80);
		tblclmnBorn.setText("Born");

		final TableColumn tblclmnDied = new TableColumn(tablePerson, SWT.NONE);
		tblclmnDied.setWidth(80);
		tblclmnDied.setText("Died");

		final TableColumn tblclmnFathersId = new TableColumn(tablePerson, SWT.NONE);
		tblclmnFathersId.setWidth(75);
		tblclmnFathersId.setText("Father's ID");

		final TableColumn tblclmnMothersId = new TableColumn(tablePerson, SWT.NONE);
		tblclmnMothersId.setWidth(75);
		tblclmnMothersId.setText("Mother's ID");

		callBusinessLayer(perNo);
	}

	/**
	 * 
	 */
	@PreDestroy
	public void dispose() {
	}

	/**
	 * 
	 */
	@Focus
	public void setFocus() {
	}

	/**
	 * 
	 * @param perNo
	 */
	@Inject
	@Optional
	private void subscribePersonUpdateTopic(@UIEventTopic(HreEventConstants.PERSON_UPDATE_TOPIC) int perNo) {
		callBusinessLayer(perNo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
		int index = 0;
		int selection = 1;

		try {
			Iterator<PersonItem> iterator = personNavigatorModel.getPersons().iterator();

			tablePerson.removeAll();

			while (iterator.hasNext()) {
				person = iterator.next();
				tableItem = new TableItem(tablePerson, SWT.NONE);
				tableItem.setText(0, person.getName());
				tableItem.setText(1, Integer.toString(person.getPerNo()));
				tableItem.setText(2, person.getPbirth());
				tableItem.setText(3, person.getPdeath());
				tableItem.setText(4, Integer.toString(person.getFather()));
				tableItem.setText(5, Integer.toString(person.getMother()));
				index++;

				if (person.getPerNo() == perNo) {
					selection = index - 1;
				}
			}
			tablePerson.setSelection(selection);

		} catch (Exception e) {
			eventBroker.post("MESSAGE", e.getMessage());
			LOGGER.severe(e.getMessage());
		}
	}
}