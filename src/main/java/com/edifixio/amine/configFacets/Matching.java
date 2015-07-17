package com.edifixio.amine.configFacets;

public abstract class Matching {
	private String nameInBean;
	private String nameInIndex;
	private IQueryFacetConfig queryfacet;

	public IQueryFacetConfig getQueryfacet() {
		return queryfacet;
	}

	public void setQueryfacet(IQueryFacetConfig queryfacet) {
		this.queryfacet = queryfacet;
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
