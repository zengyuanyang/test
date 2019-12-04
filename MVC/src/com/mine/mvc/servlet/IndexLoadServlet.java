package com.mine.mvc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.mvc.pojo.User;
import com.mine.mvc.service.IUserService;
import com.mine.mvc.service.impl.UserServiceImpl;

/**
 * 主页面控制器
 * @author 曾远洋
 * @time 2019年12月2日下午10:05:14
 * @version V1.0
 */
public class IndexLoadServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IUserService userService = new UserServiceImpl();
		List<User> list = userService.showAllUser();
		this.getServletConfig().getServletContext().setAttribute("allUser", list);
		resp.sendRedirect(req.getContextPath()+"/index.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		IUserService userService = new UserServiceImpl();
		List<User> list = userService.showAllUser();
		config.getServletContext().setAttribute("allUser", list);
		super.init(config);
		
	}
}
