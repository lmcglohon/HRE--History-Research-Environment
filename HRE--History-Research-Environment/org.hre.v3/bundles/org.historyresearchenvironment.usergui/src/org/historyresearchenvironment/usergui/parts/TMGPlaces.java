
package org.historyresearchenvironment.usergui.parts;

import java.util.Iterator;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.models.TMGPlaceItem;
import org.historyresearchenvironment.usergui.models.TMGPlaceModel;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

/**
 * @author Michael Erichsen
 *
 */
public class TMGPlaces extends AbstractHREGuiPart {
	private Table tablePlaces;
	private TMGPlaceModel model;
	private TableItem tableItem;
	private int recNo;

	@PostConstruct
	public void postConstruct(Composite parent) {
		model = new TMGPlaceModel();

		parent.setLayout(new GridLayout(1, false));

		final Composite compositePlaces = new Composite(parent, SWT.NONE);
		final GridData gd_compositePlaces = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_compositePlaces.heightHint = 480;
		compositePlaces.setLayoutData(gd_compositePlaces);
		final TableColumnLayout tcl_compositePlaces = new TableColumnLayout();
		compositePlaces.setLayout(tcl_compositePlaces);

		final TableViewer tableViewerPlaces = new TableViewer(compositePlaces, SWT.BORDER | SWT.FULL_SELECTION);
		tablePlaces = tableViewerPlaces.getTable();
		tablePlaces.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event e) {
				TableItem[] selection = tablePlaces.getSelection();
				TableItem ti = selection[0];
				String string = ti.getText(0);

				if (string.length() > 0) {
					recNo = Integer.parseInt(string);
				} else {
					recNo = 1;
				}
				LOGGER.info("Record number: " + recNo);
			}
		});
		tablePlaces.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				String s = model.getVector().getItem(recNo).toString();
				eventBroker.post(HreEventConstants.LOCATION_UPDATE_TOPIC, s);
				LOGGER.info("City: " + s);
			}
		});
		tablePlaces.setHeaderVisible(true);
		tablePlaces.setLinesVisible(true);

		final TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnRecordNumber = tableViewerColumn.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnRecordNumber, new ColumnPixelData(120, true, true));
		tblclmnRecordNumber.setText(model.getLabel(0));

		final TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn = tableViewerColumn_1.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn, new ColumnPixelData(120, true, true));
		tblclmnNewColumn.setText(model.getLabel(1));

		final TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_1 = tableViewerColumn_2.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_1, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_1.setText(model.getLabel(2));

		final TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_2 = tableViewerColumn_3.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_2, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_2.setText(model.getLabel(3));

		final TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_3 = tableViewerColumn_4.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_3, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_3.setText(model.getLabel(4));

		final TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_4 = tableViewerColumn_5.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_4, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_4.setText(model.getLabel(5));

		final TableViewerColumn tableViewerColumn_6 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_5 = tableViewerColumn_6.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_5, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_5.setText(model.getLabel(6));

		final TableViewerColumn tableViewerColumn_7 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_6 = tableViewerColumn_7.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_6, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_6.setText(model.getLabel(7));

		final TableViewerColumn tableViewerColumn_8 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_7 = tableViewerColumn_8.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_7, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_7.setText(model.getLabel(8));

		final TableViewerColumn tableViewerColumn_9 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_8 = tableViewerColumn_9.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_8, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_8.setText(model.getLabel(9));

		final TableViewerColumn tableViewerColumn_10 = new TableViewerColumn(tableViewerPlaces, SWT.NONE);
		final TableColumn tblclmnNewColumn_9 = tableViewerColumn_10.getColumn();
		tcl_compositePlaces.setColumnData(tblclmnNewColumn_9, new ColumnPixelData(120, true, true));
		tblclmnNewColumn_9.setText(model.getLabel(10));

		callBusinessLayer(1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int i) {
		// TODO Call optionally with HTTP/JSON
		model.readFromH2(i);
		updateGui();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
		try {
			Iterator<TMGPlaceItem> iterator = model.getVector().iterator();
			tablePlaces.removeAll();

			while (iterator.hasNext()) {
				TMGPlaceItem tmgPlaceItem = (TMGPlaceItem) iterator.next();
				tableItem = new TableItem(tablePlaces, SWT.NONE);
				tableItem.setText(0, Integer.toString(tmgPlaceItem.getRecNo()));

				for (int i = 1; i < tmgPlaceItem.getPlaceParts().length; i++) {
					tableItem.setText(i, tmgPlaceItem.getPlacePart(i));
				}
			}
		} catch (Exception e) {
			LOGGER.severe(e.getMessage());
		}
	}
}
