package com.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UsersDao;
import com.entity.Users;
import com.util.DBUtil;


public class UsersDaoImpl extends DBUtil implements UsersDao {

	@Override
	public boolean loginUser(String uemail, String upawd) {
		String sql="select * from users where uemail=? and upawd=?  ";
		ResultSet rst=super.execQuery(sql,uemail,upawd);
		try {
			if(rst.next()){
				
				
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int addUser(Users user) {
		String sql="insert into users(uemail,upawd,uname) values(?,?,?)";
		return super.execUpdate(sql, user.getUemail(),user.getUpawd(),user.getUname());
	}

}
