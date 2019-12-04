package com.mine.mvc.service.impl;

import java.util.List;

import com.mine.mvc.dao.IUserDao;
import com.mine.mvc.dao.impl.UserDaoImpl;
import com.mine.mvc.pojo.User;
import com.mine.mvc.service.IUserService;

/**
 * 业务功能接口的实现类
 * @author 曾远洋
 * @time 2019年12月2日下午5:13:36
 * @version V1.0
 */
public class UserServiceImpl implements IUserService {
	IUserDao userDao = new UserDaoImpl();

	@Override
	public User registerUser(User user) {
		int flag = userDao.insertUser(user);
		if(flag <= 0) {
			return null;
		}
		return loginUser(user);
	}

	@Override
	public User loginUser(User user) {
		return userDao.selectUserByNameAndPwd(user.getUserName(), user.getUserPwd());
	}

	@Override
	public List<User> showAllUser() {
		return userDao.selectAllUser();
	}

	@Override
	public int deleteUser(int userId) {
		return userDao.deleteUserByUserId(userId);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUserByUserId(user);
	}

	@Override
	public User selectUser(int userId) {
		return userDao.selectUserById(userId);
	}

}
