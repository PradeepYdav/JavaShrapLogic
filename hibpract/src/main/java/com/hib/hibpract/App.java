package com.hib.hibpract;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
     
      
      
      Laptop laptop= new Laptop();
      laptop.setLid(101);
      laptop.setLbrand("Hp");
      
      Laptop laptop1= new Laptop();
      laptop1.setLid(102);
      laptop1.setLbrand("Dell");
      
    	
       Student student= new Student();
       student.setSid(1);
       student.setSname("Pradeep");
       student.setSbranch("cs");
       student.getLaptop().add(laptop);
       student.getLaptop().add(laptop1);
       
        laptop.getStudent().add(student);
	
	 
	 
       
	
//       
//       Student student1= new Student();
//       student1.setSid(2);
//       student1.setSname("Sandeep");
//       student1.setSbranch("cs");
//       student1.getLaptop().add(laptop);
//       student1.getLaptop().add(laptop1);
//       
//       
//       laptop1.getStudent().add(student1);
  	
//       
     // laptop.setStudent(student);
    //  laptop.setStudent(student);
      //laptop1.setStudent(student);
       
       
    	
       Configuration con= new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       
       ServiceRegistry registry= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();     
       
    	SessionFactory sf= con.buildSessionFactory(registry);
       
       Session session=sf.openSession();
       
       session.beginTransaction();
      
       session.save(laptop);
       session.save(laptop1);
      session.save(student);
     // session.save(student1);
       
       
       session.getTransaction().commit();
    	
    }
}
