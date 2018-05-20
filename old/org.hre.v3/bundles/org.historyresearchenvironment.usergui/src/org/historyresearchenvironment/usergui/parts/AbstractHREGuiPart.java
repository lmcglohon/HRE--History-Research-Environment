/**
 * 
 */
package org.historyresearchenvironment.usergui.parts;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;
import org.historyresearchenvironment.usergui.clientinterface.BusinessLayerInterface;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public abstract class AbstractHREGuiPart {
	@Inject
	protected IEventBroker eventBroker;
	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	protected ScopedPreferenceStore store;
	protected BusinessLayerInterface bli;
	protected ServerRequest req;
	protected ServerResponse resp;

	/**
	 * @param i
	 */
	protected abstract void callBusinessLayer(int i);

	/**
	 * @param parent
	 * @return
	 */
	protected Font getHreFont(Composite parent) {
		LOGGER.fine("Get HRE Font");
		Font font;

		try {
			store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
			final String s = store.getString("HREFONT");

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
