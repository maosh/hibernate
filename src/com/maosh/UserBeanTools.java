package com.maosh;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class UserBeanTools {
	
	Session session;
	Query query;

	public UserBeanTools() {
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean checkUser(String u, String p){
		boolean b=false;
		try{
			session = HibernateUtil.currentSession();

			query = session.createQuery("checkUser");
			query.setString(0, u);
			query.setString(1, p);
		  UserBean user = (UserBean)session.get(UserBean.class, u);
		  if(user.getName().equals(u) && user.getPassword().equals(p)){
			  b=true;
		  }
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
		
		return b;
	}
	
	
	public boolean addUser(UserBean user){
		boolean b=false;
		try{
			session = HibernateUtil.currentSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
		
		return b;
	}
	
	public boolean deleteUser(UserBean user){
		boolean b=false;
		try{
			session = HibernateUtil.currentSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
		
		return b;
	}	
	public boolean updateUser(UserBean user){
		boolean b=false;
		try{
			session = HibernateUtil.currentSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
		
		return b;
	}
	

}
