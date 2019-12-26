package com.mine.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mine.dao.IBookDao;
import com.mine.pojo.Book;
import com.mine.util.C3P0Util;

public class BookDao implements IBookDao {

	@Override
	public List<Book> selectBooksByName(String name) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(C3P0Util.getDataSource());
		String sql = "SELECT * FROM book WHERE bookName LIKE '%"+ name +"%'";
		return queryRunner.query(sql, new BeanListHandler<Book>(Book.class));
	}

}
