/**
 * ��ɫʵ���࣬�����ɫ����
 * @author ��Զ��
 * @version V1.0
 */
public class User {

	private String name;	//�û���ɫ
	private String userId;	//�û����
	private String userName = "admin";	//�û���
	private String userPwd = "admin";		//�û�����
	private int experience;		//�û�����
	private int level;		//�û��ȼ�
	
	public String getName() {	//��Ա����name��get����
		return name;
	}

	public void setName(String name) {	//��Ա����name��set����
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

	public User() {	//���췽��
		// TODO Auto-generated constructor stub
	}

}
