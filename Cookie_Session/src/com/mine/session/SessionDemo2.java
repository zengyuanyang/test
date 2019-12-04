package com.mine.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证登录数据
 * @author 曾远洋
 * @time 2019年11月29日下午3:39:31
 * @version V1.0
 */
public class SessionDemo2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		String userCode = request.getParameter("validateCode");
		String rightCode = (String) request.getSession().getAttribute("validateCode");	//获取session值
		if("zyy".equals(userName) && "zyy520".equals(userPwd) && userCode.equalsIgnoreCase(rightCode)) {
			response.sendRedirect("/Cookie_Session/cookiedemo5");
		}else {
			response.getWriter().write("登录失败,两秒后重新登录");
			response.setHeader("refresh", "2;url='" + request.getContextPath() + "/login.jsp'");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
