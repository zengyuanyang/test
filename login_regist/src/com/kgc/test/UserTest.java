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
			System.out.println("-----------------XXX����ϵͳ-----------------------");
			System.out.println("1.��¼");
			System.out.println("2.ע��");
			System.out.println("3.�˳�");
			Scanner input = new Scanner(System.in);
			String choiceString = input.nextLine();
			IUserDao udao = new UserDaoImpl();
			switch (choiceString) {
			case "1":
				System.out.println("-----------------��¼����-----------------------");
				System.out.println("�������˻���");
				String userName = input.nextLine();
				System.out.println("���������룺");
				String userPwd = input.nextLine();
				boolean flag = udao.isLogin(userName, userPwd);
				if(flag) {
					System.out.println("��¼�ɹ������Կ�ʼ����Ϸ��");
					System.out.println("�Ƿ�ʼ��Ϸ��y/n");
					while(true) {
						String resultString = input.nextLine();
						if("y".equalsIgnoreCase(resultString)) {
							GuessNumber.start();
							System.out.println("�Ƿ����? y/n");
						}else {
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�������");
					System.exit(0);
				}else {
					System.out.println("�˻���������󣬵�½ʧ�ܣ�");
				}
				break;
			case "2":
				System.out.println("-----------------ע�����-----------------------");
				System.out.println("�������˻���");
				String newuserName = input.nextLine();
				System.out.println("���������룺");
				String newuserPwd = input.nextLine();
				User user = new User();
				user.setUserName(newuserName);
				user.setUserPwd(newuserPwd);
				udao.regist(user);
				System.out.println("ע��ɹ���");
				break;
			case "3":
			default:
				System.out.println("ллʹ�ã�");
				System.exit(0);
				break;
			}
			
		}
	}

}
