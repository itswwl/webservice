package com.lvdun.publish;

import javax.xml.ws.Endpoint;

import com.lvdun.serviceImpl.HelloWorldImpl;


/*
 * 
 * http://blog.csdn.net/mafan121/article/details/43271153
 * 
 * 
 * http://blog.csdn.net/hu_shengyang/article/details/38384597
 * 
 * */
public class WebServiceApp {

	public static void main(String[] args) {
		
		
		 System.out.println("web service start");  
         HelloWorldImpl implementor = new HelloWorldImpl();  
         String address = "http://localhost:8080/WebService/services/WebService";  
         Endpoint.publish(address, implementor);
         System.out.println("web service started");  

	}

}
