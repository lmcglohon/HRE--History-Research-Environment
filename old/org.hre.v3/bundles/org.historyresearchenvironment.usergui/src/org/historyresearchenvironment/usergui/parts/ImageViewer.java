/**
 * 
 */
package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.ResourceManager;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ImageViewer extends AbstractHREGuiPart {
	private Image i;

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
		parent.setLayout(new GridLayout(1, false));

		final CLabel lblNewLabel = new CLabel(parent, SWT.NONE);
		lblNewLabel
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "pictures/UK.jpg"));
		final CLabel lblNewLabel2 = new CLabel(parent, SWT.NONE);
		lblNewLabel2.setText("The Church of St Christopher at Willingale Doe, Essex.\r\n"
				+ "Frederick and Charlotte Davis ran the school attached\r\n" + "to the church");
		lblNewLabel2.setFont(getHreFont(parent));
	}

	@PreDestroy
	public void dispose() {
		i.dispose();
	}

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
