/**
 * 
 */
package org.historyresearchenvironment.usergui.zesttest;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.swt.graphics.Image;

public class NodeFigure extends ImageFigure {
	private String text;

	public NodeFigure(Image image, String text) {
		super(image);
		this.text = text;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawText(text, super.getLocation().x + 80, super.getLocation().y + 40);
	}

}
