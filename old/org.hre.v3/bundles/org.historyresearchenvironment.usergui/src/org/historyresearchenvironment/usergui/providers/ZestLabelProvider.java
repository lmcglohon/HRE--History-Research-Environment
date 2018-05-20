/**
 * 
 */
package org.historyresearchenvironment.usergui.providers;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.zest.core.viewers.IEntityStyleProvider;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.historyresearchenvironment.usergui.models.ZestPersonConnection;
import org.historyresearchenvironment.usergui.models.ZestPersonNode;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class ZestLabelProvider extends LabelProvider implements IEntityStyleProvider, IConnectionStyleProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IEntityStyleProvider#fisheyeNode(java.lang.
	 * Object)
	 */
	@Override
	public boolean fisheyeNode(Object entity) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IEntityStyleProvider#getBackgroundColour(java.
	 * lang.Object)
	 */
	@Override
	public Color getBackgroundColour(Object entity) {
		if (entity instanceof ZestPersonNode) {
			final Device device = Display.getCurrent();
			final ZestPersonNode node = (ZestPersonNode) entity;

			if (node.getSex() != null) {
				if (node.getSex().equals("M")) {
					return new Color(device, 90, 180, 255);
				} else if (node.getSex().equals("F")) {
					return new Color(device, 255, 180, 90);
				}
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IEntityStyleProvider#getBorderColor(java.lang.
	 * Object)
	 */
	@Override
	public Color getBorderColor(Object entity) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IEntityStyleProvider#getBorderHighlightColor(
	 * java.lang.Object)
	 */
	@Override
	public Color getBorderHighlightColor(Object entity) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IEntityStyleProvider#getBorderWidth(java.lang.
	 * Object)
	 */
	@Override
	public int getBorderWidth(Object entity) {
		return 6;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IConnectionStyleProvider#getColor(java.lang.
	 * Object)
	 */
	@Override
	public Color getColor(Object rel) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IConnectionStyleProvider#getConnectionStyle(
	 * java.lang.Object)
	 */
	@Override
	public int getConnectionStyle(Object rel) {
		return ZestStyles.CONNECTIONS_DIRECTED;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IEntityStyleProvider#getForegroundColour(java.
	 * lang.Object)
	 */
	@Override
	public Color getForegroundColour(Object entity) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IConnectionStyleProvider#getHighlightColor(java
	 * .lang.Object)
	 */
	@Override
	public Color getHighlightColor(Object rel) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object element) {
		Image img;

		if (element instanceof ZestPersonNode) {
			final ZestPersonNode node = (ZestPersonNode) element;

			if (node.getSex() != null) {
				if (node.getSex().equals("M")) {
					img = ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/male.png");
				} else if (node.getSex().equals("F")) {
					img = ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/female.png");
				} else {
					return null;
				}

				final Image image = new Image(img.getDevice(), img.getImageData().scaledTo(50, 36));
				return image;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IConnectionStyleProvider#getLineWidth(java.lang
	 * .Object)
	 */
	@Override
	public int getLineWidth(Object rel) {
		return 6;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IEntityStyleProvider#getNodeHighlightColor(java
	 * .lang.Object)
	 */
	@Override
	public Color getNodeHighlightColor(Object entity) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof ZestPersonNode) {
			final ZestPersonNode node = (ZestPersonNode) element;
			return node.getName();
		}

		if (element instanceof ZestPersonConnection) {
			final ZestPersonConnection connection = (ZestPersonConnection) element;
			return connection.getLabel();
		}

		if (element instanceof EntityConnectionData) {
			return "";
		}
		throw new RuntimeException("Wrong type: " + element.getClass().toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.zest.core.viewers.IEntityStyleProvider#getTooltip(java.lang.
	 * Object)
	 */
	@Override
	public IFigure getTooltip(Object entity) {
		return null;
	}
}
