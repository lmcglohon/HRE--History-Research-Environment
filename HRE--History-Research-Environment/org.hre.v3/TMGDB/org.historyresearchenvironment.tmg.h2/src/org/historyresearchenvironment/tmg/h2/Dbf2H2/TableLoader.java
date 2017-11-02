/**
 *
 */
package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.xBaseJ.DBF;
import org.xBaseJ.xBaseJException;
import org.xBaseJ.fields.Field;
import org.xBaseJ.fields.MemoField;

/**
 * Extract a TMG table from Foxpro and insert it into Derby
 *
 * @author Michael Erichsen, 2016
 */

public class TableLoader {
	// H2 connection
	private static final String DBDRIVER = "org.h2.Driver";
	private static final String DBNAME = "jdbc:h2:./TMG9";
	private static final String USERID = "sa";
	private static final String PASSWORD = "";
	// private static final String SHUTDOWN = "jdbc:derby:;shutdown=true";
	private static Statement stmt = null;

	// Externally defined fields
	String project = null;
	String type = null;
	String table = null;
	String insertStatement = null;

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
	 * Constructor
	 *
	 * @param project
	 * @param type
	 * @param table
	 * @param insertStatement
	 */
	public TableLoader(String project, String type, String table, String insertStatement) {
		this.project = project;
		this.type = type;
		this.table = table;
		this.insertStatement = insertStatement;
		FPTABLE = "C:/Users/michael/Documents/THEMAS~1/Projects/" + project + "/" + project + "_" + type + ".dbf";
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
	private void initialize() throws xBaseJException, IOException, IllegalAccessException, InstantiationException,
			ClassNotFoundException, SQLException {
		// Connect to Foxpro
		dbf = new DBF(FPTABLE, DBF.READ_ONLY);

		System.out.println("Table name: " + dbf.getName() + "\nRecord count: " + dbf.getRecordCount()
				+ "\nField count: " + dbf.getFieldCount());

		for (int f = 1; f <= dbf.getFieldCount(); ++f) {
			// Field fld = dbf.getField(f);

			// System.out.println("Field " + f + ":\t" + fld.getName() + ", "
			// + fld.getType() + ", " + fld.getLength());
		}

		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBNAME, USERID, PASSWORD);
		stmt = conn.createStatement();
		stmt.execute(DELETE);
		conn.commit();
		pst = conn.prepareStatement(INSERT);

		// System.out.println("----------------------------\n");
	}

	/**
	 * @throws IOException
	 * @throws xBaseJException
	 * @throws SQLException
	 *
	 */
	private void mainLoop() throws xBaseJException, IOException, SQLException {
		char type = '?';
		String s = null;
		String ssub = null;
		String ds = null;
		Date d = null;
		int l = 0;
		BigDecimal bd = null;
		Field fld = null;
		int a = 0;
		System.out.println("");

		for (int i = 0; i < dbf.getRecordCount(); i++) {
			// Read from Foxpro
			dbf.read();
			System.out.println("\nRecord " + i);

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

				System.out.println("Field " + f + ":\t" + fld.getName() + ", " + type + ", " + l + "\t>" + ssub + "<");

				switch (type) {
				case 'I':
					a = 0;
					// bval = 0;
					for (int k = 3; k >= 0; k--) {
						System.out.print(fld.buffer[k] + " ");

						a *= 256;
						a += fld.buffer[k] < 0 ? fld.buffer[k] + 256 : fld.buffer[k];
					}
					System.out.println("\tInt corrected from " + s + " to " + a);
					pst.setInt(f, a);
					break;
				case 'N':
					if (s.length() == 0) {
						bd = new BigDecimal(0);
					} else {
						bd = new BigDecimal(s.trim());
					}
					pst.setBigDecimal(f, bd);
					break;
				case 'C':
				case 'M':
				case 'G':
					pst.setString(f, s);
					break;
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
				case 'L':
					// pst.setBoolean(f, Boolean.parseBoolean(s));
					pst.setString(f, s.substring(0, 1));
					break;
				default:
					throw new RuntimeException("Unknown field type " + type);
				}
			}
			System.out.println("----------------------------");

			// Insert into Derby
			try {
				pst.executeUpdate();
				conn.commit();
			} catch (final Exception e) {
				e.printStackTrace();
			}
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
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	private void terminate() {
		try {
			stmt.close();
			// 
			conn.close();

			dbf.close();
		} catch (final Exception e) {

		}
	}
}