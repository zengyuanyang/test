/**
 * 角色实体类，定义角色属性
 * @author 曾远洋
 * @version V1.0
 */
public class User {

	private String name;	//用户角色
	private String userId;	//用户编号
	private String userName = "admin";	//用户名
	private String userPwd = "admin";		//用户密码
	private int experience;		//用户经验
	private int level;		//用户等级
	
	public String getName() {	//成员变量name的get方法
		return name;
	}

	public void setName(String name) {	//成员变量name的set方法
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public User() {	//构造方法
		// TODO Auto-generated constructor stub
	}

}
