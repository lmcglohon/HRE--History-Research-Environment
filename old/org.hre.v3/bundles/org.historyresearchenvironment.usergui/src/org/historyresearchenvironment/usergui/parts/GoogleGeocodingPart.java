package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.providers.GoogleGeocodingProvider;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class GoogleGeocodingPart extends AbstractHREGuiPart {
	private Text textLocation;
	private Text textCoordinates;
	private GoogleGeocodingProvider geocoder;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int i) {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		parent.setFont(getHreFont(parent));

		final Label lblLocation = new Label(parent, SWT.NONE);
		lblLocation.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblLocation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblLocation.setText("Location");

		textLocation = new Text(parent, SWT.BORDER);
		textLocation.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		textLocation.setText("None");
		textLocation.setEditable(false);
		textLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblCoordinates = new Label(parent, SWT.NONE);
		lblCoordinates.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblCoordinates.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCoordinates.setText("Coordinates");

		textCoordinates = new Text(parent, SWT.BORDER);
		textCoordinates.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		textCoordinates.setEditable(false);
		textCoordinates.setText("0, 0");
		textCoordinates.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNewLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblNewLabel.setText("Coordinates are copied to the clipboard");
	}

	/**
	 * @param s
	 */
	@Inject
	@Optional
	private void subscribePersonUpdateTopic(@UIEventTopic(HreEventConstants.LOCATION_UPDATE_TOPIC) String city) {
		geocoder = new GoogleGeocodingProvider();
		final String coordinates = geocoder.geocode(city);
		textLocation.setText(city);
		textCoordinates.setText(coordinates);

		final Display display = Display.getDefault();
		final Clipboard cb = new Clipboard(display);
		final TextTransfer textTransfer = TextTransfer.getInstance();
		cb.setContents(new Object[] { coordinates }, new Transfer[] { textTransfer });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
	}
}