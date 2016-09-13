package com.dao;

import com.entity.Users;

public interface UsersDao {
	public boolean loginUser(String uemail,String upwd);
	public int addUser(Users user);

}
