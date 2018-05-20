/**
 * 
 */
package org.xBaseJ.examples;

import java.io.File;

import org.xBaseJ.DBF;
import org.xBaseJ.XBASEXMLParser;

/**
 * @author joseph mcverry
 *
 */
public class XMLExample1 {

	public static void main(String args[]) {

		try {
			// Open dbf file
			final DBF classDB = new DBF("class.dbf");
			classDB.getXML("class.xml");
			final File f = new File("class.dbf");
			f.delete();
			final XBASEXMLParser xxp = new XBASEXMLParser();
			xxp.parse("class.xml");

		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
