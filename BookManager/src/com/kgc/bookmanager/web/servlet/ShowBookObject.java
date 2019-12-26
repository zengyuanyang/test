package com.kgc.bookmanager.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgc.bookmanager.pojo.Book;
import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.service.IBookService;
import com.kgc.bookmanager.service.ICategoryService;
import com.kgc.bookmanager.service.impl.BookService;
import com.kgc.bookmanager.service.impl.CategoryService;
/**
 * 显示所有的类型数据servlet
 * @author Administrator
 *
 */
public class ShowBookObject extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.处理乱码
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		IBookService bookService = new BookService();
		ICategoryService categoryService = new CategoryService();
		//获取请求
		String bookId = request.getParameter("bookId");
		//2.放业务逻辑层获取所有的商品数据
		Book book = bookService.showOneBook(bookId);
		//获取商品所有类型
		List<Category> listCategory = categoryService.showAllCategory();
		//3.存入作用域
		request.setAttribute("book", book);
		request.setAttribute("listCategory", listCategory);
		//4.分发转向
		request.getRequestDispatcher("/admin/products/edit.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
