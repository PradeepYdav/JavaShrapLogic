package com.pradeep.HibTut.FirstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		AlienName alienName = new AlienName();
		alienName.setfName("Pradeep");
		alienName.setlName("yadav");

		Alien pradeep = new Alien();
		pradeep.setAid(101);
		pradeep.setAname(alienName);
		pradeep.setColor("skin");

		Alien getPradeep = null;

		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(registry);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// for saving the data
		// session.save(pradeep);

		// for getting the data
		// if we call for first time it will get from databasse
		getPradeep = (Alien) session.get(Alien.class, 101);
		System.out.println(getPradeep);

		// now for Second if we get it again it will not hit database get from hib cache
		// as it in same session
		getPradeep = (Alien) session.get(Alien.class, 101);
		System.out.println(getPradeep);

		tx.commit();
		session.close();
		
		
		// as if we hit the same qury in diff session it will get the data from database only..

		Session session2 = sf.openSession();

		Transaction tx1 = session2.beginTransaction();

		// for saving the data
		// session.save(pradeep);

		// for getting the data
		// if we call for first time it will get from databasse
		getPradeep = (Alien) session2.get(Alien.class, 101);
		System.out.println(getPradeep);

		// now for Second if we get it again it will not hit database get from hib cache
		// as it in same session
		getPradeep = (Alien) session2.get(Alien.class, 101);
		System.out.println(getPradeep);

		tx1.commit();

	}
}
