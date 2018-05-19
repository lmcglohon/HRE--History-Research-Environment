package org.historyresearchenvironment.databaseadmin.providers;

import java.sql.Connection;

import org.historyresearchenvironment.databaseadmin.HreH2ConnectionPool;

/**
 * Abstract superclass for providers
 * 
 * @version 2018-04-21
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public abstract class AbstractHreProvider {
	protected Connection conn = null;

	/**
	 * No arg c:tor
	 */
	public AbstractHreProvider() {
		super();

		try {
			conn = HreH2ConnectionPool.getConnection();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

}