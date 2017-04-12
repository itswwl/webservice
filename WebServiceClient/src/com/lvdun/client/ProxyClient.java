package com.lvdun.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.lvdun.model.User;
import com.lvdun.service.HelloWorld;

/**
 * 
 * 
 * http://reymont.iteye.com/blog/1511176
 * 
 * 
 *
 */
public class ProxyClient {

	private static final QName SERVICE_NAME = new QName("http://com.lvdun.service/", "WebService");  
	private static final QName PORT_NAME = new QName("http://com.lvdun.service/", "WebServicePort");  
	
	private static final String WSDL_LOCATION = "http://localhost:8080/WebService/services/WebService?wsdl";  
	
	public static void main(String[] args) throws MalformedURLException {
		
		 URL wsdlURL = new URL(WSDL_LOCATION);  
		 
		 Service service = Service.create(wsdlURL, SERVICE_NAME);  
		 
		 HelloWorld hw = service.getPort(PORT_NAME, HelloWorld.class); 
		 
		 User user = new User();  
         user.setName("马克思");  
         user.setDescription("怀念马克思");  
         
         String result = hw.sayHiToUser(user);  
         
         System.out.println(result);

	}

}
