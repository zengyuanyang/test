package com.kgc.bookmanager.pojo;

/**
 * 机房临时类
 * @author 曾远洋
 * @time 2019年12月16日上午11:13:39
 * @version V1.0
 */
public class ComputerHouse_Flag {
	private String computerhouseNo;//机房号
	private String computerhouseName;//机房名称
	private int computerhouseSize;//机房容量 
	public String getComputerhouseNo() {
		return computerhouseNo;
	}
	public void setComputerhouseNo(String computerhouseNo) {
		this.computerhouseNo = computerhouseNo;
	}
	public String getComputerhouseName() {
		return computerhouseName;
	}
	public void setComputerhouseName(String computerhouseName) {
		this.computerhouseName = computerhouseName;
	}
	public int getComputerhouseSize() {
		return computerhouseSize;
	}
	public void setComputerhouseSize(int computerhouseSize) {
		this.computerhouseSize = computerhouseSize;
	}
	@Override
	public String toString() {
		return "ComputerHouse_Flag [computerhouseNo=" + computerhouseNo + ", computerhouseName=" + computerhouseName
				+ ", computerhouseSize=" + computerhouseSize + "]";
	}
	
}
