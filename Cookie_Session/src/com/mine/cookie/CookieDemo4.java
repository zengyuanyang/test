package com.mine.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 保存用户名和密码在cookie中
 * @author 曾远洋
 * @time 2019年11月28日下午7:34:38
 * @version V1.0
 */
public class CookieDemo4 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		String value = userName + "&" + userPwd;
		String remenber = request.getParameter("remenber");
		Cookie cookie = new Cookie("userInfo", value);
		cookie.setPath(request.getContextPath());
		if("zyy".equals(userName) && "zyy520".equals(userPwd)) {
			if(remenber != null) {
				cookie.setMaxAge(60*60*24);
			}else {
				cookie.setMaxAge(0);
			}
			pw.write("登录成功");
		}else {
			cookie.setMaxAge(0);
			pw.write("登录失败,2秒后重新登录");
			response.setHeader("refresh", "2;url='" + request.getContextPath() + "/cookiedemo3'");
		}
		response.addCookie(cookie);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
