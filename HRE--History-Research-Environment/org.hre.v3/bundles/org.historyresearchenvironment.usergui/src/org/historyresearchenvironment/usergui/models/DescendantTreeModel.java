package org.historyresearchenvironment.usergui.models;

import java.util.Vector;

/**
 * @author michael
 *
 */
public class DescendantTreeModel extends AbstractHreModel {
	protected DescendantVector descendantItems;
	protected int perNo = 1;

	/**
	 * No arg c:tor
	 */
	public DescendantTreeModel() {
		super();
	}

	/**
	 * One arg c:tor
	 */
	public DescendantTreeModel(int perNo) {
		super();
		setKey(Integer.toString(perNo));
		descendantItems = new DescendantVector(perNo);
	}

	/**
	 * @param parent
	 * @param children
	 */
	public void addDescendant(int perNo, Vector<Integer> children) {
		DescendantItem di = new DescendantItem(perNo, children);

		if (descendantItems == null) {
			descendantItems = new DescendantVector(perNo);
		}
		descendantItems.add(di);
	}

	/**
	 * @return the descendantItems
	 */
	public DescendantVector getDescendantItems() {
		return descendantItems;
	}

	/**
	 * @return the perNo
	 */
	public int getPerNo() {
		return perNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.models.AbstractHreModel#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {
		descendantItems = new DescendantVector(perNo);
	}

	/**
	 * @param descendantItems
	 *            the descendantItems to set
	 */
	public void setDescendantItems(DescendantVector descendantItems) {
		this.descendantItems = descendantItems;
	}

	/**
	 * @param perNo
	 *            the perNo to set
	 */
	public void setPerNo(int perNo) {
		this.perNo = perNo;
		setKey(Integer.toString(perNo));
	}

}
