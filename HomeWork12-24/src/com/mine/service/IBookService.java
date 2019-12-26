package com.mine.service;

import java.util.List;

import com.mine.pojo.Book;

/**
 * 书籍业务层
 * @author 曾远洋
 * @time 2019年12月24日下午11:12:11
 * @version V1.0
 */
public interface IBookService {
	public List<Book> searchBooks(String param);
}
