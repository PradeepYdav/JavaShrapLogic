package com.pradeep.HibTut.SecondLevelCache;

import org.hibernate.Query;
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
		
		
		// for second level chache we have many options like eccahce swarns etc
		
		//stesps 1
		// downlaod  the ehcahe of sf from maven or jar and hibernate  ehcache for conf  put both in pom file or jar in class path
		//  enable and set echcahe in hibernate conf file
		// annote entity with @cachebale and @cavhe for peroperties like read only  etc
		
		//for secodn level cache in queru we nee to enable in hib conf and also need to set in query aobject also
		

		AlienName alienName = new AlienName();
		alienName.setfName("Pradeep");
		alienName.setlName("yadav");

		Alien pradeep = new Alien();
		pradeep.setAid(101);
		pradeep.setAname(alienName);
		pradeep.setColor("skin");

		Alien getPradeep = null;

		Configuration con = new Configuration().configure("hibernate.cfgsecondlevelcache.xml").addAnnotatedClass(Alien.class);

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(registry);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// for saving the data
		// session.save(pradeep);

		// for getting the data
		// if we call for first time it will get from databasse
		getPradeep = (Alien) session.get(Alien.class, 101);
		System.out.println("session 1 call 1"+getPradeep);

		// now for Second if we get it again it will not hit database get from hib cache
		// as it in same session
		getPradeep = (Alien) session.get(Alien.class, 101);
		System.out.println("session 1 call 2"+getPradeep);
		
		//with queru cachin
		
		Query query= session.createQuery("from Alien where aid=101");
		query.setCacheable(true);
		getPradeep = (Alien) query.uniqueResult();
		System.out.println("session 1 call 3 with query"+getPradeep);

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
		System.out.println("session 2 call 1"+getPradeep);

		// now for Second if we get it again it will not hit database get from hib cache
		// as it in same session
		getPradeep = (Alien) session2.get(Alien.class, 101);
		System.out.println("session 2 call 2"+getPradeep);
		
		//with queru cachin
		
		Query query1= session2.createQuery("from Alien where aid=101");
		query1.setCacheable(true);
		getPradeep = (Alien) query1.uniqueResult();
		System.out.println("session 2 call 3 with query"+getPradeep);

		tx1.commit();

	}
}
