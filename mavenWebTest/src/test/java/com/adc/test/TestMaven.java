package com.adc.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adc.service.IBaseService;
import com.adc.service.impl.BaseServiceImpl;
import com.adc.utils.DataSourceContextHolder;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMaven {
	@Resource(name="baseService")
	private IBaseService baseService = null;

	@Test
	public void test1() {
		DataSourceContextHolder.setDataSource("dataSourceA");
		String sql = "select user_name from users where id=1";
		String str = baseService.find(sql);
		//List str = baseService.findList(sql);
		System.out.println(JSON.toJSONString(str));
	}
}
