package org.historyresearchenvironment.usergui.providers;

import java.util.Vector;

import org.historyresearchenvironment.usergui.models.DescendantModel;
import org.historyresearchenvironment.usergui.models.DescendantVector;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class DescendantTreeProvider extends AbstractHreProvider {
	protected DescendantVector descendantItems;
	protected int perNo = 1;

	/**
	 * No arg c:tor
	 */
	public DescendantTreeProvider() {
		super();
	}

	/**
	 * One arg c:tor
	 */
	public DescendantTreeProvider(int perNo) {
		super();
		setKey(Integer.toString(perNo));
		descendantItems = new DescendantVector(conn, perNo);
	}

	/**
	 * @param parent
	 * @param children
	 */
	public void addDescendant(int perNo, Vector<Integer> children) {
		final DescendantModel di = new DescendantModel(perNo, children);

		if (descendantItems == null) {
			descendantItems = new DescendantVector(conn, perNo);
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
	 * org.historyresearchenvironment.usergui.models.AbstractHreProvider#readFromH2(
	 * int)
	 */
	@Override
	public void readFromH2(int i) {
		descendantItems = new DescendantVector(conn, perNo);
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
		descendantItems = new DescendantVector(conn, perNo);
	}

}
