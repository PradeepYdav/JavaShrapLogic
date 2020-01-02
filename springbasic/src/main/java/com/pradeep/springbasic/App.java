package com.pradeep.springbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	
    	
		/*
		 * Vechile obj= (Vechile) context.getBean("bike"); obj.drive();
		 */
    	
    	Car  c= (Car) context.getBean("car");
    	c.drive();
    	
    	
//    	Tyre t= (Tyre) context.getBean("tyre");
//    	System.out.println(t);
        
        
    }
}
