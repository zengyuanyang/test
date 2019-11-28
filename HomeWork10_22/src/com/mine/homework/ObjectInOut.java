package com.mine.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectInOut {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
		ArrayList<Student> array = new ArrayList<Student>();
		array.add(new Student("曾远洋", 23));
		array.add(new Student("刀疤哥", 22));
		array.add(new Student("刀疤", 21));
		oos.writeObject(array);
		oos.flush();
		FileInputStream fis = new FileInputStream("object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(fis.available() > 0) {
				Object obj = ois.readObject();
				System.out.println(obj);
		}
		ois.close();
		oos.close();
	}

}
