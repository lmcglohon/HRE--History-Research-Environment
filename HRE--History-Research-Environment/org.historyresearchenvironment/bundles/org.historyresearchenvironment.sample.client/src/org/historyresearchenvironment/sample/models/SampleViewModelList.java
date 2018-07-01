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
	private List<SampleViewModel> modelList;

	/**
	 * Constructor
	 *
	 */
	public SampleViewModelList() {
		modelList = new ArrayList<SampleViewModel>();
	}

	/**
	 * Constructor
	 *
	 * @param modelList
	 */
	public SampleViewModelList(List<SampleViewModel> modelList) {
		super();
		this.modelList = modelList;
	}

	/**
	 * @param model
	 */
	public void add(SampleViewModel model) {
		modelList.add(model);
	}

	/**
	 * @return the modelList
	 */
	public List<SampleViewModel> getModelList() {
		return modelList;
	}

	/**
	 * @param modelList
	 *            the modelList to set
	 */
	public void setModelList(List<SampleViewModel> modelList) {
		this.modelList = modelList;
	}

}
