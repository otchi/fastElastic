package com.edifixio.amine.fastElastic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.edifixio.jsonFastBuild.ArrayBuilder.JsonArrayBuilder;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
													SecurityException, InstantiationException, 
													IllegalAccessException, IllegalArgumentException,
													InvocationTargetException {
		// System.out.println( "Hello World!" );
		System.out.println(JsonArrayBuilder.init().begin().end().getJsonElement());

	
		Object o = Class.forName("com.edifixio.amine.testBean.MyResponse").newInstance();
		Method m = o.getClass().getMethod("setPdg", String.class);
		m.invoke(o, "cc");
		Method ms = o.getClass().getMethod("getPdg");
		System.out.println((String) ms.invoke(o));

		Document document = null;

		DOMParser parser = null;

		try {

			parser = new DOMParser();

			parser.parse("/home/amine/workspace/" + "fastElastic/src/ressource/" + "xmlSourceTest/MyConfig.xml");

			document = parser.getDocument();
			System.out.println(((Element)document.getDocumentElement()
									.getElementsByTagName("requestBean").item(0)).getAttribute("class"));

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
