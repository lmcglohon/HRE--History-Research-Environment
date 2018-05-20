package org.historyresearchenvironment.usergui.providers;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.CreateH2Database;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.TableLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.TmgTypes;
import org.historyresearchenvironment.usergui.models.HreEventConstants;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

/**
 * Import a TMG9 project from Visual FoxPro to H2.
 * 
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class TMG9Provider implements IRunnableWithProgress {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Inject
	private IEventBroker eventBroker;
	private final ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE,
			"org.historyresearchenvironment.usergui");
	private String dbName;
	private String project;

	/**
	 * @param dbName
	 * @param project
	 */
	public TMG9Provider(String dbName, String project) {
		super();
		this.dbName = dbName;
		this.project = project;
	}

	/**
	 * @return the dbName
	 */
	public String getDbName() {
		return dbName;
	}

	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.
	 * runtime.IProgressMonitor)
	 */
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		LOGGER.info("Run");
		final SubMonitor subMonitor = SubMonitor.convert(monitor, 30);
		TableLoader ld;

		try {
			subMonitor.beginTask("Converting TMG9 Project " + project + " to H2", 30);
			subMonitor.subTask("Creating H2 Database " + dbName);

			store.putValue("DBNAME", dbName);
			final CreateH2Database createH2Database = new CreateH2Database(dbName,
					subMonitor.split(2, SubMonitor.SUPPRESS_NONE));
			createH2Database.run();
			subMonitor.worked(2);
			LOGGER.info("DB " + dbName + " created");

			ld = new TableLoader(project, TmgTypes.DATA_SET, "DATASET", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.DNA, "DNA", dbName, subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.EVENT, "EVENT", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.EVENT_WITNESS, "EVENTWITNESS", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.EXCLUDED_PAIR, "EXCLUDEDPAIR", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.EXHIBIT, "EXHIBIT", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.FLAG, "FLAG", dbName, subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.FOCUS_GROUP, "FOCUSGROUP", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.FOCUS_GROUP_MEMBER, "FOCUSGROUPMEMBER", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.NAME, "NAME", dbName, subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.NAME_DICTIONARY, "NAMEDICTIONARY", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.NAME_PART_TYPE, "NAMEPARTTYPE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.NAME_PART_VALUE, "NAMEPARTVALUE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.PARENT_CHILD_RELATIONSHIP, "PARENTCHILDRELATIONSHIP", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.PERSON, "PERSON", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.PLACE, "PLACE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.PLACE_DICTIONARY, "PLACEDICTIONARY", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.PLACE_PART_TYPE, "PLACEPARTTYPE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.PLACE_PART_VALUE, "PLACEPARTVALUE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.REPOSITORY, "REPOSITORY", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.REPOSITORY_LINK, "REPOSITORYLINK", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.RESEARCH_LOG, "RESEARCHLOG", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.SOURCE, "SOURCE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.SOURCE_CITATION, "SOURCECITATION", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.SOURCE_ELEMENT, "SOURCEELEMENT", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.SOURCE_TYPE, "SOURCETYPE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.STYLE, "STYLE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.TAG_TYPE, "TAGTYPE", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);

			ld = new TableLoader(project, TmgTypes.TIMELINE_LOCK, "TIMELINELOCK", dbName,
					subMonitor.split(1, SubMonitor.SUPPRESS_NONE));
			ld.run();
			subMonitor.worked(1);
			// TODO SELECT MIN???
			eventBroker.post(HreEventConstants.PERSON_UPDATE_TOPIC, 1);
		} catch (final Exception e) {
			StringBuilder sb = new StringBuilder(e.getClass() + " " + e.getMessage());

			for (final StackTraceElement element : e.getStackTrace()) {
				sb.append("\n" + element.toString());
			}
		}

	}

	/**
	 * @param dbName
	 *            the dbName to set
	 */
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}
}
