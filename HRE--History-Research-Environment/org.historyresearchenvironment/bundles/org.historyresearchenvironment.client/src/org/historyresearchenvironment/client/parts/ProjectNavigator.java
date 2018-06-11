package org.historyresearchenvironment.client.parts;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.osgi.service.prefs.Preferences;

/**
 * @version 2018-06-10
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
@SuppressWarnings("restriction")
public class ProjectNavigator {
	@Inject
	private ECommandService commandService;
	@Inject
	private EHandlerService handlerService;
	@Inject
	private IEventBroker eventBroker;
	
	private static Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private Table table;

	/**
	 * Constructor
	 *
	 */
	public ProjectNavigator() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		TableViewer tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				final ParameterizedCommand command = commandService
						.createCommand("org.historyresearchenvironment.client.command.projectproperties", null);
				handlerService.executeHandler(command);

				int index = table.getSelectionIndex();
				eventBroker.post(org.historyresearchenvironment.client.HreConstants.SELECTION_INDEX_TOPIC, index);
				LOGGER.info("Project Navigator posted selectio0n index " + index);

			}
		});
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		TableViewerColumn tableViewerColumnProjectName = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnProjectName = tableViewerColumnProjectName.getColumn();
		tblclmnProjectName.setWidth(100);
		tblclmnProjectName.setText("Project Name");

		int projectCount = preferences.getInt("projectcount", 1);
		String key;

		for (int i = 0; i < projectCount; i++) {
			TableItem tableItem = new TableItem(table, SWT.NONE);
			key = new String("project." + i + ".name");
			tableItem.setText(preferences.get(key, "?"));
		}

		Menu menu = new Menu(table);
		table.setMenu(menu);

		MenuItem mntmOpen = new MenuItem(menu, SWT.NONE);
		mntmOpen.addSelectionListener(new SelectionAdapter() {
			/*
			 * (non-Javadoc)
			 *
			 * @see
			 *
			 * org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events
			 * .SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				ParameterizedCommand saveCommand = commandService.createCommand("org.eclipse.ui.file.open", null);
				handlerService.executeHandler(saveCommand);
			}
		});
		mntmOpen.setText("Open...");

		MenuItem mntmNew = new MenuItem(menu, SWT.NONE);
		mntmNew.addSelectionListener(new SelectionAdapter() {
			/*
			 * (non-Javadoc)
			 *
			 * @see
			 *
			 * org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events
			 * .SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				ParameterizedCommand newCommand = commandService.createCommand("org.eclipse.ui.file.save", null);
				handlerService.executeHandler(newCommand);
			}
		});
		mntmNew.setText("New...");

		MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
		mntmNewItem.setText("Backup...");

		MenuItem mntmRestore = new MenuItem(menu, SWT.NONE);
		mntmRestore.setText("Restore...");

		MenuItem mntmCopyAs = new MenuItem(menu, SWT.NONE);
		mntmCopyAs.setText("Copy as...");

		MenuItem mntmRename = new MenuItem(menu, SWT.NONE);
		mntmRename.setText("Rename...");

		MenuItem mntmDelete = new MenuItem(menu, SWT.NONE);
		mntmDelete.setText("Delete");

		new MenuItem(menu, SWT.SEPARATOR);

		MenuItem mntmProperties = new MenuItem(menu, SWT.NONE);
		mntmProperties.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Selected item
				final ParameterizedCommand command = commandService
						.createCommand("org.historyresearchenvironment.client.command.projectproperties", null);
				handlerService.executeHandler(command);
			}
		});
		mntmProperties.setToolTipText("Properties");
		mntmProperties.setText("Properties");
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}
}
