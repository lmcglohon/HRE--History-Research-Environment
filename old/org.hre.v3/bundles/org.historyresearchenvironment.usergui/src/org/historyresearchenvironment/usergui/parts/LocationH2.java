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
import org.eclipse.swt.widgets.Text;
import org.historyresearchenvironment.usergui.models.PlaceNameModel;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class LocationH2 extends AbstractHREGuiPart {
	private Table placeNameTable;
	private TableColumn tblclmnPlacePart;
	private PlaceNameModel placeNameModel;
	private Text messageText;
	private TableColumn tblclmnCoordinates;

	@Override
	protected void callBusinessLayer(int i) {

	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		placeNameTable = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		placeNameTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		placeNameTable.setHeaderVisible(true);
		placeNameTable.setLinesVisible(true);

		tblclmnPlacePart = new TableColumn(placeNameTable, SWT.NONE);
		tblclmnPlacePart.setWidth(266);
		tblclmnPlacePart.setText("Place Part");

		tblclmnCoordinates = new TableColumn(placeNameTable, SWT.NONE);
		tblclmnCoordinates.setWidth(167);
		tblclmnCoordinates.setText("Coordinates");

		messageText = new Text(parent, SWT.BORDER);
		messageText.setEditable(false);
		messageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		TableItem item;
		String placeName;
		// GoogleGeocodingProvider geocoder = new GoogleGeocodingProvider();
		String latLong;

		for (int i = 1; i < 200; i++) {
			try {
				placeNameModel = new PlaceNameModel(i);
				placeName = placeNameModel.getPlaceName();

				if ((placeName != null) && (placeName.equals("") == false)) {
					item = new TableItem(placeNameTable, SWT.NONE);
					item.setText(0, placeName);

					latLong = placeNameModel.getLocationModel().getType9();

					// if (latLong.equals("")) {
					// latLong = geocoder.geocode(placeName);
					// LOGGER.info("Geocoding " + placeName + " as " + latLong);
					// }

					item.setText(1, latLong);
				}

			} catch (final Exception e) {
				LOGGER.info(e.getClass() + " " + e.getMessage());
			}
		}
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}

	@Override
	protected void updateGui() {

	}
}
