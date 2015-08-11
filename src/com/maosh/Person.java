package com.maosh;



import java.io.Serializable;  

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table; 


@Entity
@Table(name="t_person")
public class Person implements Serializable{
	 
	  private static final long serialVersionUID = 1L;  
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="name",length=50) 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="sex",length=5) 
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	@Column(name="address",length=50) 
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	int id;
	String name;
	String sex;
	String address;

	

	public Person() {
		// TODO Auto-generated constructor stub

	}

}
