package com.mine.cookie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.pojo.Goods;

public class CookieDemo5 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Goods> list = new ArrayList<Goods>();
		list.add(new Goods("et01.png", "红色座椅", 69.5,1));
		list.add(new Goods("et02.png", "浅蓝色座椅", 88,2));
		list.add(new Goods("et03.png", "深蓝色座椅", 79,3));
		list.add(new Goods("et04.png", "橘色座椅", 101,4));
		this.getServletContext().setAttribute("goods", list);
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
