package com.softeem.DTO;

import java.util.Date;

public class Student {

	private int sid;
	private String sname;
	private int age;
	private Date birth;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", birth=" + birth + ", sid=" + sid
				+ ", sname=" + sname + "]";
	}
	
	
	
}
