package com.mine.pojo;

public class Goods {
	private String img;
	private String desc;
	private double price;
	private int id;
	private int count = 1;
	public Goods(String img,String desc,double price,int id) {
		this.img = img;
		this.desc = desc;
		this.price = price;
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
