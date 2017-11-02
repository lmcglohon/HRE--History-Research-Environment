/**
 * 
 */
package org.historyresearchenvironment.usergui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.historyresearchenvironment.usergui.models.PersonTableModel;
import org.historyresearchenvironment.usergui.providers.PersonTableContentProvider;

/**
 * @author Michael Erichsen
 *
 */
public class PersonTableViewer extends AbstractHREGuiPart {

	public PersonTableViewer() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		final TableViewer v = new TableViewer(parent);
		v.setLabelProvider(new LabelProvider());
		// for demonstration purposes use custom content provider
		// alternatively you could use ArrayContentProvider.getInstance()
		v.setContentProvider(new PersonTableContentProvider());
		PersonTableModel[] model = createModel();
		v.setInput(model);
		v.getTable().setLinesVisible(true);
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO Set the focus to control
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#
	 * callBusinessLayer(int)
	 */
	@Override
	protected void callBusinessLayer(int i) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.parts.AbstractHREGuiPart#updateGui()
	 */
	@Override
	protected void updateGui() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return
	 */
	private PersonTableModel[] createModel() {
		PersonTableModel[] elements = new PersonTableModel[10];

		for (int i = 0; i < 10; i++) {
			elements[i] = new PersonTableModel(i);
		}

		return elements;
	}
}
