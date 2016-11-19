package com.adc.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.adc.dao.IBaseDao;

public class BaseDaoImpl extends JdbcDaoSupport implements IBaseDao{

	public String find(String sql) {
		String result = this.getJdbcTemplate().queryForObject(sql, java.lang.String.class);
		return result;
	}

	@SuppressWarnings({"rawtypes" })
	public List findList(String sql) {
		List result = this.getJdbcTemplate().queryForList(sql);
		return result;
	}
 
}
