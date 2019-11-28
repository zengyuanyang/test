package com.mine.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//在d盘目录下有一个加密文件a.txt（文件里只有英文和数字），密码是“heima”，
//当密码输入正确时才能读取文件里的数据。现要求用代码来模拟读取文件的过程，并统
//计文件里各个字母出现的次数，并把统计结果按照“a：2个；b：3个；”的格式输出到d盘的count.txt中

public class Test13 {
	public static void main(String[] args) {
		//创建一个人文件，设置一个密码
        File f=new File("d:/a.txt");
        try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String c="heima";
        readFile(f,c);
        
    }

    private static void readFile(File f, String s) {

        Scanner a =new Scanner(System.in);
        while(true) {
            
            System.out.println("请输入一个正确的文件密码");
            String passwordInput=a.nextLine();
            //判断密码是否正确
            if(passwordInput.equals(s)) {
                System.out.println("文件密码正确.");
                break;
            }
        }
        BufferedReader br=null;
        BufferedWriter bw=null;
        try {
            br=new BufferedReader(new FileReader(f));
            File destFile=new File("count.txt");
            bw=new BufferedWriter(new FileWriter(destFile));
            Map<Character,Integer> map=new TreeMap<>(new Comparator<Character>() {
                public int compare(Character o1, Character o2) {
                    int num=(int)o1-(int)o2;
                    return num;
                }//重写方法
            });
            String line;
            while((line=br.readLine())!=null) {
                char[] chars=line.toCharArray();
                for(char c:chars) {
                    if(!map.containsKey(c)) {
                        map.put(c, 1);
                    }else {
                        map.put(c, map.get(c)+1);
                    }
                }
            }
            
            for(Character c:map.keySet()) {
                bw.write("   "+c+":"+map.get(c)+"个");
                bw.newLine();
                bw.flush();
            }
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        a.close();
    }

}
