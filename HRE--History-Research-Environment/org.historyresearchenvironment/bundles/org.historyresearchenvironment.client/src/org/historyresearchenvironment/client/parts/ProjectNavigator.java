package org.historyresearchenvironment.client.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
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
	private Table table;

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
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		TableViewerColumn tableViewerColumnProjectName = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnProjectName = tableViewerColumnProjectName.getColumn();
		tblclmnProjectName.setWidth(100);
		tblclmnProjectName.setText("Project Name");

		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText("HRE");
		tableItem.setText(new String[] {});

		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText("Test1");
		tableItem_1.setText(new String[] {});

		Menu menu = new Menu(table);
		table.setMenu(menu);

		MenuItem mntmOpen = new MenuItem(menu, SWT.NONE);
		mntmOpen.addSelectionListener(new SelectionAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events
			 * .SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				ParameterizedCommand saveCommand = commandService
						.createCommand("org.eclipse.ui.file.open", null);
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
			 * org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events
			 * .SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				ParameterizedCommand newCommand = commandService
						.createCommand("org.eclipse.ui.file.save", null);
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
		mntmProperties.setToolTipText("Properties");
		mntmProperties.setText("Properties");
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO Set the focus to control
	}
}
