package com.maosh;

import org.hibernate.HibernateException;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;   
import org.hibernate.cfg.*;  
 
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ClassToDB {

	   public static void main(String[] args){       
  
       try {       
    	   /*  
            Configuration configuration = new AnnotationConfiguration();
            configuration.configure("hibernate.cfg.xml");
            SchemaExport export = new SchemaExport(configuration);
            export.execute(true, true, false, true);
            
            SessionFactory factory = configuration.buildSessionFactory();

            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Person user = new Person();
            user.setName("maosh");
            user.setSex("ÄÐ");
            user.setAddress("chognqing");
            
            UserRelationBean ur=new UserRelationBean();
            UserRelationPrimaryKey id = new UserRelationPrimaryKey(1,2);
            ur.setId(id);
            ur.setType(true);
            session.save(ur);
            session.getTransaction().commit();
 */
    	UserBean ub = new UserBean();  
      UserBeanTools ubt = new UserBeanTools();
      ub.setName("maosh");
      ub.setPassword("123456");
      ubt.addUser(ub);
      
      
      if(ubt.checkUser("maosh", "123456")){
    	  System.out.println("check success");
      }
      
      ubt.addUser(ub);
      
    	   
        } catch (HibernateException e) {       
            e.printStackTrace();             
        } finally {       
      
        }       
    }      

}
