/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author michael
 *
 */
public class PersonalRelativesItem extends AbstractHreModel {
	private String name;
	private String relationship;
	private String sex;
	private String lifespan;
	private String gen;
	private String children;

	/**
	 * @param name
	 * @param relationship
	 * @param sex
	 * @param lifespan
	 * @param gen
	 * @param children
	 */
	public PersonalRelativesItem(String name, String relationship, String sex, String lifespan, String gen,
			String children) {
		this.name = name;
		this.relationship = relationship;
		this.sex = sex;
		this.lifespan = lifespan;
		this.gen = gen;
		this.children = children;
	}

	/**
	 * @return the children
	 */
	public String getChildren() {
		return children;
	}

	/**
	 * @return the gen
	 */
	public String getGen() {
		return gen;
	}

	/**
	 * @return the lifespan
	 */
	public String getLifespan() {
		return lifespan;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	public String[] getStrings() {
		String[] sa = new String[6];
		sa[0] = name;
		sa[1] = relationship;
		sa[2] = sex;
		sa[3] = lifespan;
		sa[4] = gen;
		sa[5] = children;

		return sa;
	}

	@Override
	public void readFromH2(int i) {
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(String children) {
		this.children = children;
	}

	/**
	 * @param gen
	 *            the gen to set
	 */
	public void setGen(String gen) {
		this.gen = gen;
	}

	/**
	 * @param lifespan
	 *            the lifespan to set
	 */
	public void setLifespan(String lifespan) {
		this.lifespan = lifespan;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param relationship
	 *            the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
}
