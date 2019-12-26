package com.mine.bookmanager.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import com.mine.bookmanager.dao.IBookDao;
import com.mine.bookmanager.dao.ICategoryDao;
import com.mine.bookmanager.pojo.Book;
import com.mine.bookmanager.util.C3P0Util;

/**
 * @author 曾远洋
 * @time 2019年12月8日下午10:53:08
 * @version V1.0
 */
public class BookDao implements IBookDao {
	private ICategoryDao cd = new CategoryDao();
	@Override
	public List<Book> selectAllBooks() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		List<Book> list = qr.query("select * from book", new BeanListHandler<Book>(Book.class));
		List<String> categoryId =  selectAllCategoryIdByBook();
		if(list != null) {
			for (int i = 0 ; i < list.size(); i++) {
				list.get(i).setCategory(cd.selectCategoryById(categoryId.get(i)));
			}
		}
		return list;
	}
	private List selectAllCategoryIdByBook() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return (List) queryRunner.query("select categoryId from book", new ColumnListHandler("categoryId"));
	}

}
