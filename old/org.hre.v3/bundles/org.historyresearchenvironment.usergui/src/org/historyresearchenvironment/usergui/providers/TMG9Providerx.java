package org.historyresearchenvironment.usergui.providers;

import java.util.logging.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.CreateH2Database;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.DatasetLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.DnaLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.EventLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.EventWitnessLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.ExcludedPairLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.ExhibitLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.FocusGroupLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.FocusGroupMemberLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.NameDictionaryLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.NameLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.NamePartTypeLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.NamePartValueLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.ParentChildRealationshipLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.PersonLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.PlaceDictionaryLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.PlaceLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.PlacePartTypeLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.PlacePartValueLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.RepositoryLinkLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.RepositoryLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.ResearchLogLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.SourceCitationLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.SourceElementLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.SourceLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.SourceTypeLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.StyleLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.TagTypeLoader;
import org.historyresearchenvironment.tmg.h2.Dbf2H2.TimelineLockLoader;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
class TMG9Provider implements IRunnableWithProgress {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private String dbName;
	private String userid;
	private String password;
	private String project;

	/**
	 * @param dbName
	 * @param userid
	 * @param password
	 * @param project
	 */
	public TMG9Provider(String dbName, String userid, String password, String project) {
		super();
		this.dbName = dbName;
		this.userid = userid;
		this.password = password;
		this.project = project;
	}

	/**
	 * @return the dbName
	 */
	public String getdbName() {
		return dbName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.
	 * runtime.IProgressMonitor)
	 */
	@Override
	public void run(IProgressMonitor monitor) {
		LOGGER.info("Run");
		final SubMonitor subMonitor = SubMonitor.convert(monitor, 100);

		try {
			subMonitor.beginTask("Converting TMG9 to H2", 50);
			subMonitor.subTask("Creating H2 Database");

			final CreateH2Database createH2Database = new CreateH2Database(dbName, userid, password,
					subMonitor.split(50, SubMonitor.SUPPRESS_NONE));
			createH2Database.run();
			subMonitor.worked(50);
			LOGGER.info("DB created");

			final DatasetLoader dsl = new DatasetLoader(dbName, userid, password, project);
			dsl.run();
			subMonitor.worked(1);

			final DnaLoader a = new DnaLoader(dbName, userid, password, project);
			a.run();
			subMonitor.worked(1);
			final EventLoader b = new EventLoader(dbName, userid, password, project);
			b.run();
			subMonitor.worked(1);
			final EventWitnessLoader c = new EventWitnessLoader(dbName, userid, password, project);
			c.run();
			subMonitor.worked(1);
			final ExcludedPairLoader d = new ExcludedPairLoader(dbName, userid, password, project);
			d.run();
			subMonitor.worked(1);
			final ExhibitLoader e = new ExhibitLoader(dbName, userid, password, project);
			e.run();
			subMonitor.worked(1);
			final FocusGroupLoader f = new FocusGroupLoader(dbName, userid, password, project);
			f.run();
			subMonitor.worked(1);
			final FocusGroupMemberLoader g = new FocusGroupMemberLoader(dbName, userid, password, project);
			g.run();
			subMonitor.worked(1);
			final NameDictionaryLoader h = new NameDictionaryLoader(dbName, userid, password, project);
			h.run();
			subMonitor.worked(1);
			final NameLoader i = new NameLoader(dbName, userid, password, project);
			i.run();
			subMonitor.worked(1);
			final NamePartTypeLoader j = new NamePartTypeLoader(dbName, userid, password, project);
			j.run();
			subMonitor.worked(1);
			final NamePartValueLoader k = new NamePartValueLoader(dbName, userid, password, project);
			k.run();
			subMonitor.worked(1);
			final ParentChildRealationshipLoader l = new ParentChildRealationshipLoader(dbName, userid, password,
					project);
			l.run();
			subMonitor.worked(1);
			final PersonLoader m = new PersonLoader(dbName, userid, password, project);
			m.run();
			subMonitor.worked(1);
			final PlaceDictionaryLoader n = new PlaceDictionaryLoader(dbName, userid, password, project);
			n.run();
			subMonitor.worked(1);
			final PlaceLoader o = new PlaceLoader(dbName, userid, password, project);
			o.run();
			subMonitor.worked(1);
			final PlacePartTypeLoader p = new PlacePartTypeLoader(dbName, userid, password, project);
			p.run();
			subMonitor.worked(1);
			final PlacePartValueLoader q = new PlacePartValueLoader(dbName, userid, password, project);
			q.run();
			subMonitor.worked(1);
			final RepositoryLinkLoader r = new RepositoryLinkLoader(dbName, userid, password, project);
			r.run();
			subMonitor.worked(1);
			final RepositoryLoader s = new RepositoryLoader(dbName, userid, password, project);
			s.run();
			subMonitor.worked(1);
			final ResearchLogLoader t = new ResearchLogLoader(dbName, userid, password, project);
			t.run();
			subMonitor.worked(1);
			final SourceCitationLoader u = new SourceCitationLoader(dbName, userid, password, project);
			u.run();
			subMonitor.worked(1);
			final SourceElementLoader v = new SourceElementLoader(dbName, userid, password, project);
			v.run();
			subMonitor.worked(1);
			final SourceLoader w = new SourceLoader(dbName, userid, password, project);
			w.run();
			subMonitor.worked(1);
			final SourceTypeLoader x = new SourceTypeLoader(dbName, userid, password, project);
			x.run();
			subMonitor.worked(1);
			final StyleLoader y = new StyleLoader(dbName, userid, password, project);
			y.run();
			subMonitor.worked(1);
			final TagTypeLoader z = new TagTypeLoader(dbName, userid, password, project);
			z.run();
			subMonitor.worked(1);
			final TimelineLockLoader aa = new TimelineLockLoader(dbName, userid, password, project);
			aa.run();
			subMonitor.worked(1);
		} catch (final Exception e) {
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
			e.printStackTrace();
		}
	}

	/**
	 * @param dbName
	 *            the dbName to set
	 */
	public void setdbName(String dbName) {
		this.dbName = dbName;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * @param userid
	 *            the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
}