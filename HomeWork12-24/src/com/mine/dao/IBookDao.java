package com.mine.dao;

import java.sql.SQLException;
import java.util.List;

import com.mine.pojo.Book;

/**
 * 书籍数据访问层接口
 * @author 曾远洋
 * @time 2019年12月24日下午7:04:07
 * @version V1.0
 */
public interface IBookDao {
	public List<Book> selectBooksByName(String name) throws SQLException;
}
