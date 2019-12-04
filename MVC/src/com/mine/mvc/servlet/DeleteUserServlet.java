package com.mine.mvc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.mvc.pojo.User;
import com.mine.mvc.service.IUserService;
import com.mine.mvc.service.impl.UserServiceImpl;

/**
 * 删除数据控制器
 * @author 曾远洋
 * @time 2019年12月2日下午10:18:48
 * @version V1.0
 */
public class DeleteUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		IUserService userService = new UserServiceImpl();
		int userId = Integer.parseInt(request.getParameter("userId"));
		int flag = userService.deleteUser(userId);
		if(flag > 0) {
			response.getWriter().write("成功删除，3秒后返回首页！");
			List<User> list = userService.showAllUser();
			this.getServletConfig().getServletContext().setAttribute("allUser", list);
			response.setHeader("refresh", "3;url=" + request.getContextPath() + "/index.jsp");
		}else {
			response.getWriter().write("删除失败，3秒后返回首页！");
			response.setHeader("refresh", "3;url=" + request.getContextPath() + "/index.jsp");
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
