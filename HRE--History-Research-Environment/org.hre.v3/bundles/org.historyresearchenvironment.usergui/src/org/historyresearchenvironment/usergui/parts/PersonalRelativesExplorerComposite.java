package org.historyresearchenvironment.usergui.parts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;

public class PersonalRelativesExplorerComposite extends Composite {
	private Text textGenNo;
	private Text textComAncM;
	private Text textComAncF;
	private Table tableParents;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public PersonalRelativesExplorerComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(7, false));
		
		Label btnHide = new Label(this, SWT.NONE);
		btnHide.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/HideCorner.png"));
		
		Label lblGeneration = new Label(this, SWT.NONE);
		lblGeneration.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblGeneration.setText("Generation");
		
		textGenNo = new Text(this, SWT.NONE);
		GridData gd_textGenNo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_textGenNo.widthHint = 32;
		textGenNo.setLayoutData(gd_textGenNo);
		textGenNo.setEditable(false);
		
		Label lblCommonAncestorm = new Label(this, SWT.NONE);
		lblCommonAncestorm.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCommonAncestorm.setText("Common Ancestor (M)");
		
		textComAncM = new Text(this, SWT.BORDER);
		textComAncM.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblCommonAncestorf = new Label(this, SWT.NONE);
		lblCommonAncestorf.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCommonAncestorf.setText("Common Ancestor (F)");
		
		textComAncF = new Text(this, SWT.BORDER);
		textComAncF.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		tableParents = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		GridData gd_tableParents = new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1);
		gd_tableParents.widthHint = 704;
		tableParents.setLayoutData(gd_tableParents);
		tableParents.setHeaderVisible(true);
		tableParents.setLinesVisible(true);
		
		TableColumn tblclmnName = new TableColumn(tableParents, SWT.NONE);
		tblclmnName.setWidth(347);
		tblclmnName.setText("Name");
		
		TableColumn tblclmnRelationship = new TableColumn(tableParents, SWT.NONE);
		tblclmnRelationship.setWidth(74);
		tblclmnRelationship.setText("Relationship");
		
		TableColumn tblclmnSex = new TableColumn(tableParents, SWT.NONE);
		tblclmnSex.setWidth(32);
		tblclmnSex.setText("Sex");
		
		TableColumn tblclmnLifespan = new TableColumn(tableParents, SWT.NONE);
		tblclmnLifespan.setWidth(75);
		tblclmnLifespan.setText("Lifespan");
		
		TableColumn tblclmnGen = new TableColumn(tableParents, SWT.NONE);
		tblclmnGen.setWidth(39);
		tblclmnGen.setText("Gen.");
		
		TableColumn tblclmnCh = new TableColumn(tableParents, SWT.NONE);
		tblclmnCh.setWidth(33);
		tblclmnCh.setText("Ch.");
		
		TableColumn tblclmnOptionalFieldsHere = new TableColumn(tableParents, SWT.NONE);
		tblclmnOptionalFieldsHere.setWidth(100);
		tblclmnOptionalFieldsHere.setText("Optional fields here");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	/**
	 * @return the tableParents
	 */
	public Table getTableParents() {
		return tableParents;
	}

	/**
	 * @return the textComAncF
	 */
	public Text getTextComAncF() {
		return textComAncF;
	}

	/**
	 * @return the textComAncM
	 */
	public Text getTextComAncM() {
		return textComAncM;
	}

	/**
	 * @return the textGenNo
	 */
	public Text getTextGenNo() {
		return textGenNo;
	}

	/**
	 * @param tableParents the tableParents to set
	 */
	public void setTableParents(Table tableParents) {
		this.tableParents = tableParents;
	}

	/**
	 * @param textComAncF the textComAncF to set
	 */
	public void setTextComAncF(Text textComAncF) {
		this.textComAncF = textComAncF;
	}

	/**
	 * @param textComAncM the textComAncM to set
	 */
	public void setTextComAncM(Text textComAncM) {
		this.textComAncM = textComAncM;
	}

	/**
	 * @param textGenNo the textGenNo to set
	 */
	public void setTextGenNo(Text textGenNo) {
		this.textGenNo = textGenNo;
	}

}
