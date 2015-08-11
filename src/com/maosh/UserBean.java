package com.maosh;



import java.io.Serializable;  

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.NamedQuery;
import javax.persistence.Table; 



@Entity
@Table(name="t_user_info")
@NamedQuery(name="checkUser", query="from UserBean where name=?0 and password=?1")
public class UserBean implements Serializable{
	 
	  private static final long serialVersionUID = 1L;  
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMsgCount() {
		return msgCount;
	}
	public void setMsgCount(int msgCount) {
		this.msgCount = msgCount;
	}
	public int getFansCount() {
		return fansCount;
	}
	public void setFansCount(int fansCount) {
		this.fansCount = fansCount;
	}
	public int getFollowCount() {
		return followCount;
	}
	public void setFollowCount(int followCount) {
		this.followCount = followCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	  public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	int userId;
	  String name;
	  String password;

	int msgCount;
	  int fansCount;
	  int followCount;

}
