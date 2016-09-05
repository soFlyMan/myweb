package com.test;

import com.util.DBUtil;

public class Test1 {

	public static void main(String[] args) {
		DBUtil db=new DBUtil();
		System.out.println(db.getConn());

	}

}
