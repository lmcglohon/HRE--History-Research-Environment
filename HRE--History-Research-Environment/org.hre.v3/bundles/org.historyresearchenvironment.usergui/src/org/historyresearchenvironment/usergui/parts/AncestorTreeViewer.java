package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.historyresearchenvironment.usergui.models.AncestorTreeModel;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.providers.AncestorTreeContentProvider;
import org.historyresearchenvironment.usergui.providers.AncestorTreeLabelProvider;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;

/**
 * @author Michael Erichsen
 */
public class AncestorTreeViewer extends AbstractHREGuiPart {
	private int perNo = 1;
	private TreeViewer viewer;
	private Tree tree;
	private AncestorTreeModel model;

	/**
	 * 
	 */
	public AncestorTreeViewer() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int perNo) {
		iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		model = new AncestorTreeModel(perNo);

		req = new ServerRequest("GET", "ancestorlist", model);

		final long before = System.nanoTime();

		resp = bli.callBusinessLayer(req);

		final long after = System.nanoTime();
		LOGGER.info("Elapsed time in milliseconds: " + ((after - before) / 1000000));

		if (resp == null) {
			eventBroker.post("MESSAGE", "Call not successful");
			LOGGER.severe("Call not successful");
		} else if (resp.getReturnCode() != 0) {
			eventBroker.post("MESSAGE", resp.getReturnMessage());
			LOGGER.severe(resp.getReturnMessage());
		} else {
			model = (AncestorTreeModel) resp.getModel();

			try {
				if (tree != null) {
					this.perNo = perNo;
					// updateGui();
				}
			} catch (final Exception e2) {
				eventBroker.post("MESSAGE", e2.getMessage());
				LOGGER.severe(
						"Error in request " + req.getOperation() + " " + req.getModelName() + ", " + e2.getMessage());
			}
		}
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		LOGGER.fine("Creating controls");
		viewer = new TreeViewer(parent, SWT.BORDER);
		tree = viewer.getTree();

		tree.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				LOGGER.info(e.toString());

				if (e.item instanceof TreeItem) {
					TreeItem item = (TreeItem) e.item;
					String string = item.getText();
					String[] sa = string.split(",");
					perNo = Integer.parseInt(sa[0]);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				LOGGER.info("Double clicking " + perNo);
				eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, perNo);
			}
		});

		viewer.setLabelProvider(new AncestorTreeLabelProvider());
		viewer.setContentProvider(new AncestorTreeContentProvider());
		callBusinessLayer(perNo);
		viewer.setInput(createModel(perNo));
	}

	/**
	 * @return
	 */
	private AncestorTreeModel createModel(int perNo) {
		return new AncestorTreeModel(perNo);
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
	 * 
	 * @param perNo
	 */
	@Inject
	@Optional
	private void subscribePersonUpdateTopic(@UIEventTopic(HreEventConstants.PERSON_UPDATE_TOPIC) int perNo) {
		LOGGER.info("Received " + perNo);
		if (perNo != this.perNo) {
			tree.removeAll();
			callBusinessLayer(perNo);
			viewer.setInput(createModel(perNo));
			// viewer.refresh();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
		LOGGER.info("Refresh viewer");
		tree.removeAll();
		viewer.refresh();
	}
}