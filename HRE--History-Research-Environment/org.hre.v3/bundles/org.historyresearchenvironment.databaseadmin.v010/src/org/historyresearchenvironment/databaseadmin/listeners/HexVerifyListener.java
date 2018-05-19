package org.historyresearchenvironment.databaseadmin.listeners;

import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;

/**
 * Limit input to valid hex characters
 * 
 * @version 2018-05-19
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HexVerifyListener implements VerifyListener {
	public void verifyText(VerifyEvent event) {
		String text = event.text.toUpperCase();
		if (!text.matches("[0-9A-F]*")) {
			event.doit = false;
		}
		event.text = text;
	}
}