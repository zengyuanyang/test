package com.kgc.bookmanager.pojo;

/**
 * 机房实体类
 * @author 曾远洋
 * @time 2019年12月16日上午10:34:58
 * @version V1.0
 */
public class ComputerHouse {
	private String computerhouseId;
	private String computerhouseNo;//机房号
	private String computerhouseName;//机房名称
	private int computerhouseSize;//机房容量
	private int computerhouseWeek;//机房时间-周
	private int computerhouseDay;//机房时间-星期
	private int computerhouseLesson;//机房时间-节数
	private String courseId;//课程Id
	public String getComputerhouseId() {
		return computerhouseId;
	}
	public void setComputerhouseId(String computerhouseId) {
		this.computerhouseId = computerhouseId;
	}
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
	public int getComputerhouseWeek() {
		return computerhouseWeek;
	}
	public void setComputerhouseWeek(int computerhouseWeek) {
		this.computerhouseWeek = computerhouseWeek;
	}
	public int getComputerhouseDay() {
		return computerhouseDay;
	}
	public void setComputerhouseDay(int computerhouseDay) {
		this.computerhouseDay = computerhouseDay;
	}
	public int getComputerhouseLesson() {
		return computerhouseLesson;
	}
	public void setComputerhouseLesson(int computerhouseLesson) {
		this.computerhouseLesson = computerhouseLesson;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "ComputerHouse [computerhouseId=" + computerhouseId + ", computerhouseNo=" + computerhouseNo
				+ ", computerhouseName=" + computerhouseName + ", computerhouseSize=" + computerhouseSize
				+ ", computerhouseWeek=" + computerhouseWeek + ", computerhouseDay=" + computerhouseDay
				+ ", computerhouseLesson=" + computerhouseLesson + ", courseId=" + courseId + "]";
	}
	
}
