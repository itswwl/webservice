package com.lvdun.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.lvdun.model.User;

@WebService(targetNamespace="http://com.lvdun.service/")
public interface HelloWorld {
	
	String sayHi(@WebParam(name="text")String text);  
    String sayHiToUser(User user);  
    String[] SayHiToUserList(List<User> userList); 
}
