package com.mine.homework;

public class StudentScore implements Comparable<StudentScore>{
	
	private String name;
	private int yw;
	private int sx;
	private int yy;
	private int score;
	public StudentScore() {
		
	}
	public StudentScore(String name, int yw, int sx, int yy) {
		super();
		this.name = name;
		this.yw = yw;
		this.sx = sx;
		this.yy = yy;
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
	public int getSx() {
		return sx;
	}
	public void setSx(int sx) {
		this.sx = sx;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public int compareTo(StudentScore s) {
		return s.score - score;
	}
	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", score=" + score + "]";
	}
	
	

}
