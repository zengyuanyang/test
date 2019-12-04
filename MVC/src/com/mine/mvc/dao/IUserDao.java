package com.mine.mvc.dao;

import java.util.List;

import com.mine.mvc.pojo.User;

/**
 * 操作用户数据
 * @author 曾远洋
 * @time 2019年12月2日下午4:16:54
 * @version V1.0
 */
public interface IUserDao {
	
	
	/**
	 * 根据用户名和密码查找用户
	 * @param userName
	 * @param userPwd
	 * @return
	 */
	public User selectUserByNameAndPwd(String userName,String userPwd) ;
	
	
	/**
	 * 插入新增用户数据
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	
	/**
	 * 查询所有用户信息
	 * @return
	 */
	public List<User> selectAllUser();
	
	
	/**
	 * 通过用户ID查找用户数据
	 * @param userId
	 * @return
	 */
	public User selectUserById(int userId);
	
	
	/**
	 * 通过用户对象修改用户数据
	 * @param userId
	 * @return
	 */
	public int updateUserByUserId(User user);
	
	
	/**
	 * 根据用户ID删除用户数据
	 * @param userId
	 * @return
	 */
	public int deleteUserByUserId(int userId);
	
	
}
