package com.mine.homework;

class Father{
	private void test(int iFather){
		System.out.println("Father.test");
	}
}
public class Son extends Father{
	public static void main(String[] args){
		Son o = new Son();
		int iFather = 0;
		o.test(iFather);
	}
	public void test(int iSon){
		System.out.println("Son.test");
	}
}

