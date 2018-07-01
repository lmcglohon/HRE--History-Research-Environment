package org.historyresearchenvironment.sample.models;

/**
 * Model representing data in the sample view part.
 * 
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleViewModel {
	private int SubstnParamNamePid;
	private String DefltValue;

	/**
	 * Constructor
	 *
	 */
	public SampleViewModel() {
	}

	/**
	 * Constructor
	 *
	 * @param substnParamNamePid
	 * @param defltValue
	 */
	public SampleViewModel(int substnParamNamePid, String defltValue) {
		super();
		SubstnParamNamePid = substnParamNamePid;
		DefltValue = defltValue;
	}

	/**
	 * @return the defltValue
	 */
	public String getDefltValue() {
		return DefltValue;
	}

	/**
	 * @return the substnParamNamePid
	 */
	public int getSubstnParamNamePid() {
		return SubstnParamNamePid;
	}

	/**
	 * @param defltValue
	 *            the defltValue to set
	 */
	public void setDefltValue(String defltValue) {
		DefltValue = defltValue;
	}

	/**
	 * @param substnParamNamePid
	 *            the substnParamNamePid to set
	 */
	public void setSubstnParamNamePid(int substnParamNamePid) {
		SubstnParamNamePid = substnParamNamePid;
	}

}
