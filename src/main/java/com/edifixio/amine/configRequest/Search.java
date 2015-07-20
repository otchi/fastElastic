package com.edifixio.amine.configRequest;

import java.util.List;

public class Search {

	private String nameInBean;
	private List<IQueryConfig> queries;

	public List<IQueryConfig> getQueries() {
		return queries;
	}

	public void setQueries(List<IQueryConfig> queries) {
		this.queries = queries;
	}

	public String getNameInBean() {
		return nameInBean;
	}

	public void setNameInBean(String nameInBean) {
		this.nameInBean = nameInBean;
	}

	
}
