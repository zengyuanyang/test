package com.mine.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 利用cookie加载上次访问页面的时间
 * @author 曾远洋
 * @time 2019年11月28日下午6:23:58
 * @version V1.0
 */
public class CookieDemo1 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for (Cookie cookie : cookies) {
				if("lastAccessTime".equals(cookie.getName())) {
					pw.write("上次访问时间为：" + new Date(Long.parseLong(cookie.getValue())).toLocaleString());
				}
			}
		}
		
		pw.write("<a href='/Cookie_Session/cookiedemo2'>清除Cookie</a>");
		
		Cookie cookie = new Cookie("lastAccessTime", System.currentTimeMillis()+"");//新建cookie对象
		cookie.setMaxAge(60*10);//设置销毁时间
		cookie.setPath(request.getContextPath()); //等价于cookie.setPath("/");
		response.addCookie(cookie);//通过response对象添加cookie
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
