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
import org.historyresearchenvironment.usergui.models.PersonModel;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class PersonDetails {
	private Table table;
	private Table table_1;
	PersonModel perosn = new PersonModel();

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		final GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		gd_table.heightHint = 88;
		gd_table.widthHint = 444;
		table.setLayoutData(gd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		final TableColumn tblclmnType = new TableColumn(table, SWT.NONE);
		tblclmnType.setWidth(100);
		tblclmnType.setText("Type");

		final TableColumn tblclmnName = new TableColumn(table, SWT.NONE);
		tblclmnName.setWidth(138);
		tblclmnName.setText("Name");

		final TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Name", "Niels Jensen (40)" });

		final TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText(new String[] { "Father", "Jens Madsen (80)" });

		final TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText(new String[] { "Mother", "Dorthe J\u00F8rgensdatter (81)" });

		table_1 = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		final GridData gd_table_1 = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		gd_table_1.widthHint = 617;
		table_1.setLayoutData(gd_table_1);
		table_1.setHeaderVisible(true);
		table_1.setLinesVisible(true);

		final TableColumn tblclmnNewColumn = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Type");

		final TableColumn tblclmnNewColumn_1 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("Date");

		final TableColumn tblclmnNewColumn_2 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_2.setWidth(210);
		tblclmnNewColumn_2.setText("Name/Place");

		final TableColumn tblclmnNewColumn_3 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_3.setWidth(48);
		tblclmnNewColumn_3.setText("Age");

		final TableColumn tblclmnNewColumn_4 = new TableColumn(table_1, SWT.CHECK);
		tblclmnNewColumn_4.setWidth(58);
		tblclmnNewColumn_4.setText("Memo");

		final TableColumn tblclmnNewColumn_5 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_5.setWidth(56);
		tblclmnNewColumn_5.setText("Sources");

		final TableItem tableItem_3 = new TableItem(table_1, SWT.NONE);
		tableItem_3.setText(new String[] { "Relation", "", "G-greatgrandfather of Michael Erichsen" });

		final TableItem tableItem_4 = new TableItem(table_1, SWT.NONE);
		tableItem_4.setText(new String[] { "Born", "23 Nov 1791", "Asn\u00E6s", "0" });

		final TableItem tableItem_5 = new TableItem(table_1, SWT.NONE);
		tableItem_5.setText(new String[] { "Baptized", "27 Nov 1791", "Asn\u00E6s", "0" });

		final TableItem tableItem_6 = new TableItem(table_1, SWT.NONE);
		tableItem_6.setText(new String[] { "Census", "1801", "(w) Jens Madsen & Dorthe J\u00F8rgensdatter", "~10" });

		final TableItem tableItem_7 = new TableItem(table_1, SWT.NONE);
		tableItem_7.setText(new String[] { "Graduated", "1812", "Jonstrup Seminarium", "~21" });

		final TableItem tableItem_8 = new TableItem(table_1, SWT.NONE);
		tableItem_8.setText(new String[] { "Occupation", "1812", "l\u00E6rer i Herrestrup", "~21" });

		final TableItem tableItem_9 = new TableItem(table_1, SWT.NONE);
		tableItem_9.setText(new String[] { "Occupation", "1812", "Private teacher at", "~21" });

		final TableItem tableItem_10 = new TableItem(table_1, SWT.NONE);
		tableItem_10.setText(new String[] { "Occupation", "1814", "Teacher i Nex\u00F8", "~23" });

	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

}
