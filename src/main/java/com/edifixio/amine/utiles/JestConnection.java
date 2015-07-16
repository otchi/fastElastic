package com.edifixio.amine.utiles;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Set;

import io.searchbox.action.Action;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.JestResult;
import io.searchbox.client.JestResultHandler;
import io.searchbox.client.config.HttpClientConfig;

public class JestConnection implements JestClient{
	private JestClient client;
	private static Hashtable<String, JestConnection> clients=new Hashtable<String, JestConnection>();
	
	
	private JestConnection (String nodeURL){
		JestClientFactory factory = new JestClientFactory();
		factory.setHttpClientConfig(new HttpClientConfig
		       .Builder(nodeURL)
		       .multiThreaded(true)
		       .build());
		this.client= factory.getObject();
	}
	
	public static JestConnection getElasticClient(String nodeURL){
		if(clients.containsKey(nodeURL)){
			return(JestConnection.clients.get(nodeURL));
		}else{
			JestConnection jc=new JestConnection(nodeURL);
			clients.put(nodeURL,jc);
			return jc;
		}
	}

	public <T extends JestResult> T execute(Action<T> arg0) throws IOException {
		// TODO Auto-generated method stub
		return this.client.execute(arg0);
	}

	public <T extends JestResult> void executeAsync(Action<T> arg0, JestResultHandler<T> arg1) {
		// TODO Auto-generated method stub
		this.client.executeAsync(arg0, arg1);
		
	}

	public void setServers(Set<String> arg0) {
		// TODO Auto-generated method stub
		this.client.setServers(arg0);
		
	}

	public void shutdownClient() {
		// TODO Auto-generated method stub
		this.client.shutdownClient();
		
	} 

}
