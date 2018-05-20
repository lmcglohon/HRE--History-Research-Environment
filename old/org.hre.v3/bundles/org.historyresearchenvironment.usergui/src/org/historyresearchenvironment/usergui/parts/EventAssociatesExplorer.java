package org.historyresearchenvironment.usergui.parts;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

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
import org.historyresearchenvironment.usergui.clientinterface.BusinessLayerInterface;
import org.historyresearchenvironment.usergui.clientinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.dialogs.PersonSelectionDialog;
import org.historyresearchenvironment.usergui.models.EventAssociatesModel;
import org.historyresearchenvironment.usergui.providers.EventAssociatesProvider;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class EventAssociatesExplorer extends AbstractHREGuiPart {
	@Inject
	private IEventBroker eventBroker;

	private ScopedPreferenceStore store;
	private Text textIdentity;
	private Table tableProperties;
	private Text text;
	private Table tableAssociates;
	private EventAssociatesProvider eam;
	private BusinessLayerInterface bli;
	private ServerRequest req;
	private ServerResponse resp;

	@Override
	protected void callBusinessLayer(int i) {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		eam = new EventAssociatesProvider();
		eam.setId(1);

		req = new ServerRequest("GET", "eventassociates", eam);

		resp = bli.callBusinessLayer(req);
		try {
			eam = (EventAssociatesProvider) resp.getProvider();
		} catch (final Exception e1) {
			eventBroker.post("MESSAGE", e1.getMessage());
			LOGGER.severe(e1.getMessage());
		}

		parent.setLayout(new GridLayout(6, false));

		final Label lblIdentity = new Label(parent, SWT.NONE);
		lblIdentity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdentity.setText("Identity:");

		textIdentity = new Text(parent, SWT.BORDER);
		textIdentity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		final Button btnSearch = new Button(parent, SWT.NONE);
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				final Display display = Display.getDefault();
				final Shell shell = new Shell(display);
				final PersonSelectionDialog dialog = new PersonSelectionDialog(shell);
				dialog.open();

				store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
				bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
				eam = new EventAssociatesProvider();
				eam.setId(Integer.parseInt(store.getString("PERNO")));

				req = new ServerRequest("GET", "eventassociates", eam);

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
					eam = (EventAssociatesProvider) resp.getProvider();

					try {
						populateExplorer();
					} catch (final Exception e2) {
						LOGGER.severe("Error in request " + req.getOperation() + " " + req.getModelName() + ", "
								+ e2.getMessage());
						eventBroker.post("MESSAGE", e2.getMessage());
					}
				}
			}
		});
		btnSearch.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		final Button btnNewButton_1 = new Button(parent, SWT.NONE);
		btnNewButton_1
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon2.png"));

		final Button btnNewButton_2 = new Button(parent, SWT.NONE);
		btnNewButton_2
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon3.png"));

		tableProperties = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableProperties.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 6, 1));
		tableProperties.setFont(getHreFont(parent));
		tableProperties.setHeaderVisible(true);
		tableProperties.setLinesVisible(true);

		final TableColumn tblclmnProperties = new TableColumn(tableProperties, SWT.NONE);
		tblclmnProperties.setWidth(100);
		tblclmnProperties.setText("Properties");

		final TableColumn tblclmnValue = new TableColumn(tableProperties, SWT.NONE);
		tblclmnValue.setWidth(352);
		tblclmnValue.setText("Value");

		final TableColumn tblclmnRating = new TableColumn(tableProperties, SWT.NONE);
		tblclmnRating.setWidth(100);
		tblclmnRating.setText("Rating");

		final Label label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 6, 1));

		final Label lblShowAssociates = new Label(parent, SWT.NONE);
		lblShowAssociates.setText("Show Associates:");

		final Combo comboAssociates = new Combo(parent, SWT.NONE);
		comboAssociates.setItems(new String[] { "All Associates (in one table)",
				"By Associate Type (one table per associate type, person, item, etc)" });
		comboAssociates.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		comboAssociates.select(0);

		final Button btnFilter = new Button(parent, SWT.CHECK);
		btnFilter.setText("Filter");

		text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		tableAssociates = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableAssociates.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 6, 1));
		tableAssociates.setFont(getHreFont(parent));
		tableAssociates.setHeaderVisible(true);
		tableAssociates.setLinesVisible(true);

		final TableColumn tblclmnType = new TableColumn(tableAssociates, SWT.NONE);
		tblclmnType.setWidth(100);
		tblclmnType.setText("Type");

		final TableColumn tblclmnRole = new TableColumn(tableAssociates, SWT.NONE);
		tblclmnRole.setWidth(197);
		tblclmnRole.setText("Role");

		final TableColumn tblclmnSummary = new TableColumn(tableAssociates, SWT.NONE);
		tblclmnSummary.setWidth(277);
		tblclmnSummary.setText("Summary");

		final TableColumn tblclmnOptionalFieldsHere = new TableColumn(tableAssociates, SWT.NONE);
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
		} catch (final Exception e) {
		}
		ti = new TableItem(tableProperties, SWT.NONE);
		ti.setText(0, "* Date");
		try {
			ti.setText(1, eam.getDate());
		} catch (final Exception e) {
		}

		tableAssociates.removeAll();
		try {
			final Iterator<EventAssociatesModel> iterator = eam.getEaiv().iterator();

			while (iterator.hasNext()) {
				final EventAssociatesModel item = iterator.next();

				ti = new TableItem(tableAssociates, SWT.NONE);
				ti.setText(item.getStrings());
			}
		} catch (final Exception e) {
			eventBroker.post("MESSAGE", e.getClass() + " " + e.getMessage());
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}

	@Focus
	public void setFocus() {
	}

	@Override
	protected void updateGui() {
	}

}
