package org.historyresearchenvironment.usergui.models;

/**
 * @author michael
 *
 */
public class AncestorItem extends AbstractHreItem {
	private int perNo;
	private String name;
	private String sex;
	private int father;

	private int mother;

	/**
	 * 
	 */
	public AncestorItem() {
		super();
	}

	/**
	 * @param perNo
	 * @param name
	 * @param father
	 * @param mother
	 */
	public AncestorItem(int perNo, String name, String sex, int father, int mother) {
		super();
		this.perNo = perNo;
		this.name = name;
		this.sex = sex;
		this.father = father;
		this.mother = mother;
	}

	/**
	 * @return the perNo
	 */
	public int getPerNo() {
		return perNo;
	}

	/**
	 * @return the father
	 */
	public int getFather() {
		return father;
	}

	/**
	 * @return the mother
	 */
	public int getMother() {
		return mother;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param perNo
	 *            the perNo to set
	 */
	public void setPerNo(int perNo) {
		this.perNo = perNo;
	}

	/**
	 * @param father
	 *            the father to set
	 */
	public void setFather(int father) {
		this.father = father;
	}

	/**
	 * @param mother
	 *            the mother to set
	 */
	public void setMother(int mother) {
		this.mother = mother;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
}
