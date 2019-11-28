package com.stuff.Iml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.stuff.Dao.IManageDao;
import com.stuff.pojo.Stuff;

public class ManageDaoImpl implements IManageDao {

	@Override
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入添加员工的姓名：");
		String name = sc.nextLine();
		System.out.println("请输入添加员工的年龄：");
		String age = sc.nextLine();
		System.out.println("请输入添加员工的电话：");
		String phone = sc.nextLine();
		System.out.println("请输入添加员工的职位：");
		String zhiwei = sc.nextLine();
		Stuff s = new Stuff(name, age, phone, zhiwei);
		ObjectInputStream osi = null;
		ObjectOutputStream oos = null;
		try {
			osi = new ObjectInputStream(new FileInputStream("stuff.txt"));
			@SuppressWarnings("unchecked")
			ArrayList<Stuff> list = (ArrayList<Stuff>) osi.readObject();
			list.add(s);
			oos = new ObjectOutputStream(new FileOutputStream("stuff.txt"));
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				osi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		new UIDaoImpl().menu();
		sc.close();
	}

	@Override
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要删除的员工的姓名：");
		String name = sc.nextLine();
		System.out.println("请输入该员工的电话号码：");
		String phone = sc.nextLine();
		ObjectInputStream osi = null;
		ObjectOutputStream oos = null;
		try {
			osi = new ObjectInputStream(new FileInputStream("stuff.txt"));
			@SuppressWarnings("unchecked")
			ArrayList<Stuff> list = (ArrayList<Stuff>) osi.readObject();
			int count=0;
			for (Stuff stuff : list) {
				if(stuff.getName().equals(name) && stuff.getPhone().equals(phone)) {
					list.remove(stuff);
					break;
				}else {
					count++;
				}
			}
			if(count == list.size()) {
				System.out.println("未找到匹配的员工，请重新输入：");
				delete();
			}
			oos = new ObjectOutputStream(new FileOutputStream("stuff.txt"));
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				osi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		new UIDaoImpl().menu();
		sc.close();
	}

	@Override
	public void updata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要修改的员工的姓名:");
		String name = sc.nextLine();
		System.out.println("请输入您要修改的员工的年龄:");
		String age = sc.nextLine();
		System.out.println("请输入您要修改的员工的电话:");
		String phone = sc.nextLine();
		System.out.println("请输入您要修改的员工的职位:");
		String zhiwei = sc.nextLine();
		ObjectInputStream osi = null;
		ObjectOutputStream oos = null;
		try {
			osi = new ObjectInputStream(new FileInputStream("stuff.txt"));
			@SuppressWarnings("unchecked")
			ArrayList<Stuff> list = (ArrayList<Stuff>) osi.readObject();
			int count=0;
			for (Stuff stuff : list) {
				if(stuff.getName().equals(name)) {
					stuff.setAge(age);
					stuff.setPhone(phone);
					stuff.setZhiwei(zhiwei);
					break;
				}else {
					count++;
				}
			}
			if(count == list.size()) {
				System.out.println("未找到匹配的员工，请重新输入：");
				updata();
			}
			oos = new ObjectOutputStream(new FileOutputStream("stuff.txt"));
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				osi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		new UIDaoImpl().menu();
		sc.close();
	}

	@Override
	public void search() {
		ObjectInputStream osi = null;
		try {
			osi = new ObjectInputStream(new FileInputStream("stuff.txt"));
			@SuppressWarnings("unchecked")
			ArrayList<Stuff> list = (ArrayList<Stuff>) osi.readObject();
			for (Stuff stuff : list) {
				System.out.println(stuff);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				osi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
