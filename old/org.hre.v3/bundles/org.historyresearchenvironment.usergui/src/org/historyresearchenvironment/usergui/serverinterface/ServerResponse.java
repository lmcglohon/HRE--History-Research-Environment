package org.historyresearchenvironment.usergui.serverinterface;

import org.historyresearchenvironment.usergui.providers.AbstractHreProvider;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class ServerResponse {
	private AbstractHreProvider provider;
	private int returnCode;
	private String returnMessage;

	/**
	 * 
	 */
	public ServerResponse() {
		super();
	}

	/**
	 * @param provider
	 * @param returnCode
	 * @param returnMessage
	 */
	public ServerResponse(AbstractHreProvider provider, int returnCode, String returnMessage) {
		super();
		this.provider = provider;
		this.returnCode = returnCode;
		this.returnMessage = returnMessage;
	}

	/**
	 * @return the provider
	 */
	public AbstractHreProvider getProvider() {
		return provider;
	}

	/**
	 * @return the returnCode
	 */
	public int getReturnCode() {
		return returnCode;
	}

	/**
	 * @return the returnMessage
	 */
	public String getReturnMessage() {
		return returnMessage;
	}

	/**
	 * @param provider
	 *            the provider to set
	 */
	public void setProvider(AbstractHreProvider provider) {
		this.provider = provider;
	}

	/**
	 * @param returnCode
	 *            the returnCode to set
	 */
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	/**
	 * @param returnMessage
	 *            the returnMessage to set
	 */
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

}
