package org.historyresearchenvironment.server;

import org.historyresearchenvironment.dataaccess.providers.AbstractHreProvider;
import org.historyresearchenvironment.server.businesslogic.AbstractHreBusinessLogic;

/**
 * @version 2018-07-13
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ServerRequest {
	private String operation;
	private AbstractHreProvider provider;
	private AbstractHreBusinessLogic businessLogic;

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
	public ServerRequest(String operation, AbstractHreProvider provider, AbstractHreBusinessLogic businessLogic) {
		super();
		this.operation = operation;
		this.provider = provider;
		this.businessLogic = businessLogic;
	}

	/**
	 * @return the businessLogic
	 */
	public AbstractHreBusinessLogic getBusinessLogic() {
		return businessLogic;
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
	 * @param businessLogic the businessLogic to set
	 */
	public void setBusinessLogic(AbstractHreBusinessLogic businessLogic) {
		this.businessLogic = businessLogic;
	}

	/**
	 * @param operation the operation to set
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