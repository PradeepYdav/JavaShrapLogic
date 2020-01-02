package com.pradeep.HibTut.lazy_eager;

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
		
		
		
		Laptop laptop2= new Laptop();
		laptop2.setLid(102);
		laptop2.setLname("apple");
		
		Laptop laptop3= new Laptop();
		laptop3.setLid(103);
		laptop3.setLname("hp");
		
		Student st= new Student();
		st.setRollNo(1);
		st.setName("Pradeep");
		st.setMarks(80);
		st.getLaptop().add(laptop);	
		st.getLaptop().add(laptop2);
		
		Student st1= new Student();
		st1.setRollNo(2);
		st1.setName("Max");
		st1.setMarks(80);
		st1.getLaptop().add(laptop3);	
		
		laptop.setStudent(st);
		laptop2.setStudent(st);
		laptop3.setStudent(st1);
		
		
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf=con.buildSessionFactory(registry);
//		
//		Session session=sf.openSession();
//		
//		Transaction tx= session.beginTransaction();
//		
//		session.save(laptop);
//		session.save(laptop2);
//		session.save(laptop3);
//		session.save(st);
//		session.save(st1);
//		
//		
//		
//		Student sts=(Student)session.get(Student.class, 1);
//		System.out.println(sts.getLaptop());
//		
//		tx.commit();
//		session.close();
		
		Session session1=sf.openSession();
		
		Transaction tx1= session1.beginTransaction();
		
		
		
		Student sts=(Student)session1.get(Student.class, 1);
		System.out.println(sts);
		
		tx1.commit();
		
		
	}
	
}
