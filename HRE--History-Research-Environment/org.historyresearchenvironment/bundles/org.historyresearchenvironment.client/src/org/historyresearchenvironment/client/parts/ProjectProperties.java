package org.historyresearchenvironment.client.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

/**
 * @version 2018-06-10
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ProjectProperties {
	private Table table;

	public ProjectProperties() {
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

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnProjectName = tableViewerColumn.getColumn();
		tblclmnProjectName.setToolTipText("Property");
		tblclmnProjectName.setWidth(100);
		tblclmnProjectName.setText("Property");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnLastEdited = tableViewerColumn_1.getColumn();
		tblclmnLastEdited.setToolTipText("Value");
		tblclmnLastEdited.setWidth(800);
		tblclmnLastEdited.setText("Value");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] {"Project Name", "HRE"});
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText(new String[] {"Last Edited", "2018-06-10 10:49:23"});
		
		TableItem tableItem_4 = new TableItem(table, SWT.NONE);
		tableItem_4.setText(new String[] {"Summary", "This is the default project provided with the application"});
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText(new String[] {"Local/Server", "LOCAL"});
		
		TableItem tableItem_3 = new TableItem(table, SWT.NONE);
		tableItem_3.setText(new String[] {"Path", "c:/temp/HRE"});
		
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO Set the focus to control
	}

}
