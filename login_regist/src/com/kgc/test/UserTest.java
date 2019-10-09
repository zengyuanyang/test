package com.kgc.test;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.kgc.dao.IUserDao;
import com.kgc.dao.impl.UserDaoImpl;
import com.kgc.game.GuessNumber;
import com.kgc.pojo.User;

public class UserTest {

	public static void main(String[] args) {
		while(true) {
			System.out.println("-----------------XXX购物系统-----------------------");
			System.out.println("1.登录");
			System.out.println("2.注册");
			System.out.println("3.退出");
			Scanner input = new Scanner(System.in);
			String choiceString = input.nextLine();
			IUserDao udao = new UserDaoImpl();
			switch (choiceString) {
			case "1":
				System.out.println("-----------------登录界面-----------------------");
				System.out.println("请输入账户：");
				String userName = input.nextLine();
				System.out.println("请输入密码：");
				String userPwd = input.nextLine();
				boolean flag = udao.isLogin(userName, userPwd);
				if(flag) {
					System.out.println("登录成功，可以开始玩游戏了");
					System.out.println("是否开始游戏？y/n");
					while(true) {
						String resultString = input.nextLine();
						if("y".equalsIgnoreCase(resultString)) {
							GuessNumber.start();
							System.out.println("是否继续? y/n");
						}else {
							break;
						}
					}
					System.out.println("谢谢使用，欢迎下次再来！");
					System.exit(0);
				}else {
					System.out.println("账户和密码错误，登陆失败！");
				}
				break;
			case "2":
				System.out.println("-----------------注册界面-----------------------");
				System.out.println("请输入账户：");
				String newuserName = input.nextLine();
				System.out.println("请输入密码：");
				String newuserPwd = input.nextLine();
				User user = new User();
				user.setUserName(newuserName);
				user.setUserPwd(newuserPwd);
				udao.regist(user);
				System.out.println("注册成功！");
				break;
			case "3":
			default:
				System.out.println("谢谢使用！");
				System.exit(0);
				break;
			}
			
		}
	}

}
