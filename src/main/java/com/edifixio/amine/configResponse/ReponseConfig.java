package com.edifixio.amine.configResponse;

import java.util.Properties;

import org.w3c.dom.Element;

import com.edifixio.amine.config.ElasticConfig;


@SuppressWarnings("serial")
public class ReponseConfig extends ElasticConfig<LoadResponse>{


	public ReponseConfig(Element element) throws ClassNotFoundException {
		super(element);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		
		Properties properties = new Properties();
		properties.put("dd", "sqqq");
		System.out.println(properties.get("dd"));
	}

}
