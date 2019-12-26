package com.kgc.bookmanager.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.kgc.bookmanager.pojo.Book;
import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.service.IBookService;
import com.kgc.bookmanager.service.ICategoryService;
import com.kgc.bookmanager.service.impl.BookService;
import com.kgc.bookmanager.service.impl.CategoryService;



/**

 * @author Administrator
 *
 */
public class DelProducts extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.处理乱码
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		IBookService bookService = new BookService();
		//2.获取表单数据
		String bookId = request.getParameter("bookId");
		int num = bookService.removeBook(bookId);
		if(num > 0) {
			//刷新数据
			response.sendRedirect(request.getContextPath()+"/admin/products/servlet/showAllProducts.action");
		}else {
			//显示删除失败错误页面
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
