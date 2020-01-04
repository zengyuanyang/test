package com.mine.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mine.mybatis.pojo.User;
import com.mine.mybatis.vo.UserVO;

public interface UserMapper {
	public List<User> showALlUser();
	public void insertUser(User user);
	public List<User> selectUserByName(String userName);
	
	/*
	 * 注解方式开发，勿在xml中重复写实现
	 */
	@Select("SELECT * FROM user WHERE userId = #{userId}")
	public User selectUserById(Integer userId);
	
	public List<User> selectUsers(UserVO userVO);
	
	public List<User> selectUsersMap(HashMap<String, String> hashMap);
	
	public User selectUserToMap(Integer userId);
	
	public User selectUserIf(User user);
}
