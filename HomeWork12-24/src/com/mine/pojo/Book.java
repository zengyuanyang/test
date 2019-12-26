package com.mine.pojo;

/**
 * 书籍实体类
 * @author 曾远洋
 * @time 2019年12月24日下午7:01:41
 * @version V1.0
 */
public class Book {
	private String bookId;
	private String bookName;
	private String bookImg;
	private Double bookPrice;
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
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookImg=" + bookImg + ", bookPrice=" + bookPrice
				+ "]";
	}
	public Book(String bookId, String bookName, String bookImg, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookImg = bookImg;
		this.bookPrice = bookPrice;
	}
	public Book() {
		super();
	}
	
}
