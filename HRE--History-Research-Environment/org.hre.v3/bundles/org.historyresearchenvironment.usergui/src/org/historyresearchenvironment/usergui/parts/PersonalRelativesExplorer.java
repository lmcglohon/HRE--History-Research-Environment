package org.historyresearchenvironment.usergui.parts;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
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
import org.historyresearchenvironment.usergui.dialogs.PersonSelectionDialog;
import org.historyresearchenvironment.usergui.models.PersonalRelativesItem;
import org.historyresearchenvironment.usergui.models.PersonalRelativesModel;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterface;
import org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterfaceFactory;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

public class PersonalRelativesExplorer extends AbstractHREGuiPart {
	@Inject
	private IEventBroker eventBroker;

	private IEclipsePreferences iep;

	private Text textIdentity;
	private PersonalRelativesExplorerComposite personalRelativesExplorerCompositePrev;
	private PersonalRelativesExplorerComposite personalRelativesExplorerCompositeThis;
	private PersonalRelativesExplorerComposite personalRelativesExplorerCompositeNext;

	private PersonalRelativesModel prm;
	private BusinessLayerInterface bli;
	private ServerRequest req;
	private ServerResponse resp;

	/**
	 * 
	 */
	public PersonalRelativesExplorer() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
		prm = new PersonalRelativesModel();
		prm.setId(1);

		req = new ServerRequest("GET", "personalrelatives", prm);

		resp = bli.callBusinessLayer(req);
		try {
			prm = (PersonalRelativesModel) resp.getModel();
		} catch (Exception e1) {
			eventBroker.post("MESSAGE", e1.getMessage());
			LOGGER.info(e1.getMessage());
		}

		parent.setLayout(new GridLayout(7, false));

		Label lblIdentity = new Label(parent, SWT.NONE);
		lblIdentity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdentity.setText("Identity:");

		textIdentity = new Text(parent, SWT.BORDER);
		textIdentity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

		Button btnSearch = new Button(parent, SWT.NONE);
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Display display = Display.getDefault();
				Shell shell = new Shell(display);
				PersonSelectionDialog dialog = new PersonSelectionDialog(shell);
				dialog.open();

				iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");
				bli = BusinessLayerInterfaceFactory.getBusinessLayerInterface();
				prm = new PersonalRelativesModel();
				prm.setId(Integer.parseInt(iep.get("PERNO", "88")));

				req = new ServerRequest("GET", "personalrelatives", prm);

				long before = System.nanoTime();

				resp = bli.callBusinessLayer(req);

				long after = System.nanoTime();

				LOGGER.info("Elapsed time in milliseconds: " + ((after - before) / 1000000));

				if (resp == null) {
					eventBroker.post("MESSAGE", "Call not successful");
				} else if (resp.getReturnCode() != 0) {
					eventBroker.post("MESSAGE", resp.getReturnMessage());
				} else {
					prm = (PersonalRelativesModel) resp.getModel();

					try {
						populateExplorer();
					} catch (Exception e2) {
						LOGGER.info("PRE Error in request " + req.getOperation() + " " + req.getModelName() + ", "
								+ e2.getMessage());
						eventBroker.post("MESSAGE", e2.getMessage());
					}
				}
			}
		});
		btnSearch.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		Button btnNewButton_1 = new Button(parent, SWT.NONE);
		btnNewButton_1
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon2.png"));

		Button btnNewButton_2 = new Button(parent, SWT.NONE);
		btnNewButton_2
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon3.png"));

		Button btnNewButton_3 = new Button(parent, SWT.NONE);
		btnNewButton_3
				.setImage(ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/Icon1.png"));

		Label lblShowRelativesBy = new Label(parent, SWT.NONE);
		lblShowRelativesBy.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblShowRelativesBy.setText("Show Relatives by:");

		Combo comboRelativesBy = new Combo(parent, SWT.NONE);
		comboRelativesBy.setItems(new String[] { "Generation", "Common Ancestor", "Birth Date" });
		comboRelativesBy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboRelativesBy.select(0);

		Button btnOptions = new Button(parent, SWT.NONE);
		btnOptions.setText("Options");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);

		personalRelativesExplorerCompositePrev = new PersonalRelativesExplorerComposite(parent, SWT.NONE);
		personalRelativesExplorerCompositePrev.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));

		Label label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 7, 1));

		personalRelativesExplorerCompositeThis = new PersonalRelativesExplorerComposite(parent, SWT.NONE);
		personalRelativesExplorerCompositeThis.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 7, 1));

		Label label_1 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
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
		Table parents = personalRelativesExplorerCompositePrev.getTableParents();
		parents.removeAll();

		try {
			Iterator<PersonalRelativesItem> iterator = prm.getLastGen().iterator();

			while (iterator.hasNext()) {
				PersonalRelativesItem item = iterator.next();
				ti = new TableItem(parents, SWT.NONE);
				ti.setText(item.getStrings());
			}
		} catch (Exception e) {
			eventBroker.post("MESSAGE", e.getMessage());
			LOGGER.info(e.getMessage());
		}

		personalRelativesExplorerCompositeThis.getTextGenNo().setText("0");
		personalRelativesExplorerCompositeThis.getTextComAncM().setText(prm.getComAncMThis());
		personalRelativesExplorerCompositeThis.getTextComAncF().setText(prm.getComAncFThis());
		Table current = personalRelativesExplorerCompositeThis.getTableParents();
		current.removeAll();

		try {
			Iterator<PersonalRelativesItem> iterator = prm.getThisGen().iterator();

			while (iterator.hasNext()) {
				PersonalRelativesItem personalRelativesItem = iterator.next();
				ti = new TableItem(current, SWT.NONE);
				ti.setText(personalRelativesItem.getStrings());
			}
		} catch (Exception e) {
			eventBroker.post("MESSAGE", e.getMessage());
			LOGGER.info(e.getMessage());
		}

		personalRelativesExplorerCompositeNext.getTextGenNo().setText("+1");
		personalRelativesExplorerCompositeNext.getTextComAncM().setText(prm.getComAncMNext());
		personalRelativesExplorerCompositeNext.getTextComAncF().setText(prm.getComAncFNext());
		Table children = personalRelativesExplorerCompositeNext.getTableParents();
		children.removeAll();

		try {
			Iterator<PersonalRelativesItem> iterator = prm.getNextGen().iterator();

			while (iterator.hasNext()) {
				PersonalRelativesItem personalRelativesItem = iterator.next();
				ti = new TableItem(children, SWT.NONE);
				ti.setText(personalRelativesItem.getStrings());
			}
		} catch (Exception e) {
			eventBroker.post("MESSAGE", e.getMessage());
			LOGGER.info(e.getMessage());
		}
	}

	@Focus
	public void setFocus() {
	}

	@Override
	protected void callBusinessLayer(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateGui() {
		// TODO Auto-generated method stub
		
	}
}
