package com.mine.spring.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mine.spring.dao.IUserDao;

public class UserDao extends JdbcDaoSupport implements IUserDao {

	@Override
	public void insertUser() throws Exception {
		this.getJdbcTemplate().update("INSERT INTO user VALUES(2,'刀疤哥','男')");
	}

}
