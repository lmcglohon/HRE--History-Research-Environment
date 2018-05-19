package org.historyresearchenvironment.databaseadmin.parts;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.xml.bind.DatatypeConverter;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.historyresearchenvironment.databaseadmin.HreDbadminConstants;
import org.historyresearchenvironment.databaseadmin.listeners.HexFocusListener;
import org.historyresearchenvironment.databaseadmin.listeners.HexVerifyListener;
import org.historyresearchenvironment.databaseadmin.listeners.LengthFocusListener;
import org.historyresearchenvironment.databaseadmin.listeners.NumericVerifyListener;
import org.historyresearchenvironment.databaseadmin.models.H2TableModel;
import org.historyresearchenvironment.databaseadmin.providers.H2TableProvider;

/**
 * Dynamically create an editor with the fields in the database catalog.
 * 
 * @version 2018-05-19
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */

public class H2TableEditor {
	@Inject
	private EPartService partService;
	@Inject
	private EModelService modelService;
	@Inject
	private MApplication application;
	@Inject
	private IEventBroker eventBroker;

	private String tableName;
	private int recordNum = 0;
	private H2TableProvider provider;
	private List<Object> row;
	private List<H2TableModel> columns;
	private List<Object> lineList = new ArrayList<>();
	private Composite compositeButtons;
	private int count;
	private ScrolledComposite scrolledComposite;

	/**
	 * Constructor
	 *
	 */
	public H2TableEditor() {
	}

	/**
	 * @param parent Shell
	 */
	private void createButtons(Composite parent) {
		// Only create once
		if (compositeButtons != null) {
			return;
		}
		new Label(parent, SWT.NONE);

		compositeButtons = new Composite(parent, SWT.NONE);
		compositeButtons.setLayout(new RowLayout(SWT.HORIZONTAL));

		final Button btnSelect = new Button(compositeButtons, SWT.NONE);
		btnSelect.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Text text = (Text) lineList.get(0);
				final int recordNum = Integer.parseInt(text.getText());
				final List<Object> row = provider.select(recordNum);

				if (row == null)
					eventBroker.post("MESSAGE", "Record " + recordNum + " could no be selected");
				else {
					try {
						for (int i = 0; i < lineList.size(); i++) {
							Object lineObject = lineList.get(i);
							String type = lineObject.getClass().getName();

							if (type.equals("org.eclipse.swt.widgets.Button")) {
								Button line = (Button) lineObject;
								line.setSelection((boolean) row.get(i));
							} else if (type.equals("org.eclipse.swt.widgets.Text")) {
								Text line = (Text) lineObject;
								line.setText(row.get(i).toString());
							} else if (type.equals("org.eclipse.swt.widgets.Composite")) {
								Timestamp timeStamp = (Timestamp) row.get(i);
								Calendar calendar = Calendar.getInstance();
								calendar.setTimeInMillis(timeStamp.getTime());

								Composite dateTime = (Composite) lineObject;
								Control[] children = dateTime.getChildren();

								DateTime date = (DateTime) children[0];
								date.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
										calendar.get(Calendar.DATE));
								DateTime time = (DateTime) children[1];
								time.setTime(calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE),
										calendar.get(Calendar.SECOND));
							} else {
								System.out.println("Unimplemented type: " + type);
								System.exit(16);
							}
						}
						eventBroker.post("MESSAGE", "Record " + recordNum + " has been selected");
					} catch (Exception e1) {
						eventBroker.post("MESSAGE", "Record " + recordNum + " could no be selected");
					}
				}
				btnSelect.getParent().redraw();
			}
		});
		btnSelect.setText("Select");

		final Button btnInsert = new Button(compositeButtons, SWT.NONE);
		btnInsert.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Text insertText = (Text) lineList.get(0);
				final int insertRecordNum = Integer.parseInt(insertText.getText());

				for (int i = 0; i < lineList.size(); i++) {
					Object lineObject = lineList.get(i);
					String type = lineObject.getClass().getName();

					if (type.equals("org.eclipse.swt.widgets.Button")) {
						Button line = (Button) lineObject;
						Button checkButton = (Button) lineList.get(i);
						line.setSelection((boolean) checkButton.getSelection());
						columns.get(i).setValue(checkButton.getSelection());
					} else if (type.equals("org.eclipse.swt.widgets.Text")) {
						Text line = (Text) lineObject;
						Text text = (Text) lineList.get(i);
						line.setText(text.getText());
						columns.get(i).setValue(text.getText());
					} else if (type.equals("org.eclipse.swt.widgets.Composite")) {
						Composite dateTime = (Composite) lineObject;
						Control[] children = dateTime.getChildren();
						DateTime date = (DateTime) children[0];
						DateTime time = (DateTime) children[1];

						@SuppressWarnings("deprecation")
						Timestamp timeStamp = new Timestamp(date.getYear() - 1900, date.getMonth(), date.getDay(),
								time.getHours(), time.getMinutes(), time.getSeconds(), 0);
						columns.get(i).setValue(timeStamp);
					} else {
						System.out.println("Unimplemented type: " + type);
						System.exit(16);
					}
				}

				Boolean flag = provider.insert(columns);
				if (flag) {
					eventBroker.post(HreDbadminConstants.DATABASE_UPDATE_TOPIC, "Dummy");
					eventBroker.post(
							org.historyresearchenvironment.databaseadmin.HreDbadminConstants.TABLENAME_UPDATE_TOPIC,
							tableName);
					eventBroker.post("MESSAGE", "Record " + insertRecordNum + " has been inserted");
				} else
					eventBroker.post("MESSAGE", "Record " + insertRecordNum + " could no be inserted");
			}
		});
		btnInsert.setText("Insert");

		final Button btnUpdate = new Button(compositeButtons, SWT.NONE);
		btnUpdate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Text updateText = (Text) lineList.get(0);
				final int updateRecordNum = Integer.parseInt(updateText.getText());

				for (int i = 0; i < lineList.size(); i++) {
					Object lineObject = lineList.get(i);
					String type = lineObject.getClass().getName();

					if (type.equals("org.eclipse.swt.widgets.Button")) {
						Button line = (Button) lineObject;
						Button checkButton = (Button) lineList.get(i);
						line.setSelection((boolean) checkButton.getSelection());
						columns.get(i).setValue(checkButton.getSelection());
					} else if (type.equals("org.eclipse.swt.widgets.Text")) {
						Text line = (Text) lineObject;
						Text text = (Text) lineList.get(i);
						line.setText(text.getText());
						columns.get(i).setValue(text.getText());
					} else if (type.equals("org.eclipse.swt.widgets.Composite")) {
						Composite dateTime = (Composite) lineObject;
						Control[] children = dateTime.getChildren();
						DateTime date = (DateTime) children[0];
						DateTime time = (DateTime) children[1];

						@SuppressWarnings("deprecation")
						Timestamp timeStamp = new Timestamp(date.getYear() - 1900, date.getMonth(), date.getDay(),
								time.getHours(), time.getMinutes(), time.getSeconds(), 0);
						columns.get(i).setValue(timeStamp);
					} else {
						System.out.println("Unimplemented type: " + type);
						System.exit(16);
					}
				}

				Boolean flag = provider.update(columns);
				if (flag) {
					eventBroker.post(HreDbadminConstants.DATABASE_UPDATE_TOPIC, "Dummy");
					eventBroker.post(
							org.historyresearchenvironment.databaseadmin.HreDbadminConstants.TABLENAME_UPDATE_TOPIC,
							tableName);
					eventBroker.post("MESSAGE", "Record " + updateRecordNum + " has been updated");
				} else
					eventBroker.post("MESSAGE", "Record " + updateRecordNum + " could no be updated");
			}
		});
		btnUpdate.setText("Update");

		final Button btnDelete = new Button(compositeButtons, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Text text = (Text) lineList.get(0);
				final int recordNum = Integer.parseInt(text.getText());
				Boolean flag = provider.delete(recordNum);

				if (flag) {
					eventBroker.post(HreDbadminConstants.DATABASE_UPDATE_TOPIC, "Dummy");
					eventBroker.post(
							org.historyresearchenvironment.databaseadmin.HreDbadminConstants.TABLENAME_UPDATE_TOPIC,
							tableName);
					eventBroker.post("MESSAGE", "Record " + recordNum + " has been deleted");
				} else
					eventBroker.post("MESSAGE", "Record " + recordNum + " could not be deleted");
			}
		});
		btnDelete.setText("Delete");

		final Button btnResetDialog = new Button(compositeButtons, SWT.NONE);
		btnResetDialog.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Object lineObject : lineList) {
					String type = lineObject.getClass().getName();

					if (type.equals("org.eclipse.swt.widgets.Button")) {
						Button line = (Button) lineObject;
						line.setSelection(Boolean.FALSE);
					} else if (type.equals("org.eclipse.swt.widgets.Text")) {
						Text line = (Text) lineObject;
						line.setText("0");
					} else if (type.equals("org.eclipse.swt.widgets.Composite")) {
						Composite dateTime = (Composite) lineObject;
						Control[] children = dateTime.getChildren();
						DateTime date = (DateTime) children[0];
						date.setDate(2000, 1, 1);
						DateTime time = (DateTime) children[1];
						time.setTime(0, 0, 0);
					} else {
						System.out.println("Unimplemented type: " + type);
						System.exit(16);
					}
				}
			}
		});
		btnResetDialog.setText("Reset fields");

		final Button btnClose = new Button(compositeButtons, SWT.NONE);
		btnClose.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
				final MPart part = (MPart) stacks.get(stacks.size() - 1).getSelectedElement();
				partService.hidePart(part, true);
			}
		});
		btnClose.setText("Close");

	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent Shell
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.V_SCROLL);
		GridData gd_scrolledComposite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		scrolledComposite.setLayoutData(gd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		createLines(scrolledComposite);
		createButtons(parent);
		new Label(parent, SWT.NONE);
	}

	/**
	 * @param scrolledComposite
	 */
	private void createLines(ScrolledComposite scrolledComposite) {
		Text text;
		Label label2;

		if ((tableName == null) || (tableName == ""))
			return;

		provider = new H2TableProvider(tableName);
		count = provider.getCount();
		columns = provider.getModelList();
		row = provider.select(recordNum);

		Composite compositeFields = new Composite(scrolledComposite, SWT.NONE);
		compositeFields.setLayout(new GridLayout(3, false));

		lineList.clear();

		for (int i = 0; i < count; i++) {
			switch (columns.get(i).getNumericType()) {
			case HreDbadminConstants.BIGINT:
				text = createFieldLine(compositeFields, i);
				text.addVerifyListener(new NumericVerifyListener());
				columns.get(i).setValue(row.get(i));
				text.setText(Long.toString((Long) row.get(i)));
				lineList.add(text);
				break;
			case HreDbadminConstants.BLOB:
				text = createFieldLine(compositeFields, i);
				text.addVerifyListener(new HexVerifyListener());
				text.addFocusListener(new HexFocusListener());
				columns.get(i).setValue(row.get(i));
				Blob blob = (Blob) row.get(i);

				try {
					byte[] ba = blob.getBytes(1L, (int) blob.length());
					String s = new String(DatatypeConverter.printHexBinary(ba));
					text.setText(s);
				} catch (SQLException e) {
					text.setText("Blob could not be displayed");
				}
				lineList.add(text);
				break;
			case HreDbadminConstants.BOOLEAN:
				new Label(compositeFields, SWT.NONE);
				label2 = new Label(compositeFields, SWT.NONE);
				label2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
				label2.setText(columns.get(i).getType());

				final Button checkButton = new Button(compositeFields, SWT.CHECK);
				checkButton.setText(columns.get(i).getName());

				if (columns.get(i).getValue() == null)
					checkButton.setSelection(false);
				else if (columns.get(i).getValue().equals("TRUE"))
					checkButton.setSelection(true);
				else
					checkButton.setSelection(false);

				columns.get(i).setValue(checkButton.getSelection());
				lineList.add(checkButton);
				break;
			case HreDbadminConstants.CLOB:
				text = createFieldLine(compositeFields, i);
				columns.get(i).setValue(row.get(i));
				Clob clob = (Clob) row.get(i);
				try {
					text.setText(new String(clob.getSubString(1L, (int) clob.length())));
				} catch (SQLException e) {
					text.setText("Clob could not be displayed");
				}
				lineList.add(text);
				break;
			case HreDbadminConstants.DOUBLE:
				text = createFieldLine(compositeFields, i);
				text.addVerifyListener(new NumericVerifyListener());
				columns.get(i).setValue(row.get(i));
				text.setText(Double.toString((Double) row.get(i)));
				lineList.add(text);
				break;
			case HreDbadminConstants.INTEGER:
				text = createFieldLine(compositeFields, i);
				text.addVerifyListener(new NumericVerifyListener());
				columns.get(i).setValue(row.get(i));
				text.setText(Integer.toString((Integer) row.get(i)));
				lineList.add(text);
				break;
			case HreDbadminConstants.SMALLINT:
				text = createFieldLine(compositeFields, i);
				text.addVerifyListener(new NumericVerifyListener());
				columns.get(i).setValue(row.get(i));
				text.setText(Short.toString((Short) row.get(i)));
				lineList.add(text);
				break;
			case HreDbadminConstants.TIMESTAMP:
				final Label label = new Label(compositeFields, SWT.NONE);
				label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
				label.setText(columns.get(i).getName());

				label2 = new Label(compositeFields, SWT.NONE);
				label2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
				label2.setText(columns.get(i).getType());

				Timestamp timeStamp = (Timestamp) row.get(i);
				Calendar calendar = Calendar.getInstance();
				calendar.setTimeInMillis(timeStamp.getTime());

				Composite dateTime = new Composite(compositeFields, SWT.NONE);
				dateTime.setLayout(new GridLayout(2, false));

				DateTime date = new DateTime(dateTime, SWT.DATE);
				date.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
				DateTime time = new DateTime(dateTime, SWT.TIME);
				time.setTime(calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
				columns.get(i).setValue(row.get(i));
				lineList.add(dateTime);
				break;
			case HreDbadminConstants.VARBINARY:
				text = createFieldLine(compositeFields, i);
				text.addVerifyListener(new HexVerifyListener());
				text.addFocusListener(new HexFocusListener());
				text.addFocusListener(new LengthFocusListener(columns.get(i).getScale() * 2));
				text.setToolTipText("Use 0-9, a-f or A-F. Input longer than " + (columns.get(i).getScale() * 2)
						+ " will be truncated");
				columns.get(i).setValue(row.get(i));
				text.setText(new String(DatatypeConverter.printHexBinary((byte[]) row.get(i))));
				lineList.add(text);
				break;
			case HreDbadminConstants.VARCHAR:
				text = createFieldLine(compositeFields, i);
				text.addFocusListener(new LengthFocusListener(columns.get(i).getScale()));
				text.setToolTipText("Input longer than " + columns.get(i).getScale() + " will be truncated");
				columns.get(i).setValue(row.get(i));
				text.setText((String) row.get(i));
				lineList.add(text);
				break;
			default:
				System.out.println("Unimplemented type: " + columns.get(i).getType());
				System.exit(16);
				break;
			}
		}
		scrolledComposite.setContent(compositeFields);
		scrolledComposite.setMinSize(compositeFields.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	/**
	 * @param compositeFields
	 * @param i
	 * @return
	 */
	private Text createFieldLine(Composite compositeFields, int i) {
		final Label label = new Label(compositeFields, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		label.setText(columns.get(i).getName());

		final Label label2 = new Label(compositeFields, SWT.NONE);
		label2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		int scale = columns.get(i).getScale();

		if (scale > 0)
			label2.setText(columns.get(i).getType() + "(" + scale + ")");
		else
			label2.setText(columns.get(i).getType());

		final Text text = new Text(compositeFields, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		return text;
	}

	/**
	 * 
	 */
	@PreDestroy
	public void dispose() {
	}

	/**
	 * 
	 */
	@Focus
	public void setFocus() {
	}

	/**
	 * @param tableName
	 */
	@Inject
	@Optional
	private void subscribeNameUpdateTopic(
			@UIEventTopic(org.historyresearchenvironment.databaseadmin.HreDbadminConstants.TABLENAME_UPDATE_TOPIC) String tableName) {
		this.tableName = tableName;
		final List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		final MPart part = (MPart) stacks.get(stacks.size() - 1).getSelectedElement();
		part.setLabel(tableName);
	}

	/**
	 * @param recordNumString
	 */
	@Inject
	@Optional
	private void subscribeRecordNumUpdateTopic(
			@UIEventTopic(org.historyresearchenvironment.databaseadmin.HreDbadminConstants.RECORDNUM_UPDATE_TOPIC) String recordNumString) {
		this.recordNum = Integer.parseInt(recordNumString);
		createLines(scrolledComposite);
	}
}