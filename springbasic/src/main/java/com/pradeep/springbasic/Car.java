package com.pradeep.springbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car  implements Vechile{
	
	@Autowired
	private Tyre tyre;
	
	

	public Tyre getTyre() {
		return tyre;
	}



	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}



	public void drive() {
		// TODO Auto-generated method stub
		
		System.out.println("car is working"+tyre);
		
	}

}
