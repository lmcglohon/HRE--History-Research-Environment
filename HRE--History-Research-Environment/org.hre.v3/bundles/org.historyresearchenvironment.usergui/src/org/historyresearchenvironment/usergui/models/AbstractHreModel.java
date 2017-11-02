/**
 * 
 */
package org.historyresearchenvironment.usergui.models;

import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONWriter;

/**
 * @author michael
 *
 */
public abstract class AbstractHreModel {
	@Inject
	protected static IEventBroker eventBroker;

	protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	protected IEclipsePreferences iep = InstanceScope.INSTANCE.getNode("org.historyresearchenvironment.usergui");
	protected String dbDriver = iep.get("DBDRIVER", "org.h2.Driver");
	protected String dbName = iep.get("DBNAME", "./TMG9");
	protected String userId = iep.get("USERID", "sa");
	protected String passWord = iep.get("PASSWORD", "");

	protected Connection conn = null;
	protected PreparedStatement pst = null;

	protected String key;

	/**
	 * No arg c:tor
	 */
	public AbstractHreModel() {
		super();
		try {
			Class.forName(dbDriver);

			// String DbPath = new File(".").getAbsolutePath();
			// DbPath = "file:///" + DbPath.substring(0, DbPath.length() - 1) + "TMG9";
			// dbName = DbPath.replace("\\", "/");
			// dbName = "jdbc:h2:file:./TMG9";

			LOGGER.info(dbName);
			conn = DriverManager.getConnection("jdbc:h2:" + dbName, userId, passWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param c
	 * @param type
	 * @param model
	 * @param jsonObject
	 * @param field
	 * @throws JSONException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	private static void getObjectsFromJson(Class<?> c, String type, Object model, JSONObject jsonObject, Field field)
			throws JSONException, IllegalAccessException, InvocationTargetException {
		for (Method method : c.getMethods()) {

			if ((method.getName().startsWith("set")) && (method.getName().length() == (field.getName().length() + 3))) {
				if (method.getName().toLowerCase().endsWith(field.getName().toLowerCase())) {
					if (type.equals("int")) {
						int value = jsonObject.getInt(field.getName());
						method.invoke(model, value);
					} else {
						String value = jsonObject.getString(field.getName());
						method.invoke(model, value);
					}

					break;
				}
			}
		}
	}

	/**
	 * @param model
	 * @param arglist
	 * @param method
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	private static void invokeVararg(Object model, Vector<Object> arglist, Method method)
			throws IllegalAccessException, InvocationTargetException, Exception {
		switch (arglist.size()) {
		case 0:
			method.invoke(model);
			break;
		case 1:
			method.invoke(model, arglist.get(0));
			break;
		case 2:
			method.invoke(model, arglist.get(0), arglist.get(1));
			break;
		case 3:
			method.invoke(model, arglist.get(0), arglist.get(1), arglist.get(2));
			break;
		case 4:
			method.invoke(model, arglist.get(0), arglist.get(1), arglist.get(2), arglist.get(3));
			break;
		case 5:
			method.invoke(model, arglist.get(0), arglist.get(1), arglist.get(2), arglist.get(3), arglist.get(4));
			break;
		case 6:
			method.invoke(model, arglist.get(0), arglist.get(1), arglist.get(2), arglist.get(3), arglist.get(4),
					arglist.get(5));
			break;
		case 7:
			method.invoke(model, arglist.get(0), arglist.get(1), arglist.get(2), arglist.get(3), arglist.get(4),
					arglist.get(5), arglist.get(6));
			break;
		case 8:
			method.invoke(model, arglist.get(0), arglist.get(1), arglist.get(2), arglist.get(3), arglist.get(4),
					arglist.get(5), arglist.get(6), arglist.get(7));
			break;
		case 9:
			method.invoke(model, arglist.get(0), arglist.get(1), arglist.get(2), arglist.get(3), arglist.get(4),
					arglist.get(5), arglist.get(6), arglist.get(7), arglist.get(8));
			break;
		case 10:
			method.invoke(model, arglist.get(0), arglist.get(1), arglist.get(2), arglist.get(3), arglist.get(4),
					arglist.get(5), arglist.get(6), arglist.get(7), arglist.get(8), arglist.get(9));
			break;
		default:
			LOGGER.severe("Too many arguments for implementation");
			throw new Exception("Too many arguments for implementation");
		}
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param i
	 */
	public abstract void readFromH2(int i);

	/**
	 * @param jsonstring
	 */
	public void readJson(String jsonstring) {
		Class<?> modelClass = null, itemClass;
		String modelType = "";
		String itemType = "";
		Object model, itemObject;
		Field[] modelFields, itemFields;
		Field modelField = null;
		Field itemField = null;
		String key = "";
		Vector<Object> argVector;
		JSONObject jsonObject;

		try {
			modelClass = this.getClass();
			model = this;
			modelFields = modelClass.getDeclaredFields();

			jsonObject = new JSONObject(jsonstring);

			for (int i = 0; i < modelFields.length; i++) {
				modelField = modelFields[i];
				modelField.setAccessible(true);
				modelType = modelField.getType().toString();

				if (modelType.contains("java.util.Vector")) {
					JSONArray itemJsonArray = jsonObject.getJSONArray(modelField.getName());
					JSONObject itemJsonObject = null;

					String genericType = modelField.getGenericType().getTypeName();
					String a[] = genericType.split("<");
					String b[] = a[1].split(">");
					String itemClassName = b[0];

					itemClass = Class.forName(itemClassName);
					itemObject = itemClass.newInstance();
					itemFields = itemClass.getDeclaredFields();

					// For each JSONObject in the JSON Array
					for (int j = 0; j < itemJsonArray.length(); j++) {
						itemJsonObject = itemJsonArray.getJSONObject(j);

						for (int k = 0; k < itemFields.length; k++) {
							itemField = itemFields[k];
							itemField.setAccessible(true);
							itemType = itemField.getType().toString();

							getObjectsFromJson(itemClass, itemType, itemObject, itemJsonObject, itemField);
						}

						argVector = new Vector<Object>();

						for (Method method : modelClass.getMethods()) {
							if ((method.getName().startsWith("add") && (modelField.getName().toLowerCase()
									.startsWith(method.getName().toLowerCase().substring(3))))) {
								itemFields = itemClass.getDeclaredFields();

								for (int k = 0; k < itemFields.length; k++) {
									itemField = itemFields[k];
									itemField.setAccessible(true);

									for (Iterator<?> iterator = itemJsonObject.keys(); iterator.hasNext();) {
										key = (String) iterator.next();

										if (itemField.getName().equals(key)) {
											itemType = itemField.getType().toString();

											if (itemType.equals("int")) {
												argVector.add(itemJsonObject.getInt(key));
											} else {
												argVector.add(itemJsonObject.getString(key));
											}
											break;
										}
									}
								}

								try {
									invokeVararg(model, argVector, method);
								} catch (Exception e) {
									e.printStackTrace();
									LOGGER.severe(e.getMessage());
								}
								break;
							}
						}
					}
				} else if (modelType.contains("Vector")) {
					// LOGGER.info("Not handling type " + modelType);
				} else
					getObjectsFromJson(modelClass, modelType, model, jsonObject, modelField);
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @param classname
	 * @return
	 */
	public String writeJson(String classname) {
		Class<?> c;
		Field field;
		String type;
		String key;
		String value;
		Class<?> c1;
		Field field1;
		String key1;
		String value1;
		StringWriter sw = new StringWriter();

		try {
			c = Class.forName(classname);
			Field[] fa = c.getDeclaredFields();

			JSONWriter jw = new JSONWriter(sw);

			jw.object();

			// Each field
			for (int i = 0; i < fa.length; i++) {
				field = fa[i];

				type = field.getType().toString();

				if (type.contains("[[[")) {
					throw new Exception("Too many array levels for this implementation");
				}

				if (type.contains("[[")) {
					throw new Exception("Too many array levels for this implementation, so far");
				}

				// Primary type array
				if (type.contains("[")) {
					key = field.getName();
					jw.key(key);

					jw.array();

					// Integer array
					if (type.contains("[I")) {
						int[] valueArray = (int[]) field.get(this);

						for (int j = 0; j < valueArray.length; j++) {
							jw.object();
							jw.key(key + "[" + j + "]");
							jw.value(Integer.toString(valueArray[j]));
							jw.endObject();
						}

						// String Array
					} else {
						String[] valueArray = (String[]) field.get(this);

						for (int j = 0; j < valueArray.length; j++) {
							LOGGER.info(valueArray[j]);
							jw.object();
							jw.key(key + "[" + j + "]");
							jw.value(valueArray[j]);
							jw.endObject();
						}
					}

					jw.endArray();

					// Component array
				} else if (type.contains("java.util.Vector")) {
					Vector<?> v = (Vector<?>) field.get(this);

					key = field.getName();
					jw.key(key);

					jw.array();

					for (Iterator<?> iterator = v.iterator(); iterator.hasNext();) {
						jw.object();

						AbstractHreItem item = (AbstractHreItem) iterator.next();
						c1 = item.getClass();
						Field[] fa1 = c1.getDeclaredFields();

						for (int i1 = 0; i1 < fa1.length; i1++) {
							field1 = fa1[i1];
							key1 = field1.getName();
							jw.key(key1);

							if (field1.getType().getName().equals("int")) {
								value1 = (String) Integer.toString(field1.getInt(item));
							} else {
								value1 = (String) field1.get(item);
							}
							jw.value(value1);
						}

						jw.endObject();
					}

					jw.endArray();

					// Non-array
				} else if (type.contains("Vector")) {
				} else {
					key = field.getName();
					jw.key(key);

					// Integer
					if (type.equals("int")) {
						value = Integer.toString((int) field.get(this));

						// String
					} else {
						value = (String) field.get(this);

					}
					jw.value(value);
				}
			}
			jw.endObject();
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.severe(e.getMessage());
		}
		return sw.toString();
	}
}