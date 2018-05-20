/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.util.ArrayList;
import java.util.List;

import org.historyresearchenvironment.usergui.providers.AbstractHreProvider;

/**
 * @author Michael Erichsen, &copy; HRE Ltd. Erichsen
 *
 */
public class AncestorTreeModel1 extends AbstractHreProvider {
	public AncestorTreeModel1 parent;
	public List<AncestorTreeModel1> child = new ArrayList<>();
	public int counter;

	/**
	 * 
	 */
	public AncestorTreeModel1() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.models.AbstractHreProvider#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}
