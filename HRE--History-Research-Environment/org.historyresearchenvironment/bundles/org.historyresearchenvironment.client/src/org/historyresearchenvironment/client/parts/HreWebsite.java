
package org.historyresearchenvironment.client.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * @version 2018-06-10
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreWebsite {

	/**
	 * Contruct a browser with the HRE web site
	 * 
	 * @param parent
	 */
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		Browser browserHreWebsite = new Browser(parent, SWT.NONE);
		browserHreWebsite.setUrl("https://historyresearchenvironment.org/");
		GridData gd_browserHreWebsite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_browserHreWebsite.widthHint = 1080;
		gd_browserHreWebsite.heightHint = 1920;
		browserHreWebsite.setLayoutData(gd_browserHreWebsite);

	}

}