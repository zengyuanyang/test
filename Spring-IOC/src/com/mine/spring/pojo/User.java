package com.mine.spring.pojo;

public class User {
	private String userName;
	private String userPwd;
	private Job job;
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
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
	
	
	public User(String userName, String userPwd, Job job) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.job = job;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + ", job=" + job + "]";
	}
	
}
