package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.minfoDao;
import com.entity.minfo;
import com.util.DBUtil;

public class minfoDaoImpl extends DBUtil implements minfoDao {
	
	public List<minfo> getAllminfo(String id) {
	List<minfo> list=new ArrayList<minfo>();
	if("".equals(id)  ||  id  == null){
		String sql="SELECT * FROM minfo ";
		ResultSet rst=super.execQuery(sql);
		try {
			while(rst.next()){
				int did=rst.getInt(1);
				String dname=rst.getString(2);
				double drate=rst.getDouble(3);
				String dcountry=rst.getString(4);
				String dtime=rst.getString(5);
				String dtype=rst.getString(6);
				String dactor=rst.getString(7);
				String ddirector=rst.getString(8);
				int dage=rst.getInt(9);
				String dimage=rst.getString(10);
				minfo minfo=new minfo(did,dname,drate,dcountry,dtime,dtype,dactor,ddirector,dage,dimage);
				list.add(minfo);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  else{
		String sql="SELECT * FROM minfo where dname = ?";
		ResultSet rst=super.execQuery(sql , id);
		try {
			while(rst.next()){
				int did=rst.getInt(1);
				String dname=rst.getString(2);
				double drate=rst.getDouble(3);
				String dcountry=rst.getString(4);
				String dtime=rst.getString(5);
				String dtype=rst.getString(6);
				String dactor=rst.getString(7);
				String ddirector=rst.getString(8);
				int dage=rst.getInt(9);
				String dimage=rst.getString(10);
				minfo minfo=new minfo(did,dname,drate,dcountry,dtime,dtype,dactor,ddirector,dage,dimage);
				list.add(minfo);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return list;
	}

	public minfo getmindf(String name) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM minfo where dname = ?";
		ResultSet rst=super.execQuery(sql , name);
		minfo minfo = null;
		try {
			while(rst.next()){
				int did=rst.getInt(1);
				String dname=rst.getString(2);
				double drate=rst.getDouble(3);
				String dcountry=rst.getString(4);
				String dtime=rst.getString(5);
				String dtype=rst.getString(6);
				String dactor=rst.getString(7);
				String ddirector=rst.getString(8);
				int dage=rst.getInt(9);
				String dimage=rst.getString(10);
				minfo=new minfo(did,dname,drate,dcountry,dtime,dtype,dactor,ddirector,dage,dimage);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return minfo;
	}

	@Override
	public List<minfo> getDtype(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
