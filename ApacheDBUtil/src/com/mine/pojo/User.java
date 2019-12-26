package com.mine.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * @author 曾远洋
 * @time 2019年12月2日下午3:48:30
 * @version V1.0
 */
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String userPwd;
	private int userSex;
	private Date userBirthday;
	private String userEmail;
	
	
	
	public User() {
		super();
	}
	public User(int userId, String userName, String userPwd, int userSex, Date userBirthday, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userSex = userSex;
		this.userBirthday = userBirthday;
		this.userEmail = userEmail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userSex=" + userSex
				+ ", userBirthday=" + userBirthday + ", userEmail=" + userEmail + "]";
	}
	
	
	
}
