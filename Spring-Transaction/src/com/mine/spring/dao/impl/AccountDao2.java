package com.mine.spring.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mine.spring.dao.IAccountDao;
/*
 * 使用JDBCTemplate执行SQL
 * 需要继承jdbcDaoSupport类
 */
public class AccountDao2 extends JdbcDaoSupport implements IAccountDao {


	@Override
	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update account set money = money + ? where userName = ?",money,inner );
	}

	@Override
	public void out(String outer, Integer money) {
		this.getJdbcTemplate().update("update account set money = money - ? where userName = ?",money,outer );
	}

}
