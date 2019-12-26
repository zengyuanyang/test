package com.kgc.bookmanager.pojo;

import java.io.Serializable;
/**
 * 类型的实体类
 * @author Administrator
 *
 */
public class Category implements Serializable{
		
		private static final long serialVersionUID = 1L;
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
		public Category(String categoryName) {
			super();
			this.categoryName = categoryName;
		}
		public Category() {
			
		}
		@Override
		public String toString() {
			return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
		}
		
		
}
