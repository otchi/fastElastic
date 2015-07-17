package com.edifixio.amine.config;

import java.util.ArrayList;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ConfigBean {
	private String host;
	private Map<String, ArrayList<String>> indexes;
	
	public ConfigBean(Document document) {
		super();
		Element root=document.getDocumentElement();
		host=root.getAttribute("host");
		
	}
	

	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}



	public Map<String, ArrayList<String>> getIndexes() {
		return indexes;
	}



	public void setIndexes(Map<String, ArrayList<String>> indexes) {
		this.indexes = indexes;
	}

}
