package com.mine.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录界面设置
 * @author 曾远洋
 * @time 2019年11月28日下午7:33:20
 * @version V1.0
 */
public class CookieDemo3 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		String value = "";
		String userName = "";
		String userPwd = "";
		String remenber = "";
		Cookie[] cookies = request.getCookies();
		for(int i =0;cookies != null && i < cookies.length;i++) {
			if("userInfo".equals(cookies[i].getName())) {
				value = cookies[i].getValue();
				userName = value.split("&")[0];
				userPwd = value.split("&")[1];
				remenber = "checked='checked'";
			}
		}
		pw.write("<form method='post' action ='/Cookie_Session/cookiedemo4'>"
				+ "用户名：<input type='text' name='userName' value='"+ userName +"' /><br/>"
				+ "密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type='password' name='userPwd' value='"+ userPwd +"'/><br/>"
				+ "<input type='checkbox' name='remenber'"+ remenber +" />记住用户<br/>"
				+ "<input type='submit' value='登录' />"
				+"</form>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
