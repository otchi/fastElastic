package com.edifixio.amine.configRequest;

import java.util.ArrayList;

public class Search {

	private String nameInBean;
	private ArrayList<IQueryConfig> queries;

	public ArrayList<IQueryConfig> getQueries() {
		return queries;
	}

	public void setQueries(ArrayList<IQueryConfig> queries) {
		this.queries = queries;
	}

	public String getNameInBean() {
		return nameInBean;
	}

	public void setNameInBean(String nameInBean) {
		this.nameInBean = nameInBean;
	}

	
}
