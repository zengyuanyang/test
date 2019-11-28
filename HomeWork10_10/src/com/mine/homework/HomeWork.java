package com.mine.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1.ArrayList数据存在到txt中
 * 2.txt数据存到集合，一行为一个元素
 * 3.在文件中存几个名字，随机获取一个名字
 * 4.文件夹复制到另一个文件夹下
 * 5.复制指定文件，并改后缀名
 * 6.复制多级文件夹，到指定文件夹下
 * 7.键盘录入五个学生的基本信息姓名、语文、数学、英语，按总分从高到低录入txt
 * 8.已知在txt中存放了n个字母，排序后存到另一个txt中
 * 9.用reader去模拟BufferedReader的readLine（）方法
 * @author 曾远洋
 * @time 2019年10月10日下午5:45:14
 * @version V1.0
 */
public class HomeWork {
	public static void main(String[] args) throws IOException {
		listToTxt();
		txtToList();
		System.out.println("---------------------------");
		randomName();
		copyDir();
		File sourseDir = new File("C:\\Users\\Administrator\\Desktop\\sourse");
		File targetDir = new File("C:\\Users\\Administrator\\Desktop");
		copyMoreDir(sourseDir,targetDir);
		changeName("test.txt");
		inputScore();
		sort();
		moni();
	}
	
	/**
	 * ArrayList数据存在到txt中
	 * @throws IOException
	 */
	public static void listToTxt() throws IOException {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("我爱我的祖国！");
		arrList.add("我的祖国是中国！");
		arrList.add("中国牛逼！");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("listToTxt.txt")));
		for (String s : arrList) {
			bw.write(s);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}
	
	/**
	 * txt数据存到集合，一行为一个元素
	 * @throws IOException
	 */
	public static void txtToList() throws IOException {
		ArrayList<String> arrList = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("listToTxt.txt")));
		String s = null;
		while((s = br.readLine()) != null) {
			arrList.add(s);
		}
		for (String str : arrList) {
			System.out.println(str);
		}
		br.close();
	}
	
	/**
	 * 在文件中存几个名字，随机获取一个名字
	 * @throws IOException
	 */
	public static void randomName() throws IOException {
		ArrayList<String> arrList = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("randomName.txt")));
		String s = null;
		while((s = br.readLine()) != null) {
			arrList.add(s);
		}
		int i = (int) (Math.random()*arrList.size());
		System.out.println(arrList.get(i));
		br.close();
	}
	
	/**
	 * 文件夹复制到另一个文件夹下
	 * @throws IOException
	 */
	public static void copyDir() throws IOException {
		File sourseDir = new File("C:\\Users\\Administrator\\Desktop\\sourse");
		File targetDir = new File("C:\\Users\\Administrator\\Desktop\\target");
		File[] fileArray = sourseDir.listFiles();
		for (File f : fileArray) {
			if(f.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getAbsoluteFile()));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetDir.getAbsolutePath() + "\\" + f.getName()));
				int by = 0;
				while((by = bis.read()) != -1) {
					bos.write(by);
				}
				bos.flush();
				bos.close();
				bis.close();
			}
			
		}
	}
	
	/**
	 * 复制多级文件夹，到指定文件夹下
	 * @param sourseFile
	 * @throws IOException
	 */
	public static void copyMoreDir(File sourseFile,File target) throws IOException  {
		if (!sourseFile.exists()){
			sourseFile.mkdir();
	    }
		if(sourseFile.isFile()) {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourseFile.getAbsoluteFile()));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target.getAbsolutePath() + "\\" + sourseFile.getName()));
			int by = 0;
			while((by = bis.read()) != -1) {
					bos.write(by);
			}
			bos.close();
			bis.close();
		}else {
			File[] fileArray = sourseFile.listFiles();
			if(fileArray == null) {
				return;
			}
			for (File f : fileArray) {
				if(f.isFile()) {
					BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getAbsoluteFile()));
					BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target.getAbsolutePath() + "\\" + f.getName()));
					byte[] by = new byte[1024*1024];
					int len;
					while((len = bis.read(by)) != -1) {
						bos.write(by,0,len);
					}
					System.out.println(f.getName());
					bos.close();
					bis.close();
				}else if(f.isDirectory()){
					File file = new File(target, f.getName());
					System.out.println(file.mkdir());
					copyMoreDir(f,file);
				}
			}
		}
	}
	
	/**
	 * 复制指定文件，并改后缀名
	 * @throws IOException
	 */
	public static void changeName(String filename) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
		String[] strArray = filename.split("\\.");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(strArray[0] + ".docx"));
		int by = 0;
		while((by = bis.read()) != -1) {
				bos.write(by);
		}
		bos.close();
		bis.close();
	}
	
	/**
	 * 键盘录入五个学生的基本信息姓名、语文、数学、英语，按总分从高到低录入txt
	 * @throws IOException
	 */
	public static void inputScore() throws IOException{
		Set<Student> ts = new TreeSet<Student>();
		ts.add(new Student("曾远洋", 100, 99, 100));
		ts.add(new Student("刀疤哥", 90, 95, 91));
		ts.add(new Student("洋洋", 85, 90, 93));
		ts.add(new Student("洋娃子", 77, 88, 69));
		ts.add(new Student("鸳鸯", 60, 88, 59));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("inputScore.txt"))) ;
		for (Student s : ts) {
			bw.write("name:" + s.getName() + ",yw:" + s.getYw() + ",yy:" + s.getYy() + ",sx:" + s.getSx() + ",Score:" + s.getScore());
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	
	/**
	 * 已知在txt中存放了n个字母，排序后存到另一个txt中
	 * @throws IOException
	 */
	public static void sort() throws IOException {
		ArrayList<Character> list = new ArrayList<Character>();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("sort.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("copySort.txt"));
		int c = 0;
		while((c = isr.read()) != -1) {
			list.add((char)c);
		}
		Collections.sort(list);
		for (Character ch: list) {
			osw.write(ch);
		}
		osw.close();
		isr.close();
		
	}
	
	/**
	 * 用reader去模拟BufferedReader的readLine（）方法
	 * @throws IOException
	 */
	public static void moni() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("moni.txt"));
		ArrayList<ArrayList<Character>> totalList = new ArrayList<ArrayList<Character>>();
		ArrayList<Character> hangList = new ArrayList<Character>();
		int ch = 0;
		while((ch = isr.read()) != -1) {
			if((char)ch == '\n' ) {
				totalList.add(hangList);
				hangList = new ArrayList<Character>();
			}else if((char)ch == '\r' ){
				
			}else {
				hangList.add((char)ch);
			}
		}
		ArrayList<String>  finalList = new ArrayList<String>();
		for (ArrayList<Character> list : totalList) {
			String str = "";
			for (Character c : list) {
				str = str + c;
			}
			finalList.add(str);
			System.out.println(str);
		}
		isr.close();
	}
}
