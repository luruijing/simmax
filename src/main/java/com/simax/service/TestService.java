package com.simax.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author XDeng
 * @param <E>
 * @date 2019年7月23日上午9:44:24
 */

@Service
public class TestService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> queryTest(){
		String sql = "select * from user";
		return jdbcTemplate.queryForList(sql);
	}
	
}
