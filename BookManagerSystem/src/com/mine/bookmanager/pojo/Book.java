package com.mine.bookmanager.pojo;

/**
 * 书籍实体类
 * @author 曾远洋
 * @time 2019年12月8日下午10:17:18
 * @version V1.0
 */
public class Book {
	private String bookId;
	private Double bookPrice;
	private Integer bookNum;
	private String bookDesc;
	private String bookImage;
	private Category category;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
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
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookPrice=" + bookPrice + ", bookNum=" + bookNum + ", bookDesc=" + bookDesc
				+ ", bookImage=" + bookImage + ", category=" + category + "]";
	}
	
	
}
