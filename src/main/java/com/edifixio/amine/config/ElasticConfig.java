package com.edifixio.amine.config;

import java.util.ArrayList;

import org.w3c.dom.Element;

@SuppressWarnings("serial")
public abstract class ElasticConfig<ContratType> extends ArrayList<ContratType>{
	
	protected Class<?> beanClass;
	protected Element element;
	
	public ElasticConfig(Element element) throws ClassNotFoundException{
		this.element=element;
		Class.forName(element.getAttribute("class"));
		
	}

	public Element getelement() {
		return element;
	}

	public void setelement(Element element) {
		this.element = element;
	}

	public Class<?> getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class<?> beanClass) {
		this.beanClass = beanClass;
	}
	


}
