package org.historyresearchenvironment.sample.client.providers;

import java.util.ArrayList;
import java.util.List;

import org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider;
import org.historyresearchenvironment.sample.client.models.SampleViewModel;

/**
 * @version 2018-07-05
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleNavigatorProvider extends AbstractHreProvider {
	private List<SampleViewModel> modelList;

	/**
	 * Constructor
	 *
	 */
	public SampleNavigatorProvider() {
		modelList = new ArrayList<SampleViewModel>();
	}

	/**
	 * Constructor
	 *
	 * @param modelList
	 */
	public SampleNavigatorProvider(List<SampleViewModel> modelList) {
		super();
		this.modelList = modelList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider#
	 * readFromH2(int)
	 */
	@Override
	public void readFromH2(int i) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the modelList
	 */
	public List<SampleViewModel> getModelList() {
		return modelList;
	}

	/**
	 * @param modelList the modelList to set
	 */
	public void setModelList(List<SampleViewModel> modelList) {
		this.modelList = modelList;
	}

}
