package com.entity;

public class Users {
	private int uid;
	private String uname;
	private String upwd;
	private String birthday;
	
	//alt+shift+s	
	public Users(){}
	public Users(String uname, String upwd, String birthday) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.birthday = birthday;
	}
	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	
	

}
