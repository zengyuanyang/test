/**
*游戏开发中所用到的工具
*/

import java.util.Scanner;
public class GameTools{
	/**
	*接受用户输入的最大值
	*@param maxIndex为用户可以输入的最大值
	*/
	
	
	public int getUserValue(int maxIndex){
			return validate(maxIndex);
	}		
	
	/**
	*判断用户输入的数值
	*
	*/
		public int validate(int maxIndex){
			Scanner input = new Scanner(System.in);
			for(;;){
				System.out.print("请您选择需要的选项(1-"+maxIndex+")：");
				if(!(input.hasNextInt())){
					String valueString  = input.nextLine(); //获取用户输入的值
					System.out.println("您输入的不是数字，请重新输入！");
					continue;
				}else{
					int value = input.nextInt();
					//可能用户的选择项只有1-5 而用户输入的不是1-5 也有可能是1-3
					if(value < 1 || value > maxIndex){ //不符合选择项
						System.out.println("没有您输入的选项，请重新输入！");
						continue;
					}else{
						return value;
					}
				}
			}
		}
		
	/**
	*用户注册
	*@return 返回值 
	*/
	public User addUser(){
		User user=new User();
		Scanner input = new Scanner(System.in);
		for(;;){
			System.out.println("请输入用户名");
			String name=input.nextLine();
			System.out.println("请输入密码");
			String pwd=input.nextLine();
			System.out.println("请再次输入密码");
			String pwdTo=input.nextLine();
				if(pwd.equals(pwdTo)){
					user.setUserName(name);
					user.setUserPwd(pwd);
				break;
				}else {
				System.out.println("输入密码并不一致，请重新输入");
				continue;
				}
		}
	return user;
	
	}
	
	/**
	*用户注册
	*@return 返回值 
	*/
	public User login(){
		User user=new User();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名");
		String name=input.nextLine();
		System.out.println("请输入密码");
		String pwd=input.nextLine();
		user.setUserName(name);
		user.setUserPwd(pwd);
		return user;
	}
	
}