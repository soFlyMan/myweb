package com.entity;

public class Users {
	private int uid;
	private String uemail;
	private String upawd;
	private String uname;
	
	//alt+shift+s	
	public Users(){}
	
	
	public Users(String uemail, String upawd, String uname) {
		super();
		this.uemail = uemail;
		this.upawd = upawd;
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpawd() {
		return upawd;
	}
	public void setUpawd(String upawd) {
		this.upawd = upawd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

	
	
	

}
