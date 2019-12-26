package com.mine.bookmanager.dao;

import java.sql.SQLException;
import java.util.List;

import com.mine.bookmanager.pojo.Book;

public interface IBookDao {

	public List<Book> selectAllBooks() throws SQLException;

}
