package org.historyresearchenvironment.usergui.wizards;

import org.eclipse.jface.wizard.Wizard;

/**
 * Wizard for importing TMG V9 Projects.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TMG9ProjectWizard extends Wizard {
	protected TMG9ProjectWizardPage wizardPage;

	/**
	 * Constructor
	 *
	 */
	public TMG9ProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		wizardPage = new TMG9ProjectWizardPage();
		addPage(wizardPage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#getWindowTitle()
	 */
	@Override
	public String getWindowTitle() {
		return "Convert TMG9 Project";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {

		return true;
	}
}