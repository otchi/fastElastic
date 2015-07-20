package com.edifixio.amine.configFacets;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.edifixio.amine.config.ElasticConfig;


@SuppressWarnings("serial")
public class FacetsConfig extends ElasticConfig<Faceting>{
	private List<Faceting> facets;

	public List<Faceting> getFacets() {
		return facets;
	}

	public void setFacets(List<Faceting> facets) {
		this.facets = facets;
	}

	public FacetsConfig(Element element) throws ClassNotFoundException {
		super(element);
		// TODO Auto-generated constructor stub
		this.facets=new ArrayList<Faceting>();
	}
	
	public void putLoad(){
		NodeList listOfLoad=this.element.getElementsByTagName("load");
		
		for(int i=0;i<listOfLoad.getLength();i++){
			Element element =(Element) listOfLoad.item(i);
			this.facets.add(new SimpleFacetQuery(
					element.getAttribute("nameInBean"),
					element.getAttribute("nameInIndex")));
		}
		
	}

}
