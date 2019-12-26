package com.mine.bookmanager.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.mine.bookmanager.dao.IBookDao;
import com.mine.bookmanager.dao.ICategoryDao;
import com.mine.bookmanager.dao.impl.BookDao;
import com.mine.bookmanager.dao.impl.CategoryDao;
import com.mine.bookmanager.pojo.Book;
import com.mine.bookmanager.service.IBookService;

/**
 * @author 曾远洋
 * @time 2019年12月8日下午10:48:11
 * @version V1.0
 */
public class BookService implements IBookService {
	private IBookDao bd = new BookDao();
	private ICategoryDao cd = new CategoryDao();
	@Override
	public List<Book> showAllBooks() {
		
		try {
			return bd.selectAllBooks();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}	
