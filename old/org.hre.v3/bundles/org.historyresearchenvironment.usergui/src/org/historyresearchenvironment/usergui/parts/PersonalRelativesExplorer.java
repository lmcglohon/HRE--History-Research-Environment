package org.historyresearchenvironment.usergui.parts;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;
import org.historyresearchenvironment.usergui.clientinterface.BusinessLayerInterface;
import org.historyresearchenvironment.usergui.clientinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.dialogs.PersonSelectionDialog;
import org.historyresearchenvironment.usergui.models.PersonalRelativesItem;
import org.historyresearchenvironment.usergui.models.PersonalRelativesProvider;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class PersonalRelativesExplorer extends AbstractHREGuiPart {
	@Inject
	private IEventBroker eventBroker;

	private ScopedPreferenceStore store;

	private Text textIdentity;
	private PersonalRelativesExplorerComposite personalRelativesExplorerCompositePrev;
	private PersonalRelativesExplorerComposite personalRelativesExplorerCompositeThis;
	private PersonalRelativesExplorerComposite personalRelativesExplorerCompositeNext;

	private PersonalRelativesProvider prm;
	private BusinessLayerInterface bli;
	private ServerRequest req;
	private ServerResponse resp;

	@Override
	protected void callBusinessLayer(int i) {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		prm = new PersonalRelativesProvider();
		prm.setId(1);

		req = new ServerRequest("GET", "personalrelatives", prm);

		resp = bli.callBusinessLayer(req);
		try {
			prm = (PersonalRelativesProvider) resp.getProvider();
		} catch (final Exception e1) {
			eventBroker.post("MESSAGE", e1.getMessage());
			LOGGER.info(e1.getMessage());
		}

		parent.setLayout(new GridLayout(7, false));
		parent.setFont(getHreFont(parent));

		final Label lblIdentity = new Label(parent, SWT.NONE);
		lblIdentity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdentity.setText("Identity:");

		textIdentity = new Text(parent, SWT.BORDER);
		textIdentity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

		final Button btnSearch = new Button(parent, SWT.NONE);
		btnSearch.setToolTipText("Select a person by ID");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				final Display display = Display.getDefault();
				final Shell shell = new Shell(display);
				final PersonSelectionDialog dialog = new PersonSelectionDialog(shell);
				dialog.open();

				store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.historyresearchenvironment.usergui");
				bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
				prm = new PersonalRelativesProvider();
				prm.setId(Integer.parseInt(store.getString("PERNO")));

				req = new ServerRequest("GET", "personalrelatives", prm);

				final long before = System.nanoTime();

				resp = bli.callBusinessLayer(req);

				final long after = System.nanoTime();

				LOGGER.fine("Elapsed time in milliseconds: " + ((after - before) / 1000000));

				if (resp == null) {
					eventBroker.post("MESSAGE", "Call not successful");
				} else if (resp.getReturnCode() != 0) {
					eventBroker.post("MESSAGE", resp.getReturnMessage());
				} else {
					prm = (PersonalRelativesProvider) resp.getProvider();

					try {
						populateExplorer();
					} catch (final Exception e2) {
						LOGGER.info("PRE Error in request " + req.getOperation() + " " + req.getModelName() + ", "
								+ e2.getMessage());
						eventBroker.post("MESSAGE", e2.getMessage());
					}
				}
			}
		});
		btnSearch.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		final Button btnNewButton_1 = new Button(parent, SWT.NONE);
		btnNewButton_1.setToolTipText("A nice star picture");
		btnNewButton_1
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon2.png"));

		final Button btnNewButton_2 = new Button(parent, SWT.NONE);
		btnNewButton_2.setToolTipText("Probably meant to squeeze something?");
		btnNewButton_2
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon3.png"));

		final Button btnNewButton_3 = new Button(parent, SWT.NONE);
		btnNewButton_3.setToolTipText("Does nothing");
		btnNewButton_3
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		final Label lblShowRelativesBy = new Label(parent, SWT.NONE);
		lblShowRelativesBy.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblShowRelativesBy.setText("Show Relatives by:");

		final Combo comboRelativesBy = new Combo(parent, SWT.NONE);
		comboRelativesBy.setItems(new String[] { "Generation", "Common Ancestor", "Birth Date" });
		comboRelativesBy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboRelativesBy.select(0);

		final Button btnOptions = new Button(parent, SWT.NONE);
		btnOptions.setText("Options");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);

		personalRelativesExplorerCompositePrev = new PersonalRelativesExplorerComposite(parent, SWT.NONE);
		personalRelativesExplorerCompositePrev.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));

		final Label label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 7, 1));

		personalRelativesExplorerCompositeThis = new PersonalRelativesExplorerComposite(parent, SWT.NONE);
		personalRelativesExplorerCompositeThis.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));

		final Label label_1 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 7, 1));

		personalRelativesExplorerCompositeNext = new PersonalRelativesExplorerComposite(parent, SWT.NONE);
		personalRelativesExplorerCompositeNext.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));

		populateExplorer();
	}

	@PreDestroy
	public void dispose() {
	}

	protected void populateExplorer() {
		TableItem ti;

		textIdentity.setText(prm.getIdentity());
		personalRelativesExplorerCompositePrev.getTextGenNo().setText("-1");
		personalRelativesExplorerCompositePrev.getTextComAncM().setText(prm.getComAncMPrev());
		personalRelativesExplorerCompositePrev.getTextComAncF().setText(prm.getComAncFPrev());
		final Table parents = personalRelativesExplorerCompositePrev.getTableParents();
		parents.removeAll();

		try {
			final Iterator<PersonalRelativesItem> iterator = prm.getLastGen().iterator();

			while (iterator.hasNext()) {
				final PersonalRelativesItem item = iterator.next();
				ti = new TableItem(parents, SWT.NONE);
				ti.setText(item.getStrings());
			}
		} catch (final Exception e) {
			eventBroker.post("MESSAGE", e.getClass() + " " + e.getMessage());
			LOGGER.info(e.getClass() + " " + e.getMessage());
		}

		personalRelativesExplorerCompositeThis.getTextGenNo().setText("0");
		personalRelativesExplorerCompositeThis.getTextComAncM().setText(prm.getComAncMThis());
		personalRelativesExplorerCompositeThis.getTextComAncF().setText(prm.getComAncFThis());
		final Table current = personalRelativesExplorerCompositeThis.getTableParents();
		current.removeAll();

		try {
			final Iterator<PersonalRelativesItem> iterator = prm.getThisGen().iterator();

			while (iterator.hasNext()) {
				final PersonalRelativesItem personalRelativesItem = iterator.next();
				ti = new TableItem(current, SWT.NONE);
				ti.setText(personalRelativesItem.getStrings());
			}
		} catch (final Exception e) {
			eventBroker.post("MESSAGE", e.getClass() + " " + e.getMessage());
			LOGGER.info(e.getClass() + " " + e.getMessage());
		}

		personalRelativesExplorerCompositeNext.getTextGenNo().setText("+1");
		personalRelativesExplorerCompositeNext.getTextComAncM().setText(prm.getComAncMNext());
		personalRelativesExplorerCompositeNext.getTextComAncF().setText(prm.getComAncFNext());
		final Table children = personalRelativesExplorerCompositeNext.getTableParents();
		children.removeAll();

		try {
			final Iterator<PersonalRelativesItem> iterator = prm.getNextGen().iterator();

			while (iterator.hasNext()) {
				final PersonalRelativesItem personalRelativesItem = iterator.next();
				ti = new TableItem(children, SWT.NONE);
				ti.setText(personalRelativesItem.getStrings());
			}
		} catch (final Exception e) {
			eventBroker.post("MESSAGE", e.getClass() + " " + e.getMessage());
			LOGGER.info(e.getClass() + " " + e.getMessage());
		}
	}

	@Focus
	public void setFocus() {
	}

	@Override
	protected void updateGui() {
	}
}
