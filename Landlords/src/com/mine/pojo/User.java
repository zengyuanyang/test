package com.mine.pojo;

public class User {
	private int userID = 5201314;		//用户ID
	private String userName = "游客";	//用户名
	private String uersPwd = "游客";		//用户密码
	private String role;		//用户的角色
	private int money = 2000;			//用户金币
	//无参构造方法
	public User() {
		
	}
	
	//get()和set()方法
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUersPwd() {
		return uersPwd;
	}
	public void setUersPwd(String uersPwd) {
		this.uersPwd = uersPwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", uersPwd=" + uersPwd + ", money=" + money + "]";
	}
	
	

}
