package com.stuff.Iml;

import java.util.Scanner;

import com.stuff.Dao.IUIDao;

public class UIDaoImpl implements IUIDao {

	@Override
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎来到员工管理系统!");
		System.out.println("请管理员登录，请输入管理员用户名：");
		String userName = sc.nextLine();
		System.out.println("请输入管理员用户密码：");
		String userPwd = sc.nextLine();
		if(userName.equals("admin") && userPwd.equals("admin")) {
			menu();
		}
		sc.close();
	}

	@Override
	public void menu() {
		System.out.println("员工列表如下：");
		new ManageDaoImpl().search();
		System.out.println("1.添加员工  2.删除员工  3.更新员工  4.退出(请输入操作序号)");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			new ManageDaoImpl().add();
			break;
		case 2:
			new ManageDaoImpl().delete();
			break;
		case 3:
			new ManageDaoImpl().updata();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			break;
		}
		sc.close();
	}

}
