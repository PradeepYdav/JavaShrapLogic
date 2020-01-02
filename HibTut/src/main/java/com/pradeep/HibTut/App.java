package com.pradeep.HibTut;

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
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        AlienName alienName= new AlienName();
        alienName.setfName("Pradeep");
        alienName.setlName("yadav");
        
        
        Alien pradeep = new Alien();
        pradeep.setAid(101);
        pradeep.setAname(alienName);
        pradeep.setColor("skin");
        
        Alien getPradeep=null;

        
        Configuration con= new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry registry= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf=con.buildSessionFactory(registry);
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        // for saving the data
        session.save(pradeep);
        
        //for getting the data
       getPradeep=(Alien)session.get(Alien.class, 101);
        
        
        tx.commit();
        
        System.out.println(getPradeep);
    }
}
