package com.pradeep.HibTut;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {
	
	String fName;
	String lName;
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	@Override
	public String toString() {
		return "AlienName [fName=" + fName + ", lName=" + lName + "]";
	}
	
	
	
	

}
