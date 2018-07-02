package org.historyresearchenvironment.client.parts;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;
import org.historyresearchenvironment.client.serverinterface.BusinessLayerInterface;
import org.historyresearchenvironment.server.ServerRequest;
import org.historyresearchenvironment.server.ServerResponse;
import org.osgi.service.prefs.Preferences;

/**
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public abstract class AbstractHreGuiPart {
	protected static Preferences preferences = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment");

	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Inject
	protected IEventBroker eventBroker;
	protected BusinessLayerInterface bli;
	protected ServerRequest req;
	protected ServerResponse resp;

	/**
	 * @param key
	 */
	protected abstract void callBusinessLayer(int key);

	/**
	 * @param parent
	 * @return
	 */
	protected Font getHreFont(Composite parent) {
		LOGGER.fine("Get HRE Font");
		Font font;

		try {
			final String s = preferences.get("HREFONT",
					"1|Segoe UI|12.0|0|WINDOWS|1|-16|0|0|0|400|0|0|0|0|3|2|1|34|Segoe UI");

			LOGGER.fine(s);
			final String[] sa = s.split("-");
			for (int i = 0; i < sa.length; i++) {
				LOGGER.fine("sa[" + i + "]: " + sa[i]);
			}
			final String[] sb = sa[0].split("\\|");
			for (int i = 0; i < sb.length; i++) {
				LOGGER.fine("sb[" + i + "]: " + sb[i]);
			}
			LOGGER.fine("HRE font: " + sb[1] + " " + Math.round(Double.valueOf(sb[2])) + " " + sb[3]);
			font = SWTResourceManager.getFont(sb[1], (int) Math.round(Double.valueOf(sb[2])), Integer.parseInt(sb[3]));
		} catch (final NumberFormatException e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			e.printStackTrace();

			font = parent.getShell().getFont();
			final FontData fd = font.getFontData()[0];
			font = SWTResourceManager.getFont(fd.getName(), 12, fd.getStyle());
		}
		return font;
	}

	/**
	 * 
	 */
	protected abstract void updateGui();

}
