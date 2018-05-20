package org.historyresearchenvironment.usergui.parts;

import java.net.URLEncoder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class PolRegBrowser extends AbstractHREGuiPart {
	private final String URL = "http://www.politietsregisterblade.dk/component/sfup/?controller=politregisterblade&task=viewRegisterblad&id=";
	String searchArgument;

	/**
	 * No arg c:tor
	 */
	public PolRegBrowser() {
		store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
	}

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
		try {
			parent.setLayout(new GridLayout(1, false));
			final Browser browser = new Browser(parent, SWT.NONE);
			browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
			searchArgument = store.getString("POLREGID");
			final String polRegUrl = URL + URLEncoder.encode(searchArgument, "UTF-8");
			browser.setUrl(polRegUrl);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	@PreDestroy
	public void dispose() {
	}

	/**
	 * 
	 */
	@Focus
	public void setFocus() {
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
