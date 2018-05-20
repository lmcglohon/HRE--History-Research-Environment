/**
 * 
 */
package org.historyresearchenvironment.usergui.providers;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.historyresearchenvironment.usergui.models.ZestPersonNode;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class ZestNodeContentProvider extends ArrayContentProvider implements IGraphEntityContentProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.zest.core.viewers.IGraphEntityContentProvider#getConnectedTo(java
	 * .lang.Object)
	 */
	@Override
	public Object[] getConnectedTo(Object entity) {
		if (entity instanceof ZestPersonNode) {
			final ZestPersonNode node = (ZestPersonNode) entity;
			return node.getConnectedTo().toArray();
		}
		throw new RuntimeException("Type not supported");
	}

}
