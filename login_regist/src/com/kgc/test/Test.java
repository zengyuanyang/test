package com.kgc.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "([1-9][0-9]{0,1}|100)";
		if("10.0".matches(regex)) {
			System.out.println("ok");
		}
	}

}
