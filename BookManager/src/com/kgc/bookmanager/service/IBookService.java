package com.kgc.bookmanager.service;

import java.util.List;

import com.kgc.bookmanager.pojo.Book;

public interface IBookService {
	/**
	 * 添加图书
	 * @param book
	 */
	public int createBook(Book book);
	/**
	 * 显示所有图书
	 * @return
	 */
	public List<Book> showAllBooks();
	/**
	 * 移除商品
	 * @param bookId
	 * @return 受影响行数 
	 */
	public int removeBook(String bookId);
	/**
	 * 显示一条图书记录
	 * @param bookId
	 * @return
	 */
	public Book showOneBook(String bookId);
	public int updateBook(Book book);

}
