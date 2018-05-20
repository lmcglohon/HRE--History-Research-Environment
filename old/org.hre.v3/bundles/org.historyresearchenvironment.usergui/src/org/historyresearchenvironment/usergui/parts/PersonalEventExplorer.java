package org.historyresearchenvironment.usergui.parts;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
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
import org.eclipse.wb.swt.SWTResourceManager;
import org.historyresearchenvironment.usergui.clientinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.dialogs.PersonSelectionDialog;
import org.historyresearchenvironment.usergui.models.EventModel;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.providers.PersonalEventProvider;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
@SuppressWarnings("restriction")
public class PersonalEventExplorer extends AbstractHREGuiPart {
	@Inject
	ECommandService commandService;
	@Inject
	EHandlerService handlerService;

	private Text textIdentity;
	private Table tableProperties;
	private Text filterNameField;
	private Table tableEvents;
	private PersonalEventProvider provider = new PersonalEventProvider();

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

		provider.setId(perNo);

		req = new ServerRequest("GET", "personalevents", provider);

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
			provider = (PersonalEventProvider) resp.getProvider();

			try {
				updateGui();
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
		parent.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		parent.setLayout(new GridLayout(7, false));
		parent.setFont(getHreFont(parent));
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);

		final Button btnSearch = new Button(parent, SWT.NONE);
		btnSearch.setToolTipText("Select person by ID");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				final Display display = Display.getDefault();
				final Shell shell = new Shell(display);
				final PersonSelectionDialog dialog = new PersonSelectionDialog(shell);
				dialog.open();

				final int i = Integer.parseInt(store.getString("PERNO"));
				callBusinessLayer(i);
			}

		});

		btnSearch.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));
		btnSearch.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		final Button btnGoogle = new Button(parent, SWT.NONE);
		// btnGoogle.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseDoubleClick(MouseEvent e) {
		// LOGGER.info("Google button double click for " + textIdentity.getText());
		//
		// store.putValue("PERNAME", textIdentity.getText().replace(' ', '+'));
		//
		// ParameterizedCommand openCommand = commandService
		// .createCommand("org.historyresearchenvironment.usergui.command.googlesearch",
		// null);
		// handlerService.executeHandler(openCommand);
		// LOGGER.info("Clicked");
		// }
		// });
		btnGoogle.setToolTipText("Does not do anything yet");
		btnGoogle.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));
		btnGoogle.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon2.png"));

		final Button btnNewButton_2 = new Button(parent, SWT.NONE);
		btnNewButton_2.setToolTipText("Does not do anything either");
		btnNewButton_2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));
		btnNewButton_2
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon3.png"));

		final Label lblIdentity = new Label(parent, SWT.NONE);
		lblIdentity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdentity.setText("Identity:");

		textIdentity = new Text(parent, SWT.BORDER);
		textIdentity.setEditable(false);
		textIdentity.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		tableProperties = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableProperties.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				final TableItem[] tableItemArray = tableProperties.getSelection();
				final TableItem tableItem = tableItemArray[0];
				final String string = tableItem.getText(1);
				final String[] sa = string.split("\\(");
				final String[] sb = sa[1].split("\\)");
				eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, Integer.parseInt(sb[0]));
			}
		});
		final GridData gd_tableProperties = new GridData(SWT.FILL, SWT.FILL, true, false, 7, 1);
		gd_tableProperties.heightHint = 106;
		tableProperties.setLayoutData(gd_tableProperties);
		tableProperties.setFont(getHreFont(parent));
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

		final Label lblShowEvents = new Label(parent, SWT.NONE);
		lblShowEvents.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblShowEvents.setText("Show Events:");

		final Combo combo = new Combo(parent, SWT.NONE);
		combo.setItems(new String[] { "All Events", "By Function", "By Theme" });
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		combo.select(0);

		final Button btnFilter = new Button(parent, SWT.CHECK);
		btnFilter.setText("Filter:");

		filterNameField = new Text(parent, SWT.BORDER);
		filterNameField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);

		final Button btnNewButton_3 = new Button(parent, SWT.NONE);
		btnNewButton_3.setToolTipText("Does nothing");
		btnNewButton_3
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		tableEvents = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableEvents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));
		tableEvents.setFont(getHreFont(parent));
		tableEvents.setHeaderVisible(true);
		tableEvents.setLinesVisible(true);

		final TableColumn tblclmnEventTag = new TableColumn(tableEvents, SWT.NONE);
		tblclmnEventTag.setWidth(100);
		tblclmnEventTag.setText("EventModel Tag");

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

	/**
	 * Invokes dispose() on provider to disconnect from H2.
	 */
	@PreDestroy
	public void dispose() {
		provider.dispose();
	}

	/**
	 * 
	 */
	@Focus
	public void setFocus() {
	}

	/**
	 * @param perNo
	 */
	@Inject
	@Optional
	private void subscribePersonUpdateTopic(@UIEventTopic(HreEventConstants.PERSON_UPDATE_TOPIC) int perNo) {
		// TODO CHange to invoke callBusinessLzayer() ?
		LOGGER.info("Updating to " + perNo);
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		provider = new PersonalEventProvider();
		provider.setId(perNo);

		req = new ServerRequest("GET", "personalevents", provider);

		final long before = System.nanoTime();

		resp = bli.callBusinessLayer(req);

		final long after = System.nanoTime();
		LOGGER.fine("Elapsed time in milliseconds: " + ((after - before) / 1000000));

		if (resp == null) {
			eventBroker.post("MESSAGE", "Call not successful");
			LOGGER.info("Call not successful");
		} else if (resp.getReturnCode() != 0) {
			eventBroker.post("MESSAGE", resp.getReturnMessage());
			LOGGER.info(resp.getReturnMessage());
		} else {
			provider = (PersonalEventProvider) resp.getProvider();

			try {
				updateGui();
			} catch (final Exception e2) {
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
		EventModel item;

		try {
			textIdentity.setText(provider.getIdentity());
		} catch (final Exception e1) {
			LOGGER.severe(e1.getMessage());
		}

		tableProperties.removeAll();

		TableItem ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "Father-Bio");
		try {
			ti.setText(1, provider.getFather());
		} catch (final Exception e) {
		}

		ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "Mother-Bio");
		try {
			ti.setText(1, provider.getMother());
		} catch (final Exception e) {
		}

		ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "#Children");
		try {
			ti.setText(1, Integer.toString(provider.getNoChildren()));
		} catch (final Exception e) {
		}

		tableEvents.removeAll();

		try {
			final Iterator<EventModel> iterator = provider.getEvents().iterator();

			while (iterator.hasNext()) {
				item = iterator.next();

				ti = new TableItem(tableEvents, SWT.NONE);
				ti.setText(item.getStrings());
			}
			LOGGER.fine("Found: " + provider.writeJson(provider.getClass().getName()));
			eventBroker.post("PEM", provider);
		} catch (final Exception e) {
			eventBroker.post("MESSAGE", e.getClass() + " " + e.getMessage());
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}
}