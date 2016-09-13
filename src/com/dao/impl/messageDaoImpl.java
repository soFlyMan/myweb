package com.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.messageDao;
import com.entity.message;
import com.util.DBUtil;

public class messageDaoImpl extends DBUtil implements messageDao {

	public int addMessage(message mess){
		String sql="insert into message(umessage,dname,uemail) values(?,?,?)";
		System.out.println(mess.getUmessage());
		System.out.println(mess.getDname());
		
		return super.execUpdate(sql, mess.getUmessage(),mess.getDname(),mess.getUemail());
	}

	@Override
	public List<message> getDisplay(String display) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM message where dname = ?";
		ResultSet rst=super.execQuery(sql , display);
		List<message> list = new ArrayList<message>() ;
		try {
			while(rst.next()){
			int mid=rst.getInt(1);
			String umessage=rst.getString(2);
			String dname=rst.getString(3);
			String uemail=rst.getString(4);
			message message=new message(mid, umessage,dname,uemail);
			list.add(message);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
