package com.mine.mvc.pojo.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mine.mvc.pojo.User;
import com.mine.mvc.util.IMakeRowToObject;

/**
 * 将字段数据封装为对象
 * @author 曾远洋
 * @time 2019年12月2日下午4:07:13
 * @version V1.0
 */
public class UserMapping implements IMakeRowToObject {

	@Override
	public Object rowToObject(ResultSet rs) {
		User user = new User();
		try {
			user.setUserId(rs.getInt("userId"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			user.setUserName(rs.getString("userName"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			user.setUserPwd(rs.getString("userPwd"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			user.setUserSex(rs.getInt("userSex"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			user.setUserBirthday(rs.getDate("userBirthday"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			user.setUserEmail(rs.getString("userEmail"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}
