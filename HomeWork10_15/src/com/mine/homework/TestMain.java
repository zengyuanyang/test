package com.mine.homework;

public class TestMain {

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		Thread t = new Thread(tc, "线程1");
		t.start();
	}
}
