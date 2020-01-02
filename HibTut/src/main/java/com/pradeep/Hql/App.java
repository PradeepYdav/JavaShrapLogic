package com.pradeep.Hql;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.pradeep.HibTut.Alien;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random= new Random();
		
	
		
		Configuration con= new Configuration().configure().addAnnotatedClass(StudentMarks.class);
        
        ServiceRegistry registry= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf=con.buildSessionFactory(registry);
        Session session=sf.openSession();
		
		
		Transaction tx=session.beginTransaction();
		
//		for(int i=0;i<50;i++) {
//			StudentMarks studentMarks= new StudentMarks();
//			studentMarks.setSid(i);
//			studentMarks.setSname("Name "+i);
//			studentMarks.setSmarks(random.nextInt(100));
//			
//			session.save(studentMarks);
//			
//		}
		
		
		Query query= session.createQuery("from StudentMarks where smarks<45");
		
		List<StudentMarks> students=query.list();
		
		for(StudentMarks marks:students) {
			System.out.println(marks);
		}
		
		tx.commit();
		
	

	}

}
