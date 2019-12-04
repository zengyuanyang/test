package com.mine.pojo;

import java.util.Arrays;

public class User {
	private String userName;
	private String userPwd;
	private String userSex;
	private String[] userHobby;
	private String userCity;
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
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String[] getUserHobby() {
		return userHobby;
	}
	public void setUserHobby(String[] userHobby) {
		this.userHobby = userHobby;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + ", userSex=" + userSex + ", userHobby="
				+ Arrays.toString(userHobby) + ", userCity=" + userCity + "]";
	}
	
}
