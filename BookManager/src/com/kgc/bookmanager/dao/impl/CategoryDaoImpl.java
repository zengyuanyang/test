package com.kgc.bookmanager.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.kgc.bookmanager.dao.ICategoryDao;
import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.util.C3P0Util;

public class CategoryDaoImpl implements ICategoryDao{

	@Override
	public int insertCategory(Category category) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.update("insert into category(categoryId,categoryName) values(?,?)", category.getCategoryId(),category.getCategoryName());
	}

	@Override
	public List<Category> selectAllCategory() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		
		return queryRunner.query("select * from category ", new BeanListHandler<Category>(Category.class));
	}

	@Override
	public Category selectCategoryById(String categoryId) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		
		return queryRunner.query("select * from category where categoryId = ?",new BeanHandler<Category>(Category.class),categoryId);
	}

	@Override
	public int updateCategoryById(Category category) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		
		return queryRunner.update("update category set categoryName = ? where categoryId = ?", category.getCategoryName(),category.getCategoryId());
	}

	@Override
	public int deleteCategoryById(String categoryId) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.update("delete from category where categoryId = ?", categoryId);
	}

}
