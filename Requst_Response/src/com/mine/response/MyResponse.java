package com.mine.response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.response.Goods;

/**
 * @author 曾远洋
 * @time 2019年11月27日下午12:58:01
 * @version V1.0
 * java内写前端代码
 */
public class MyResponse extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");	//解决乱码问题：设置服务器和浏览器编码
		List<Goods> list = new ArrayList<Goods>();
		list.add(new Goods(this.getServletContext().getRealPath("et01.png"), "红色座椅", 69.5));
		list.add(new Goods(this.getServletContext().getRealPath("et02.png"), "浅蓝色座椅", 88));
		list.add(new Goods(this.getServletContext().getRealPath("et03.png"), "深蓝色座椅", 79));
		list.add(new Goods(this.getServletContext().getRealPath("et04.png"), "橘色座椅", 101));
		response.getWriter().write("<div style='width: 80%;margin:0 auto;text-align: center'>");
		for (Goods goods : list) {
			response.getWriter().write("<div style='width: 30%;margin:0 auto;display: inline-block;background-color:#F0F0F0;text-align: center'>\r\n" + 
					"			<table width='100%'>\r\n" + 
					"				<tr style='border: solid'>\r\n" + 
					"					<td colspan='3' style='text-align: center'><img src='"+ goods.getImg() +"'/></td>\r\n" + 
					"				</tr>\r\n" + 
					"				<tr>\r\n" + 
					"					<td colspan='3' style='text-align: center'>"+ goods.getDesc() +"</td>\r\n" + 
					"				</tr>\r\n" + 
					"				<tr>\r\n" + 
					"					<td colspan='2'>"+ goods.getPrice() +"</td>\r\n" + 
					"					<td>包邮</td>\r\n" + 
					"				</tr>\r\n" + 
					"			</table>\r\n" + 
					"		</div>");
		}
		response.getWriter().write("</div>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
