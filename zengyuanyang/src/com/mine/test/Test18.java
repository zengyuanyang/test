package com.mine.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 用List方法 存储10个1-50的随机偶数元素，要求不能重复，添加完成，
 * 从大到小倒叙遍历输出到控制台并使用Io流将集合元素按指定格式输出到当前项目的num.TXT中。
 *
 */
public class Test18 {
    public static void main(String[] args) throws IOException {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    getNum(arr); //获取10个随机数
        //重写Compartor 实现倒序
        Comparator <Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        Collections.sort(arr,comparator);
        //输出到控制台
        for (Integer nm:arr
             ) {
            System.out.println(nm);
        }
        //输出到文件
        FileOutputStream fos =new FileOutputStream(new File("num.txt"));
        PrintWriter pw =new PrintWriter(fos);
        for (Integer i: arr
             ) {
        //    System.out.println(i.byteValue());
            pw.print(i);
            pw.print(" ");
        }
        pw.close();
    }
    public static  void getNum(ArrayList<Integer> arr){
        int count=0;
        while(true){

            int RandomNum = (int) (Math.random()*50)+1;

            if(!arr.contains(RandomNum)&&check(RandomNum)){
                count++;
                arr.add(RandomNum);
            }
            if(count==10){
                break;
            }
        }
    }
    public static boolean check(int num){
        boolean flag=true;
        if (num %2==1){
            flag=false;
        }
        return  flag;
    }
}
