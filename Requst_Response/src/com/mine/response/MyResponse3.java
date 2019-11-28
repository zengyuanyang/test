package com.mine.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 曾远洋
 * @time 2019年11月27日下午5:16:35
 * @version V1.0
 * 转发和重定向
 */
public class MyResponse3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		//转发
		/*
		 * 1.请求发送一次
		 * 2.地址栏的URL不变
		 * 3.携带参数
		 * 4.不能跳转到其他应用中
		 */
		//this.getServletContext().getRequestDispatcher("/response").forward(req, response);
		//重定向
		/*
		 * 1.请求发送两次
		 * 2.地址栏URL要发生改变
		 * 3.不携带参数
		 * 4.可以跳转到其他应用中
		 */
		response.sendRedirect("/Requst_Response/response");// 必须加上项目名称
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
