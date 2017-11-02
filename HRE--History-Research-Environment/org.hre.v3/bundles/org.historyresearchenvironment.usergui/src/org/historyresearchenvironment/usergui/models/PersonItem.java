/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author Michael Erichsen
 *
 */
public class PersonItem extends AbstractHreItem {
	protected String name;
	protected int perNo;
	protected String pBirth;
	protected String pDeath;
	protected int father;
	protected int mother;

	/**
	 * 
	 */
	public PersonItem() {
	}

	/**
	 * @param name
	 * @param perNo
	 * @param pBirth
	 * @param pDeath
	 * @param father
	 * @param mother
	 */
	public PersonItem(String name, int perNo, String pBirth, String pDeath, int father, int mother) {
		super();
		this.name = name;
		this.perNo = perNo;
		this.pBirth = pBirth;
		this.pDeath = pDeath;
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
	 * @return the pBirth
	 */
	public String getPbirth() {
		return pBirth;
	}

	/**
	 * @return the pDeath
	 */
	public String getPdeath() {
		return pDeath;
	}

	/**
	 * @return the perNo
	 */
	public int getPerNo() {
		return perNo;
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

	public void setPbirth(String string) {
		this.pBirth = string;
	}

	/**
	 * @param string
	 */
	public void setPdeath(String string) {
		this.pDeath = string;
	}

	/**
	 * @param perNo
	 *            the perNo to set
	 */
	public void setPerNo(int perNo) {
		this.perNo = perNo;
	}
}