package com.adc.dao;

import com.adc.bean.ConfigBean;

public interface IConfigDao {
	public ConfigBean find(String name);
	public void test();
}
