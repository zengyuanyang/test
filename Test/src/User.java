/**
*用户角色类
*@ author 课工场    编号  角色名称   等级   经验值   账号  密码
*/

public class User{
	//成员变量
	private int userId;//编号
	private String name;//角色名称
	private int lv;//等级
	private int experience;//经验值
	private String userName;//账号 
	private String userPwd;//密码
	
	//成员方法
	//getXxx 获取
	public int getUserId(){
		return this.userId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getLv(){
		return this.lv;
	}
	
	public int getExperience(){
		return this.experience;
	}
	
	public String getUsername(){
		return this.userName;
	}
	
	public String getUserPwd(){
		return this.userPwd;
	}
	
	
	//setXxx 设置
	public void setUserId(int userId){
		this.userId=userId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setLv(int lv){
		this.lv=lv;
	}
	
	public void setExperience(int experience){
		this.experience=experience;
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	public void setUserPwd(String userPwd){
		this.userPwd=userPwd;
	}
	
	//构造无参数方法user
	public User(){
		
	}
	
}