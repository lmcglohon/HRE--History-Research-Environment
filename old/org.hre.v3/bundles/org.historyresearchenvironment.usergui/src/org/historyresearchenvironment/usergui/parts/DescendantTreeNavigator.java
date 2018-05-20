package org.historyresearchenvironment.usergui.parts;

import java.util.Vector;

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
import org.historyresearchenvironment.usergui.models.HreEventConstants;
import org.historyresearchenvironment.usergui.providers.DescendantTreeProvider;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class DescendantTreeNavigator extends AbstractHREGuiPart {
	private Tree tree;
	private DescendantTreeProvider descendantTreeProvider = new DescendantTreeProvider();
	private int perNo = 1;
	private Vector<Integer> children;

	/**
	 * Add descendants recursively
	 * 
	 * @param parent
	 * @param perNo
	 */
	private void addBranch(TreeItem parent, int perNo) {
		descendantTreeProvider.setPerNo(perNo);

		final TreeItem currentTreeItem = new TreeItem(parent, SWT.NONE);
		currentTreeItem.setText(descendantTreeProvider.getDescendantItems().getVector().get(0).getName());

		for (final Integer child : descendantTreeProvider.getDescendantItems().getVector().get(0).getChildren()) {
			addBranch(currentTreeItem, child);
		}

		currentTreeItem.setExpanded(true);
	}

	@Override
	protected void callBusinessLayer(int perNo) {
		store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		descendantTreeProvider = new DescendantTreeProvider(perNo);

		req = new ServerRequest("GET", "descendantlist", descendantTreeProvider);

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
			descendantTreeProvider = (DescendantTreeProvider) resp.getProvider();

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
		tree.setFont(getHreFont(parent));
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

	@PreDestroy
	public void dispose() {
	}

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

		descendantTreeProvider = new DescendantTreeProvider(perNo);
		root.setText(descendantTreeProvider.getDescendantItems().getVector().get(0).getName());
		children = descendantTreeProvider.getDescendantItems().getVector().get(0).getChildren();

		if (children != null) {
			for (final Integer child : children) {
				addBranch(root, child);
			}
		}
		root.setExpanded(true);
	}
}