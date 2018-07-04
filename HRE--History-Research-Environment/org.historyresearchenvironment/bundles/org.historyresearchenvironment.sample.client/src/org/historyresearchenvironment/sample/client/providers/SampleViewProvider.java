package org.historyresearchenvironment.sample.client.providers;

import java.sql.SQLException;

import org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider;
import org.historyresearchenvironment.sample.dataaccess.SampleView;

/**
 * @version 2018-07-03
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleViewProvider extends AbstractHreProvider {
	private int SubstnParamName;
	private String DefltValue;

	/**
	 * Constructor
	 * 
	 */
	public SampleViewProvider() {
		super();
	}

	/**
	 * @return the defltValue
	 */
	public String getDefltValue() {
		return DefltValue;
	}

	/**
	 * @return the substnParamName
	 */
	public int getSubstnParamName() {
		return SubstnParamName;
	}

	/**
	 * @param defltValue
	 *            the defltValue to set
	 */
	public void setDefltValue(String defltValue) {
		DefltValue = defltValue;
	}

	/**
	 * @param substnParamName
	 *            the substnParamName to set
	 */
	public void setSubstnParamName(int substnParamName) {
		SubstnParamName = substnParamName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider#
	 * readFromH2(int)
	 */
	@Override
	public void readFromH2(int i) {

		try {
			SampleView accessor = new SampleView();
			setSubstnParamName(accessor.getSubstnParamNamePid());
			setDefltValue(accessor.getDefltValue());
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());

		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());

		}

	}
}
