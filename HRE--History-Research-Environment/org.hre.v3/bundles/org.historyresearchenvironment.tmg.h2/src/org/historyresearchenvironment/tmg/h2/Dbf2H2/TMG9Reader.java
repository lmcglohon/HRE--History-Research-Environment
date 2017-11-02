package org.historyresearchenvironment.tmg.h2.Dbf2H2;

import org.xBaseJ.DBF;
import org.xBaseJ.fields.Field;

/**
 * Reads and prints all columns, all rows of the specified file.
 *
 * @author clott
 *
 */
public class TMG9Reader {

	public TMG9Reader() {
		super();
	}

	public void read(String tableName) {
		try {
			final DBF dbf = new DBF(tableName, DBF.READ_ONLY);

			System.out.println("Table name: " + tableName + "\nRecord count: "
					+ dbf.getRecordCount() + "\nField count: "
					+ dbf.getFieldCount());

			// Fields index from 1
			for (int f = 1; f <= dbf.getFieldCount(); ++f) {
				final Field fld = dbf.getField(f);
				System.out.println("Field " + f + ": " + fld.getName()
						+ ", type=" + fld.getType() + ", len="
						+ fld.getLength());
			}

			System.out.println("----------------------------");

			for (int i = 0; i <= dbf.getRecordCount(); i++) {
				dbf.read();
				System.out.println("\nRecord " + i);
				for (int f = 1; f <= dbf.getFieldCount(); ++f) {
					final Field fld = dbf.getField(f);
					System.out.println("Field " + f + ": " + fld.getName()
							+ "= >" + fld.get() + "<");
				}
				System.out.println("----------------------------");
			}
			System.out.println("----------------------------\n\n\n");
			dbf.close();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

}
