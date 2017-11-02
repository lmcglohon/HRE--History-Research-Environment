/**
 * 
 */
package org.historyresearchenvironment.usergui.serverinterface;

import org.historyresearchenvironment.usergui.models.AbstractHreModel;

/**
 * @author michael
 *
 */
public class ServerResponse {
	private AbstractHreModel model;
	private int returnCode;
	private String returnMessage;

	/**
	 * 
	 */
	public ServerResponse() {
		super();
	}

	/**
	 * @param model
	 * @param returnCode
	 * @param returnMessage
	 */
	public ServerResponse(AbstractHreModel model, int returnCode, String returnMessage) {
		super();
		this.model = model;
		this.returnCode = returnCode;
		this.returnMessage = returnMessage;
	}

	/**
	 * @return the model
	 */
	public AbstractHreModel getModel() {
		return model;
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
	 * @param model
	 *            the model to set
	 */
	public void setModel(AbstractHreModel model) {
		this.model = model;
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
