package org.historyresearchenvironment.sample.client.parts;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.historyresearchenvironment.client.HreConstants;
import org.historyresearchenvironment.client.listeners.NumericVerifyListener;
import org.historyresearchenvironment.client.parts.AbstractHreGuiPart;
import org.historyresearchenvironment.sample.client.providers.SampleViewProvider;

/**
 * View part for the sample.
 * 
 * @version 2018-07-03
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleViewPart extends AbstractHreGuiPart {
	@Inject
	private EPartService partService;
	@Inject
	private EModelService modelService;
	@Inject
	private MApplication application;

	SampleViewProvider provider = new SampleViewProvider();
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
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		final Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblNewLabel.setText("Substitution Parameter Name Pid");

		textSubstnParamNamePid = new Text(parent, SWT.BORDER);
		textSubstnParamNamePid.addVerifyListener(new NumericVerifyListener());
		textSubstnParamNamePid.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblDefaultValue = new Label(parent, SWT.NONE);
		lblDefaultValue.setText("Default Value");

		textDefltValue = new Text(parent, SWT.BORDER);
		textDefltValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 2, 1));

		final Button btnOk = new Button(composite, SWT.NONE);
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Update
			}
		});
		btnOk.setText("OK");

		final Button btnClose = new Button(composite, SWT.NONE);
		btnClose.addSelectionListener(new SelectionAdapter() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events
			 * .SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				final List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
				final MPart part = (MPart) stacks.get(stacks.size() - 2).getSelectedElement();
				partService.hidePart(part, true);
			}

		});
		btnClose.setText("Close");

		callBusinessLayer("GET", "sampleview", new SampleViewProvider(), "1");
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.client.parts.AbstractHreGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
		textSubstnParamNamePid.setText(Integer.toString(provider.getSubstnParamName()));
		textDefltValue.setText(provider.getDefltValue());
	}

	/**
	 * @param key
	 */
	@Inject
	@Optional
	private void subscribeKeyUpdateTopic(@UIEventTopic(HreConstants.KEY_UPDATE_TOPIC) String key) {
		LOGGER.info("Updating to " + key);
		callBusinessLayer("GET", "sampleview", new SampleViewProvider(), key);
	}

}
