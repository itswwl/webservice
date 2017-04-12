package com.lvdun.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.lvdun.model.User;
import com.lvdun.service.HelloWorld;

public class WebServiceClient {

	public static void main(String[] args) {
        JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();  
        jwpfb.setServiceClass(HelloWorld.class);  
        jwpfb.setAddress("http://localhost:8080/WebService/services/WebService");  
        HelloWorld hw = (HelloWorld) jwpfb.create();  
        User user = new User();  
        user.setName("马克思");  
        user.setDescription("怀念马克思");  
        System.out.println(hw.sayHiToUser(user)+"=======");  

	}

}
