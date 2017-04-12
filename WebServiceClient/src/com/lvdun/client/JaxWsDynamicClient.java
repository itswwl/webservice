package com.lvdun.client;

import java.lang.reflect.Method;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class JaxWsDynamicClient {

	public static void main(String[] args) throws Exception {
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();  
        Client client = dcf.createClient("http://localhost:8080/WebService/services/WebService?wsdl");  
            
        //这种方式调用model要和service接口放在一个package中
        Object user = Thread.currentThread().getContextClassLoader().loadClass("com.lvdun.service.User").newInstance();
       // Object user = Class.forName("com.lvdun.model.User").newInstance();
        
        Method m1 = user.getClass().getMethod("setName", String.class);  
        Method m2 = user.getClass().getMethod("setDescription", String.class);  
        
        m1.invoke(user, "马克思");  
        m2.invoke(user, "怀念马克思");  
       
                  
        Object[] response = client.invoke("sayHi", "ceshi");  
        Object[] response1 = client.invoke("sayHiToUser", user);  
        System.out.println("Response is " + response[0]);  
        System.out.println("Response is " + response1[0]);  

	}

}
