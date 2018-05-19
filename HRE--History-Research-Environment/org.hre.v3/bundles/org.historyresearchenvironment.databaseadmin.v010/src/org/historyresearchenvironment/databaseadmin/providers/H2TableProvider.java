package org.historyresearchenvironment.databaseadmin.providers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.IContentProvider;
import org.historyresearchenvironment.databaseadmin.HreDbadminConstants;
import org.historyresearchenvironment.databaseadmin.models.H2TableModel;

/**
 * Provide H2 data to the table navigator and the table editor.
 * 
 * @version 2018-05-19
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class H2TableProvider extends AbstractHreProvider implements IContentProvider {
	private final String COUNT = "SELECT COUNT(*) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = 'PUBLIC' AND TABLE_NAME = ?";
	private final String COLUMNS = "SELECT COLUMN_NAME, TYPE_NAME, DATA_TYPE, NUMERIC_PRECISION, NUMERIC_SCALE, CHARACTER_MAXIMUM_LENGTH FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = 'PUBLIC' AND TABLE_NAME = ?";

	private int count;
	private final List<H2TableModel> modelList;
	private H2TableModel model;
	private final String tableName;
	private PreparedStatement ps;
	private ResultSet rs;
	private List<Object> row;
	private List<List<Object>> rowList;

	/**
	 * Constructor
	 * 
	 * @param tableName
	 *
	 */
	public H2TableProvider(String tableName) {
		String type;

		this.tableName = tableName;
		modelList = new ArrayList<>();

		try {
			// Get number of columns in H2 table
			ps = conn.prepareStatement(COUNT);
			ps.setString(1, tableName);

			rs = ps.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1);
			}

			// Get names and other properties of columns in H2 tables
			ps = conn.prepareStatement(COLUMNS);
			ps.setString(1, tableName);
			rs = ps.executeQuery();

			while (rs.next()) {
				model = new H2TableModel();
				model.setName(rs.getString(1));
				type = rs.getString(2);
				model.setType(type);
				model.setNumericType(rs.getInt(3));

				switch (model.getNumericType()) {
				case HreDbadminConstants.BIGINT:
				case HreDbadminConstants.DOUBLE:
				case HreDbadminConstants.SMALLINT:
				case HreDbadminConstants.INTEGER:
					model.setPrecision(rs.getInt(4));
					model.setScale(rs.getInt(5));
					break;
				case HreDbadminConstants.VARCHAR:
				case HreDbadminConstants.VARBINARY:
					model.setScale(rs.getInt(6));
					break;
				default:
					break;
				}

				modelList.add(model);
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Delete a row in the H2 table
	 * 
	 * @param recordNum
	 * @return If delete was successful
	 */
	public Boolean delete(int recordNum) {
		final String DELETE = "DELETE FROM PUBLIC." + tableName + " WHERE RECORD_NUM = ?";
		try {
			ps = conn.prepareStatement(DELETE);
			ps.setInt(1, recordNum);
			@SuppressWarnings("unused")
			int rows = ps.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Delete all rows in the H2 table
	 */
	public void deleteAll() {
		final String DELETEALL = "DELETE FROM PUBLIC." + tableName;

		try {
			ps = conn.prepareStatement(DELETEALL);
			ps.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Get the count of columns in the H2 table
	 * 
	 * @return The count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Get a list of models, each with column name, type, and optional value
	 * 
	 * @return A list of columns
	 */
	public List<H2TableModel> getModelList() {
		return modelList;
	}

	/**
	 * Import a CSV file into the H2 table
	 * 
	 * @param fileName
	 * @return
	 */
	public int importCsv(String fileName) {
		final String IMPORTCSV = "INSERT INTO PUBLIC." + tableName + " (SELECT * from csvread('" + fileName + "'));";
		int rowCount = 0;

		try {
			ps = conn.prepareStatement(IMPORTCSV);
			rowCount = ps.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	/**
	 * Insert a row into the H2 table
	 * 
	 * @param columns2
	 * 
	 * @return If insert was successful
	 */
	public Boolean insert(List<H2TableModel> columns2) {
		H2TableModel h2TableModel;

		final StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO PUBLIC." + tableName + " (");

		Iterator<H2TableModel> iterator = columns2.iterator();

		if (iterator.hasNext()) {
			h2TableModel = iterator.next();
			sb.append(h2TableModel.getName());
		}

		while (iterator.hasNext()) {
			h2TableModel = iterator.next();
			sb.append(", " + h2TableModel.getName());
		}

		sb.append(") VALUES ('");

		iterator = columns2.iterator();

		if (iterator.hasNext()) {
			h2TableModel = iterator.next();
			sb.append(h2TableModel.getValue());
		}

		while (iterator.hasNext()) {
			h2TableModel = iterator.next();
			sb.append("', '" + h2TableModel.getValue());
		}

		sb.append("');");
		final String INSERT = sb.toString();

		try {
			ps = conn.prepareStatement(INSERT);
			ps.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Insert multiple rows into the H2 table
	 * 
	 * @param rows
	 * 
	 * @return If insert was successful
	 */
	public Boolean insertSet(List<List<H2TableModel>> rows) {
		Boolean success = false;

		for (int i = 0; i < rows.size(); i++) {
			success = insert(rows.get(i));

			if (!success) {
				return success;
			}
		}

		return true;

	}

	/**
	 * Select a single row from the H2 table
	 * 
	 * @param recordNum
	 * @return List of rows
	 */
	public List<Object> select(int recordNum) {
		row = new ArrayList<>();
		String field = "";

		if (recordNum == 0) {
			for (int i = 1; i < (count + 1); i++) {
				switch (modelList.get(i - 1).getNumericType()) {
				case HreDbadminConstants.BIGINT:
					row.add(0L);
					break;
				case HreDbadminConstants.BOOLEAN:
					row.add(Boolean.FALSE);
					break;
				case HreDbadminConstants.DOUBLE:
					row.add(0D);
					break;
				case HreDbadminConstants.INTEGER:
					row.add(0);
					break;
				case HreDbadminConstants.SMALLINT:
					row.add((short) 0);
					break;
				case HreDbadminConstants.TIMESTAMP:
					row.add(new Timestamp(0L));
					break;
				case HreDbadminConstants.VARBINARY:
					byte[] ba = { 0 };
					row.add(ba);
					break;
				default:
					row.add("");
					break;
				}
			}
			return row;
		}

		try {
			final String SELECT = "SELECT * FROM PUBLIC." + tableName + " WHERE RECORD_NUM = ?";
			ps = conn.prepareStatement(SELECT);
			ps.setInt(1, recordNum);
			rs = ps.executeQuery();

			if (rs.next()) {
				for (int i = 1; i < (count + 1); i++) {
					switch (modelList.get(i - 1).getNumericType()) {
					case HreDbadminConstants.BIGINT:
						row.add(rs.getLong(i));
						break;
					case HreDbadminConstants.BLOB:
						row.add(rs.getBlob(i));
						break;
					case HreDbadminConstants.BOOLEAN:
						row.add(rs.getBoolean(i));
						break;
					case HreDbadminConstants.CLOB:
						row.add(rs.getClob(i));
						break;
					case HreDbadminConstants.DOUBLE:
						row.add(rs.getDouble(i));
						break;
					case HreDbadminConstants.INTEGER:
						row.add(rs.getInt(i));
						break;
					case HreDbadminConstants.SMALLINT:
						row.add(rs.getShort(i));
						break;
					case HreDbadminConstants.TIMESTAMP:
						row.add(rs.getTimestamp(i));
						break;
					case HreDbadminConstants.VARBINARY:
						row.add(rs.getBytes(i));
						break;
					case HreDbadminConstants.VARCHAR:
						row.add(rs.getString(i));
						break;
					default:
						if ((field = rs.getString(i)) != null)
							row.add(field);
						else
							row.add("");
						break;
					}

				}
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	/**
	 * Select all rows from the H2 table
	 * 
	 * @return A list of rows
	 */
	public List<List<Object>> selectAll() {
		rowList = new ArrayList<>();
		String field = "";

		try {
			final String SELECTALL = "SELECT * FROM PUBLIC." + tableName;
			ps = conn.prepareStatement(SELECTALL);
			rs = ps.executeQuery();

			while (rs.next()) {
				row = new ArrayList<>();

				for (int i = 1; i < (count + 1); i++) {
					if ((field = rs.getString(i)) != null) {
						row.add(field);
					} else {
						row.add("");
					}
				}
				rowList.add(row);
			}

		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return rowList;
	}

	/**
	 * Update a row in the H2 table
	 * 
	 * @param columns
	 * 
	 * @return If update was successful
	 */
	public Boolean update(List<H2TableModel> columns) {
		H2TableModel h2TableModel;
		final StringBuilder sb = new StringBuilder();
		sb.append("UPDATE PUBLIC." + tableName + " SET ");

		final Iterator<H2TableModel> iterator = columns.iterator();

		if (iterator.hasNext()) {
			h2TableModel = iterator.next();
			sb.append(h2TableModel.getName() + "='" + h2TableModel.getValue());
		}

		while (iterator.hasNext()) {
			h2TableModel = iterator.next();
			sb.append("', " + h2TableModel.getName() + "='" + h2TableModel.getValue());
		}

		sb.append("' WHERE RECORD_NUM='" + columns.get(0).getValue() + "';");

		final String UPDATE = sb.toString();
		try {
			ps = conn.prepareStatement(UPDATE);
			ps.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}