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
 * 注册控制器
 * @author 曾远洋
 * @time 2019年12月2日下午6:04:36
 * @version V1.0
 */
public class RegisterServlet extends HttpServlet{

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
			//ConvertUtils.register(new DateLocaleConverter(), Date.class);
			DateConverter dateConverter = new DateConverter();
			dateConverter.setPatterns(new String[]{"yyyy-MM-dd"});
			ConvertUtils.register(dateConverter, Date.class);
			BeanUtils.populate(user, request.getParameterMap());
			user = userService.registerUser(user);
			if(user != null) {
				request.getSession().setAttribute("user", user);
				response.sendRedirect(request.getContextPath() + "/indexloadservlet.action");
			}else {
				response.getWriter().write("对不起注册失败，三秒后重新注册！");
				response.setHeader("refresh", "3;url=" + request.getContextPath() + "/register.jsp");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
