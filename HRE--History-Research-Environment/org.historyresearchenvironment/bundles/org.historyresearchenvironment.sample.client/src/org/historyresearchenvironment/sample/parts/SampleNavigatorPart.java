package org.historyresearchenvironment.sample.parts;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.historyresearchenvironment.client.HreConstants;
import org.historyresearchenvironment.client.parts.AbstractHreGuiPart;
import org.historyresearchenvironment.sample.providers.SampleListProvider;
import org.historyresearchenvironment.sample.providers.SampleNavigatorProvider;

/**
 * A navigator view part for sample models.
 * 
 * @version 2018-07-11
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
@SuppressWarnings("restriction")
public class SampleNavigatorPart extends AbstractHreGuiPart {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Inject
	private EPartService partService;
	@Inject
	private EModelService modelService;
	@Inject
	private MApplication application;
	@Inject
	private IEventBroker eventBroker;
	@Inject
	private ECommandService commandService;
	@Inject
	private EHandlerService handlerService;

	private Table table;
	private final SampleNavigatorProvider provider = new SampleNavigatorProvider();
	private TableViewer tableViewer;
	private Composite parent;

	/**
	 * Constructor
	 *
	 */
	public SampleNavigatorPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parentC) {
		parent = parentC;
		parent.setLayout(new GridLayout(1, false));

		tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

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
		btnClose.setBounds(10, 29, 41, 25);
		table.addMouseListener(new MouseAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.swt.events.MouseAdapter#mouseDoubleClick(org.eclipse.swt.events.
			 * MouseEvent)
			 */
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				openSampleEditor();
			}
		});

		callBusinessLayer("GET", provider, "1");
	}

	/**
	 * 
	 */
	protected void openSampleEditor() {
		String paramSetKey = "0";

		// Open an editor
		final ParameterizedCommand command = commandService
				.createCommand("org.historyresearchenvironment.sample.client.command.sampleeditoropen", null);
		handlerService.executeHandler(command);
		LOGGER.info("Navigator opened editor");

		final TableItem[] selectedRows = table.getSelection();

		if (selectedRows.length > 0) {
			final TableItem selectedRow = selectedRows[0];
			paramSetKey = selectedRow.getText(0);
		}

		eventBroker.post(org.historyresearchenvironment.sample.client.Constants.PARAMETER_SET_KEY_UPDATE_TOPIC,
				paramSetKey);
		LOGGER.info("Navigator posted key " + paramSetKey);

		eventBroker.post("MESSAGE", "Sample editor has been opened");
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
		try {
			SampleListProvider provider = new SampleListProvider();

			int count = provider.getCount();
			parent.setLayout(new GridLayout());

			if (table.getColumnCount() == 0) {
				final TableViewerColumn[] tvc = new TableViewerColumn[count];
				final TableColumn[] tc = new TableColumn[count];

				for (int i = 0; i < count; i++) {
					tvc[i] = new TableViewerColumn(tableViewer, SWT.NONE);
					tc[i] = tvc[i].getColumn();
					tc[i].setWidth(100);
//					tc[i].setText(provider.getModelList().get(i).getName());
				}
			}

			List<List<Object>> rowList;

			rowList = provider.selectAll();

			table.removeAll();

			for (int i = 0; i < rowList.size(); i++) {
				final TableItem item = new TableItem(table, SWT.NONE);
				final List<Object> row = rowList.get(i);
				for (int j = 0; j < row.size(); j++) {
					if (row.get(j) != null) {
						item.setText(j, (String) row.get(j));
					} else {
						item.setText(j, "");
					}
				}
			}
		} catch (final Exception e) {
			e.printStackTrace();
			eventBroker.post("MESSAGE", e.getMessage());
			LOGGER.severe(e.getMessage());
		}

	}

	@Inject
	@Optional
	private void subscribeSampleModelUpdateTopic(@UIEventTopic(HreConstants.SAMPLE_MODEL_UPDATE_TOPIC) String key) {
		callBusinessLayer("GET", provider, key);
	}
}
