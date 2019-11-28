package com.mine.test;

//一栋房子需要一个工匠七天建成，这个工匠的工钱是一份金条，假如现在你需要盖一栋房子，而你只有一根完整的金条，怎么能把金条分三份的情况下每天都付给工匠工资，最后一天刚好付完？
public class Test3 {

	public static void main(String[] args) {
	    int a=0,b=0,c=0;
        //分三段，只能切2刀
        int[]num={1,2,3,4,5,6,7};
        for(int i=1;i<7;i++){
                for(int j=i+1;j<7;j++){
                   a=i;
                   b=j-i;
                  c=7-j;
                   if(a*2<=b && b*2<=c){
                    System.out.println("第一天："+a+"一份，"+"第二天："+b+"二份，"+"第三天："+c+"三份。");
                        }
                }
        }

	}

}
