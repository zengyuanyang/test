package com.kgc.bookmanager.pojo;

import java.io.Serializable;
/**
 * 书的实体类
 * @author Administrator
 *
 */
public class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	private String bookId;
	private String bookName;
	private String bookImage;
	private String bookDescription;
	private Double bookPrice;
	private Integer bookNum;
	private Category category;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Integer getBookNum() {
		return bookNum;
	}
	public void setBookNum(Integer bookNum) {
		this.bookNum = bookNum;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Book(String bookId, String bookName, String bookImage, String bookDescription, Double bookPrice,
			Integer bookNum, Category category) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookImage = bookImage;
		this.bookDescription = bookDescription;
		this.bookPrice = bookPrice;
		this.bookNum = bookNum;
		this.category = category;
	}
	public Book(String bookName, String bookImage, String bookDescription, Double bookPrice, Integer bookNum,
			Category category) {
		super();
		this.bookName = bookName;
		this.bookImage = bookImage;
		this.bookDescription = bookDescription;
		this.bookPrice = bookPrice;
		this.bookNum = bookNum;
		this.category = category;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookImage=" + bookImage + ", bookDescription="
				+ bookDescription + ", bookPrice=" + bookPrice + ", bookNum=" + bookNum + ", category=" + category
				+ "]";
	}
	
	

}
