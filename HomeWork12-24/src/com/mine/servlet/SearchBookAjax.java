package com.mine.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.pojo.Book;
import com.mine.service.IBookService;
import com.mine.service.impl.BookService;

import net.sf.json.JSONArray;

/**
 * 
 * @author 曾远洋
 * @time 2019年12月24日下午7:15:45
 * @version V1.0
 */
public class SearchBookAjax extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("param");
		IBookService bookService = new BookService();
		List<Book> bookList = bookService.searchBooks(param);
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().print(JSONArray.fromObject(bookList).toString());
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
