package org.historyresearchenvironment.sample.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * View part for the sample.
 * 
 * @version 2018-06-29
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleViewPart {
	private Text textSubstnParamNamePid;
	private Text textDefltValue;

	/**
	 * Constructor
	 *
	 */
	public SampleViewPart() {
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		final Label lblSubstitutionParameterName = new Label(parent, SWT.NONE);
		lblSubstitutionParameterName.setText("Substitution Parameter Name Pid");

		textSubstnParamNamePid = new Text(parent, SWT.BORDER);
		textSubstnParamNamePid.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblDafaultValue = new Label(parent, SWT.NONE);
		lblDafaultValue.setText("Dafault Value");

		textDefltValue = new Text(parent, SWT.BORDER);
		textDefltValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 2, 1));

		final Button btnGet = new Button(composite, SWT.NONE);
		btnGet.setText("Get (Select)");

		final Button btnPost = new Button(composite, SWT.NONE);
		btnPost.setText("Post (Insert)");

		final Button btnPut = new Button(composite, SWT.NONE);
		btnPut.setText("Put (Update)");

		final Button btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setText("Delete");

		final Button btnClose = new Button(composite, SWT.NONE);
		btnClose.addMouseListener(new MouseAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.MouseAdapter#mouseDown(org.eclipse.swt.events.
			 * MouseEvent)
			 */
			@Override
			public void mouseDown(MouseEvent e) {
				parent.getShell().close();
			}
		});
		btnClose.setText("Close");
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
}
