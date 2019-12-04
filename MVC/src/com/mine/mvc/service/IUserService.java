package com.mine.mvc.service;

import java.util.List;

import com.mine.mvc.pojo.User;

/**
 * 业务功能接口
 * @author 曾远洋
 * @time 2019年12月2日下午5:05:52
 * @version V1.0
 */
public interface IUserService {
	
	
	/**
	 * 用户注册操作
	 * @param user
	 * @return
	 */
	public User registerUser(User user);
	
	/**
	 * 用户登录操作
	 * @param user
	 * @return
	 */
	public User loginUser(User user);
	
	/**
	 * 展示所有用户数据
	 * @return
	 */
	public List<User> showAllUser();
	
	/**
	 * 删除用户数据
	 * @param userId
	 * @return
	 */
	public int deleteUser(int userId);
	
	/**
	 * 修改用户数据
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	
	/**
	 * 根据用户ID查询用户
	 * @param userId
	 * @return
	 */
	public	User selectUser(int userId);
}
