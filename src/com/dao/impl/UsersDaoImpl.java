package com.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UsersDao;
import com.entity.Users;
import com.util.DBUtil;


public class UsersDaoImpl extends DBUtil implements UsersDao {

	@Override
	public boolean loginUser(String uname, String upwd) {
		String sql="select * from users where uname=? and upwd=?";
		ResultSet rst=super.execQuery(sql, uname,upwd);
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
		String sql="insert into users(uname,upwd,birthday) values(?,?,?)";
		return super.execUpdate(sql, user.getUname(),user.getUpwd(),user.getBirthday());
	}

}
