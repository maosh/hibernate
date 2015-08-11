package com.maosh;



import java.io.Serializable;  

import javax.persistence.Embeddable;  



@Embeddable
public class UserRelationPrimaryKey implements Serializable{
	 
	  private static final long serialVersionUID = 1L;  

	int userId;
		int followId;
		
		public UserRelationPrimaryKey(int userId, int followId){
			this.userId = userId;
			this.followId = followId;
		}
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFollowId() {
		return followId;
	}
	public void setFollowId(int followId) {
		this.followId = followId;
	}

	@Override
    public boolean equals(Object o) {  
        if(o instanceof UserRelationPrimaryKey){  
        	UserRelationPrimaryKey key = (UserRelationPrimaryKey)o ;  
            if(this.userId == key.getUserId() && this.followId == key.getFollowId()){  
                return true ;  
            }  
        }  
        return false ;  
    }  
      
    @Override  
    public int hashCode() {  
        return this.userId*100+this.followId;  
    } 	

}
