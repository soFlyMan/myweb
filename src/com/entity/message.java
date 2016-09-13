package com.entity;

public class message {

	

	private int mid;


	private String umessage;
	private String dname;
	private String uemail;
	
	public message(){}
	public message(int mid, String umessage, String dname, String uemail) {
		super();
		this.mid = mid;
		this.umessage = umessage;
		this.dname = dname;
		this.uemail = uemail;
	}
	public message(String umessage, String dname) {
		super();
		this.umessage = umessage;
		this.dname = dname;
	}
	public message(String umessage, String dname, String uemail) {
		super();
		this.umessage = umessage;
		this.dname = dname;
		this.uemail = uemail;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getUmessage() {
		return umessage;
	}

	public void setUmessage(String umessage) {
		this.umessage = umessage;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	
	
	
	
}
