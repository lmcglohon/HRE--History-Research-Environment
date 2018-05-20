package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import java.io.IOException;
import java.util.logging.Logger;

import org.xBaseJ.DBF;
import org.xBaseJ.xBaseJException;

/**
 * Find all fields in a dbf file.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class DbfFieldAnalyser {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private DBF dbf;

	/**
	 * Constructor
	 *
	 */
	public DbfFieldAnalyser(String dbfFileName) {
		try {
			dbf = new DBF(dbfFileName, DBF.READ_ONLY);
		} catch (final xBaseJException e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
			e.printStackTrace();
		} catch (final IOException e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public void close() {
		try {
			dbf.close();
		} catch (final IOException e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * @return Field count
	 */
	public int getFieldCount() {
		LOGGER.info("Field Count: " + dbf.getFieldCount());
		return dbf.getFieldCount();
	}

	/**
	 * Creates a string to use as INSERT statement in loader classes.
	 * 
	 * @return a string with all field names in sequence.
	 */
	public String getFieldNames() {
		String s;
		StringBuilder sb = new StringBuilder("(");

		try {
			for (int f = 1; f < dbf.getFieldCount(); ++f) {
				s = dbf.getField(f).getName();
				if (s.equals("GROUP")) {
					s = "XGROUP";
				} else if (s.equals("PRIMARY")) {
					s = "XPRIMARY";
				} else if (s.equals("VALUE")) {
					s = "XVALUE";
				}
				sb.append(s + ", ");
			}

			sb.append(dbf.getField(dbf.getFieldCount()).getName());
			sb.append(") VALUES (");
			for (int i = 0; i < dbf.getFieldCount() - 1; i++) {
				sb.append("?, ");
			}
			sb.append("?)");
		} catch (Exception e) {
			StringBuilder sb1 = new StringBuilder(e.getClass() + " " + e.getMessage());

			for (final StackTraceElement element : e.getStackTrace()) {
				sb1.append("\n" + element.toString());
			}
		}
		return sb.toString().toUpperCase();
	}
}
