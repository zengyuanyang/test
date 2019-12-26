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
public class EditBookServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.处理乱码
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ICategoryService categoryService = new CategoryService();
		IBookService bookService = new BookService();
		//2.获取表单数据
		String categoryId = request.getParameter("categoryId");
		Category category  = null;
		
		if(categoryId != null && !"".equals(categoryId) ) {
			category = categoryService.findCategoryByCategoryId(categoryId);
		}
		Book book = new Book();
		
		try {
			BeanUtils.populate(book, request.getParameterMap());
			book.setCategory(category);
			//调用图书的业务逻辑方法
			int num = bookService.updateBook(book);
			if(num > 0) {
				response.sendRedirect(request.getContextPath()+"/admin/products/servlet/showAllProducts.action");
			}else {
				System.out.println("no");
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
