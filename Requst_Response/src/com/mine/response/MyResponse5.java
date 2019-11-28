package com.mine.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyResponse5 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-");
		String userName = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String validateCode = request.getParameter("validatecode");
		String validateCodeRight = (String)this.getServletContext().getAttribute("validatecode");
		if(!validateCodeRight.equals(validateCode)) {
			System.out.println("您输入的验证码不正确，正确的为" + validateCodeRight);
		}else {
			System.out.println(userName + "  " + pwd + "  " + validateCode);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
