package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class SiblingsTable {
	private Table table;

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		final TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Born");

		final TableColumn tblclmnDied = new TableColumn(table, SWT.NONE);
		tblclmnDied.setWidth(100);
		tblclmnDied.setText("Died");

		final TableColumn tblclmnChildren = new TableColumn(table, SWT.NONE);
		tblclmnChildren.setMoveable(true);
		tblclmnChildren.setWidth(100);
		tblclmnChildren.setText("Siblings: 7");

		final TableColumn tblclmnSex = new TableColumn(table, SWT.NONE);
		tblclmnSex.setWidth(100);
		tblclmnSex.setText("Sex");

		final TableColumn tblclmnPartner = new TableColumn(table, SWT.NONE);
		tblclmnPartner.setWidth(100);
		tblclmnPartner.setText("Partner");

		final TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "1794", "1820", "Karen Jensdatter (1713)", "F", "Christen Pedersen (7085)" });
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

}
