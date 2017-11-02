/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael Erichsen
 *
 */
public class AncestorTreeModel1 extends AbstractHreModel {
	public AncestorTreeModel1 parent;
	public List<AncestorTreeModel1> child = new ArrayList<>();
	public int counter;

	/**
	 * 
	 */
	public AncestorTreeModel1() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.historyresearchenvironment.usergui.models.AbstractHreModel#readFromH2(int)
	 */
	@Override
	public void readFromH2(int i) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
