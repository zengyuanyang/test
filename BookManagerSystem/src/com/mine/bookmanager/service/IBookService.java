package com.mine.bookmanager.service;

import java.util.List;

import com.mine.bookmanager.pojo.Book;

/**
 * @author 曾远洋
 * @time 2019年12月8日下午10:44:25
 * @version V1.0
 */
public interface IBookService {

	/**
	 * 显示所有书籍
	 * @return	书籍集合
	 */
	public List<Book> showAllBooks();

}
