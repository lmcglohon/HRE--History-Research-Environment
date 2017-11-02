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
import org.historyresearchenvironment.usergui.models.EventAssociatesItem;
import org.historyresearchenvironment.usergui.models.EventAssociatesModel;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterface;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

/**
 * @author michael
 *
 */
public class EventAssociatesExplorer extends AbstractHREGuiPart {
	@Inject
	private IEventBroker eventBroker;

	private IEclipsePreferences iep;

	private Text textIdentity;
	private Table tableProperties;
	private Text text;
	private Table tableAssociates;

	private EventAssociatesModel eam;
	private BusinessLayerInterface bli;
	private ServerRequest req;
	private ServerResponse resp;

	/**
	 * 
	 */
	public EventAssociatesExplorer() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		eam = new EventAssociatesModel();
		eam.setId(1);

		req = new ServerRequest("GET", "eventassociates", eam);

		resp = bli.callBusinessLayer(req);
		try {
			eam = (EventAssociatesModel) resp.getModel();
		} catch (Exception e1) {
			eventBroker.post("MESSAGE", e1.getMessage());
			LOGGER.severe(e1.getMessage());
		}

		parent.setLayout(new GridLayout(6, false));

		Label lblIdentity = new Label(parent, SWT.NONE);
		lblIdentity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdentity.setText("Identity:");

		textIdentity = new Text(parent, SWT.BORDER);
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
				eam = new EventAssociatesModel();
				eam.setId(Integer.parseInt(iep.get("PERNO", "88")));

				req = new ServerRequest("GET", "eventassociates", eam);

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
					eam = (EventAssociatesModel) resp.getModel();

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
		btnNewButton_1
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon2.png"));

		Button btnNewButton_2 = new Button(parent, SWT.NONE);
		btnNewButton_2
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon3.png"));

		tableProperties = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableProperties.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 6, 1));
		tableProperties.setHeaderVisible(true);
		tableProperties.setLinesVisible(true);

		TableColumn tblclmnProperties = new TableColumn(tableProperties, SWT.NONE);
		tblclmnProperties.setWidth(100);
		tblclmnProperties.setText("Properties");

		TableColumn tblclmnValue = new TableColumn(tableProperties, SWT.NONE);
		tblclmnValue.setWidth(352);
		tblclmnValue.setText("Value");

		TableColumn tblclmnRating = new TableColumn(tableProperties, SWT.NONE);
		tblclmnRating.setWidth(100);
		tblclmnRating.setText("Rating");

		Label label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 6, 1));

		Label lblShowAssociates = new Label(parent, SWT.NONE);
		lblShowAssociates.setText("Show Associates:");

		Combo comboAssociates = new Combo(parent, SWT.NONE);
		comboAssociates.setItems(new String[] { "All Associates (in one table)",
				"By Associate Type (one table per associate type, person, item, etc)" });
		comboAssociates.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		comboAssociates.select(0);

		Button btnFilter = new Button(parent, SWT.CHECK);
		btnFilter.setText("Filter");

		text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		tableAssociates = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableAssociates.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 6, 1));
		tableAssociates.setHeaderVisible(true);
		tableAssociates.setLinesVisible(true);

		TableColumn tblclmnType = new TableColumn(tableAssociates, SWT.NONE);
		tblclmnType.setWidth(100);
		tblclmnType.setText("Type");

		TableColumn tblclmnRole = new TableColumn(tableAssociates, SWT.NONE);
		tblclmnRole.setWidth(197);
		tblclmnRole.setText("Role");

		TableColumn tblclmnSummary = new TableColumn(tableAssociates, SWT.NONE);
		tblclmnSummary.setWidth(277);
		tblclmnSummary.setText("Summary");

		TableColumn tblclmnOptionalFieldsHere = new TableColumn(tableAssociates, SWT.NONE);
		tblclmnOptionalFieldsHere.setWidth(100);
		tblclmnOptionalFieldsHere.setText("Optional Fields here");

		populateExplorer();
	}

	@PreDestroy
	public void dispose() {
	}

	protected void populateExplorer() {
		TableItem ti;

		textIdentity.setText(eam.getIdentity());

		tableProperties.removeAll();
		ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "* Location");
		try {
			ti.setText(1, eam.getLocation());
		} catch (Exception e) {
		}
		ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "* Date");
		try {
			ti.setText(1, eam.getDate());
		} catch (Exception e) {
		}

		tableAssociates.removeAll();
		try {
			Iterator<EventAssociatesItem> iterator = eam.getEaiv().iterator();

			while (iterator.hasNext()) {
				EventAssociatesItem item = iterator.next();

				ti = new TableItem(tableAssociates, SWT.NONE);
				ti.setText(item.getStrings());
			}
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
