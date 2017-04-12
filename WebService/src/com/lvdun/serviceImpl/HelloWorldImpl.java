package com.lvdun.serviceImpl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.lvdun.model.User;
import com.lvdun.service.HelloWorld;


/*
 * @WebService(endpointInterface="com.lvdun.service.HelloWorld",serviceName="HelloWorld")  
 * 
 * 
 * 
 * 是以发布方式启动，非tomact方式
 * 
 * 
 * 若以xml配置方式，可以不需要此注解 tomact方式
 * 
 * 
 * http://blog.csdn.net/look85927/article/details/13000117
 * 
 * */
//@WebService(endpointInterface="com.lvdun.service.HelloWorld",serviceName="HelloWorld")  
@WebService(endpointInterface="com.lvdun.service.HelloWorld",serviceName="WebService")  
public class HelloWorldImpl implements HelloWorld {  
    Map<Integer, User> users = new LinkedHashMap<Integer, User>();  
  
    public String sayHi(@WebParam(name = "text") String text) {  
        return "Hello,"+text;  
    }  
  
    public String sayHiToUser(User user) {  
        users.put(users.size()+1, user);  
        return "Hello,"+user.getName();  
    }  
  
    public String[] SayHiToUserList(List<User> userList) {  
        String[] result = new String[userList.size()];  
        int i = 0;  
        for(User u:userList){  
            result[i] = "Hello " + u.getName();  
            i++;  
        }  
        return result;  
    }  
  
}  
