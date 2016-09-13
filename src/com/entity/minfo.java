package com.entity;

public class minfo {
	
	private int did;
	private String dname;
	private double drate;
	private String dcountry;
	private String dtime;
	private String dtype;
	private String dactor;
	private String ddirector;
	private int dage;
	private String dimage;
	
	public minfo(){}

	public minfo(int did, String dname, double drate, String dcountry,
			String dtime, String dtype, String dactor, String ddirector,
			int dage, String dimage) {
		super();
		this.did = did;
		this.dname = dname;
		this.drate = drate;
		this.dcountry = dcountry;
		this.dtime = dtime;
		this.dtype = dtype;
		this.dactor = dactor;
		this.ddirector = ddirector;
		this.dage = dage;
		this.dimage = dimage;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public double getDrate() {
		return drate;
	}

	public void setDrate(double drate) {
		this.drate = drate;
	}

	public String getDcountry() {
		return dcountry;
	}

	public void setDcountry(String dcountry) {
		this.dcountry = dcountry;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getDactor() {
		return dactor;
	}

	public void setDactor(String dactor) {
		this.dactor = dactor;
	}

	public String getDdirector() {
		return ddirector;
	}

	public void setDdirector(String ddirector) {
		this.ddirector = ddirector;
	}

	public int getDage() {
		return dage;
	}

	public void setDage(int dage) {
		this.dage = dage;
	}

	public String getDimage() {
		return dimage;
	}

	public void setDimage(String dimage) {
		this.dimage = dimage;
	}
	

}
