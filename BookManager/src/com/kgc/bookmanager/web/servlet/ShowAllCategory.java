package com.kgc.bookmanager.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.service.ICategoryService;
import com.kgc.bookmanager.service.impl.CategoryService;

/**
 * 显示所有类型
 * @author 曾远洋
 * @time 2019年12月9日上午12:40:15
 * @version V1.0
 */
public class ShowAllCategory extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");	
		ICategoryService categoryService = new CategoryService();
		
		List<Category> categorys = categoryService.showAllCategory();
		request.setAttribute("categorys", categorys);
		request.getRequestDispatcher("/admin/category/list.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
