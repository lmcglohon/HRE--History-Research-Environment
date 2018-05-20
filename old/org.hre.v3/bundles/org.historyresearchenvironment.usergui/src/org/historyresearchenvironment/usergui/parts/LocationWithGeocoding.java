package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.historyresearchenvironment.usergui.providers.GoogleGeocodingProvider;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class LocationWithGeocoding {
	private Table table;

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {

		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		final TableColumn tblclmnLocation = new TableColumn(table, SWT.NONE);
		tblclmnLocation.setWidth(219);
		tblclmnLocation.setText("Location");

		final TableColumn tblclmnCoordinates = new TableColumn(table, SWT.NONE);
		tblclmnCoordinates.setWidth(225);
		tblclmnCoordinates.setText("Coordinates");

		final GoogleGeocodingProvider googleGeocodingProvider = new GoogleGeocodingProvider();

		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Oslo", googleGeocodingProvider.geocode("Oslo") });

		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Skive", googleGeocodingProvider.geocode("Skive") });

		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Vejby", googleGeocodingProvider.geocode("Vejby") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Adelaide", googleGeocodingProvider.geocode("Adelaide") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Hereford", googleGeocodingProvider.geocode("Hereford") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Hendon", googleGeocodingProvider.geocode("Hendon") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Agger", googleGeocodingProvider.geocode("Agger") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Aggersborg", googleGeocodingProvider.geocode("Aggersborg") });
		tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] { "Thorup, Aggersborg", googleGeocodingProvider.geocode("Thorup, Aggersborg") });
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

}
