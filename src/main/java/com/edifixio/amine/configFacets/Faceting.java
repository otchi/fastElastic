package com.edifixio.amine.configFacets;

import java.util.Map;

public abstract class Faceting {
	private String nameInBean;
	private String nameInIndex;
	private Map<String, Boolean> facetState;
	
	

	public Faceting(String nameInBean, String nameInIndex) {
		super();
		this.nameInBean = nameInBean;
		this.nameInIndex = nameInIndex;
	}

	public Map<String, Boolean> getFacetState() {
		return facetState;
	}

	public void setFacetState(Map<String,Boolean> facetState) {
		this.facetState = facetState;
	}

	public String getNameInBean() {
		return nameInBean;
	}

	public void setNameInBean(String nameInBean) {
		this.nameInBean = nameInBean;
	}

	public String getNameInIndex() {
		return nameInIndex;
	}

	public void setNameInIndex(String nameInIndex) {
		this.nameInIndex = nameInIndex;
	}
	
}
