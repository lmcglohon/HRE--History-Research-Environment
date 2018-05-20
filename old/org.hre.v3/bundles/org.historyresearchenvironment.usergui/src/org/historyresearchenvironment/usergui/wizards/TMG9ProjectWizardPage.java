package org.historyresearchenvironment.usergui.wizards;

import java.util.logging.Logger;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;
import org.historyresearchenvironment.usergui.providers.TMG9Provider;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * Run all load jobs to import a TMG9 project.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TMG9ProjectWizardPage extends WizardPage {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			"org.historyresearchenvironment.usergui");
	private Text textProject;
	private Composite container;
	private Button btnBrowse;
	private Label lblHDatabaseName;
	private Text textDbname;
	private Button btnSelect;
	@SuppressWarnings("unused")
	private Label lblNewLabel;
	private String name;
	private String project;
	private String dbName;

	/**
	 * 
	 */
	public TMG9ProjectWizardPage() {
		super("Wizard Page");
		setImageDescriptor(
				ResourceManager.getPluginImageDescriptor("org.historyresearchenvironment.usergui", "icons/TMG163.png"));
		setTitle("TMG 9 Project Conversion to H2 Database");
		setDescription(
				"Select a The Master Genealogist Version 9 Project\r\nSelect a H2 Database Name and Location\r\n");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.
	 * Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		container.setFont(getHreFont(parent));
		final GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		final Label labelProject = new Label(container, SWT.NONE);
		labelProject.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		labelProject.setText("TMG9 Project:");

		textProject = new Text(container, SWT.BORDER | SWT.SINGLE);
		textProject.setEditable(false);
		textProject.setText("");
		textProject.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!textProject.getText().isEmpty()) {
					setPageComplete(true);
				}
			}

		});
		textProject.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// required to avoid an error in the system
		setControl(container);

		btnBrowse = new Button(container, SWT.PUSH);
		btnBrowse.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final FileDialog fd = new FileDialog(parent.getShell(), SWT.OPEN);
				fd.setText("Open");
				fd.setFilterPath(".");
				final String[] filterExt = { "*.pjc", "*.*" };
				fd.setFilterExtensions(filterExt);
				project = fd.open();
				textProject.setText(project);
				name = FilenameUtils.getBaseName(project).replace("_", "");
				LOGGER.info("Project: " + project);
			}
		});
		btnBrowse.setText("Browse");

		lblNewLabel = new Label(container, SWT.NONE);

		lblHDatabaseName = new Label(container, SWT.NONE);
		lblHDatabaseName.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblHDatabaseName.setText("H2 Database name:");

		textDbname = new Text(container, SWT.BORDER);
		textDbname.setEditable(false);
		textDbname.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		btnSelect = new Button(container, SWT.NONE);
		btnSelect.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnSelect.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final FileDialog fd = new FileDialog(parent.getShell(), SWT.SAVE);
				fd.setText("Create");
				fd.setFileName(name);
				fd.setFilterPath(".");
				final String[] filterExt = { "*.h2.db", "*.*" };
				fd.setFilterExtensions(filterExt);
				dbName = fd.open();
				textDbname.setText(dbName);
				dbName = dbName.replace(".h2.db", "");
				LOGGER.info("Database; " + dbName);
				setPageComplete(true);

				runLoadJobs(parent);
			}
		});
		btnSelect.setText("Select");
		new Label(container, SWT.NONE);
		setPageComplete(false);
	}

	/**
	 * @param parent
	 * @return
	 */
	private Font getHreFont(Composite parent) {
		LOGGER.fine("Get HRE Font");
		Font font;

		try {
			final String s = store.getString("HREFONT");

			LOGGER.fine(s);
			final String[] sa = s.split("-");
			for (int i = 0; i < sa.length; i++) {
				LOGGER.fine("sa[" + i + "]: " + sa[i]);
			}
			final String[] sb = sa[0].split("\\|");
			for (int i = 0; i < sb.length; i++) {
				LOGGER.fine("sb[" + i + "]: " + sb[i]);
			}
			LOGGER.fine("HRE font: " + sb[1] + " " + Math.round(Double.valueOf(sb[2])) + " " + sb[3]);
			font = SWTResourceManager.getFont(sb[1], (int) Math.round(Double.valueOf(sb[2])), Integer.parseInt(sb[3]));
		} catch (final NumberFormatException e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			e.printStackTrace();

			font = parent.getShell().getFont();
			final FontData fd = font.getFontData()[0];
			font = SWTResourceManager.getFont(fd.getName(), 12, fd.getStyle());
		}

		return font;
	}

	/**
	 * @param parent
	 */
	private void runLoadJobs(Composite parent) {
		try {
			LOGGER.info("runLoadJobs");

			final ProgressMonitorDialog dialog = new ProgressMonitorDialog(parent.getShell());
			LOGGER.info("Dbname " + dbName + ", project: " + project);
			dialog.run(true, true, new TMG9Provider(dbName, project));
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}
}
