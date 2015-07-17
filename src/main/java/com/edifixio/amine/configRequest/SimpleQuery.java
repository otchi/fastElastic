package com.edifixio.amine.configRequest;

public class SimpleQuery implements IQueryConfig {
	
	private String nameOfField; 
	private String kindOfSearch;
	private String operator;
	
	
	
	public String getNameOfField() {
		return nameOfField;
	}
	public void setNameOfField(String nameOfField) {
		this.nameOfField = nameOfField;
	}
	public String getKindOfSearch() {
		return kindOfSearch;
	}
	public void setKindOfSearch(String kindOfSearch) {
		this.kindOfSearch = kindOfSearch;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	

}
