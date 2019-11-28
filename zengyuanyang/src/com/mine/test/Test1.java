package com.mine.test;

//矿泉水1元钱1瓶，每2个空瓶换一瓶矿泉水，
//现有20元钱，请问可以买多少瓶矿泉水？
public class Test1 {

	public static void main(String[] args) {
		int m= 20;
	
		System.out.println("可以买："+function(m)+"矿泉水");
	
	}

public static int function(int n){
  int ps = n;  //定义一个数接受可以买的瓶数
	while (n > 1){ 
		ps  =  ps +  n / 2;
		n = n / 2 + n % 2;
	}
	return ps;  //返回瓶数
}
}
