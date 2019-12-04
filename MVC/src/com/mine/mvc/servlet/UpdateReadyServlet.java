package com.mine.mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.mvc.pojo.User;
import com.mine.mvc.service.IUserService;
import com.mine.mvc.service.impl.UserServiceImpl;

/**
 * @author 曾远洋
 * @time 2019年12月3日下午3:37:56
 * @version V1.0
 */
public class UpdateReadyServlet extends HttpServlet {

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
		User user = userService.selectUser(userId);
		request.setAttribute("tmpUser", user);
		this.getServletContext().getRequestDispatcher("/update.jsp").forward(request, response);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
