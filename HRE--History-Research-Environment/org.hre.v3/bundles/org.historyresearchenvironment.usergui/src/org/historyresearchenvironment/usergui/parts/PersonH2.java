package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.historyresearchenvironment.usergui.models.PersonModel;

public class PersonH2 {
	private Text perNoText;
	private Text nameText;
	private Text fatherText;
	private Text motherText;
	private Text lastEditedText;
	private Text datasetText;
	private Text birthDateText;
	private Text deathDateText;
	private Text spouseText;
	private Text sexText;
	private Table eventTable;
	private Text messageText;

	private PersonModel personModel;

	public PersonH2() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(5, false));

		final Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Person No.");

		perNoText = new Text(parent, SWT.BORDER);
		perNoText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Button btnSearch = new Button(parent, SWT.NONE);
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				// LOGGER.info("Perno " + perNoText.getText());
				// personModel = new PersonModel(Integer.parseInt(perNoText.getText()));
				personModel.readFromH2(Integer.parseInt(perNoText.getText()));
				// Should not be necessary - binding should handle it!!!
				nameText.setText(personModel.getSrnamedisp());
				fatherText.setText(personModel.getFatherName());
				motherText.setText(personModel.getMotherName());
				lastEditedText.setText(personModel.getLastEditString());
				datasetText.setText(personModel.getDatasetName());
				birthDateText.setText(personModel.getPbirth());
				deathDateText.setText(personModel.getPdeath());
				spouseText.setText(personModel.getSpoulastName());
				sexText.setText(personModel.getSex());
				messageText.setText(personModel.getMessage());
			}
		});
		btnSearch.setText("Search");

		final Label lblNewLabel_1 = new Label(parent, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Name");

		nameText = new Text(parent, SWT.BORDER);
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblNewLabel_2 = new Label(parent, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setText("Father");

		fatherText = new Text(parent, SWT.BORDER);
		fatherText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		final Label lblNewLabel_3 = new Label(parent, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("Mother");

		motherText = new Text(parent, SWT.BORDER);
		motherText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblNewLabel_4 = new Label(parent, SWT.NONE);
		lblNewLabel_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_4.setText("Last Edited");

		lastEditedText = new Text(parent, SWT.BORDER);
		lastEditedText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		final Label lblNewLabel_5 = new Label(parent, SWT.NONE);
		lblNewLabel_5.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_5.setText("Dataset");

		datasetText = new Text(parent, SWT.BORDER);
		datasetText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblNewLabel_6 = new Label(parent, SWT.NONE);
		lblNewLabel_6.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_6.setText("Birth Date");

		birthDateText = new Text(parent, SWT.BORDER);
		birthDateText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		final Label lblNewLabel_7 = new Label(parent, SWT.NONE);
		lblNewLabel_7.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_7.setText("Death Date");

		deathDateText = new Text(parent, SWT.BORDER);
		deathDateText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblNewLabel_8 = new Label(parent, SWT.NONE);
		lblNewLabel_8.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_8.setText("Spouse");

		spouseText = new Text(parent, SWT.BORDER);
		final GridData gd_spouseText = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		gd_spouseText.widthHint = 346;
		spouseText.setLayoutData(gd_spouseText);

		final Label lblNewLabel_9 = new Label(parent, SWT.NONE);
		lblNewLabel_9.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_9.setText("Sex");

		sexText = new Text(parent, SWT.BORDER);
		sexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblNewLabel_10 = new Label(parent, SWT.NONE);
		lblNewLabel_10.setText("Events");

		eventTable = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		eventTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1));
		eventTable.setHeaderVisible(true);
		eventTable.setLinesVisible(true);

		messageText = new Text(parent, SWT.BORDER);
		messageText.setEditable(false);
		messageText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));

		personModel = new PersonModel(1);
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}
}
