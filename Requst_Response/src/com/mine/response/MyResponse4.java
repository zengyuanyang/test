package com.mine.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dsna.util.images.ValidateCode;

/**
 * @author 曾远洋
 * @time 2019年11月27日下午6:03:57
 * @version V1.0
 * 验证码
 */
public class MyResponse4 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		ValidateCode vc = new ValidateCode(120, 30, 4, 8);
		System.out.println(vc.getCode());
		this.getServletContext().setAttribute("validatecode", vc.getCode());
		vc.write(response.getOutputStream());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
