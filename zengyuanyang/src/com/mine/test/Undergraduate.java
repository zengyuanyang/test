package com.mine.test;

public class Undergraduate extends StudentTest15 {
	private String degree;

	public Undergraduate(String degree) {
		super();
	}

	public Undergraduate() {
		super();
	}

	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}

	@Override
	public void show() {
		System.out.println( this.getName() + this.getAge() + this.degree );
	}
}
