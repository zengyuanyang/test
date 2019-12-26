package com.kgc.bookmanager.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.kgc.bookmanager.dao.IBookDao;
import com.kgc.bookmanager.dao.ICategoryDao;
import com.kgc.bookmanager.pojo.Book;
import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.util.C3P0Util;

public class BookDaoImpl implements IBookDao {
	private ICategoryDao catDao = new CategoryDaoImpl();
	@Override
	public int insert(Book book) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		
		return queryRunner.update("insert into book values(?,?,?,?,?,?,?)", book.getBookId(),book.getBookName(),book.getBookPrice(),book.getBookNum(),book.getBookImage(),book.getBookDescription(),book.getCategory().getCategoryId());
	}

	@Override
	public List<Book> selectAllBook() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		List<Book> list = queryRunner.query("select * from book", new BeanListHandler<Book>(Book.class));
		List<String> categoryId =  selectAllCategoryIdByBook();
		if(list != null) {
			for (int i = 0 ; i < list.size(); i++) {
				list.get(i).setCategory(catDao.selectCategoryById(categoryId.get(i)));
			}
		}
		return list;
	}

	@Override
	public List selectAllCategoryIdByBook() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("select categoryId from book", new ColumnListHandler("categoryId"));
	}

	@Override
	public int deleteBookById(String bookId) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.update("delete from book where bookId = ?", bookId);
	}

	@Override
	public Book selectBookById(String bookId) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.query("select * from book where bookId = ?", new BeanHandler<Book>(Book.class),bookId);
	}

	@Override
	public String selectCategoryIdByBookId(String bookId) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return (String) queryRunner.query("select categoryId from book where bookId = ?", new ScalarHandler("categoryId"),bookId);
	}

	@Override
	public int updateBookById(Book book) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		return queryRunner.update("update book set bookName= ? ,bookPrice = ?,bookNum = ? ,bookImage = ? ,bookDescription = ? ,categoryId = ? where bookId = ?",book.getBookName(),
				book.getBookPrice(),book.getBookNum(),book.getBookImage(),book.getBookDescription(),book.getCategory().getCategoryId(),book.getBookId());
	
	}

}
