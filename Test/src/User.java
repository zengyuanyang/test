/**
*�û���ɫ��
*@ author �ι���    ���  ��ɫ����   �ȼ�   ����ֵ   �˺�  ����
*/

public class User{
	//��Ա����
	private int userId;//���
	private String name;//��ɫ����
	private int lv;//�ȼ�
	private int experience;//����ֵ
	private String userName;//�˺� 
	private String userPwd;//����
	
	//��Ա����
	//getXxx ��ȡ
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
	
	
	//setXxx ����
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
	
	//�����޲�������user
	public User(){
		
	}
	
}