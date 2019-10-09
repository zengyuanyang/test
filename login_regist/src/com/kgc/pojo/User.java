package com.kgc.pojo;
/**
 * 这是用户的基本描述类
 * @author lei
 *
 */
public class User {
	
	private String userName;//用户名
	private String userPwd;//用户密码
	public User() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
