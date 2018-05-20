/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class FamilySearchModel {
	private String name;
	private String gender;
	private String birthDate;
	private String birthPlace;
	private String deathDate;
	private String deathPlace;
	private String afn;

	/**
	 * 
	 */
	public FamilySearchModel() {
		super();
		name = "";
		gender = "";
		birthDate = "";
		birthPlace = "";
		deathDate = "";
		deathPlace = "";
		afn = "";
	}

	/**
	 * @return the afn
	 */
	public String getAfn() {
		return afn;
	}

	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @return the birthPlace
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * @return the deathDate
	 */
	public String getDeathDate() {
		return deathDate;
	}

	/**
	 * @return the deathPlace
	 */
	public String getDeathPlace() {
		return deathPlace;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param afn
	 *            the afn to set
	 */
	public void setAfn(String afn) {
		this.afn = afn;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @param birthPlace
	 *            the birthPlace to set
	 */
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	/**
	 * @param deathDate
	 *            the deathDate to set
	 */
	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}

	/**
	 * @param deathPlace
	 *            the deathPlace to set
	 */
	public void setDeathPlace(String deathPlace) {
		this.deathPlace = deathPlace;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
