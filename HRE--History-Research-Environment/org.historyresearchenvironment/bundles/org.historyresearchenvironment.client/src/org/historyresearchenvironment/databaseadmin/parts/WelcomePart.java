
package org.historyresearchenvironment.databaseadmin.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.Bullet;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.GlyphMetrics;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * Welcome screen with application help
 * 
 * @version 2018-05-19
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class WelcomePart {

	/**
	 * @param parent Shell
	 */
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		final StyledText styledText = new StyledText(parent, SWT.BORDER | SWT.READ_ONLY);
		styledText.setWordWrap(true);
		styledText.setFont(SWTResourceManager.getFont("Times New Roman", 12, SWT.NORMAL));
		styledText.setText("History Research Environment H2 Database Administration Utility.\r\n\r\n"
				+ "A double click on a table name will open a list of rows in the table.\r\n"
				+ "Double click a row  or a blank area in the table row list to open an editor.\r\n\r\n"
				+ "Editor options:\r\n" + "Select, insert, update, delete a single row\r\n"
				+ "Import a semicolon separated file into the table\r\n"
				+ "Export the table into a semicolon separated file\r\n" + "Delete all rows in a table\r\n"
				+ "Clear all fields in the editor\r\n" + "Close the editor");

		final StyleRange style = new StyleRange();
		style.metrics = new GlyphMetrics(0, 0, 40);
		final Bullet bullet = new Bullet(style);

		styledText.setLineBullet(6, 6, bullet);

		styledText.setDoubleClickEnabled(false);
		styledText.setEditable(false);
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
	}
}