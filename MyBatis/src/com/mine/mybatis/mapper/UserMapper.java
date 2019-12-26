package com.mine.mybatis.mapper;

import com.mine.mybatis.pojo.User;

public interface UserMapper {
	public void insertUser(User user) throws Exception;
	public User selectUserById(Integer userId) throws Exception;

}
