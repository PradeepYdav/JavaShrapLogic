package com.pradeep.Hql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentMarks {

	@Id
	private int sid;
	private String sname;
	private int smarks;
	
	
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
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "StudentMarks [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	
	
	
}
