package org.historyresearchenvironment.sample.parts;

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
import org.historyresearchenvironment.sample.providers.SampleViewProvider1;

/**
 * View part for the sample.
 * 
 * @version 2018-07-07
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

	SampleViewProvider1 provider = new SampleViewProvider1();
	private Text textparamSetKey;
	private Text textDefltValue;
	private Text textparamListKey;

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
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		lblNewLabel.setText("Paremeter Set Key");

		textparamSetKey = new Text(parent, SWT.BORDER);
		textparamSetKey.addVerifyListener(new NumericVerifyListener());
		textparamSetKey.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Label lblDefaultValue = new Label(parent, SWT.NONE);
		lblDefaultValue.setText("Default Value");

		textDefltValue = new Text(parent, SWT.BORDER);
		textDefltValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblParameterListKey = new Label(parent, SWT.NONE);
		lblParameterListKey.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblParameterListKey.setText("Parameter List Key");

		textparamListKey = new Text(parent, SWT.BORDER);
		textparamListKey.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 2, 1));

		final Button btnOk = new Button(composite, SWT.NONE);
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				callBusinessLayer("GET", provider, Integer.parseInt(textparamSetKey.getText()));
				updateGui();
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

		callBusinessLayer("GET", provider, "1");
	}

	/**
	 * @param operation
	 * @param provider2
	 * @param parseInt
	 */
	protected void callBusinessLayer(String operation, SampleViewProvider1 provider2, int parseInt) {
		// TODO Auto-generated method stub
		
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
		textparamListKey.setText(Integer.toString(provider.getParamListKey()));
		textparamSetKey.setText(Integer.toString(provider.getParamSetKey()));
		textDefltValue.setText(provider.getDefltValue());
	}

	/**
	 * @param key
	 */
	@Inject
	@Optional
	private void subscribeKeyUpdateTopic(@UIEventTopic(HreConstants.KEY_UPDATE_TOPIC) String key) {
		LOGGER.info("Updating to " + key);
		callBusinessLayer("GET", provider, key);
	}

}
