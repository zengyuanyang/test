package com.mine.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dsna.util.images.ValidateCode;

/**
 * 验证码
 * @author 曾远洋
 * @time 2019年11月29日上午10:21:20
 * @version V1.0
 */
public class SessionDemo1 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ValidateCode vc = new ValidateCode(120, 30, 4, 8);
		System.out.println(vc.getCode());
		this.getServletContext().setAttribute("validatecode", vc.getCode());
		vc.write(response.getOutputStream());
		request.getSession().setAttribute("validateCode", vc.getCode());	//设置session
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
