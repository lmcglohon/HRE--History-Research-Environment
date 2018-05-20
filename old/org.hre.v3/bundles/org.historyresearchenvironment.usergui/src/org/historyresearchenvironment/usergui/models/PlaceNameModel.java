package org.historyresearchenvironment.usergui.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.historyresearchenvironment.usergui.providers.AbstractHreProvider;

/**
 * The persistent class for the PLACEDICTIONARY database table.
 *
 */
public class PlaceNameModel extends AbstractHreProvider {
	private final String SELECT1 = "SELECT UID, TYPE FROM PLACEPARTVALUE WHERE RECNO = ? ORDER BY TYPE";
	private final String SELECT2 = "SELECT XVALUE FROM PLACEDICTIONARY WHERE UID = ?";

	private PreparedStatement pst1 = null;
	private PreparedStatement pst2 = null;

	private int type;
	private LocationModel locationModel = new LocationModel();
	private String[] sa = { "", "", "", "", "", "", "", "", "" };

	public PlaceNameModel(int recNo) {
		try {
			pst1 = conn.prepareStatement(SELECT1);
			pst2 = conn.prepareStatement(SELECT2);
			pst1.setInt(1, recNo);

			final ResultSet rs1 = pst1.executeQuery();

			while (rs1.next()) {
				pst2.setInt(1, rs1.getInt("UID"));
				type = rs1.getInt("TYPE");

				final ResultSet rs2 = pst2.executeQuery();
				String s;

				if (rs2.next()) {
					s = rs2.getString("XVALUE");
					switch (type) {
					case 1:
						sa[type] = s;
						locationModel.setType1(s);
						break;
					case 2:
						sa[type] = s;
						locationModel.setType2(s);
						break;
					case 3:
						sa[type] = s;
						locationModel.setType3(s);
						break;
					case 4:
						sa[type] = s;
						locationModel.setType4(s);
						break;
					case 5:
						sa[type] = s;
						locationModel.setType5(s);
						break;
					case 6:
						sa[type] = s;
						locationModel.setType6(s);
						break;
					case 7:
						sa[type] = s;
						locationModel.setType7(s);
						break;
					case 8:
						sa[type] = s;
						locationModel.setType8(s);
						break;
					case 9:
						// Coordinates not included
						locationModel.setType9(s);
						break;

					default:
						LOGGER.severe("Invalid type " + type);
						break;
					}
				}
			}
			try {
				pst2.close();
				pst1.close();
				conn.close();
			} catch (final Exception e) {
				// Do nothing
			}

		} catch (final Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getClass() + ": " + e.getMessage() + " at line " + e.getStackTrace()[0].getLineNumber());
		}
	}

	/**
	 * @return the locationModel
	 */
	public LocationModel getLocationModel() {
		return locationModel;
	}

	public String getPlaceName() {
		final StringBuilder sb = new StringBuilder();

		Boolean flag = false;

		for (final String element : sa) {

			if (element.equals("") == false) {
				if (flag == true) {
					sb.append(", ");
				} else {
					flag = true;
				}

				sb.append(element);

			}
		}

		return sb.toString();

	}

	/**
	 * @return the sa
	 */
	public String[] getSa() {
		return sa;
	}

	@Override
	public void readFromH2(int i) {

	}

	/**
	 * @param locationModel
	 *            the locationModel to set
	 */
	public void setLocationModel(LocationModel locationModel) {
		this.locationModel = locationModel;
	}

	/**
	 * @param sa
	 *            the sa to set
	 */
	public void setSa(String[] sa) {
		this.sa = sa;
	}

}