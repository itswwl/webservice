package com.lvdun.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.lvdun.model.User;
/*
 * 
 * 
 * 无论是xml + tomact
 * 
 * 还是发布方式，都需要
 * 
 * @WebService
 * 
 * */
@WebService(targetNamespace="http://com.lvdun.service/")
public interface HelloWorld {
	
	String sayHi(@WebParam(name="text")String text);  
    String sayHiToUser(User user);  
    String[] SayHiToUserList(List<User> userList); 
    
    
    
}
