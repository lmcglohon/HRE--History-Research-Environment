package org.historyresearchenvironment.usergui.serverinterface;

import org.historyresearchenvironment.usergui.providers.AbstractHreProvider;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
/**
 * @version 0.0.5
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
	 * @return the response
	 */
	public AbstractHreProvider getProvider() {
		return provider;
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
	 * @param provider
	 */
	public void setProvider(AbstractHreProvider provider) {
		this.provider = provider;
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
}