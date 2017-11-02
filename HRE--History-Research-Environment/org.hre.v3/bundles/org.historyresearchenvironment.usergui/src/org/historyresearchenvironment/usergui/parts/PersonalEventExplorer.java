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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;
import org.historyresearchenvironment.usergui.dialogs.PersonSelectionDialog;
import org.historyresearchenvironment.usergui.models.EventItem;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.models.PersonalEventModel;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;

public class PersonalEventExplorer extends AbstractHREGuiPart {
	private Text textIdentity;
	private Table tableProperties;
	private Text filterNameFIeld;
	private Table tableEvents;
	private PersonalEventModel pem;

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
		pem = new PersonalEventModel();
		pem.setId(perNo);

		req = new ServerRequest("GET", "personalevents", pem);

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
			pem = (PersonalEventModel) resp.getModel();

			try {
				updateGui();
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
	public void createControls(Composite personalEventsExplorerParent) {
		personalEventsExplorerParent.setLayout(new GridLayout(7, false));
		new Label(personalEventsExplorerParent, SWT.NONE);
		new Label(personalEventsExplorerParent, SWT.NONE);
		new Label(personalEventsExplorerParent, SWT.NONE);
		new Label(personalEventsExplorerParent, SWT.NONE);

		final Button btnSearch = new Button(personalEventsExplorerParent, SWT.NONE);
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Display display = Display.getDefault();
				Shell shell = new Shell(display);
				PersonSelectionDialog dialog = new PersonSelectionDialog(shell);
				dialog.open();

				int i = Integer.parseInt(iep.get("PERNO", "88"));
				callBusinessLayer(i);
			}

		});

		btnSearch.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));
		btnSearch.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		final Button btnNewButton_1 = new Button(personalEventsExplorerParent, SWT.NONE);
		btnNewButton_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));
		btnNewButton_1
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon2.png"));

		final Button btnNewButton_2 = new Button(personalEventsExplorerParent, SWT.NONE);
		btnNewButton_2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));
		btnNewButton_2
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon3.png"));

		final Label lblIdentity = new Label(personalEventsExplorerParent, SWT.NONE);
		lblIdentity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdentity.setText("Identity:");

		textIdentity = new Text(personalEventsExplorerParent, SWT.BORDER);
		textIdentity.setEditable(false);
		textIdentity.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		tableProperties = new Table(personalEventsExplorerParent, SWT.BORDER | SWT.FULL_SELECTION);
		tableProperties.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				TableItem[] tableItemArray = tableProperties.getSelection();
				TableItem tableItem = tableItemArray[0];
				String string = tableItem.getText(1);
				String[] sa = string.split("\\(");
				String[] sb = sa[1].split("\\)");
				eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, Integer.parseInt(sb[0]));
			}
		});
		final GridData gd_tableProperties = new GridData(SWT.FILL, SWT.FILL, true, false, 7, 1);
		gd_tableProperties.heightHint = 106;
		tableProperties.setLayoutData(gd_tableProperties);
		tableProperties.setHeaderVisible(true);
		tableProperties.setLinesVisible(true);

		final TableColumn tblclmnProperties = new TableColumn(tableProperties, SWT.NONE);
		tblclmnProperties.setWidth(100);
		tblclmnProperties.setText("Property");

		final TableColumn tblclmnValue = new TableColumn(tableProperties, SWT.NONE);
		tblclmnValue.setWidth(367);
		tblclmnValue.setText("Value");

		final TableColumn tblclmnRating = new TableColumn(tableProperties, SWT.NONE);
		tblclmnRating.setWidth(100);
		tblclmnRating.setText("Rating");

		final Label lblShowEvents = new Label(personalEventsExplorerParent, SWT.NONE);
		lblShowEvents.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblShowEvents.setText("Show Events:");

		final Combo combo = new Combo(personalEventsExplorerParent, SWT.NONE);
		combo.setItems(new String[] { "All Events", "By Function", "By Theme" });
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		combo.select(0);

		final Button btnFilter = new Button(personalEventsExplorerParent, SWT.CHECK);
		btnFilter.setText("Filter:");

		filterNameFIeld = new Text(personalEventsExplorerParent, SWT.BORDER);
		filterNameFIeld.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(personalEventsExplorerParent, SWT.NONE);
		new Label(personalEventsExplorerParent, SWT.NONE);

		final Button btnNewButton_3 = new Button(personalEventsExplorerParent, SWT.NONE);
		btnNewButton_3
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		tableEvents = new Table(personalEventsExplorerParent, SWT.BORDER | SWT.FULL_SELECTION);
		tableEvents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));
		tableEvents.setHeaderVisible(true);
		tableEvents.setLinesVisible(true);

		final TableColumn tblclmnEventTag = new TableColumn(tableEvents, SWT.NONE);
		tblclmnEventTag.setWidth(100);
		tblclmnEventTag.setText("EventItem Tag");

		final TableColumn tblclmnRole = new TableColumn(tableEvents, SWT.NONE);
		tblclmnRole.setWidth(100);
		tblclmnRole.setText("Role");

		final TableColumn tblclmnDate = new TableColumn(tableEvents, SWT.NONE);
		tblclmnDate.setWidth(100);
		tblclmnDate.setText("Date");

		final TableColumn tblclmnSummary = new TableColumn(tableEvents, SWT.NONE);
		tblclmnSummary.setWidth(455);
		tblclmnSummary.setText("Summary");

		final TableColumn tblclmnOptionalField = new TableColumn(tableEvents, SWT.NONE);
		tblclmnOptionalField.setWidth(100);
		tblclmnOptionalField.setText("Optional Field 1");

		callBusinessLayer(1);
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

	@Inject
	@Optional
	private void subscribePersonUpdateTopic(@UIEventTopic(HreEventConstants.PERSON_UPDATE_TOPIC) int perNo) {
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		pem = new PersonalEventModel();
		pem.setId(perNo);

		req = new ServerRequest("GET", "personalevents", pem);

		long before = System.nanoTime();

		resp = bli.callBusinessLayer(req);

		long after = System.nanoTime();
		LOGGER.info("Elapsed time in milliseconds: " + ((after - before) / 1000000));

		if (resp == null) {
			eventBroker.post("MESSAGE", "Call not successful");
			LOGGER.info("Call not successful");
		} else if (resp.getReturnCode() != 0) {
			eventBroker.post("MESSAGE", resp.getReturnMessage());
			LOGGER.info(resp.getReturnMessage());
		} else {
			pem = (PersonalEventModel) resp.getModel();

			try {
				updateGui();
			} catch (Exception e2) {
				LOGGER.severe("Event Error: " + e2.getMessage());
				eventBroker.post("MESSAGE", e2.getMessage());
			}
		}
	}

	/**
	 * Set properties and events in tables
	 */
	@Override
	protected void updateGui() {
		EventItem item;

		try {
			textIdentity.setText(pem.getIdentity());
		} catch (Exception e1) {
			LOGGER.severe(e1.getMessage());
		}

		tableProperties.removeAll();

		TableItem ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "Father-Bio");
		try {
			ti.setText(1, pem.getFather());
		} catch (Exception e) {
		}

		ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "Mother-Bio");
		try {
			ti.setText(1, pem.getMother());
		} catch (Exception e) {
		}

		ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "#Children");
		try {
			ti.setText(1, Integer.toString(pem.getNoChildren()));
		} catch (Exception e) {
		}

		tableEvents.removeAll();

		try {
			Iterator<EventItem> iterator = pem.getEvents().iterator();

			while (iterator.hasNext()) {
				item = iterator.next();

				ti = new TableItem(tableEvents, SWT.NONE);
				ti.setText(item.getStrings());
			}
			LOGGER.fine("Found: " + pem.writeJson(pem.getClass().getName()));
			eventBroker.post("PEM", pem);
		} catch (Exception e) {
			eventBroker.post("MESSAGE", e.getMessage());
			LOGGER.severe(e.getMessage());
		}
	}
}