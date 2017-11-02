/**
 * 
 */
package org.historyresearchenvironment.usergui.serverinterface;

import org.historyresearchenvironment.usergui.models.AbstractHreModel;

/**
 * @author michael
 *
 */
public class ServerRequest {
	private String operation;
	private String modelName;
	private AbstractHreModel model;

	/**
	 * 
	 */
	public ServerRequest() {
		super();
	}

	/**
	 * @param operation
	 * @param request
	 */
	public ServerRequest(String operation, String modelName, AbstractHreModel model) {
		super();
		this.operation = operation;
		this.modelName = modelName;
		this.model = model;
	}

	/**
	 * @return the response
	 */
	public AbstractHreModel getModel() {
		return model;
	}

	/**
	 * @return the model
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setModel(AbstractHreModel model) {
		this.model = model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @param operation
	 *            the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
}