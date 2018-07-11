package org.historyresearchenvironment.sample.server.providers;

import java.sql.SQLException;

import org.historyresearchenvironment.dataaccess.models.SubstnParamName;
import org.historyresearchenvironment.dataaccess.models.SubstnParamValue;
import org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider;

/**
 * @version 2018-07-07
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleViewProvider extends AbstractHreProvider {
	private String defltValue;
	private short paramListKey;
	private short paramSetKey;

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
		return defltValue;
	}

	/**
	 * @return the paramListKey
	 */
	public short getParamListKey() {
		return paramListKey;
	}

	/**
	 * @return the paramSetKey
	 */
	public short getParamSetKey() {
		return paramSetKey;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider#
	 * readFromH2(int)
	 */
	@Override
	public void readFromH2(int paramSetKey) {
		try {
			this.paramSetKey = (short) paramSetKey;
			final SubstnParamName spn = new SubstnParamName(this.paramSetKey);
			final SubstnParamValue spv = new SubstnParamValue(this.paramSetKey);

			defltValue = spn.getDefltValue();
			paramListKey = spv.getParamListKey();

		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}

		try {
			conn.close();
		} catch (final SQLException e) {
			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}

	/**
	 * @param defltValue
	 *            the defltValue to set
	 */
	public void setDefltValue(String defltValue) {
		this.defltValue = defltValue;
	}

	/**
	 * @param paramListKey
	 *            the paramListKey to set
	 */
	public void setParamListKey(short paramListKey) {
		this.paramListKey = paramListKey;
	}

	/**
	 * @param paramSetKey the paramSetKey to set
	 */
	public void setParamSetKey(short paramSetKey) {
		this.paramSetKey = paramSetKey;
	}
}
