package org.historyresearchenvironment.databaseadmin.providers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.viewers.IContentProvider;
import org.historyresearchenvironment.databaseadmin.HreH2ConnectionPool;
import org.historyresearchenvironment.databaseadmin.models.H2DatabaseModel;
import org.osgi.service.prefs.Preferences;

/**
 * Provides H2 data to the database navigator
 * 
 * @version 2018-04-21
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class H2DatabaseProvider extends AbstractHreProvider implements IContentProvider {
	private static final String SELECT = "SELECT TABLE_NAME, ROW_COUNT_ESTIMATE FROM INFORMATION_SCHEMA.TABLES "
			+ "WHERE TABLE_TYPE = 'TABLE' ORDER BY TABLE_NAME";
	private final List<H2DatabaseModel> modelList = new ArrayList<H2DatabaseModel>();
	private H2DatabaseModel model;

	/**
	 * Constructor
	 *
	 */
	public H2DatabaseProvider() {
		try {
			Preferences preferences = ConfigurationScope.INSTANCE
					.getNode("org.historyresearchenvironment.databaseadmin");
			String dbName = preferences.get("DBNAME", "~/HRE");

			conn = HreH2ConnectionPool.getConnection(dbName);
			final PreparedStatement ps = conn.prepareStatement(SELECT);

			final ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				model = new H2DatabaseModel(rs.getString(1), rs.getLong(2));
				modelList.add(model);
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the modelList
	 */
	public List<H2DatabaseModel> getModelList() {
		return modelList;
	}

}