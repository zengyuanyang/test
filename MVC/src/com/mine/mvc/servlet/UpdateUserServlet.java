package com.mine.mvc.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import com.mine.mvc.pojo.User;
import com.mine.mvc.service.IUserService;
import com.mine.mvc.service.impl.UserServiceImpl;

/**
 * 用户数据更新控制器
 * @author 曾远洋
 * @time 2019年12月2日下午10:21:24
 * @version V1.0
 */
public class UpdateUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		IUserService userService = new UserServiceImpl();
		try {
			User user = new User();
			DateConverter dateConverter = new DateConverter();
			dateConverter.setPatterns(new String[]{"yyyy-MM-dd"});
			ConvertUtils.register(dateConverter, Date.class);
			BeanUtils.populate(user, request.getParameterMap());				int flag = userService.updateUser(user);
			if(flag > 0) {
				//request.getSession().setAttribute("user", user);
				response.sendRedirect(request.getContextPath() + "/index.jsp");
			}else {					
				response.getWriter().write("修改失败，三秒后回到首页！");
				response.setHeader("refresh", "3;url=" + request.getContextPath() + "/index.jsp");
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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
