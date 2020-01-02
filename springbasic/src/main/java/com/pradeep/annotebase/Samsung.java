package com.pradeep.annotebase;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

	@Autowired
	MobileProcessor cpu;
	
	
	
	


	public void spec() {
		System.out.println("12 mp,4gb ram");
		cpu.perfromance();
	}
}
