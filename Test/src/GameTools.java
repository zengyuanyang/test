/**
*��Ϸ���������õ��Ĺ���
*/

import java.util.Scanner;
public class GameTools{
	/**
	*�����û���������ֵ
	*@param maxIndexΪ�û�������������ֵ
	*/
	
	
	public int getUserValue(int maxIndex){
			return validate(maxIndex);
	}		
	
	/**
	*�ж��û��������ֵ
	*
	*/
		public int validate(int maxIndex){
			Scanner input = new Scanner(System.in);
			for(;;){
				System.out.print("����ѡ����Ҫ��ѡ��(1-"+maxIndex+")��");
				if(!(input.hasNextInt())){
					String valueString  = input.nextLine(); //��ȡ�û������ֵ
					System.out.println("������Ĳ������֣����������룡");
					continue;
				}else{
					int value = input.nextInt();
					//�����û���ѡ����ֻ��1-5 ���û�����Ĳ���1-5 Ҳ�п�����1-3
					if(value < 1 || value > maxIndex){ //������ѡ����
						System.out.println("û���������ѡ����������룡");
						continue;
					}else{
						return value;
					}
				}
			}
		}
		
	/**
	*�û�ע��
	*@return ����ֵ 
	*/
	public User addUser(){
		User user=new User();
		Scanner input = new Scanner(System.in);
		for(;;){
			System.out.println("�������û���");
			String name=input.nextLine();
			System.out.println("����������");
			String pwd=input.nextLine();
			System.out.println("���ٴ���������");
			String pwdTo=input.nextLine();
				if(pwd.equals(pwdTo)){
					user.setUserName(name);
					user.setUserPwd(pwd);
				break;
				}else {
				System.out.println("�������벢��һ�£�����������");
				continue;
				}
		}
	return user;
	
	}
	
	/**
	*�û�ע��
	*@return ����ֵ 
	*/
	public User login(){
		User user=new User();
		Scanner input=new Scanner(System.in);
		System.out.println("�������û���");
		String name=input.nextLine();
		System.out.println("����������");
		String pwd=input.nextLine();
		user.setUserName(name);
		user.setUserPwd(pwd);
		return user;
	}
	
}