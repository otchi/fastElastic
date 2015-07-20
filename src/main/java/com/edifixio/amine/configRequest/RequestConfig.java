package com.edifixio.amine.configRequest;

import org.omg.CORBA.Request;
import org.w3c.dom.Element;

import com.edifixio.amine.config.ElasticConfig;

@SuppressWarnings("serial")
public class RequestConfig extends ElasticConfig<Request> {

	public RequestConfig(Element element) throws ClassNotFoundException {
		super(element);
		// TODO Auto-generated constructor stub
	}
	
	

}
