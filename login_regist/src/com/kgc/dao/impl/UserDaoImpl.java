package com.kgc.dao.impl;

import java.util.*;

import com.kgc.dao.IUserDao;
import com.kgc.pojo.User;
//张三进来创建了一次UserDaoImpl
//李四进来有UserDaoImpl
public class UserDaoImpl implements IUserDao {
	//为了让更多方法能够使用一个集合，就把集合定义在成员变量位置。
	//为了不让其他类去访问，所以我们要私有。
	//为了让更多对象共享一个成员变量,用static
	private static List<User> list  = new ArrayList<User>();
	
	@Override
	public boolean isLogin(String userName, String userPwd) {
		//从数据库中获取信息-----集合
		boolean flag = false;
		for (User user : list) {
			if(userName.equals(user.getUserName()) && userPwd.equals(user.getUserPwd())) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		//保存到数据库 ------ 集合 
		list.add(user);
	}

}
