package org.historyresearchenvironment.databaseadmin.listeners;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * Limit SMALLINT fields to legal values
 * 
 * @version 2018-05-24
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SmallIntListener implements Listener {
	@Override
	public void handleEvent(Event event) {
		Text text = (Text) event.widget;
		String string = text.getText() + event.text;

		try {
			@SuppressWarnings("unused")
			short value = Short.parseShort(string);
		} catch (NumberFormatException e) {
			event.doit = false;
		}
	}
}