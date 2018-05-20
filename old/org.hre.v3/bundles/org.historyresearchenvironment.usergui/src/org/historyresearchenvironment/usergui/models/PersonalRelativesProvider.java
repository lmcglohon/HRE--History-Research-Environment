package org.historyresearchenvironment.usergui.models;

import java.util.Vector;

import org.historyresearchenvironment.usergui.providers.AbstractHreProvider;

/**
 * @version 0.0.5
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class PersonalRelativesProvider extends AbstractHreProvider {
	private int Id;
	private String identity;
	private String ComAncMPrev = "";
	private String ComAncFPrev = "";
	private String ComAncMThis = "";
	private String ComAncFThis = "";
	private String ComAncMNext = "";
	private String ComAncFNext = "";
	private Vector<PersonalRelativesItem> lastGen = new Vector<PersonalRelativesItem>();
	private Vector<PersonalRelativesItem> thisGen = new Vector<PersonalRelativesItem>();
	private Vector<PersonalRelativesItem> nextGen = new Vector<PersonalRelativesItem>();

	/**
	 * 
	 */
	public PersonalRelativesProvider() {
	}

	/**
	 * @param identity
	 * @param lastGen
	 * @param thisGen
	 * @param nextGen
	 */
	public PersonalRelativesProvider(String identity, Vector<PersonalRelativesItem> lastGen,
			Vector<PersonalRelativesItem> thisGen, Vector<PersonalRelativesItem> nextGen) {
		this.identity = identity;
		this.lastGen = lastGen;
		this.thisGen = thisGen;
		this.nextGen = nextGen;
	}

	public void addLastGen(String name, String relationship, String sex, String lifespan, String gen, String children) {
		final PersonalRelativesItem item = new PersonalRelativesItem(name, relationship, sex, lifespan, gen, children);
		lastGen.add(item);
	}

	public void addNextGen(String name, String relationship, String sex, String lifespan, String gen, String children) {
		final PersonalRelativesItem item = new PersonalRelativesItem(name, relationship, sex, lifespan, gen, children);
		nextGen.add(item);
	}

	public void addThisGen(String name, String relationship, String sex, String lifespan, String gen, String children) {
		final PersonalRelativesItem item = new PersonalRelativesItem(name, relationship, sex, lifespan, gen, children);
		thisGen.add(item);
	}

	/**
	 * @return the comAncFNext
	 */
	public String getComAncFNext() {
		return ComAncFNext;
	}

	/**
	 * @return the comAncFPrev
	 */
	public String getComAncFPrev() {
		return ComAncFPrev;
	}

	/**
	 * @return the comAncFThis
	 */
	public String getComAncFThis() {
		return ComAncFThis;
	}

	/**
	 * @return the comAncMNext
	 */
	public String getComAncMNext() {
		return ComAncMNext;
	}

	/**
	 * @return the comAncMPrev
	 */
	public String getComAncMPrev() {
		return ComAncMPrev;
	}

	/**
	 * @return the comAncMThis
	 */
	public String getComAncMThis() {
		return ComAncMThis;
	}

	public int getId() {
		return Id;
	}

	/**
	 * @return the identity
	 */
	public String getIdentity() {
		return identity;
	}

	/**
	 * @return the lastGen
	 */
	public Vector<PersonalRelativesItem> getLastGen() {
		return lastGen;
	}

	/**
	 * @return the nextGen
	 */
	public Vector<PersonalRelativesItem> getNextGen() {
		return nextGen;
	}

	/**
	 * @return the thisGen
	 */
	public Vector<PersonalRelativesItem> getThisGen() {
		return thisGen;
	}

	@Override
	public void readFromH2(int i) {

	}

	/**
	 * @param comAncFNext
	 *            the comAncFNext to set
	 */
	public void setComAncFNext(String comAncFNext) {
		ComAncFNext = comAncFNext;
	}

	/**
	 * @param comAncFPrev
	 *            the comAncFPrev to set
	 */
	public void setComAncFPrev(String comAncFPrev) {
		ComAncFPrev = comAncFPrev;
	}

	/**
	 * @param comAncFThis
	 *            the comAncFThis to set
	 */
	public void setComAncFThis(String comAncFThis) {
		ComAncFThis = comAncFThis;
	}

	/**
	 * @param comAncMNext
	 *            the comAncMNext to set
	 */
	public void setComAncMNext(String comAncMNext) {
		ComAncMNext = comAncMNext;
	}

	/**
	 * @param comAncMPrev
	 *            the comAncMPrev to set
	 */
	public void setComAncMPrev(String comAncMPrev) {
		ComAncMPrev = comAncMPrev;
	}

	/**
	 * @param comAncMThis
	 *            the comAncMThis to set
	 */
	public void setComAncMThis(String comAncMThis) {
		ComAncMThis = comAncMThis;
	}

	public void setId(int id) {
		this.Id = id;
	}

	/**
	 * @param identity
	 *            the identity to set
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	/**
	 * @param lastGen
	 *            the lastGen to set
	 */
	public void setLastGen(Vector<PersonalRelativesItem> lastGen) {
		this.lastGen = lastGen;
	}

	/**
	 * @param nextGen
	 *            the nextGen to set
	 */
	public void setNextGen(Vector<PersonalRelativesItem> nextGen) {
		this.nextGen = nextGen;
	}

	/**
	 * @param thisGen
	 *            the thisGen to set
	 */
	public void setThisGen(Vector<PersonalRelativesItem> thisGen) {
		this.thisGen = thisGen;
	}
}