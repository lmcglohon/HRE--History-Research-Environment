package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.historyresearchenvironment.usergui.HreH2ConnectionPool;
import org.xBaseJ.DBF;
import org.xBaseJ.xBaseJException;
import org.xBaseJ.fields.Field;
import org.xBaseJ.fields.MemoField;

/**
 * Extract a TMG table from Visual FoxPro and insert it into H2.
 *
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TableLoader {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private Statement stmt = null;

	// Foxpro connection
	private String FPTABLE = null;
	private DBF dbf = null;
	private String DELETE = null;
	private String INSERT = null;
	private Connection conn = null;
	private PreparedStatement pst = null;

	/**
	 * No arg constructor
	 */
	public TableLoader() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param project
	 * @param type
	 * @param table
	 */
	public TableLoader(String project, String type, String table, String dbName, IProgressMonitor monitor) {
		final SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
		subMonitor.beginTask("Loading tables", 1);
		subMonitor.subTask("Loading " + table);
		
		FPTABLE = FilenameUtils.getFullPath(project) + FilenameUtils.getBaseName(project).replace("_", "") + "_" + type
				+ ".dbf";
		LOGGER.info("Project:" + project);
		DELETE = "DELETE FROM " + table;

		LOGGER.info(FPTABLE);
		final DbfFieldAnalyser analyser = new DbfFieldAnalyser(FPTABLE);
		INSERT = "INSERT INTO " + table + " " + analyser.getFieldNames();
	}
	/**
	 * Old-style Constructor.
	 *
	 * @param project
	 * @param type
	 * @param table
	 */
	public TableLoader(String project, String type, String table, String dbName) {
		FPTABLE = FilenameUtils.getFullPath(project) + FilenameUtils.getBaseName(project).replace("_", "") + "_" + type
				+ ".dbf";
		LOGGER.info("Project:" + project);
		DELETE = "DELETE FROM " + table;

		LOGGER.info(FPTABLE);
		final DbfFieldAnalyser analyser = new DbfFieldAnalyser(FPTABLE);
		INSERT = "INSERT INTO " + table + " " + analyser.getFieldNames();
	}
	/**
	 * Older-style constructor with static INSERT statement.
	 *
	 * @param project
	 * @param type
	 * @param table
	 * @param insertStatement
	 */
	public TableLoader(String project, String type, String table, String insertStatement, String dbName) {
		LOGGER.info("Project:" + project);
		FPTABLE = FilenameUtils.getFullPath(project) + FilenameUtils.getBaseName(project).replace("_", "") + "_" + type
				+ ".dbf";
		LOGGER.info("FPTABLE: " + FPTABLE);
		DELETE = "DELETE FROM " + table;
		INSERT = "INSERT INTO " + table + " " + insertStatement;

	}

	/**
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws SQLException
	 *
	 */
	private void initialize()
			throws xBaseJException, IOException, IllegalAccessException, InstantiationException, SQLException {
		// Connect to Foxpro
		dbf = new DBF(FPTABLE, DBF.READ_ONLY);

		LOGGER.info("Table name: " + dbf.getName() + "\nRecord count: " + dbf.getRecordCount() + "\nField count: "
				+ dbf.getFieldCount());

		conn = HreH2ConnectionPool.getConnection();
		stmt = conn.createStatement();
		stmt.execute(DELETE);
		conn.commit();
		LOGGER.info(INSERT);
		pst = conn.prepareStatement(INSERT);
	}

	/**
	 * @throws IOException
	 * @throws xBaseJException
	 * @throws SQLException
	 *
	 */
	// private void mainLoop() throws xBaseJException, IOException, SQLException {
	private void mainLoop() {
		char type = '?';
		String s = null;
		String ssub = null;
		String ds = null;
		Date d = null;
		int l = 0;
		BigDecimal bd = null;
		Field fld = null;
		int a = 0;
		LOGGER.fine("");

		try {
			for (int i = 0; i < dbf.getRecordCount(); i++) {
				// Read from Foxpro
				dbf.read();
				LOGGER.fine("\nRecord " + i);

				// Copy each field
				for (int f = 1; f <= dbf.getFieldCount(); ++f) {
					fld = dbf.getField(f);
					type = fld.getType();

					if (fld.isMemoField()) {
						l = ((MemoField) fld).getOriginalSize();
					} else {
						l = fld.getLength();
					}

					s = fld.get();

					if (s.length() > 40) {
						ssub = s.substring(0, 40) + "...";
					} else {
						ssub = s;
					}

					LOGGER.fine("Field " + f + ":\t" + fld.getName() + ", " + type + ", " + l + "\t>" + ssub + "<");

					switch (type) {
					// Integer
					case 'I':
						a = 0;
						// bval = 0;
						for (int k = 3; k >= 0; k--) {
							System.out.print(fld.buffer[k] + " ");

							a *= 256;
							a += fld.buffer[k] < 0 ? fld.buffer[k] + 256 : fld.buffer[k];
						}
						LOGGER.fine("\tInt corrected from " + s + " to " + a);
						pst.setInt(f, a);
						break;
					// Numeric
					case 'N':
						if (s.length() == 0) {
							bd = new BigDecimal(0);
						} else {
							bd = new BigDecimal(s.trim());
						}
						pst.setBigDecimal(f, bd);
						break;
					// Character
					case 'C':
						pst.setString(f, s);
						break;
					// Memo
					case 'M':
						if (s.length() > 32760) {
							LOGGER.warning("Truncating MEMO type");
							s = s.substring(0, 32760);
						}

						pst.setString(f, s);
						break;
					// General
					case 'G':
						pst.setString(f, s);
						break;
					// Date
					case 'D':
						try {
							ds = s.substring(0, 4) + "-" + s.substring(4, 6) + "-" + s.substring(6, 8);
							d = Date.valueOf(ds);
						} catch (final Exception e) {
							e.printStackTrace();
							d = null;
						}

						pst.setDate(f, d);
						break;
					// Logical
					case 'L':
						// pst.setBoolean(f, Boolean.parseBoolean(s));
						pst.setString(f, s.substring(0, 1));
						break;
					// B Double
					// F Float
					// T Time
					// Y Currency
					default:
						LOGGER.severe("Unsupported field type " + type);
						throw new RuntimeException("Unknown field type " + type);
					}
				}
				LOGGER.fine("----------------------------");

				// Insert into H2
				// try {
				pst.executeUpdate();
				conn.commit();
				// } catch (final Exception e) {
				// StringBuilder sb = new StringBuilder(e.getClass() + " " + e.getMessage());
				//
				// for (final StackTraceElement element : e.getStackTrace()) {
				// sb.append("\n" + element.toString());
				// }
				// LOGGER.severe(sb.toString());
				//
				// }
			}
		} catch (Exception e) {
			StringBuilder sb = new StringBuilder(e.getClass() + " " + e.getMessage());

			for (final StackTraceElement element : e.getStackTrace()) {
				sb.append("\n" + element.toString());
			}
			LOGGER.severe(sb.toString());
		}
	}

	/**
	 * Run the extraction and insertion for at table
	 */

	public void run() {
		try {
			initialize();
			mainLoop();
			terminate();
		} catch (final Exception e) {
			StringBuilder sb = new StringBuilder(e.getClass() + " " + e.getMessage());

			for (final StackTraceElement element : e.getStackTrace()) {
				sb.append("\n" + element.toString());
			}
			LOGGER.severe(sb.toString());
		}
	}

	/**
	 *
	 */
	private void terminate() {
		try {
			stmt.close();
			conn.close();
			dbf.close();
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}
}