package com.mine.mvc.dao.impl;

import java.util.List;

import com.mine.mvc.dao.IUserDao;
import com.mine.mvc.pojo.User;
import com.mine.mvc.pojo.mapping.UserMapping;
import com.mine.mvc.util.DBUtil;

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
		User user = (User)DBUtil.executeQueryObject(sql, new UserMapping(), userName,userPwd);
		return user;
	}

	@Override
	public int insertUser(User user) {
		String sql = "INSERT INTO user(userName,userPwd,userSex,userBirthday,userEmail) VALUES(?,?,?,?,?)";
		return DBUtil.executeUpdate(sql, user.getUserName(),user.getUserPwd(),user.getUserSex(),user.getUserBirthday(),user.getUserEmail());
	}

	@Override
	public List<User> selectAllUser() {
		String sql = "SELECT * FROM user";
		List<User> list = DBUtil.executeQueryList(sql, new UserMapping());
		if(list.size() > 0) {
			return list;
		}
		return null;
	}

	@Override
	public User selectUserById(int userId) {
		String sql = "SELECT * FROM user WHERE userId = ?";
		return (User) DBUtil.executeQueryObject(sql, new UserMapping(), userId);
	}

	@Override
	public int updateUserByUserId(User user) {
		String sql = "UPDATE user SET userName = ?,userPwd = ?,userSex = ?,userBirthday = ?,userEmail = ? WHERE userId = ?";
		return DBUtil.executeUpdate(sql,user.getUserName(),user.getUserPwd(),user.getUserSex(),user.getUserBirthday(),user.getUserEmail(),user.getUserId());
	}

	@Override
	public int deleteUserByUserId(int userId) {
		String sql = "DELETE FROM user WHERE userId = ?";
		return DBUtil.executeUpdate(sql, userId);
	}

}
