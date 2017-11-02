package org.xBaseJ.fields;

/**
 * xBaseJ - Java access to dBase files
 *<p>Copyright 1997-2014 - American Coders, LTD  - Raleigh NC USA
 *<p>All rights reserved
 *<p>Currently supports only dBase III format DBF, DBT and NDX files
 *<p>                        dBase IV format DBF, DBT, MDX and NDX files
 *<p>American Coders, Ltd
 *<br>P. O. Box 97462
 *<br>Raleigh, NC  27615  USA
 *<br>1-919-846-2014
 *<br>http://www.americancoders.com
 @author Joe McVerry, American Coders Ltd.
 @Version 20140310
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library Lesser General Public
 * License along with this library; if not, write to the Free
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  20110119  Joe McVerry (jrm)   Added static field type and CurrencyField class.
 */

import java.io.IOException;
import java.nio.ByteBuffer;

import org.xBaseJ.xBaseJException;

/**
 * @author michael
 *
 */
public class IntegerField extends Field {
	private static final long serialVersionUID = 1L;
	public static final char type = 'I';

	public IntegerField() {
		super();
	}

	public IntegerField(String iName, ByteBuffer buffer)
			throws xBaseJException, IOException {
		super();
		super.setField(iName, 4, buffer);
	}

	/**
	 * public method for creating a IntegerField object. It is not associated
	 * with a database but can be when used with some DBF methods.
	 * 
	 * @param iName
	 *            the name of the field
	 * @param iLength
	 *            length of Field, range 1 to 254 bytes
	 * @throws xBaseJException
	 *             invalid length
	 * @throws IOException
	 *             can not occur but defined for calling methods
	 * @see Field
	 *
	 */
	public IntegerField(String iName, int iLength) throws xBaseJException,
			IOException {
		super();
		super.setField(iName, iLength, null);
	}

	public IntegerField(String iName, int iLength, ByteBuffer inBuffer)
			throws xBaseJException, IOException {
		super();
		super.setField(iName, iLength, inBuffer);
		put("");
	}

	public Object clone() throws CloneNotSupportedException {
		IntegerField tField = (IntegerField) super.clone();
		tField.Name = new String(Name);
		tField.Length = Length;
		return tField;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xBaseJ.fields.Field#get()
	 */
	@Override
	public String get() {
		int i = (int) buffer[0]
				+ 256
				* ((int) buffer[1] + 256 * ((int) buffer[2] + 256 * ((int) buffer[3])));

		return Integer.toString(i);
	}

	/**
	 * return the character 'I' indicating a character Field
	 */

	public char getType() {
		return type;
	}

}
