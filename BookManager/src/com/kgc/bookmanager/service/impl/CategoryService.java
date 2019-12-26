package com.kgc.bookmanager.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.kgc.bookmanager.dao.ICategoryDao;
import com.kgc.bookmanager.dao.impl.CategoryDaoImpl;
import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.service.ICategoryService;
import com.kgc.bookmanager.util.UUIDUtil;

public class CategoryService implements ICategoryService {
	private ICategoryDao categoryDao = new CategoryDaoImpl();
	@Override
	public List<Category> showAllCategory() {
		try {
			return categoryDao.selectAllCategory();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Category findCategoryByCategoryId(String categoryId) {
		try {
			return categoryDao.selectCategoryById(categoryId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null ;
	}
	@Override
	public int createCategory(Category category) {
		category.setCategoryId(UUIDUtil.getUUID());
		int num = 0;
		try {
			num = categoryDao.insertCategory(category);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num ;
	}
	@Override
	public int updateCategory(Category category) {
		int num = 0;
		try {
			num = categoryDao.updateCategoryById(category);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
	@Override
	public int removeCategoryById(String categoryId) {
		int num = 0;
		try {
			num = categoryDao.deleteCategoryById(categoryId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

}
