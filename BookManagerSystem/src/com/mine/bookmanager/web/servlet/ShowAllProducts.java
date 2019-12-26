package com.mine.bookmanager.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.bookmanager.pojo.Book;
import com.mine.bookmanager.service.IBookService;
import com.mine.bookmanager.service.impl.BookService;

/**
 * 显示所有商品
 * @author 曾远洋
 * @time 2019年12月8日下午10:22:48
 * @version V1.0
 */
public class ShowAllProducts extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		IBookService bs = new BookService();
		List<Book> books = bs.showAllBooks();
		request.setAttribute("books", books);
		request.getRequestDispatcher("/admin/products/list.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
