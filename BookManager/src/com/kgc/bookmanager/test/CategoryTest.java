package com.kgc.bookmanager.test;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.kgc.bookmanager.dao.IBookDao;
import com.kgc.bookmanager.dao.ICategoryDao;
import com.kgc.bookmanager.dao.impl.BookDaoImpl;
import com.kgc.bookmanager.dao.impl.CategoryDaoImpl;
import com.kgc.bookmanager.pojo.Book;
import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.util.UUIDUtil;
/**
 * 类型数据访问层的单元测试
 * @author Administrator
 *
 */
public class CategoryTest {

	@Test
	public void demo1() throws SQLException {
		ICategoryDao categoryDao = new CategoryDaoImpl();
		Category category = new Category();
		String array[] = {"文学","生活","计算机","外语","经营","励志","社科","学术","少儿","艺术","原版","科技","考试","生活百科"};
		for (int i = 0; i < array.length; i++) {
			category.setCategoryId(UUIDUtil.getUUID());
			category.setCategoryName(array[i]);
			categoryDao.insertCategory(category);
		}
		
	}
	@Test
	public void demo2() throws SQLException {
		IBookDao bookdao = new BookDaoImpl();
		List<Book> list = bookdao.selectAllBook();
		for (Book book : list) {
			System.out.println(book);
		}
	}

}
