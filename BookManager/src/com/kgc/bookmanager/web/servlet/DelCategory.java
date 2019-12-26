package com.kgc.bookmanager.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgc.bookmanager.service.IBookService;
import com.kgc.bookmanager.service.ICategoryService;
import com.kgc.bookmanager.service.impl.BookService;
import com.kgc.bookmanager.service.impl.CategoryService;

/**
 * 删除类型
 * @author 曾远洋
 * @time 2019年12月9日上午1:43:43
 * @version V1.0
 */
public class DelCategory extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ICategoryService categoryService = new CategoryService();
		String categoryId = request.getParameter("categoryId");
		int num = categoryService.removeCategoryById(categoryId);
		if(num > 0) {
			response.sendRedirect(request.getContextPath()+"/admin/category/servlet/showAllCategory.action");
		}else {
			//显示删除失败错误页面
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
