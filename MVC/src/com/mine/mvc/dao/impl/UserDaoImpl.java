package com.mine.mvc.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mine.mvc.dao.IUserDao;
import com.mine.mvc.pojo.User;
import com.mine.mvc.pojo.mapping.UserMapping;
import com.mine.mvc.util.C3P0Util;
import com.mine.mvc.util.DBUtil;
import com.mine.mvc.util.ManagerThreadLocal;

/**
 * 用户数据访问层的实现
 * @author 曾远洋
 * @time 2019年12月2日下午4:28:17
 * @version V1.0
 */
public class UserDaoImpl implements IUserDao {

	@Override
	public User selectUserByNameAndPwd(String userName, String userPwd) {
		String sql = "SELECT * FROM user WHERE userName = ? AND userPwd = ?";
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		User user = null;
		try {
			user = qr.query(ManagerThreadLocal.getConnection(), sql, new BeanHandler<User>(User.class), userName,userPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public int insertUser(User user) {
		String sql = "INSERT INTO user(userName,userPwd,userSex,userBirthday,userEmail) VALUES(?,?,?,?,?)";
		try {
			return new QueryRunner(C3P0Util.getDataSource()).update(ManagerThreadLocal.getConnection(), sql, user.getUserName(),user.getUserPwd(),user.getUserSex(),user.getUserBirthday(),user.getUserEmail());
		} catch (SQLException e) {
			throw new RuntimeException("运行异常");
		}
	}

	@Override
	public List<User> selectAllUser() {
		String sql = "SELECT * FROM user";
		try {
			List<User> list = new QueryRunner(C3P0Util.getDataSource()).query(ManagerThreadLocal.getConnection(), sql, new BeanListHandler<User>(User.class));
			if(list.size() > 0) {
				return list;
			}
			return null;
		} catch (SQLException e) {
			throw new RuntimeException("运行异常");
		}
	}

	@Override
	public User selectUserById(int userId) {
		String sql = "SELECT * FROM user WHERE userId = ?";
		
		try {
			return new QueryRunner(C3P0Util.getDataSource()).query(ManagerThreadLocal.getConnection(), sql, new BeanHandler<User>(User.class), userId);
		} catch (SQLException e) {
			throw new RuntimeException("运行异常");
		}
	}

	@Override
	public int updateUserByUserId(User user) {
		String sql = "UPDATE user SET userName = ?,userPwd = ?,userSex = ?,userBirthday = ?,userEmail = ? WHERE userId = ?";
		try {
			return new QueryRunner(C3P0Util.getDataSource()).update(ManagerThreadLocal.getConnection(), sql, user.getUserName(),user.getUserPwd(),user.getUserSex(),user.getUserBirthday(),user.getUserEmail(),user.getUserId());
		} catch (SQLException e) {
			throw new RuntimeException("运行异常");
		}
	}

	@Override
	public int deleteUserByUserId(int userId) {
		String sql = "DELETE FROM user WHERE userId = ?";
		try {
			return new QueryRunner(C3P0Util.getDataSource()).update(ManagerThreadLocal.getConnection(), sql, userId);
		} catch (SQLException e) {
			throw new RuntimeException("运行异常");
		}
	}

}
