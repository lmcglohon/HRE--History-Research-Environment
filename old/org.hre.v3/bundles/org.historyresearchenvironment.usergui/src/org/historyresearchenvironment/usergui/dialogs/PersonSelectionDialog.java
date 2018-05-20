package org.historyresearchenvironment.usergui.dialogs;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * Dialog to select the ID of a person.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class PersonSelectionDialog extends Dialog {
	private final ScopedPreferenceStore store;
	private Text textPerNo;
	private String perNo = "";

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public PersonSelectionDialog(Shell parentShell) {
		super(parentShell);
		store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Select Person by ID");
		Font font = newShell.getFont();
		final FontData fd = font.getFontData()[0];
		font = SWTResourceManager.getFont(fd.getName(), 12, fd.getStyle());
		newShell.setFont(font);
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		final Button button = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				store.putValue("PERNO", perNo);
			}
		});
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		final Label lblSelectPersonId = new Label(container, SWT.NONE);
		lblSelectPersonId.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblSelectPersonId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSelectPersonId.setText("Person Id:");

		textPerNo = new Text(container, SWT.BORDER);
		textPerNo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				perNo = textPerNo.getText();
			}
		});
		textPerNo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		perNo = store.getString("PERNO");

		return container;
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(286, 139);
	}
}
