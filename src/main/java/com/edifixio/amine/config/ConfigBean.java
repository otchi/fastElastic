package com.edifixio.amine.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.edifixio.amine.configFacets.FacetsConfig;
import com.edifixio.amine.configRequest.RequestConfig;
import com.edifixio.amine.configResponse.ResponseConfig;
import com.edifixio.amine.fastElastic.App;

public class ConfigBean {
	private String host;
	private Map<String, List<String>> indexes;
	private RequestConfig requestConfig;
	private FacetsConfig facetsConfig;
	private ResponseConfig responseConfig;

	public ConfigBean(Document document) throws ClassNotFoundException {
		super();
		this.indexes = new HashMap<String, List<String>>();
		Element root = document.getDocumentElement();
		host = root.getAttribute("host");
		this.putIndex((Element) root.getElementsByTagName("indexes").item(0));
		this.requestConfig=new RequestConfig((Element) root.getElementsByTagName("request").item(0));
		this.responseConfig=new ResponseConfig((Element) root.getElementsByTagName("response").item(0));
		this.facetsConfig=new FacetsConfig((Element) root.getElementsByTagName("facets").item(0));

	}

	public void putIndex(Element indexes) {
		NodeList listeOfIndexes = indexes.getElementsByTagName("index");
		for (int i = 0; i < listeOfIndexes .getLength(); i++) {
			Element index = (Element) listeOfIndexes .item(i);
			NodeList types = index.getElementsByTagName("type");

			ArrayList<String> listOfType = new ArrayList<String>();

			for (int j = 0; j < types.getLength(); j++) {
				listOfType.add(((Element) types.item(j)).getAttribute("name"));
			}

			this.indexes.put(index.getAttribute("name"), listOfType);
		}

	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Map<String, List<String>> getIndexes() {
		return indexes;
	}

	public void setIndexes(Map<String, List<String>> indexes) {
		this.indexes = indexes;
	}

	public RequestConfig getRequestConfig() {
		return requestConfig;
	}

	public void setRequestConfig(RequestConfig requestConfig) {
		this.requestConfig = requestConfig;
	}

	public FacetsConfig getFacetsConfig() {
		return facetsConfig;
	}

	public void setFacetsConfig(FacetsConfig facetsConfig) {
		this.facetsConfig = facetsConfig;
	}

	public ResponseConfig getResponseConfig() {
		return responseConfig;
	}

	public void setResponseConfig(ResponseConfig responseConfig) {
		this.responseConfig = responseConfig;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.indexes.toString() + "\n" + super.toString();
	}

	// **************************************************************************
	// **************************************************************************

	public static void main(String args[]) throws ClassNotFoundException {
		ConfigBean c = new ConfigBean(App.getConfigDoc());
		System.out.println(c);

	}

}
