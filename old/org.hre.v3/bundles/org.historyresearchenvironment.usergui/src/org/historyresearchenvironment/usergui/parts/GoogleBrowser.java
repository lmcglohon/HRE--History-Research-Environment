package org.historyresearchenvironment.usergui.parts;

import java.net.URLEncoder;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class GoogleBrowser extends AbstractHREGuiPart {

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
	 * @param parent
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		LOGGER.info("Part");

		try {
			final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
					"org.historyresearchenvironment.usergui");

			parent.setLayout(new GridLayout(2, false));
			final Browser browser = new Browser(parent, SWT.NONE);
			browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
			LOGGER.info("Browser Type: " + browser.getBrowserType());

			final String searchArgument = store.getString("PERNAME");
			LOGGER.fine("Search Argument: " + searchArgument);

			final String googleUrl = "https://www.google.com/search?q=" + URLEncoder.encode(searchArgument, "UTF-8");
			browser.setUrl(googleUrl);
			LOGGER.info("Url: " + googleUrl);
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	@Focus
	public void onFocus() {
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