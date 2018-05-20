package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.historyresearchenvironment.usergui.clientinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.models.AncestorModel;
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.providers.AncestorTreeProvider;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class AncestorTree extends AbstractHREGuiPart {
	private Tree tree;
	private AncestorTreeProvider ancestorTreeProvider;
	private int perNo = 1;
	private AncestorModel item;

	/**
	 * Add ancestors recursively
	 * 
	 * @param parent
	 * @param perNo
	 */
	private void addBranch(TreeItem child, int perNo) {
		ancestorTreeProvider = new AncestorTreeProvider(perNo);

		final TreeItem currentTreeItem = new TreeItem(child, SWT.NONE);
		item = ancestorTreeProvider.getAncestorItems().getVector().get(0);
		currentTreeItem.setText(item.getName());

		if (item.getFather() != 0) {
			addBranch(currentTreeItem, item.getFather());
		}

		item = ancestorTreeProvider.getAncestorItems().getVector().get(0);

		if (item.getMother() != 0) {
			addBranch(currentTreeItem, item.getMother());
		}

		currentTreeItem.setExpanded(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int perNo) {
		store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		ancestorTreeProvider = new AncestorTreeProvider(perNo);

		req = new ServerRequest("GET", "ancestorlist", ancestorTreeProvider);

		final long before = System.nanoTime();

		resp = bli.callBusinessLayer(req);

		final long after = System.nanoTime();
		LOGGER.fine("Elapsed time in milliseconds: " + ((after - before) / 1000000));

		if (resp == null) {
			eventBroker.post("MESSAGE", "Call not successful");
			LOGGER.severe("Call not successful");
		} else if (resp.getReturnCode() != 0) {
			eventBroker.post("MESSAGE", resp.getReturnMessage());
			LOGGER.severe(resp.getReturnMessage());
		} else {
			ancestorTreeProvider = (AncestorTreeProvider) resp.getModel();

			try {
				if (tree != null) {
					this.perNo = perNo;
					updateGui();
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
		parent.setLayout(new GridLayout(1, false));
		tree = new Tree(parent, SWT.BORDER);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tree.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event e) {
				final TreeItem[] selection = tree.getSelection();
				final TreeItem ti = selection[0];
				final String string = ti.getText();
				final String[] sa = string.split(",");
				perNo = Integer.parseInt(sa[0]);
			}
		});

		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, perNo);
			}
		});

		callBusinessLayer(perNo);
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
		callBusinessLayer(perNo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
		tree.removeAll();

		final TreeItem root = new TreeItem(tree, SWT.NONE);

		ancestorTreeProvider = new AncestorTreeProvider(perNo);
		item = ancestorTreeProvider.getAncestorItems().getVector().get(0);
		root.setText(item.getName());

		if (item.getFather() != 0) {
			addBranch(root, item.getFather());
		}

		item = ancestorTreeProvider.getAncestorItems().getVector().get(0);

		if (item.getMother() != 0) {
			addBranch(root, item.getMother());
		}
		root.setExpanded(true);
	}
}