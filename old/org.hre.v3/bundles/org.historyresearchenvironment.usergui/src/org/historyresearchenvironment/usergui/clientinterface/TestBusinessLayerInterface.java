/**
 * 
 */
package org.historyresearchenvironment.usergui.clientinterface;

import org.historyresearchenvironment.usergui.models.ConnectionEventsItem;
import org.historyresearchenvironment.usergui.models.EventAssociatesModel;
import org.historyresearchenvironment.usergui.models.PersonalConnectionsModel;
import org.historyresearchenvironment.usergui.models.PersonalRelativesProvider;
import org.historyresearchenvironment.usergui.providers.AncestorTreeProvider;
import org.historyresearchenvironment.usergui.providers.EventAssociatesProvider;
import org.historyresearchenvironment.usergui.providers.PersonNavigatorProvider;
import org.historyresearchenvironment.usergui.providers.PersonalEventProvider;
import org.historyresearchenvironment.usergui.serverinterface.ServerRequest;
import org.historyresearchenvironment.usergui.serverinterface.ServerResponse;

/**
 * Hard coded values for the mock up
 * 
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class TestBusinessLayerInterface implements BusinessLayerInterface {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.historyresearchenvironment.usergui.serverinterface.BusinessLayerInterface
	 * #callBusinessLayer(org.historyresearchenvironment.usergui.serverinterface.
	 * ServerRequest)
	 */
	@Override
	public ServerResponse callBusinessLayer(ServerRequest request) {
		if (request.getModelName().equals("personalevents")) {
			return getPersonalEvents(request);
		} else if (request.getModelName().equals("personalrelatives")) {
			return getPersonalRelatives(request);
		} else if (request.getModelName().equals("personalconnections")) {
			return getPersonalConnections(request);
		} else if (request.getModelName().equals("eventassociates")) {
			return getEventAssociates(request);
		} else if (request.getModelName().equals("personlist")) {
			return getPersonList(request);
		} else if (request.getModelName().equals("descendantlist")) {
			return getDescendantList(request);
		} else if (request.getModelName().equals("ancestorlist")) {
			return getAncestorList(request);
		} else {
			return null;
		}
	}

	/**
	 * @param request
	 * @return
	 */
	private ServerResponse getAncestorList(ServerRequest request) {
		final AncestorTreeProvider model = new AncestorTreeProvider();

		model.addAncestor(1, "Frank ALEXANDER", "M", 10, 11);
		model.addAncestor(3, "Samuel Lee ALEXANDER", "M", 1, 0);
		model.addAncestor(4, "Lula Elizabeth ALEXANDER", "F", 1, 0);
		model.addAncestor(5, "John Wtight ALEXANDER", "M", 1, 0);
		model.addAncestor(10, "John ALEXANDER", "M", 17, 18);
		model.addAncestor(11, "Delilah WOODS", "F", 0, 0);
		model.addAncestor(17, "John ALEXANDER", "M", 0, 0);
		model.addAncestor(18, "Martha FERGUSON", "F", 0, 0);
		model.addAncestor(36, "Samuel ALEXANDER", "M", 10, 11);
		model.addAncestor(37, "Eliza Jane ALEXANDER", "F", 10, 11);

		return new ServerResponse(model, 0, "OK");
	}

	/**
	 * @param request
	 * @return
	 */
	private ServerResponse getDescendantList(ServerRequest request) {
		// DescendantTreeProvider model = new DescendantTreeProvider();
		//
		// DescendantModel item03 = new DescendantModel(3, new Vector<Integer>());
		// item01.setName("Samuel Lee ALEXANDER");
		// DescendantModel item04 = new DescendantModel(4, new Vector<Integer>());
		// item04.setName("Lula Elizabeth ALEXANDER");
		// DescendantModel item05 = new DescendantModel(5, new Vector<Integer>());
		// item05.setName("John Wright ALEXANDER");
		//
		// Vector<Integer> vector01 = new Vector<Integer>();
		// vector01.add(3);
		// vector01.add(4);
		// vector01.add(5);
		// DescendantVector dv01 = new DescendantVector();
		// dv01.setVector(vector);
		//
		//
		// DescendantModel item01 = new DescendantModel(1, new Vector<Integer>());
		// item01.setName("Frank ALEXANDER");
		// Desc3ndantItem item37 = new DescendantModel(37, new Vector<Integer>());
		// item37.setName("Eliza Jane ALEXANDER");
		// DescendantModel item36 = new DescendantModel(36, new Vector<Integer>());
		// item37.setName("Samuel ALEXANDER");
		//
		//
		//
		//
		// model.addDescendant(3, "Samuel Lee ALEXANDER", 1, 0);
		// model.addDescendant(4, "Lula Elizabeth ALEXANDER", 1, 0);
		// model.addDescendant(5, "John Wright ALEXANDER", 1, 0);
		// model.addDescendant(10, "John ALEXANDER", 17, 18);
		// model.addDescendant(11, "Delilah WOODS", 0, 0);
		// model.addDescendant(17, "John ALEXANDER", 0, 0);
		// model.addDescendant(18, "Martha FERGUSON", 0, 0);
		//
		//
		// return new ServerResponse(model, 0, "OK");
		return null;
	}

	/**
	 * @param request
	 * @return
	 */
	private ServerResponse getEventAssociates(ServerRequest request) {
		final EventAssociatesProvider model = (EventAssociatesProvider) request.getProvider();
		model.setIdentity("Marriage of Charles, Prince of Wales, and Lady Diana Spencer");
		model.setLocation("St. Paul's Cathedral, London, United Kingdom");
		model.setDate("29 Jul 1981, 11:20am");

		model.addAssociate(new EventAssociatesModel("Person", "* Groom", "Charles, Prince of Wales (73)"));
		model.addAssociate(new EventAssociatesModel("Person", "* Bride", "Lady Diana SPENCER (283)"));
		model.addAssociate(new EventAssociatesModel("Person", "Groom - Mother", "Elizabeth II (83)"));
		model.addAssociate(new EventAssociatesModel("Person", "Groom - Father", "The Duke of Edinburgh (101)"));
		model.addAssociate(new EventAssociatesModel("Person", "Groom - Grand Mother", "The Queen Mother (10)"));
		model.addAssociate(new EventAssociatesModel("Person", "Groom - Sister", "The Princess Anne (563)"));
		model.addAssociate(new EventAssociatesModel("Person", "Groom - Brother", "The Prince Andrew (343)"));
		model.addAssociate(new EventAssociatesModel("Person", "Groom - Brother", "The Prince Edward (48)"));
		model.addAssociate(new EventAssociatesModel("Person", "Bride - Father", "The 8th Earl SPENCER (77)"));
		model.addAssociate(new EventAssociatesModel("Person", "Bride - Mother", "Frances SHAND KYDD (881)"));
		model.addAssociate(new EventAssociatesModel("Person", "Bride - Sister", "Lady Sarah McCORQUODALE (910)"));
		model.addAssociate(new EventAssociatesModel("Person", "Bride - Sister", "Lady Jane FELLOWS (792)"));
		model.addAssociate(
				new EventAssociatesModel("Person", "Bride - Brother", "Charles SPENCER, Viscount Althorp (793)"));

		return new ServerResponse(model, 0, "OK");
	}

	/**
	 * @param request
	 * @return
	 */
	private ServerResponse getPersonalConnections(ServerRequest request) {
		final PersonalConnectionsModel model = (PersonalConnectionsModel) request.getProvider();
		model.setIdentity("John ALEXANDER (10) (>1770-1831)");

		model.setFather("John ALEXANDER (17) (>1770-1831");
		model.setMother("Martha FERGUSON (18) (1784-1863)");
		model.setNoChildren(3);

		model.addEvent(new ConnectionEventsItem("John ALEXANDER (10)", "* Head of H-Hold",
				"1840 US Census, Carter County", "__ __ 1840"));
		model.addEvent(new ConnectionEventsItem("John ALEXANDER (10)", "* Head of H-Hold",
				"1860 US Census, Carter County", "1 Jun 1860"));
		model.addEvent(new ConnectionEventsItem("Mary Catherine KEEBLER (2)", "Bride", "ALEXANDER, KEEBLER Marriage",
				"24 Dec 1861"));
		model.addEvent(new ConnectionEventsItem("Lula Elizabeth ALEXANDER (4)", "* Born",
				"Birth of Daughter - Lula Elizabeth", "13 Mar 1865"));
		model.addEvent(new ConnectionEventsItem("Annie Eliza ALEXANDER (6)", "* Born",
				"Birth of Daughter - Annie Eliza", "10 Jan 1870"));
		model.addEvent(new ConnectionEventsItem("Robert Moore BALDWIN (60)", "* Groom", "BALDWIN, ALEXANDER Marriage",
				"22 Jul 1885"));
		model.addEvent(new ConnectionEventsItem("John Keys FUGATE (42)", "* Groom", "FUGATE, ALEXANDER Marriage",
				"10 Oct 1876"));

		return new ServerResponse(model, 0, "OK");
	}

	/**
	 * @param request
	 * @return
	 */
	private ServerResponse getPersonalEvents(ServerRequest request) {
		final PersonalEventProvider model = (PersonalEventProvider) request.getProvider();
		model.setIdentity("John ALEXANDER (10) (1812-1876)");
		model.setFather("John ALEXANDER (17) (>1770-1831");
		model.setMother("Martha FERGUSON (18) (1784-1863)");
		model.setNoChildren(3);
		model.addEvent("Birth", "Born", "11 Oct 1812", "-; Washington County, Tennessee");
		model.addEvent("Marriage", "Groom", "22 Jan 1835",
				"Delilah WOODS (11); -; Elizabethon, Carter County, Tennessee");
		model.addEvent("Son-Biological", "Father", "03 Oct 1838",
				"Frank ALEXANDER (11); Elizabethon, Carter County, Tennessee");
		model.addEvent("Census", "Head of Household", "01 Jun 1850", "-; Elizabethon, Carter County, Tennessee");
		model.addEvent("Occupation", "Business Owner", "bt 1840-1866", "Frank ALEXANDER (11); Smith County, Virginia");
		model.addEvent("Death", "Deceased", "18 Oct 1876", "-; Marion, Smith County, Virginia");

		return new ServerResponse(model, 0, "OK");
	}

	/**
	 * @param request
	 * @return
	 */
	private ServerResponse getPersonalRelatives(ServerRequest request) {
		final PersonalRelativesProvider model = (PersonalRelativesProvider) request.getProvider();
		model.setIdentity("Frank ALEXANDER (1) (1838-1925)");

		model.setComAncMThis("");
		model.setComAncFThis("");
		model.addLastGen("John ALEXANDER (17)", "Father", "M", "1836-1874", "-1", "0");
		model.addLastGen("Delilah Woods (11)", "Mother", "F", "1838-1925", "-1", "8");

		model.setComAncMThis("John ALEXANDER (17)");
		model.setComAncFThis("Delilah WOODS (11)");
		model.addThisGen("Samuel ALEXANDER (36)", "Brother", "M", "1836-1874", "0", "0");
		model.addThisGen("Frank ALEXANDER (1)", "Target", "M", "1838-1925", "0", "8");
		model.addThisGen("Eliza Jane ALEXANDER (37)", "Sister", "F", "1843-1869", "0", "0");

		model.setComAncMNext("Frank ALEXANDER (1)");
		model.setComAncFNext("Mary Catherine KEEBLER (2)");
		model.addNextGen("Samuel Lee ALEXANDER (3)", "Son", "M", "1862-1932", "+1", "0");
		model.addNextGen("Lula Elizabeth ALEXANDER (4)", "Daughter", "F", "1865-1954", "+1", "1");
		model.addNextGen("John Wright ALEXANDER (5)", "Son", "M", "1807-1866", "+1", "0");

		return new ServerResponse(model, 0, "OK");
	}

	/**
	 * @param request
	 * @return
	 */
	private ServerResponse getPersonList(ServerRequest request) {
		final PersonNavigatorProvider model = new PersonNavigatorProvider();

		model.addPerson("Frank ALEXANDER", 1, "1836", "1925", 0, 0);
		model.addPerson("Samuel Lee ALEXANDER", 3, "1865", "1932", 1, 0);
		model.addPerson("Lula Elizabeth ALEXANDER", 4, "1865", "1954", 1, 0);
		model.addPerson("John Wtight ALEXANDER", 5, "1807", "1866", 1, 0);
		model.addPerson("John ALEXANDER", 10, "11 Oct 1812", "18 Oct 1876", 17, 18);
		model.addPerson("Delilah WOODS", 11, "1838", "1925", 0, 0);
		model.addPerson("Samuel ALEXANDER", 16, "1836", "1874", 10, 11);
		model.addPerson("John ALEXANDER", 17, ">1770", "1831", 0, 0);
		model.addPerson("Martha FERGUSON", 18, "1784", "1863", 0, 0);
		model.addPerson("Eliza Jane ALEXANDER", 37, "1843", "1869", 10, 11);

		return new ServerResponse(model, 0, "OK");
	}
}
