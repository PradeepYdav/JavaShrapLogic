package com.hib.hibpract;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private String sbranch;
	@ManyToMany(mappedBy = "student")
	private List<Laptop> laptop= new ArrayList<Laptop>();
	
	
	
	
	public List<Laptop>  getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop>  laptop) {
		this.laptop = laptop;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + ", getSid()=" + getSid()
				+ ", getSname()=" + getSname() + ", getSbranch()=" + getSbranch() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
