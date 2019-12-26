package com.mine.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.mine.dao.IBookDao;
import com.mine.dao.impl.BookDao;
import com.mine.pojo.Book;
import com.mine.service.IBookService;

public class BookService implements IBookService {
	IBookDao bookDao = new BookDao();
	@Override
	public List<Book> searchBooks(String param) {
		try {
			return bookDao.selectBooksByName(param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
