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
 * 显示所有的类型数据servlet
 * @author Administrator
 *
 */
public class ShowCategory extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.处理乱码
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		//2.获取
		ICategoryService categoryService = new CategoryService();
		List<Category> listCategory = categoryService.showAllCategory();
		//3.保存到作用域
		request.setAttribute("listCategory",listCategory);
		//4.转发页面 相对路径
		request.getRequestDispatcher("/admin/products/add.jsp").forward(request, response);
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
