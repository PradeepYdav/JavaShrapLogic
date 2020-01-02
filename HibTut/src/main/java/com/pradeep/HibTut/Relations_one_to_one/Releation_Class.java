package com.pradeep.HibTut.Relations_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Releation_Class {

	public static void  main(String [] args) {
		
		Laptop laptop= new Laptop();
		
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Student st= new Student();
		
		st.setRollNo(1);
		st.setName("Pradeep");
		st.setMarks(80);
		st.setLaptop(laptop);	
		
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf=con.buildSessionFactory(registry);
		
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(laptop);
		session.save(st);
		
		
		tx.commit();
		
		
	}
	
}
