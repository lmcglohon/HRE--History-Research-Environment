/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

/**
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class PolRegModel {
	private String id;
	private String registerblad_id;
	private String firstnames;
	private String person_type;
	private String lastname;
	private String birthplace;
	private String dateofbirth;
	private String dateofdeath;

	/**
	 * 
	 */
	public PolRegModel() {
		id = "";
		registerblad_id = "";
		firstnames = "";
		person_type = "";
		lastname = "";
		birthplace = "";
		dateofbirth = "";
		dateofdeath = "";
	}

	/**
	 * @param id
	 * @param registerblad_id
	 * @param firstnames
	 * @param person_type
	 * @param lastname
	 * @param birthplace
	 * @param dateofbirth
	 * @param dateofdeath
	 */
	public PolRegModel(String id, String registerblad_id, String firstnames, String person_type, String lastname,
			String birthplace, String dateofbirth, String dateofdeath) {
		super();
		this.id = id;
		this.registerblad_id = registerblad_id;
		this.firstnames = firstnames;
		this.person_type = person_type;
		this.lastname = lastname;
		this.birthplace = birthplace;
		this.dateofbirth = dateofbirth;
		this.dateofdeath = dateofdeath;
	}

	/**
	 * @return the birthplace
	 */
	public String getBirthplace() {
		return birthplace;
	}

	/**
	 * @return the dateofbirth
	 */
	public String getDateofbirth() {
		return dateofbirth;
	}

	/**
	 * @return the dateofdeath
	 */
	public String getDateofdeath() {
		return dateofdeath;
	}

	/**
	 * @return the firstnames
	 */
	public String getFirstnames() {
		return firstnames;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @return the person_type
	 */
	public String getPerson_type() {
		return person_type;
	}

	/**
	 * @return the registerblad_id
	 */
	public String getRegisterblad_id() {
		return registerblad_id;
	}

	/**
	 * @param birthplace
	 *            the birthplace to set
	 */
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	/**
	 * @param dateofbirth
	 *            the dateofbirth to set
	 */
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	/**
	 * @param dateofdeath
	 *            the dateofdeath to set
	 */
	public void setDateofdeath(String dateofdeath) {
		this.dateofdeath = dateofdeath;
	}

	/**
	 * @param firstnames
	 *            the firstnames to set
	 */
	public void setFirstnames(String firstnames) {
		this.firstnames = firstnames;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @param person_type
	 *            the person_type to set
	 */
	public void setPerson_type(String person_type) {
		this.person_type = person_type;
	}

	/**
	 * @param registerblad_id
	 *            the registerblad_id to set
	 */
	public void setRegisterblad_id(String registerblad_id) {
		this.registerblad_id = registerblad_id;
	}
}
