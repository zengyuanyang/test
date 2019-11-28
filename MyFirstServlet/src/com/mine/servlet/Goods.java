package com.mine.servlet;

public class Goods {
	private String img;
	private String desc;
	private double price;
	public Goods(String img,String desc,double price) {
		this.img = img;
		this.desc = desc;
		this.price = price;
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
	
}
