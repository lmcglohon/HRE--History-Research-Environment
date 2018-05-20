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
import org.historyresearchenvironment.usergui.clientinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.models.PersonNavigatorModel;
import org.historyresearchenvironment.usergui.providers.PersonNavigatorProvider;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class PersonNavigator extends AbstractHREGuiPart {
	private Table tablePerson;
	private PersonNavigatorProvider personNavigatorProvider = new PersonNavigatorProvider();
	private TableItem tableItem;
	private PersonNavigatorModel person;
	private int perNo = 1;
	private String perName = "Frank+Alexander";
	private Composite grandParent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int perNo) {
		store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();

		req = new ServerRequest("GET", "personlist", personNavigatorProvider);

		final long before = System.nanoTime();

		resp = bli.callBusinessLayer(req);

		final long after = System.nanoTime();
		LOGGER.fine("Elapsed time in milliseconds: " + ((after - before) / 1000000));

		if (resp == null) {
			eventBroker.post("MESSAGE", "Call not successful");
			LOGGER.severe("Call not successful");
		} else if (resp.getReturnCode() != 0) {
			eventBroker.post("MESSAGE", resp.getReturnMessage());
			LOGGER.severe(resp.getReturnMessage());

		} else {
			personNavigatorProvider = (PersonNavigatorProvider) resp.getProvider();

			try {
				if (tablePerson != null) {
					this.perNo = perNo;
					updateGui();
				}
			} catch (final Exception e2) {
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
		grandParent = parent;

		tablePerson = new Table(parent, SWT.BORDER | SWT.SINGLE);
		tablePerson.setFont(getHreFont(parent));
		tablePerson.addListener(SWT.Selection, new Listener() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
			 */
			@Override
			public void handleEvent(Event e) {
				final TableItem[] selection = tablePerson.getSelection();
				final TableItem ti = selection[0];
				perName = ti.getText(0);

				LOGGER.fine("Name: " + perName);
				final String[] sa = perName.split(",");
				final String[] sa2 = sa[1].split(" ");
				perName = sa2[1] + "+" + sa[0];
				perName = perName.replace(" ", "+");
				LOGGER.fine("Name: " + perName);

				store.putValue("PERNAME", perName);
				final String string = ti.getText(1);
				perNo = Integer.parseInt(string);
			}
		});

		tablePerson.addMouseListener(new MouseAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.swt.events.MouseAdapter#mouseDoubleClick(org.eclipse.swt.events.
			 * MouseEvent)
			 */
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, perNo);
				eventBroker.post(HreEventConstants.NAME_UPDATE_TOPIC, perName);
				LOGGER.fine("Name: " + perName);
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
			final Iterator<PersonNavigatorModel> iterator = personNavigatorProvider.getPersons().iterator();

			tablePerson.removeAll();

			while (iterator.hasNext()) {
				person = iterator.next();
				tableItem = new TableItem(tablePerson, SWT.NONE);
				tableItem.setFont(getHreFont(grandParent));
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

		} catch (final Exception e) {
			eventBroker.post("MESSAGE", e.getClass() + " " + e.getMessage());
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}
}