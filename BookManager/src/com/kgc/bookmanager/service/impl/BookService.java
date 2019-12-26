package com.kgc.bookmanager.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.kgc.bookmanager.dao.IBookDao;
import com.kgc.bookmanager.dao.ICategoryDao;
import com.kgc.bookmanager.dao.impl.BookDaoImpl;
import com.kgc.bookmanager.dao.impl.CategoryDaoImpl;
import com.kgc.bookmanager.pojo.Book;
import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.service.IBookService;
import com.kgc.bookmanager.util.UUIDUtil;

public class BookService implements IBookService {
	//数据访问层
	private IBookDao bookDao = new BookDaoImpl();
	private ICategoryDao catDao = new CategoryDaoImpl();
	@Override
	public int createBook(Book book) {
		book.setBookId(UUIDUtil.getUUID());
		int num = 0;
		try {
			num = bookDao.insert(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num ;
	}
	@Override
	public List<Book> showAllBooks() {
		
		try {
			return bookDao.selectAllBook();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int removeBook(String bookId) {
		// TODO Auto-generated method stub
		try {
			return bookDao.deleteBookById(bookId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public Book showOneBook(String bookId) {
		// TODO Auto-generated method stub
		try {
			Book book = bookDao.selectBookById(bookId);
			String catId = bookDao.selectCategoryIdByBookId(bookId);
			Category cat = catDao.selectCategoryById(catId);
			book.setCategory(cat);
			return book;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		
		try {
			return bookDao.updateBookById(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
