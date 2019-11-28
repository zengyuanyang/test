package com.mine.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 五个学生，每个学生3门课成绩，从键盘输入以上数据（姓名，三门成绩）
 * 把学生信息和计算出总分数高低顺序存放与文件“stud.txt”
 */
public class Test19 {
    public static void main(String[] args) throws IOException {
        //利用TreeSet排序  重写Comparator实现
        TreeSet<Students> ts =new TreeSet<Students>(new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                int num = o2.getSum() - o1.getSum();
                int num2 = num == 0 ? o1.getChinese() - o2.getChinese() : num;
                int num3 = num2 == 0 ? o1.getMath() - o2.getMath() : num2;
                int num4 = num3 == 0 ? o1.getEnglish() - o2.getEnglish() : num3;
                int num5 = num4 == 0 ? o1.getName().compareTo(o2.getName()) : num4;
                return num5;
            }

        }) ;
        //录入5个学生数据
        for(int x=1;x<=5;x++){
            Scanner sc =new Scanner(System.in);
            System.out.println("请录入第"+x+"个人成绩：");
            System.out.println("输入格式如 姓名,语文成绩,数学成绩,英语成绩");
            String str =sc.nextLine();
            //使用spilt分割
            String[] sb=str.split(",");
            String name =sb[0];
            int chinese=Integer.parseInt(sb[1]);
            int math=Integer.parseInt(sb[2]);
            int english=Integer.parseInt(sb[3]);
            Students s =new Students();
            s.setName(name);
            s.setChinese(chinese);
            s.setEnglish(english);
            s.setMath(math);
            ts.add(s);
            sc.close();
        }
        //输出到文件中
        BufferedWriter bw =new BufferedWriter(new FileWriter("stud.txt"));
        bw.write("学生信息如下：");
        bw.newLine();
        bw.flush();
        for(Students s:ts){
            StringBuffer sb =new StringBuffer();
            sb.append(s.getName()).append(",").append(s.getChinese())
                    .append(",").append(s.getEnglish())
                    .append(",").append(s.getMath()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
//学生类
class Students{
    private  String name;
    private  int  chinese;
    private  int  math;
    private  int english;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public Students(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }
    public Students() {
    }
    public int getSum (){
        return  this.chinese+this.english+this.math;
    }

}
