package org.historyresearchenvironment.usergui.parts;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
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
import org.historyresearchenvironment.usergui.models.ConnectionEventsItem;
import org.historyresearchenvironment.usergui.models.PersonalConnectionsModel;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterface;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

/**
 * @author michael
 *
 */
public class PersonalConnectionsExplorer extends AbstractHREGuiPart {
	@Inject
	private IEventBroker eventBroker;

	private IEclipsePreferences iep;

	private Text textIdentity;
	private Table tableParents;
	private Text textFilterName;
	private Table tableEvents;

	private PersonalConnectionsModel pcm;
	private BusinessLayerInterface bli;
	private ServerRequest req;
	private ServerResponse resp;

	/**
	 * 
	 */
	public PersonalConnectionsExplorer() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		pcm = new PersonalConnectionsModel();
		pcm.setId(1);

		req = new ServerRequest("GET", "personalconnections", pcm);

		resp = bli.callBusinessLayer(req);
		try {
			pcm = (PersonalConnectionsModel) resp.getModel();
		} catch (Exception e1) {
			eventBroker.post("MESSAGE", e1.getMessage());
			LOGGER.severe(e1.getMessage());
		}

		parent.setLayout(new GridLayout(6, false));

		Label lblIdentity = new Label(parent, SWT.NONE);
		lblIdentity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdentity.setText("Identity:");

		textIdentity = new Text(parent, SWT.BORDER);
		textIdentity.setEditable(false);
		textIdentity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Button btnSearch = new Button(parent, SWT.NONE);
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Display display = Display.getDefault();
				Shell shell = new Shell(display);
				PersonSelectionDialog dialog = new PersonSelectionDialog(shell);
				dialog.open();

				iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");
				bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
				pcm = new PersonalConnectionsModel();
				pcm.setId(Integer.parseInt(iep.get("PERNO", "88")));

				req = new ServerRequest("GET", "personalconnections", pcm);

				long before = System.nanoTime();

				resp = bli.callBusinessLayer(req);

				long after = System.nanoTime();

				LOGGER.info("Elapsed time in milliseconds: " + ((after - before) / 1000000));

				if (resp == null) {
					eventBroker.post("MESSAGE", "Call not successful");
				} else if (resp.getReturnCode() != 0) {
					eventBroker.post("MESSAGE", resp.getReturnMessage());
				} else {
					pcm = (PersonalConnectionsModel) resp.getModel();

					try {
						populateExplorer();
					} catch (Exception e2) {
						LOGGER.severe("Error in request " + req.getOperation() + " " + req.getModelName() + ", "
								+ e2.getMessage());
						eventBroker.post("MESSAGE", e2.getMessage());
					}
				}
			}
		});
		btnSearch.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		Button btnNewButton_1 = new Button(parent, SWT.NONE);
		btnNewButton_1.setImage(
				ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/gear-32.png"));

		Button btnNewButton_2 = new Button(parent, SWT.NONE);
		btnNewButton_2
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon3.png"));
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);

		tableParents = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		GridData gd_tableParents = new GridData(SWT.FILL, SWT.FILL, true, false, 6, 1);
		gd_tableParents.heightHint = 106;
		tableParents.setLayoutData(gd_tableParents);
		tableParents.setHeaderVisible(true);
		tableParents.setLinesVisible(true);

		TableColumn tblclmnProperties = new TableColumn(tableParents, SWT.NONE);
		tblclmnProperties.setWidth(100);
		tblclmnProperties.setText("Properties");

		TableColumn tblclmnValue = new TableColumn(tableParents, SWT.NONE);
		tblclmnValue.setWidth(290);
		tblclmnValue.setText("Value");

		TableColumn tblclmnRating = new TableColumn(tableParents, SWT.NONE);
		tblclmnRating.setWidth(100);
		tblclmnRating.setText("Rating");

		Label label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 5, 1));
		new Label(parent, SWT.NONE);

		Label lblSortConnectionsBy = new Label(parent, SWT.NONE);
		lblSortConnectionsBy.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSortConnectionsBy.setText("Sort Connections by:");

		Combo comboConnectionSort = new Combo(parent, SWT.NONE);
		comboConnectionSort.setItems(new String[] { "Event Date, then Person", "Person, then Event Date",
				"Theme, then Event Date, then Person", "Theme, then Person, then Event Date" });
		comboConnectionSort.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboConnectionSort.select(0);

		Button btnFilter = new Button(parent, SWT.CHECK);
		btnFilter.setText("Filter:");

		textFilterName = new Text(parent, SWT.BORDER);
		textFilterName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		tableEvents = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableEvents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 6, 1));
		tableEvents.setHeaderVisible(true);
		tableEvents.setLinesVisible(true);

		TableColumn tblclmnPerson = new TableColumn(tableEvents, SWT.NONE);
		tblclmnPerson.setWidth(100);
		tblclmnPerson.setText("Person");

		TableColumn tblclmnRole = new TableColumn(tableEvents, SWT.NONE);
		tblclmnRole.setWidth(100);
		tblclmnRole.setText("Role");

		TableColumn tblclmnEvent = new TableColumn(tableEvents, SWT.NONE);
		tblclmnEvent.setWidth(250);
		tblclmnEvent.setText("Event");

		TableColumn tblclmnDate = new TableColumn(tableEvents, SWT.NONE);
		tblclmnDate.setWidth(100);
		tblclmnDate.setText("Date");

		TableColumn tblclmnOptionalFieldsHere = new TableColumn(tableEvents, SWT.NONE);
		tblclmnOptionalFieldsHere.setWidth(151);
		tblclmnOptionalFieldsHere.setText("Optional Fields here");

		populateExplorer();
	}

	@PreDestroy
	public void dispose() {
	}

	private void populateExplorer() {
		TableItem ti;

		textIdentity.setText(pcm.getIdentity());

		tableParents.removeAll();
		ti = new TableItem(tableParents, SWT.NONE);
		ti.setText(0, "Father-Bio");
		try {
			ti.setText(1, pcm.getFather());
		} catch (Exception e) {
		}

		ti = new TableItem(tableParents, SWT.NONE);
		ti.setText(0, "Mother-Bio");
		try {
			ti.setText(1, pcm.getMother());
		} catch (Exception e) {
		}

		ti = new TableItem(tableParents, SWT.NONE);
		ti.setText(0, "#Children");
		try {
			ti.setText(1, Integer.toString(pcm.getNoChildren()));
		} catch (Exception e) {
		}

		tableEvents.removeAll();
		try {
			Iterator<ConnectionEventsItem> iterator = pcm.getCaiv().iterator();

			while (iterator.hasNext()) {
				ConnectionEventsItem eventModel = iterator.next();

				ti = new TableItem(tableEvents, SWT.NONE);
				ti.setText(eventModel.getStrings());
			}
			// LOGGER.info("Found: " + pcm.writeJson());
			// eventBroker.post("PCM", pcm);
		} catch (Exception e) {
			eventBroker.post("MESSAGE", e.getMessage());
			LOGGER.severe(e.getMessage());
		}
	}

	@Focus
	public void setFocus() {
	}

	@Override
	protected void callBusinessLayer(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateGui() {
		// TODO Auto-generated method stub
		
	}

}
