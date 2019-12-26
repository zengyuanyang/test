package com.kgc.bookmanager.service;

import java.util.List;

import com.kgc.bookmanager.pojo.Category;

/**
 * @author 曾远洋
 * @time 2019年12月9日上午1:00:00
 * @version V1.0
 */
public interface ICategoryService {
	/**
	 * 显示所有商品类型
	 * @return
	 */
	public List<Category> showAllCategory();
	/**
	 * 根据类型ID查看类型对象
	 * @return
	 */
	public Category findCategoryByCategoryId(String categoryId);
	
	/**
	 * 创建类型
	 * @param category
	 * @return
	 */
	public int createCategory(Category category);
	
	
	/**
	 * 更新数据
	 * @param category
	 * @return
	 */
	public int updateCategory(Category category);
	/**
	 * 删除类型
	 * @param categoryId
	 * @return
	 */
	public int removeCategoryById(String categoryId);
}
