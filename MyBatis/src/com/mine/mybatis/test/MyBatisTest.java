package com.mine.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mine.mybatis.mapper.UserMapper;
import com.mine.mybatis.pojo.User;


public class MyBatisTest {
	private UserMapper userMapper = null;
	private SqlSession sqlSession = null;
	
	@Test
	public void insertTest() throws Exception {
		userMapper.insertUser(new User("曾远洋", "男", "四川", new Date()));
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void selectTest() throws Exception {
		User user = userMapper.selectUserById(1);
		System.out.println(user);
		sqlSession.close();
	}
	
	@Before
	public void before() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource); 
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		
	}
	
}
