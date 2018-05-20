package org.historyresearchenvironment.usergui.models;

import java.util.Vector;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class DescendantModel extends AbstractHreModel {
	private int current;
	private String name;
	private Vector<Integer> children;

	/**
	 * 
	 */
	public DescendantModel() {
		super();
	}

	/**
	 * @param current
	 * @param children
	 */
	public DescendantModel(int current, Vector<Integer> children) {
		super();
		this.current = current;
		this.children = children;
	}

	/**
	 * @return the children
	 */
	public Vector<Integer> getChildren() {
		return children;
	}

	/**
	 * @return the current
	 */
	public int getCurrent() {
		return current;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(Vector<Integer> children) {
		this.children = children;
	}

	/**
	 * @param current
	 *            the current to set
	 */
	public void setCurrent(int current) {
		this.current = current;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
