package org.historyresearchenvironment.server;

import org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider;

/**
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ServerRequest {
	private String operation;
	private String modelName;
	private AbstractHreProvider provider;

	/**
	 * 
	 */
	/**
	 * Constructor
	 *
	 */
	public ServerRequest() {
		super();
	}

	/**
	 * @param operation
	 * @param request
	 */
	public ServerRequest(String operation, String modelName, AbstractHreProvider provider) {
		super();
		this.operation = operation;
		this.modelName = modelName;
		this.provider = provider;
	}

	/**
	 * @return the provider
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
	 * @return the response
	 */
	public org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider getProvider() {
		return provider;
	}

	/**
	 * @param provider
	 *            the provider to set
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

	/**
	 * @param provider
	 */
	public void setProvider(AbstractHreProvider provider) {
		this.provider = provider;
	}
}