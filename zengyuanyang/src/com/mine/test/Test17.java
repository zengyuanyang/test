package com.mine.test;

import java.util.*;

/**
 * 选择合适的Map集合保存五位学员学号和姓名，然后按学号的自然顺序的倒序将这些键值对一一打印出来。
 */
public class Test17 {
    //思路：使用TreeMap
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap =new TreeMap<>();
        //5个对象
        Student s1=new Student("毒婷",01);
        Student s2=new Student("刀疤哥",02);
        Student s3=new Student("洋洋",03);
        Student s4=new Student("鸳鸯",04);
        Student s5=new Student("洋娃子",05);
        //添加对象进入集合
        treeMap.put(s1.getNo(),s1.getName());
        treeMap.put(s2.getNo(),s2.getName());
        treeMap.put(s4.getNo(),s4.getName());
        treeMap.put(s5.getNo(),s5.getName());
        treeMap.put(s3.getNo(),s3.getName());
        //遍历
       // treeMap.entrySet();
        for (Map.Entry<Integer, String> i: treeMap.entrySet()
             ) {
            System.out.println("treeMap.entrySet()遍历");
            System.out.println(i.getKey()+"--"+i.getValue());

        }
        //keySet遍历
        for(Integer key:treeMap.keySet()){
            System.out.println("keySet遍历");
            System.out.println(key+"--"+treeMap.get(key));
        }
    }



}
class Student   implements  Comparable<Student>{
    private  String name;  //姓名
    private  int  no;       //学号

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        int num=this.no-o.no;
        int num1=num==0?num1=this.getName().compareTo(o.getName()):num;
        return num1;
    }
}
