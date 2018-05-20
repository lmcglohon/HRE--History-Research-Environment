package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.models.PolRegModel;
import org.historyresearchenvironment.usergui.providers.PolRegProvider;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
@SuppressWarnings("restriction")
public class PolRegExplorer extends AbstractHREGuiPart {
	@Inject
	private ECommandService commandService;
	@Inject
	private EHandlerService handlerService;

	private Table tablePolReg;
	private TableViewer tableViewerPolReg;
	private PolRegProvider polRegProvider;
	private TableColumn tblclmnId;
	private TableViewerColumn tableViewerColumn;
	private TableColumn tblclmnRegisterblad;
	private TableViewerColumn tableViewerColumn_1;
	private TableColumn tblclmnFirstNames;
	private TableViewerColumn tableViewerColumn_3;
	private TableColumn tblclmnSurname;
	private TableViewerColumn tableViewerColumn_4;
	private TableColumn tblclmnType_1;
	private TableViewerColumn tableViewerColumn_5;
	private TableColumn tblclmnBirthPlace;
	private TableViewerColumn tableViewerColumn_6;
	private TableColumn tblclmnBirthDate;
	private TableViewerColumn tableViewerColumn_7;
	private TableColumn tblclmnDeathDate;
	private TableViewerColumn tableViewerColumn_8;
	protected String registerbladId;
	private Menu menu;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int i) {

	}

	/**
	 * @param parent
	 */
	@PostConstruct
	public void postConstruct(Composite parent) {
		LOGGER.info("Constructor");
		store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
		parent.setLayout(new GridLayout(2, false));

		tableViewerPolReg = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tablePolReg = tableViewerPolReg.getTable();
		tablePolReg.setToolTipText("Select a person and right clik to continue");
		tablePolReg.addListener(SWT.Selection, new Listener() {

			/**
			 * @param event
			 */
			@Override
			public void handleEvent(Event event) {
				final TableItem[] selection = tablePolReg.getSelection();
				final TableItem item = selection[0];
				registerbladId = item.getText(1);
				LOGGER.info("Selected id: " + registerbladId);
				store.putValue("POLREGID", registerbladId);
			}
		});
		tablePolReg.setFont(getHreFont(parent));
		tablePolReg.setLinesVisible(true);
		tablePolReg.setHeaderVisible(true);
		tablePolReg.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		tableViewerColumn = new TableViewerColumn(tableViewerPolReg, SWT.NONE);
		tblclmnId = tableViewerColumn.getColumn();
		tblclmnId.setWidth(100);
		tblclmnId.setText("ID");
		tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final PolRegModel item = (PolRegModel) element;
				return item.getId();
			}
		});

		tableViewerColumn_1 = new TableViewerColumn(tableViewerPolReg, SWT.NONE);
		tblclmnRegisterblad = tableViewerColumn_1.getColumn();
		tblclmnRegisterblad.setWidth(100);
		tblclmnRegisterblad.setText("Registerblad");
		tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final PolRegModel item = (PolRegModel) element;
				return item.getRegisterblad_id();
			}
		});

		tableViewerColumn_3 = new TableViewerColumn(tableViewerPolReg, SWT.NONE);
		tblclmnFirstNames = tableViewerColumn_3.getColumn();
		tblclmnFirstNames.setWidth(200);
		tblclmnFirstNames.setText("First Names");
		tableViewerColumn_3.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final PolRegModel item = (PolRegModel) element;
				return item.getFirstnames();
			}
		});

		tableViewerColumn_4 = new TableViewerColumn(tableViewerPolReg, SWT.NONE);
		tblclmnSurname = tableViewerColumn_4.getColumn();
		tblclmnSurname.setWidth(150);
		tblclmnSurname.setText("Surname");
		tableViewerColumn_4.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final PolRegModel item = (PolRegModel) element;
				return item.getLastname();
			}
		});

		tableViewerColumn_5 = new TableViewerColumn(tableViewerPolReg, SWT.NONE);
		tblclmnType_1 = tableViewerColumn_5.getColumn();
		tblclmnType_1.setWidth(100);
		tblclmnType_1.setText("Type");
		tableViewerColumn_5.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final PolRegModel item = (PolRegModel) element;
				return item.getPerson_type();
			}
		});

		tableViewerColumn_6 = new TableViewerColumn(tableViewerPolReg, SWT.NONE);
		tblclmnBirthPlace = tableViewerColumn_6.getColumn();
		tblclmnBirthPlace.setWidth(100);
		tblclmnBirthPlace.setText("Birth Place");
		tableViewerColumn_6.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final PolRegModel item = (PolRegModel) element;
				return item.getBirthplace();
			}
		});

		tableViewerColumn_7 = new TableViewerColumn(tableViewerPolReg, SWT.NONE);
		tblclmnBirthDate = tableViewerColumn_7.getColumn();
		tblclmnBirthDate.setWidth(100);
		tblclmnBirthDate.setText("Birth date");
		tableViewerColumn_7.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final PolRegModel item = (PolRegModel) element;
				return item.getDateofbirth();
			}
		});

		tableViewerColumn_8 = new TableViewerColumn(tableViewerPolReg, SWT.NONE);
		tblclmnDeathDate = tableViewerColumn_8.getColumn();
		tblclmnDeathDate.setWidth(100);
		tblclmnDeathDate.setText("Death date");
		tableViewerColumn_8.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				final PolRegModel item = (PolRegModel) element;
				return item.getDateofdeath();
			}
		});

		menu = new Menu(tablePolReg);
		tablePolReg.setMenu(menu);

		final MenuItem mntmOpenOriginalIn = new MenuItem(menu, SWT.NONE);
		mntmOpenOriginalIn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LOGGER.info("Browser selected on " + registerbladId);
				final ParameterizedCommand browseCommand = commandService
						.createCommand("org.historyresearchenvironment.usergui.command.polregbrowser", null);
				handlerService.executeHandler(browseCommand);
			}
		});
		mntmOpenOriginalIn.setText("Open Original in Browser");

		final MenuItem mntmLocations = new MenuItem(menu, SWT.NONE);
		mntmLocations.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LOGGER.info("Locations selected on " + registerbladId);
				final ParameterizedCommand browseCommand = commandService
						.createCommand("org.historyresearchenvironment.usergui.command.polreglocation", null);
				handlerService.executeHandler(browseCommand);
			}
		});
		mntmLocations.setText("Locations");

		tableViewerPolReg.setContentProvider(ArrayContentProvider.getInstance());
		polRegProvider = new PolRegProvider();
		tableViewerPolReg.setInput(polRegProvider.getModelList());
	}

	@Inject
	@Optional
	private void subscribeNameUpdateTopic(@UIEventTopic(HreEventConstants.NAME_UPDATE_TOPIC) String perName) {
		LOGGER.fine("Subscribing to " + perName);

		if ((tablePolReg != null) && (tableViewerPolReg != null) && (tablePolReg.isVisible())) {
			updateGui();
		} else {
			LOGGER.fine("Not visible");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
		LOGGER.fine("Updating GUI");

		polRegProvider = new PolRegProvider();
		LOGGER.fine("Set input: Get item list");
		tableViewerPolReg.setInput(polRegProvider.getModelList());
		LOGGER.fine("Refresh");
		tableViewerPolReg.refresh();
	}
}