package com.mine.bookmanager.pojo;

/**
 * 书籍类型的实体类
 * @author 曾远洋
 * @time 2019年12月8日下午10:18:47
 * @version V1.0
 */
public class Category {
	private String categoryId;
	private String categoryName;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
	
}
