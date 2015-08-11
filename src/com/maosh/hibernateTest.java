package com.maosh;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.annotations.*;

import java.io.File;

public class hibernateTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		Configuration cfg;
		SessionFactory sf;
		Session session;
		Transaction tx;
		
		Person person = new Person();
		//person.setId(1);
		person.setName("HP");
		person.setSex("m");
		person.setAddress("chongqing shi No.108 ");
		try{
			
			File file=new File("C:\\Users\\maosh\\workspace\\hibernate\\hibernate.cfg.xml");
			
			cfg = new Configuration().configure(file);
			
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			session.save(person);
			tx.commit();
			session.close();
			System.out.println("Data have been saved into db");
			
		}catch (HibernateException e){
			e.printStackTrace();
		}
	}
	public hibernateTest() {
		// TODO Auto-generated constructor stub
	}

}
