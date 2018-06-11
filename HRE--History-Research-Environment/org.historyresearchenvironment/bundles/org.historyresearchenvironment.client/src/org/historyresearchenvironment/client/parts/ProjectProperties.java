package org.historyresearchenvironment.client.parts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.historyresearchenvironment.client.models.ProjectList;
import org.historyresearchenvironment.client.models.ProjectModel;

/**
 * GUI part displaying project properties.
 * 
 * @version 2018-06-11
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ProjectProperties {
	// private static Preferences preferences =
	// InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.client");
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private Table table;
	private int index;

	/**
	 * Constructor
	 *
	 */
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
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

	@Inject
	@Optional
	private void subscribeSelectionIndexTopic(
			@UIEventTopic(org.historyresearchenvironment.client.HreConstants.SELECTION_INDEX_TOPIC) int index) {
		LOGGER.info("Received index " + index);
		this.index = index;
		createItems(table);
	}

	/**
	 * @param table2
	 */
	private void createItems(Table table2) {
		ProjectModel model = ProjectList.getModel(index);

		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Project Name", model.getName() });

		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		tableItem_1.setText(new String[] { "Last Edited", df.format(model.getLastEdited()) });

		TableItem tableItem_4 = new TableItem(table, SWT.NONE);
		tableItem_4.setText(new String[] { "Summary", model.getSummary() });

		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText(new String[] { "Local/Server", model.getLocalServer() });

		TableItem tableItem_3 = new TableItem(table, SWT.NONE);
		tableItem_3.setText(new String[] { "Path", model.getPath() });

	}

}
