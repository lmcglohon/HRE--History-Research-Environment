package org.historyresearchenvironment.usergui.models;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class AncestorModel extends AbstractHreModel {
	private int perNo;
	private String name;
	private String sex;
	private int father;
	private int mother;

	/**
	 * 
	 */
	public AncestorModel() {
		super();
	}

	/**
	 * @param perNo
	 * @param name
	 * @param father
	 * @param mother
	 */
	public AncestorModel(int perNo, String name, String sex, int father, int mother) {
		super();
		this.perNo = perNo;
		this.name = name;
		this.sex = sex;
		this.father = father;
		this.mother = mother;
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
	 * @return the perNo
	 */
	public int getPerNo() {
		return perNo;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
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
	 * @param perNo
	 *            the perNo to set
	 */
	public void setPerNo(int perNo) {
		this.perNo = perNo;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
}
