package org.historyresearchenvironment.usergui.models;

import java.util.Date;

import org.historyresearchenvironment.tmg.h2.models.Dataset;
import org.historyresearchenvironment.tmg.h2.models.Name;
import org.historyresearchenvironment.tmg.h2.models.Person;

public class PersonModel extends AbstractHreModel {
	private int perNo;
	private String refer;
	private String sentence;
	private String sndxgvn;
	private String sndxsurn;
	private String srnamedisp;
	private String srnamesort;
	private String srtdate;
	private int styleid;
	private int surid;
	private String xprimary;
	private String adopted;
	private String anceInt;
	private String birthorder;
	private String descInt;
	private int dsid;
	private String datasetName;
	private int father;
	private String fatherName;
	private String motherName;
	private String flag1;
	private String flag2;
	private String flag3;
	private String flag4;
	private String flag5;
	private String flag6;
	private String flag7;
	private String flag8;
	private String flag9;
	private Date lastEdit;
	private String lastEditString;
	private String living;
	private int mother;
	private String multibirth;
	private String pbirth;
	private String pdeath;
	private int refId;
	private String reference;
	private int relate;
	private int relatefo;
	private String scbuff;
	private String sex;
	private int spoulast;
	private String spoulastName;
	private String tt;
	private int recno;
	private int altype;
	private String dsure;
	private String fsure;
	private int givid;
	private String gvnamesort;
	private String infg;
	private String infs;
	private String ispicked;

	private String ndate;
	private String nnote;
	private int nper;
	private String nsure;
	private int prefId;

	private String message;

	/**
	 *
	 */
	public PersonModel() {
		super();
	}

	/**
	 * @param perNo
	 */
	public PersonModel(int perNo) {
		this.perNo = perNo;
		readFromH2(this.perNo);
	}

	public void close() {

	}

	/**
	 * @return the adopted
	 */
	public String getAdopted() {
		return adopted;
	}

	/**
	 * @return the altype
	 */
	public int getAltype() {
		return altype;
	}

	/**
	 * @return the anceInt
	 */
	public String getAnceInt() {
		return anceInt;
	}

	/**
	 * @return the birthorder
	 */
	public String getBirthorder() {
		return birthorder;
	}

	/**
	 * @return the datasetName
	 */
	public String getDatasetName() {
		return datasetName;
	}

	/**
	 * @return the descInt
	 */
	public String getDescInt() {
		return descInt;
	}

	/**
	 * @return the dsid
	 */
	public int getDsid() {
		return dsid;
	}

	/**
	 * @return the dsure
	 */
	public String getDsure() {
		return dsure;
	}

	/**
	 * @return the father
	 */
	public int getFather() {
		return father;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @return the flag1
	 */
	public String getFlag1() {
		return flag1;
	}

	/**
	 * @return the flag2
	 */
	public String getFlag2() {
		return flag2;
	}

	/**
	 * @return the flag3
	 */
	public String getFlag3() {
		return flag3;
	}

	/**
	 * @return the flag4
	 */
	public String getFlag4() {
		return flag4;
	}

	/**
	 * @return the flag5
	 */
	public String getFlag5() {
		return flag5;
	}

	/**
	 * @return the flag6
	 */
	public String getFlag6() {
		return flag6;
	}

	/**
	 * @return the flag7
	 */
	public String getFlag7() {
		return flag7;
	}

	/**
	 * @return the flag8
	 */
	public String getFlag8() {
		return flag8;
	}

	/**
	 * @return the flag9
	 */
	public String getFlag9() {
		return flag9;
	}

	/**
	 * @return the fsure
	 */
	public String getFsure() {
		return fsure;
	}

	/**
	 * @return the givid
	 */
	public int getGivid() {
		return givid;
	}

	/**
	 * @return the gvnamesort
	 */
	public String getGvnamesort() {
		return gvnamesort;
	}

	/**
	 * @return the infg
	 */
	public String getInfg() {
		return infg;
	}

	/**
	 * @return the infs
	 */
	public String getInfs() {
		return infs;
	}

	/**
	 * @return the ispicked
	 */
	public String getIspicked() {
		return ispicked;
	}

	/**
	 * @return the lastEdit
	 */
	public Date getLastEdit() {
		return lastEdit;
	}

	/**
	 * @return the lastEditString
	 */
	public String getLastEditString() {
		return lastEditString;
	}

	/**
	 * @return the living
	 */
	public String getLiving() {
		return living;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the mother
	 */
	public int getMother() {
		return mother;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @return the multibirth
	 */
	public String getMultibirth() {
		return multibirth;
	}

	/**
	 * @return the ndate
	 */
	public String getNdate() {
		return ndate;
	}

	/**
	 * @return the nnote
	 */
	public String getNnote() {
		return nnote;
	}

	/**
	 * @return the nper
	 */
	public int getNper() {
		return nper;
	}

	/**
	 * @return the nsure
	 */
	public String getNsure() {
		return nsure;
	}

	/**
	 * @return the pbirth
	 */
	public String getPbirth() {
		return pbirth;
	}

	/**
	 * @return the pdeath
	 */
	public String getPdeath() {
		return pdeath;
	}

	/**
	 * @return the perNo
	 */
	public int getPerNo() {
		return perNo;
	}

	/**
	 * @return the prefId
	 */
	public int getPrefId() {
		return prefId;
	}

	/**
	 * @return the recno
	 */
	public int getRecno() {
		return recno;
	}

	/**
	 * @return the refer
	 */
	public String getRefer() {
		return refer;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @return the refId
	 */
	public int getRefId() {
		return refId;
	}

	/**
	 * @return the relate
	 */
	public int getRelate() {
		return relate;
	}

	/**
	 * @return the relatefo
	 */
	public int getRelatefo() {
		return relatefo;
	}

	/**
	 * @return the scbuff
	 */
	public String getScbuff() {
		return scbuff;
	}

	/**
	 * @return the sentence
	 */
	public String getSentence() {
		return sentence;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @return the sndxgvn
	 */
	public String getSndxgvn() {
		return sndxgvn;
	}

	/**
	 * @return the sndxsurn
	 */
	public String getSndxsurn() {
		return sndxsurn;
	}

	/**
	 * @return the spoulast
	 */
	public int getSpoulast() {
		return spoulast;
	}

	/**
	 * @return the spoulastName
	 */
	public String getSpoulastName() {
		return spoulastName;
	}

	/**
	 * @return the srnamedisp
	 */
	public String getSrnamedisp() {
		return srnamedisp;
	}

	/**
	 * @return the srnamesort
	 */
	public String getSrnamesort() {
		return srnamesort;
	}

	/**
	 * @return the srtdate
	 */
	public String getSrtdate() {
		return srtdate;
	}

	/**
	 * @return the styleid
	 */
	public int getStyleid() {
		return styleid;
	}

	/**
	 * @return the surid
	 */
	public int getSurid() {
		return surid;
	}

	/**
	 * @return the tt
	 */
	public String getTt() {
		return tt;
	}

	/**
	 * @return the xprimary
	 */
	public String getXprimary() {
		return xprimary;
	}

	/**
	 * @param i
	 */
	public void readFromH2(int i) {
		String s = null;
		StringBuilder sb = new StringBuilder();
		Person p = null;

		setMessage("");

		try {
			p = new Person(i);

			if (p.getPerNo() == 0) {
				setMessage("No person found");
				return;
			}

			Name n = new Name(i);

			setSrnamedisp(n.getSrnamedisp());
			setFather(p.getFather());
			n = new Name(p.getFather());
			setFatherName(n.getSrnamedisp());
			setMother(p.getMother());
			n = new Name(p.getMother());
			setMotherName(n.getSrnamedisp());

			setLastEditString(p.getLastEdit().toString());

			final Dataset ds = new Dataset(p.getDsid());
			setDatasetName(ds.getDsname());

			n = new Name(p.getSpoulast());
			setSpoulastName(n.getSrnamedisp());

			try {
				s = p.getPbirth().substring(1, 9);
				sb = new StringBuilder(s).insert(4, '-').insert(7, '-');
				setPbirth(sb.toString());
			} catch (final Exception e2) {
				setPbirth("");
			}

			try {
				s = p.getPdeath().substring(1, 9);
				sb = new StringBuilder(s).insert(4, '-').insert(7, '-');
				setPdeath(sb.toString());
			} catch (final Exception e1) {
				setPdeath("");
			}

			setSex(p.getSex());

		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}

		return;
	}

	/**
	 * @param adopted
	 *            the adopted to set
	 */
	public void setAdopted(String adopted) {
		this.adopted = adopted;
	}

	/**
	 * @param altype
	 *            the altype to set
	 */
	public void setAltype(int altype) {
		this.altype = altype;
	}

	/**
	 * @param anceInt
	 *            the anceInt to set
	 */
	public void setAnceInt(String anceInt) {
		this.anceInt = anceInt;
	}

	/**
	 * @param birthorder
	 *            the birthorder to set
	 */
	public void setBirthorder(String birthorder) {
		this.birthorder = birthorder;
	}

	/**
	 * @param datasetName
	 *            the datasetName to set
	 */
	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
	}

	/**
	 * @param descInt
	 *            the descInt to set
	 */
	public void setDescInt(String descInt) {
		this.descInt = descInt;
	}

	/**
	 * @param dsid
	 *            the dsid to set
	 */
	public void setDsid(int dsid) {
		this.dsid = dsid;
	}

	/**
	 * @param dsure
	 *            the dsure to set
	 */
	public void setDsure(String dsure) {
		this.dsure = dsure;
	}

	/**
	 * @param father
	 *            the father to set
	 */
	public void setFather(int father) {
		this.father = father;
	}

	/**
	 * @param fatherName
	 *            the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @param flag1
	 *            the flag1 to set
	 */
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	/**
	 * @param flag2
	 *            the flag2 to set
	 */
	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	/**
	 * @param flag3
	 *            the flag3 to set
	 */
	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}

	/**
	 * @param flag4
	 *            the flag4 to set
	 */
	public void setFlag4(String flag4) {
		this.flag4 = flag4;
	}

	/**
	 * @param flag5
	 *            the flag5 to set
	 */
	public void setFlag5(String flag5) {
		this.flag5 = flag5;
	}

	/**
	 * @param flag6
	 *            the flag6 to set
	 */
	public void setFlag6(String flag6) {
		this.flag6 = flag6;
	}

	/**
	 * @param flag7
	 *            the flag7 to set
	 */
	public void setFlag7(String flag7) {
		this.flag7 = flag7;
	}

	/**
	 * @param flag8
	 *            the flag8 to set
	 */
	public void setFlag8(String flag8) {
		this.flag8 = flag8;
	}

	/**
	 * @param flag9
	 *            the flag9 to set
	 */
	public void setFlag9(String flag9) {
		this.flag9 = flag9;
	}

	/**
	 * @param fsure
	 *            the fsure to set
	 */
	public void setFsure(String fsure) {
		this.fsure = fsure;
	}

	/**
	 * @param givid
	 *            the givid to set
	 */
	public void setGivid(int givid) {
		this.givid = givid;
	}

	/**
	 * @param gvnamesort
	 *            the gvnamesort to set
	 */
	public void setGvnamesort(String gvnamesort) {
		this.gvnamesort = gvnamesort;
	}

	/**
	 * @param infg
	 *            the infg to set
	 */
	public void setInfg(String infg) {
		this.infg = infg;
	}

	/**
	 * @param infs
	 *            the infs to set
	 */
	public void setInfs(String infs) {
		this.infs = infs;
	}

	/**
	 * @param ispicked
	 *            the ispicked to set
	 */
	public void setIspicked(String ispicked) {
		this.ispicked = ispicked;
	}

	/**
	 * @param lastEdit
	 *            the lastEdit to set
	 */
	public void setLastEdit(Date lastEdit) {
		this.lastEdit = lastEdit;
	}

	/**
	 * @param lastEditString
	 *            the lastEditString to set
	 */
	public void setLastEditString(String lastEditString) {
		this.lastEditString = lastEditString;
	}

	/**
	 * @param living
	 *            the living to set
	 */
	public void setLiving(String living) {
		this.living = living;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param mother
	 *            the mother to set
	 */
	public void setMother(int mother) {
		this.mother = mother;
	}

	/**
	 * @param motherName
	 *            the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @param multibirth
	 *            the multibirth to set
	 */
	public void setMultibirth(String multibirth) {
		this.multibirth = multibirth;
	}

	/**
	 * @param ndate
	 *            the ndate to set
	 */
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}

	/**
	 * @param nnote
	 *            the nnote to set
	 */
	public void setNnote(String nnote) {
		this.nnote = nnote;
	}

	/**
	 * @param nper
	 *            the nper to set
	 */
	public void setNper(int nper) {
		this.nper = nper;
	}

	/**
	 * @param nsure
	 *            the nsure to set
	 */
	public void setNsure(String nsure) {
		this.nsure = nsure;
	}

	/**
	 * @param pbirth
	 *            the pbirth to set
	 */
	public void setPbirth(String pbirth) {
		this.pbirth = pbirth;
	}

	/**
	 * @param pdeath
	 *            the pdeath to set
	 */
	public void setPdeath(String pdeath) {
		this.pdeath = pdeath;
	}

	/**
	 * @param perNo
	 *            the perNo to set
	 */
	public void setPerNo(int perNo) {
		this.perNo = perNo;
		readFromH2(perNo);
	}

	/**
	 * @param prefId
	 *            the prefId to set
	 */
	public void setPrefId(int prefId) {
		this.prefId = prefId;
	}

	/**
	 * @param recno
	 *            the recno to set
	 */
	public void setRecno(int recno) {
		this.recno = recno;
	}

	/**
	 * @param refer
	 *            the refer to set
	 */
	public void setRefer(String refer) {
		this.refer = refer;
	}

	/**
	 * @param reference
	 *            the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * @param refId
	 *            the refId to set
	 */
	public void setRefId(int refId) {
		this.refId = refId;
	}

	/**
	 * @param relate
	 *            the relate to set
	 */
	public void setRelate(int relate) {
		this.relate = relate;
	}

	/**
	 * @param relatefo
	 *            the relatefo to set
	 */
	public void setRelatefo(int relatefo) {
		this.relatefo = relatefo;
	}

	/**
	 * @param scbuff
	 *            the scbuff to set
	 */
	public void setScbuff(String scbuff) {
		this.scbuff = scbuff;
	}

	/**
	 * @param sentence
	 *            the sentence to set
	 */
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @param sndxgvn
	 *            the sndxgvn to set
	 */
	public void setSndxgvn(String sndxgvn) {
		this.sndxgvn = sndxgvn;
	}

	/**
	 * @param sndxsurn
	 *            the sndxsurn to set
	 */
	public void setSndxsurn(String sndxsurn) {
		this.sndxsurn = sndxsurn;
	}

	/**
	 * @param spoulast
	 *            the spoulast to set
	 */
	public void setSpoulast(int spoulast) {
		this.spoulast = spoulast;
	}

	/**
	 * @param spoulastName
	 *            the spoulastName to set
	 */
	public void setSpoulastName(String spoulastName) {
		this.spoulastName = spoulastName;
	}

	/**
	 * @param srnamedisp
	 *            the srnamedisp to set
	 */
	public void setSrnamedisp(String srnamedisp) {
		this.srnamedisp = srnamedisp;
	}

	/**
	 * @param srnamesort
	 *            the srnamesort to set
	 */
	public void setSrnamesort(String srnamesort) {
		this.srnamesort = srnamesort;
	}

	/**
	 * @param srtdate
	 *            the srtdate to set
	 */
	public void setSrtdate(String srtdate) {
		this.srtdate = srtdate;
	}

	/**
	 * @param styleid
	 *            the styleid to set
	 */
	public void setStyleid(int styleid) {
		this.styleid = styleid;
	}

	/**
	 * @param surid
	 *            the surid to set
	 */
	public void setSurid(int surid) {
		this.surid = surid;
	}

	/**
	 * @param tt
	 *            the tt to set
	 */
	public void setTt(String tt) {
		this.tt = tt;
	}

	/**
	 * @param xprimary
	 *            the xprimary to set
	 */
	public void setXprimary(String xprimary) {
		this.xprimary = xprimary;
	}
}
