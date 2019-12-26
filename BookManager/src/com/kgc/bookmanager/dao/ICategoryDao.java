package com.kgc.bookmanager.dao;

import java.sql.SQLException;
import java.util.List;

import com.kgc.bookmanager.pojo.Category;

/**
 *  类型的数据访问层接口
 * @author Administrator
 *
 */
public interface ICategoryDao {
	/**
	 * 添加图书类型
	 * @param category
	 * @return 受影响行数
	 */
	public int insertCategory(Category category) throws SQLException;
	/**
	 * 展示所有的图书类型
	 * @return 图书类型集合
	 */
	public List<Category> selectAllCategory() throws SQLException;
	/**
	 * 通过ID查看对象
	 * @param categoryId
	 * @return
	 */
	public Category selectCategoryById(String categoryId) throws SQLException;
	
	/**
	 * 通过Id更新类型数据
	 * @param category
	 * @return
	 * @throws SQLException 
	 */
	public int updateCategoryById(Category category) throws SQLException;
	
	/**
	 * 通过Id删除类型
	 * @param categoryId
	 * @return
	 * @throws SQLException
	 */
	public int deleteCategoryById(String categoryId) throws SQLException;
}
