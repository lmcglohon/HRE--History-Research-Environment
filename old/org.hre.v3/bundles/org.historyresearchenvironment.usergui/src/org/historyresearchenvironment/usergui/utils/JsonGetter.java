package org.historyresearchenvironment.usergui.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 
 * @author Michael Erichsen, &copy; HRE Ltd.
 *
 */
public class JsonGetter {
	private static String a = "org.historyresearchenvironment.usergui.models.PersonalEventProvider";

	private static String jsonstring = "{\"Id\":\"1\",\"identity\":\"SIEG, J�rgen (1) (1946-    )\","
			+ "\"father\":\"NIELSEN, Egon (2) (1912-    )\",\"mother\":\"SIEG, Idunna Nikolajsen J�rgensen (3) (1913-    )\","
			+ "\"noChildren\":\"0\",\"events\":[{\"eventTag\":\"Birth\",\"role\":\"Role\",\"date\":\"1946-01-21\","
			+ "\"summary\":\"�sted \"},{\"eventTag\":\"Birth\",\"role\":\"Role\",\"date\":\"1946-01-21\",\"summary\":\"�sted \"},"
			+ "{\"eventTag\":\"Christening\",\"role\":\"Role\",\"date\":\"1946-03-03\",\"summary\":\"�sted \"},"
			+ "{\"eventTag\":\"Christening\",\"role\":\"Role\",\"date\":\"1946-03-03\",\"summary\":\"�sted \"}]}";

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
		for (final Method method : c.getMethods()) {

			if ((method.getName().startsWith("set")) && (method.getName().length() == (field.getName().length() + 3))) {
				if (method.getName().toLowerCase().endsWith(field.getName().toLowerCase())) {
					if (type.equals("int")) {

						final int value = jsonObject.getInt(field.getName());
						method.invoke(model, value);
						System.out.println(
								"Invoking " + model.getClass().getName() + "." + method.getName() + "(" + value + ")");

					} else {
						final String value = jsonObject.getString(field.getName());
						method.invoke(model, value);
						System.out.println(
								"Invoking " + model.getClass().getName() + "." + method.getName() + "(" + value + ")");
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
	private static void invokeVararg(Object model, Vector<String> arglist, Method method)
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
			throw new Exception("Too many arguments for implementation");
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Class<?> modelClass, itemClass;
		String modelType = "";
		String itemType = "";
		Object model, itemObject;
		Field[] modelFields, itemFields;
		Field modelField = null;
		Field itemField = null;
		String key = "";
		String value = "";
		// VarargList arglist;
		Vector<String> argVector;
		JSONObject jsonObject;

		try {
			modelClass = Class.forName(a);
			model = modelClass.newInstance();

			modelFields = modelClass.getDeclaredFields();

			System.out.println("JSONObject jsonObject = new JSONObject(s);");
			jsonObject = new JSONObject(jsonstring);

			for (final Field modelField2 : modelFields) {
				modelField = modelField2;
				System.out.println(">>> Field name: " + modelField.getName());
				modelField.setAccessible(true);

				modelType = modelField.getType().toString();
				System.out.println(">>> Type: " + modelType);

				if (modelType.contains("Vector")) {
					System.out.println("JSONArray items = jsonObject.getJSONArray(" + modelField.getName() + ");");

					final JSONArray itemJsonArray = jsonObject.getJSONArray(modelField.getName());
					JSONObject itemJsonObject = null;

					final String genericType = modelField.getGenericType().getTypeName();
					final String a[] = genericType.split("<");
					final String b[] = a[1].split(">");
					final String itemClassName = b[0];

					itemClass = Class.forName(itemClassName);
					itemObject = itemClass.newInstance();
					itemFields = itemClass.getDeclaredFields();

					// For each JSONObject in the JSON Array
					for (int j = 0; j < itemJsonArray.length(); j++) {
						itemJsonObject = itemJsonArray.getJSONObject(j);
						System.out.println("Item: " + j + " " + itemJsonObject.toString());

						for (final Field itemField2 : itemFields) {
							itemField = itemField2;
							itemField.setAccessible(true);
							itemType = itemField.getType().toString();

							getObjectsFromJson(itemClass, itemType, itemObject, itemJsonObject, itemField);
						}

						// arglist = new VarargList();
						argVector = new Vector<String>();

						for (final Method method : modelClass.getMethods()) {

							// System.out.println("addItems " + method.getName() + " - " +
							// modelField.getName());

							if ((method.getName().startsWith("add") && (modelField.getName().toLowerCase()
									.startsWith(method.getName().toLowerCase().substring(3))))) {
								System.out.println("Method found " + method.getName() + "()");

								// Method found addEvent

								itemFields = itemClass.getDeclaredFields();

								for (int k = 0; k < itemFields.length; k++) {
									itemField = itemFields[k];
									System.out.println("Field " + " " + k + " name: " + itemField.getName());
									itemField.setAccessible(true);

									for (final Iterator<?> iterator = itemJsonObject.keys(); iterator.hasNext();) {
										key = (String) iterator.next();

										if (itemField.getName().equals(key)) {
											System.out.println("Key " + key);
											itemType = itemField.getType().toString();
											System.out.println("Type: " + itemType);

											if (itemType.equals("int")) {
												value = Integer.toString(itemJsonObject.getInt(key));
											} else {
												value = itemJsonObject.getString(key);
											}

											System.out.println("Arglist add");
											argVector.add(value);
											break;
										}
									}

								}

								System.out.println("Arglist size " + argVector.size());

								try {
									invokeVararg(model, argVector, method);
								} catch (final Exception e) {
									e.printStackTrace();
								}
								break;
							}
						}
					}

				} else {
					getObjectsFromJson(modelClass, modelType, model, jsonObject, modelField);
				}
			}
			System.out.println("-----------------------------\r\n" + jsonObject.toString(2));

		} catch (

		final Exception e) {
			e.printStackTrace();
		}
	}
}
