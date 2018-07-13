package org.historyresearchenvironment.server.businesslogic;

import org.historyresearchenvironment.server.ServerRequest;
import org.historyresearchenvironment.server.ServerResponse;

/**
 * @version 2018-07-13
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public abstract class AbstractHreBusinessLogic {
	/**
	 * @param request
	 * @return
	 */
	public abstract ServerResponse execute(ServerRequest request);
}
