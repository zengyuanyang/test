package com.mine.homework;

public class Student implements Comparable<Student>{
	private String name;
	private int yw;
	private int yy;
	private int sx;
	private int score;
	public Student() {
	}
	
	public Student(String name,int yw,int yy,int sx) {
		this.name = name;
		this.yw = yw;
		this.yy = yy;
		this.sx = sx;
		this.score = yw + sx + yy;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYw() {
		return yw;
	}
	public void setYw(int yw) {
		this.yw = yw;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public int getSx() {
		return sx;
	}
	public void setSx(int sx) {
		this.sx = sx;
	}
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return s.score - score;
	}

}
