package com.kgc.bookmanager.dao;

import java.sql.SQLException;
import java.util.List;

import com.kgc.bookmanager.pojo.Book;
import com.kgc.bookmanager.pojo.Category;

public interface IBookDao {
	/**
	 * 添加一条记录
	 * @param book
	 * @return
	 */
	public int insert(Book book) throws SQLException ;
	/**
	 * 查看所有图书
	 * @return
	 * @throws SQLException
	 */
	public List<Book> selectAllBook() throws SQLException ;
	
	public List selectAllCategoryIdByBook() throws SQLException;
	public int deleteBookById(String bookId) throws SQLException;
	public Book selectBookById(String bookId) throws SQLException;
	public String selectCategoryIdByBookId(String bookId) throws SQLException;
	public int updateBookById(Book book)throws SQLException;
	
	
	
}
