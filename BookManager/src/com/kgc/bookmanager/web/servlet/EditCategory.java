package com.kgc.bookmanager.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.kgc.bookmanager.pojo.Category;
import com.kgc.bookmanager.service.ICategoryService;
import com.kgc.bookmanager.service.impl.CategoryService;

/**
 * 获取类型的更改数据
 * @author 曾远洋
 * @time 2019年12月9日上午1:24:02
 * @version V1.0
 */
public class EditCategory extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ICategoryService categoryService = new CategoryService();
		
		Category category = new  Category();
		try {
			BeanUtils.populate(category, request.getParameterMap());
			int num = categoryService.updateCategory(category);
			if(num > 0) {
				response.sendRedirect(request.getContextPath()+"/admin/category/servlet/showAllCategory.action");
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
