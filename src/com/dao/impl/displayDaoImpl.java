package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.messageDao;
import com.entity.message;
import com.entity.minfo;
import com.util.DBUtil;

public class displayDaoImpl extends DBUtil implements messageDao {

	@Override
	public int addMessage(message mess) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<message> getDisplay(String display) {
		List<message> list1=new ArrayList<message>();
		
		
		String sql="SELECT * FROM minfo where dname = ?";
		ResultSet rst=super.execQuery(sql , display);
		
		
		try {
			while(rst.next()){
			int mid=rst.getInt(1);
			String umessage=rst.getString(2);
			String dname=rst.getString(3);
			String uemail=rst.getString(4);
			message message=new message(mid, umessage,dname,uemail);
			list1.add(message);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return list1;	
	}
	

}
