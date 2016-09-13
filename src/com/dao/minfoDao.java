package com.dao;

import java.util.List;

import com.entity.minfo;

public interface minfoDao {
	
	public List<minfo> getAllminfo(String id);
	public minfo getmindf(String name);
    public List<minfo> getDtype(String type);
}
