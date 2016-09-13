package com.dao;
import java.util.List;

import com.entity.message;
public interface messageDao {

	
	public int addMessage(message mess);
	public List<message> getDisplay(String display);
}
