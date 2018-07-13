package org.historyresearchenvironment.sample.providers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.historyresearchenvironment.dataaccess.models.AbstractHreDataModel;
import org.historyresearchenvironment.dataaccess.models.SubstnParamName;
import org.historyresearchenvironment.dataaccess.models.SubstnParamValue;
import org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider;

/**
 * Provide H2 data to the sample navigator.
 * 
 * @version 2018-07-13
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleNavigatorProvider extends AbstractHreProvider {
	private List<SampleEditorProvider> modelList;
	private SampleEditorProvider model;

	/**
	 * Constructor
	 *
	 */
	public SampleNavigatorProvider() {
		modelList = new ArrayList<SampleEditorProvider>();
		readFromH2();

	}

	/**
	 * @param defltValue
	 * @param paramListKey
	 * @param paramSetKey
	 */
	public void add(String defltValue, short paramListKey, short paramSetKey) {
		model = new SampleEditorProvider();
		model.setDefltValue(defltValue);
		model.setParamListKey(paramListKey);
		model.setParamSetKey(paramSetKey);

		if (modelList == null) {
			modelList = new ArrayList<SampleEditorProvider>();
		}
		modelList.add(model);
	}

	/**
	 * @return
	 */
	public int getCount() {
		return modelList.size();
	}

	/**
	 * @return the modelList
	 */
	public List<SampleEditorProvider> getModelList() {
		return modelList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider#
	 * readFromH2()
	 */
	@Override
	public void readFromH2() {
		SubstnParamName row;
		short paramSetKey;
		SubstnParamValue spv;

		try {
			SubstnParamName spn = new SubstnParamName();
			ArrayList<AbstractHreDataModel> dataModelList = spn.get();

			for (Iterator<AbstractHreDataModel> iterator = dataModelList.iterator(); iterator.hasNext();) {
				row = (SubstnParamName) iterator.next();
				LOGGER.info("Row: " + row.getParamSetKey() + ", " + row.getDefltValue());
				paramSetKey = row.getParamSetKey();
				spv = new SubstnParamValue(paramSetKey);

				model = new SampleEditorProvider();
				model.setParamSetKey(paramSetKey);
				model.setDefltValue(row.getDefltValue());
				model.setParamListKey(spv.getParamListKey());
				modelList.add(model);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider#
	 * readFromH2(int)
	 */
	@Override
	public void readFromH2(int i) {
		LOGGER.info("Does nothing");

	}

	/**
	 * @return
	 */
	public List<SampleEditorProvider> selectAll() {
		return modelList;
	}

	/**
	 * @param modelList the modelList to set
	 */
	public void setModelList(List<SampleEditorProvider> modelList) {
		this.modelList = modelList;
	}

}
