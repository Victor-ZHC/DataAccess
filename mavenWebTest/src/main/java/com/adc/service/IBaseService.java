package com.adc.service;

import java.util.List;

public interface IBaseService {
	public String find(String sql);
	@SuppressWarnings("rawtypes")
	public List findList(String sql);
}
