package com.maosh;



import java.io.Serializable;  

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table; 


@Entity
@Table(name="t_user_relation")
public class UserRelationBean implements Serializable{
	 
	  private static final long serialVersionUID = 1L;  
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)

	   UserRelationPrimaryKey id;
	    public UserRelationPrimaryKey getId() {
		return id;
	}
	public void setId(UserRelationPrimaryKey id) {
		this.id = id;
	}
		boolean type;
	    
	    

	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}


}
