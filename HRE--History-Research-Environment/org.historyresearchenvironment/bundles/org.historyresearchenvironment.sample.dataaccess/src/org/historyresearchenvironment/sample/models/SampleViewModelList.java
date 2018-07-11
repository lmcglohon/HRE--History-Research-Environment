package org.historyresearchenvironment.sample.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Model representing a list of Sample View models.
 * 
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleViewModelList {
	private List<SampleEditorModel> modelList;

	/**
	 * Constructor
	 *
	 */
	public SampleViewModelList() {
		modelList = new ArrayList<SampleEditorModel>();
	}

	/**
	 * Constructor
	 *
	 * @param modelList
	 */
	public SampleViewModelList(List<SampleEditorModel> modelList) {
		super();
		this.modelList = modelList;
	}

	/**
	 * @param model
	 */
	public void add(SampleEditorModel model) {
		modelList.add(model);
	}

	/**
	 * @return the modelList
	 */
	public List<SampleEditorModel> getModelList() {
		return modelList;
	}

	/**
	 * @param modelList
	 *            the modelList to set
	 */
	public void setModelList(List<SampleEditorModel> modelList) {
		this.modelList = modelList;
	}

}
