package com.edifixio.amine.component;

public class ConfigBean {
	
	private String host;
	private String index;
	private Mapping requestMapping;
	private Mapping responceMapping;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public Mapping getRequestMapping() {
		return requestMapping;
	}
	public void setRequestMapping(Mapping requestMapping) {
		this.requestMapping = requestMapping;
	}
	public Mapping getResponceMapping() {
		return responceMapping;
	}
	public void setResponceMapping(Mapping responceMapping) {
		this.responceMapping = responceMapping;
	}
	

}
