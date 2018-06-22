package org.historyresearchenvironment.client.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

/**
 * Deprecated.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class GUI_ProjectOpenDialog extends Dialog {
	private Table table;
	private Text text;
	private Text text_1;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public GUI_ProjectOpenDialog(Shell parentShell) {
		super(parentShell);
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Open Project");
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(3, false));

		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		final Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));

		final Button buttonO = new Button(composite, SWT.NONE);
		buttonO.setText("O");

		final Button buttonR = new Button(composite, SWT.NONE);
		buttonR.setText("R");

		final Button buttonC = new Button(composite, SWT.NONE);
		buttonC.setText("C");

		final Button buttonQuestionMark = new Button(composite, SWT.NONE);
		buttonQuestionMark.setText("?");

		final Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Server");

		final ComboViewer comboViewer = new ComboViewer(container, SWT.NONE);
		final Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		combo.setText("This Computer");

		final Button btnLogon = new Button(container, SWT.NONE);
		btnLogon.setText("Login");

		final Label lblNewLabel_1 = new Label(container, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1));
		lblNewLabel_1.setText("Recent Projects");

		final Label lblNewLabel_2 = new Label(container, SWT.NONE);
		lblNewLabel_2.setText("If not logged in");

		final TableViewer tableViewer = new TableViewer(container, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		final GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		gd_table.widthHint = 676;
		table.setLayoutData(gd_table);
		table.setHeaderVisible(true);

		final TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		final TableColumn tblclmnProjectName = tableViewerColumn.getColumn();
		tblclmnProjectName.setWidth(200);
		tblclmnProjectName.setText("Project Name");

		final TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		final TableColumn tblclmnLastEdited = tableViewerColumn_1.getColumn();
		tblclmnLastEdited.setWidth(200);
		tblclmnLastEdited.setText("Last Edited");

		final TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Drummond-UK", "2017-06-19" });

		final TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText(new String[] { "Drummond-US", "2012-04-08" });

		final TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText(new String[] { "Mitchell", "2003-10-10" });

		final Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		composite_1.setLayout(new FillLayout(SWT.VERTICAL));

		final Button buttonDefault = new Button(composite_1, SWT.RADIO);
		buttonDefault.setText("Use server default project folder");
		buttonDefault.setSelection(true);

		final Button buttonBrowse = new Button(composite_1, SWT.RADIO);
		buttonBrowse.setText("Browse for project folder");

		text = new Text(container, SWT.BORDER);
		text.setText("D:/History/Drummond");
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

		final Label label = new Label(container, SWT.NONE);
		label.setText("Project Name");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		text_1 = new Text(container, SWT.BORDER);
		text_1.setText("Drummond-UK");
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

		final Button button_6 = new Button(container, SWT.NONE);
		button_6.setText("Summary");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		return container;
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(703, 409);
	}
}
