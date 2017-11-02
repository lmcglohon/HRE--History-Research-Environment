package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.historyresearchenvironment.usergui.utils.Geocoder;

public class LocationWithGeocoding {
	private Table table;

	public LocationWithGeocoding() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {

		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn tblclmnLocation = new TableColumn(table, SWT.NONE);
		tblclmnLocation.setWidth(219);
		tblclmnLocation.setText("Location");

		TableColumn tblclmnCoordinates = new TableColumn(table, SWT.NONE);
		tblclmnCoordinates.setWidth(225);
		tblclmnCoordinates.setText("Coordinates");

		Geocoder geocoder = new Geocoder();

		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Oslo", geocoder.geocode("Oslo") });

		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Skive", geocoder.geocode("Skive") });

		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Vejby", geocoder.geocode("Vejby") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Adelaide", geocoder.geocode("Adelaide") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Hereford", geocoder.geocode("Hereford") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Hendon", geocoder.geocode("Hendon") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Agger", geocoder.geocode("Agger") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Aggersborg", geocoder.geocode("Aggersborg") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Thorup, Aggersborg", geocoder.geocode("Thorup, Aggersborg") });
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

}
