package com.pradeep.annotebase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
		
		Samsung sas= context.getBean(Samsung.class);
		sas.spec();
	}
	
	

}
