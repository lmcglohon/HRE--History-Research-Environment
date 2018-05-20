package org.historyresearchenvironment.usergui.providers;

import org.historyresearchenvironment.usergui.models.AncestorModel;
import org.historyresearchenvironment.usergui.models.AncestorVector;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class AncestorTreeProvider extends AbstractHreProvider {
	protected AncestorVector ancestorItems;
	protected int perNo = 1;

	/**
	 * No arg c:tor
	 */
	public AncestorTreeProvider() {
		super();
	}

	/**
	 * One arg c:tor
	 */
	public AncestorTreeProvider(int perNo) {
		super();
		setKey(Integer.toString(perNo));
		ancestorItems = new AncestorVector(conn, perNo);
	}

	/**
	 * @param item
	 */
	public void addAncestor(AncestorModel item) {
		if (ancestorItems == null) {
			ancestorItems = new AncestorVector(conn, item.getPerNo());
		}
		ancestorItems.add(item);
	}

	/**
	 * @param parent
	 * @param children
	 */
	public void addAncestor(int perNo, String name, String sex, int father, int mother) {
		final AncestorModel di = new AncestorModel(perNo, name, sex, father, mother);

		if (ancestorItems == null) {
			ancestorItems = new AncestorVector(conn, perNo);
		}
		ancestorItems.add(di);
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
	 * org.historyresearchenvironment.usergui.models.AbstractHreProvider#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {
		ancestorItems = new AncestorVector(conn, perNo);
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
		ancestorItems = new AncestorVector(conn, perNo);
	}
}