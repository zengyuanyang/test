package com.mine.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet{
	
	public MyServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("我是构造函数！");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("我是销毁方法！");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("我是初始化方法！");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html;charset=UTF-8");//设置浏览器和服务器端编码格式
		System.out.println("我是service方法！");
		Date today = new Date();
		res.getWriter().println("<html><body>" + "当前时间为：" + today + "</body></html>");//响应客户端
	}

}
