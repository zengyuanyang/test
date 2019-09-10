package com.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class ObjectStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Administrator\\Desktop","object.txt");
		if(!file.exists()) {
			file.createNewFile();	//创建文件
		}
		//Peopel对象创建
		Peopel p1 = new Peopel("周奎",true,28);
		Peopel p2 = new Peopel("杜婷",false,22);
		Peopel p3 = new Peopel("何玉奎",true,21);
		Peopel p4 = new Peopel("段皓文",true,22);
		Peopel p5 = new Peopel("刀疤哥",true,23);
		Peopel[] peopel = {p1,p2,p3,p4,p5};
		//创建对象流的对象
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		LinkedList<Peopel> ls = new LinkedList<Peopel>();
		try {
			for(int i = 0;i < peopel.length;i++) {
				oos.writeObject(peopel[i]);		//写操作
				ls.add((Peopel) ois.readObject());		//将文件中的对象读出来存在LinkedList中
			}
			//关闭流
			oos.close();
			ois.close();
			//循环遍历List
			for(int i = 0;i < ls.size();i++) {
				System.out.println(ls.get(i));
			}
		}catch (ClassNotFoundException cnfe) {
			System.out.println("未知错误！");
		}catch (IOException ioe) {
			System.out.println("IO异常!");
		}catch (Exception e) {
			System.out.println("错误！");
		}
		
	}

}
