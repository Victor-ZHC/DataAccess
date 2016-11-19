package com.adc.dao;

import java.util.List;

public interface IBaseDao {
	public String find(String sql);
	@SuppressWarnings("rawtypes")
	public List findList(String sql);
}