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
 * 登录控制器
 * @author 曾远洋
 * @time 2019年12月2日下午7:15:53
 * @version V1.0
 */
public class LoginServlet extends HttpServlet{

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
			BeanUtils.populate(user, request.getParameterMap());
			user = userService.loginUser(user);
			if(user != null) {
				request.getSession().setAttribute("user", user);
				response.sendRedirect(request.getContextPath() + "/index.jsp");
			}else {
				response.getWriter().write("对不起登录失败，三秒后重新登录！");
				response.setHeader("refresh", "3;url=" + request.getContextPath() + "/login.jsp");
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
