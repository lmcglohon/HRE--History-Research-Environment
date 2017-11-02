package org.historyresearchenvironment.usergui.models;

/**
 * @author michael
 *
 */
public class AncestorTreeModel extends AbstractHreModel {
	protected AncestorVector ancestorItems;
	protected int perNo = 1;

	/**
	 * No arg c:tor
	 */
	public AncestorTreeModel() {
		super();
	}

	/**
	 * One arg c:tor
	 */
	public AncestorTreeModel(int perNo) {
		super();
		setKey(Integer.toString(perNo));
		ancestorItems = new AncestorVector(perNo);
	}

	/**
	 * @param parent
	 * @param children
	 */
	public void addAncestor(int perNo, String name, String sex, int father, int mother) {
		AncestorItem di = new AncestorItem(perNo, name, sex, father, mother);

		if (ancestorItems == null) {
			ancestorItems = new AncestorVector(perNo);
		}
		ancestorItems.add(di);
	}

	/**
	 * @param item
	 */
	public void addAncestor(AncestorItem item) {
		if (ancestorItems == null) {
			ancestorItems = new AncestorVector(item.getPerNo());
		}
		ancestorItems.add(item);
	}

	/**
	 * @return the ancestorItems
	 */
	public AncestorVector getAncestorItems() {
		return ancestorItems;
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
		ancestorItems = new AncestorVector(perNo);
	}

	/**
	 * @param ancestorItems
	 *            the ancestorItems to set
	 */
	public void setAncestorItems(AncestorVector AncestorItems) {
		this.ancestorItems = AncestorItems;
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