package org.historyresearchenvironment.usergui.parts;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.models.TMGPlaceModel;
import org.historyresearchenvironment.usergui.providers.TMGPlaceProvider;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TMGPlaceExplorer extends AbstractHREGuiPart {
	private Table tablePlaces;
	private TMGPlaceProvider provider = new TMGPlaceProvider();
	private TableItem tableItem;
	private int recNo;
	private TableViewer tableViewerPlaces;

	/*
	 * Invokes provider to read data from H2, then invokes updateGui().
	 * 
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int i) {
		// TODO Call optionally with HTTP/JSON
		provider.readFromH2(i);
		updateGui();
	}

	/**
	 * Invokes dispose() on provider to disconnect from H2.
	 */
	@PreDestroy
	public void dispose() {
		provider.dispose();
	}

	/**
	 * @param parent
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		parent.setFont(getHreFont(parent));

		final Composite compositePlaces = new Composite(parent, SWT.NONE);
		final GridData gd_compositePlaces = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_compositePlaces.heightHint = 480;
		compositePlaces.setLayoutData(gd_compositePlaces);
		final TableColumnLayout tcl_compositePlaces = new TableColumnLayout();
		compositePlaces.setLayout(tcl_compositePlaces);

		tableViewerPlaces = new TableViewer(compositePlaces, SWT.BORDER | SWT.FULL_SELECTION);
		tablePlaces = tableViewerPlaces.getTable();
		tablePlaces.setFont(getHreFont(parent));
		tablePlaces.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event e) {
				final TableItem[] selection = tablePlaces.getSelection();
				final TableItem ti = selection[0];
				final String string = ti.getText(0);

				if (string.length() > 0) {
					recNo = Integer.parseInt(string);
				} else {
					recNo = 1;
				}
				LOGGER.fine("Record number: " + recNo);
			}
		});
		tablePlaces.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				final String s = provider.getVector().getItem(recNo).toString();
				eventBroker.post(HreEventConstants.LOCATION_UPDATE_TOPIC, s);
				LOGGER.info("City: " + s);
			}
		});
		tablePlaces.setHeaderVisible(true);
		tablePlaces.setLinesVisible(true);

		final TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnRecordNumber = tableViewerColumn.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnRecordNumber, new ColumnPixelData(120, true, true));
		tblclmnRecordNumber.setText(provider.getLabel(0));

		final TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn = tableViewerColumn_1.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn, new ColumnPixelData(120, true, true));
		tblclmnNewColumn.setText(provider.getLabel(1));

		final TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_1 = tableViewerColumn_2.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_1, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_1.setText(provider.getLabel(2));

		final TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_2 = tableViewerColumn_3.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_2, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_2.setText(provider.getLabel(3));

		final TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_3 = tableViewerColumn_4.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_3, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_3.setText(provider.getLabel(4));

		final TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_4 = tableViewerColumn_5.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_4, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_4.setText(provider.getLabel(5));

		final TableViewerColumn tableViewerColumn_6 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_5 = tableViewerColumn_6.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_5, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_5.setText(provider.getLabel(6));

		final TableViewerColumn tableViewerColumn_7 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_6 = tableViewerColumn_7.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_6, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_6.setText(provider.getLabel(7));

		final TableViewerColumn tableViewerColumn_8 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_7 = tableViewerColumn_8.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_7, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_7.setText(provider.getLabel(8));

		final TableViewerColumn tableViewerColumn_9 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_8 = tableViewerColumn_9.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_8, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_8.setText(provider.getLabel(9));

		final TableViewerColumn tableViewerColumn_10 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_9 = tableViewerColumn_10.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_9, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_9.setText(provider.getLabel(10));

		callBusinessLayer(1);
	}

	/**
	 * Called by other parts to request an update.
	 * 
	 * @param perNo
	 */
	@Inject
	@Optional
	private void subscribePersonUpdateTopic(@UIEventTopic(HreEventConstants.PERSON_UPDATE_TOPIC) int perNo) {
		callBusinessLayer(perNo);
	}

	/*
	 * Refreshes GUI with provider data.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
		try {
			final Iterator<TMGPlaceModel> iterator = provider.getVector().iterator();
			tablePlaces.removeAll();

			while (iterator.hasNext()) {
				final TMGPlaceModel tmgPlaceItem = iterator.next();
				tableItem = new TableItem(tablePlaces, SWT.NONE);
				tableItem.setText(0, Integer.toString(tmgPlaceItem.getRecNo()));

				for (int i = 1; i < tmgPlaceItem.getPlaceParts().length; i++) {
					tableItem.setText(i, tmgPlaceItem.getPlacePart(i));
				}
			}
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}
}
