package com.lvdun.model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;  
    private String name;  
    private String age;  
    private String description;
	public User() {
		super();
	}
	public User(String id, String name, String age, String description) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getDescription() {
		return description;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setDescription(String description) {
		this.description = description;
	} 

}
