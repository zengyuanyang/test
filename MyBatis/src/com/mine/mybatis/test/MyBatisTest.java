package com.mine.mybatis.test;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mine.mybatis.pojo.User;
import com.mine.mybatis.vo.UserVO;

public class MyBatisTest {
	private SqlSession sqlSession;
	@Test
	public void test() throws IOException {
		/*
		 * String resource = "sqlMapConfig.xml"; InputStream inputStream =
		 * Resources.getResourceAsStream(resource); SqlSessionFactory factory = new
		 * SqlSessionFactoryBuilder().build(inputStream); SqlSession sqlSession =
		 * factory.openSession();
		 */
		List<User> list = sqlSession.selectList("showALlUser");
		System.out.println(list);
		/* sqlSession.close(); */
	}
	
	@Test
	public void test2() {
		sqlSession.insert("insertUser", new User("刀疤哥", "男", "成都", new Date()));
		sqlSession.commit(); //增删改必须手动提交事务
	}
	
	@Test
	public void test3() {
		System.out.println(sqlSession.selectList("selectUserByName", "刀"));
	}
	/*
	 * 所有测试方法之前执行：加载配置文件，创建sqlSession
	 */
	
	@Test
	public void test4() {
		User user = new User("鸳鸯", "男", "遂宁", new Date());
		sqlSession.insert("insertUser2", user);
		sqlSession.commit();
		System.out.println(user.getUserId());
	}
	@Test
	public void test5() {
		User user = sqlSession.selectOne("selectUserById", 1);
		System.out.println(user);
	}
	
	@Test
	public void test6() {
		UserVO userVO = new UserVO();
		User user = new User();
		user.setUserName("曾");
		userVO.setUser(user);
		System.out.println(sqlSession.selectList("selectUsers", userVO));
	}
	
	@Test
	public void test7() {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("userName", "曾");
		System.out.println(sqlSession.selectList("selectUsersMap", hashMap));
	}
	
	@Test
	public void test8() {
		System.out.println(sqlSession.selectList("selectUserToMap", 1));
	}
	
	@Test
	public void test9() {
		User user = new User();
		System.out.println(sqlSession.selectList("selectUserIf", user));
	}
	
	@Test
	public void test10() {
		User user = new User();
		System.out.println(sqlSession.selectList("selectUserSql", user));
	}
	
	@Test
	public void test11() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		System.out.println(sqlSession.selectList("selectUserForeach", list));
	}
	
	@Test
	public void test12() {
		System.out.println(sqlSession.selectList("showAllOrders"));
	}
	
	@Before
	public void before() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);	//读取配置文件
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);	//根据读取的配置文件信息创建SqlSessionFactory（工厂）
		sqlSession = factory.openSession();	//通过SqlSessionFactory创建SqlSession
	}
	
	/*
	 * 所有测试方法之后执行：关闭sqlSession
	 */
	@After
	public void after() {
		sqlSession.close();	//释放资源
	}
	
}
