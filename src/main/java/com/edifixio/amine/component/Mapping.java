package com.edifixio.amine.component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings("serial")
public class Mapping extends  Properties {
		private String className;
		
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			
			this.className = className;
		}
	
	
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, SecurityException, NoSuchMethodException{
		Class c=Class.forName("com.edifixio.amine.testBean.MyResponse");
		Object o=c.newInstance();
		Method m=o.getClass().getMethod("setPdg",String.class);
		m.invoke(o, "cc");
		Method ms=o.getClass().getMethod("getPdg");
		System.out.println((String)ms.invoke(o));

	}


}
