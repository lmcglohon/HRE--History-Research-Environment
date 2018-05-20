package org.historyresearchenvironment.tmg.h2.Dbf2H2;

/**
 * @version 0.0.4
 * @author Michael Erichsen, &copy; History Research Environment Ltd.
 *
 */
public class LoaderRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final LoaderRunner lr = new LoaderRunner();
		lr.runDatasetLoader("c:/temp/test2", "sa", "", "KAREN");
	}

	private Thread t;

	/**
	 * 
	 */
	private void runDatasetLoader(String dbName, String userid, String password, String project) {
		t = new Thread(new CreateH2Database(dbName, userid, password));
		t.start();
		t = new Thread(new DatasetLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new DnaLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new EventLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new EventWitnessLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new ExcludedPairLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new ExhibitLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new FocusGroupLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new FocusGroupMemberLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new KarenPersonLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new NameDictionaryLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new NameLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new NamePartTypeLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new NamePartValueLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new ParentChildRealationshipLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new PersonLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new PlaceDictionaryLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new PlaceLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new PlacePartTypeLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new PlacePartValueLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new RepositoryLinkLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new RepositoryLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new ResearchLogLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new SourceCitationLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new SourceElementLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new SourceLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new SourceTypeLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new StyleLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new TagTypeLoader(dbName, userid, password, project));
		t.start();
		t = new Thread(new TimelineLockLoader(dbName, userid, password, project));
		t.start();
	}
}
