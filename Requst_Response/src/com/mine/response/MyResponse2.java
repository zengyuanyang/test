package com.mine.response;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 曾远洋
 * @time 2019年11月27日下午1:01:09
 * @version V1.0
 * 实现文件下载
 */
public class MyResponse2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		//创建输入流对象
		String filepath = this.getServletContext().getRealPath("et01.png");
		FileInputStream fis = new FileInputStream(filepath);
		//创建输出流对象
		ServletOutputStream sos = response.getOutputStream();
		//响应头设置
		String fileName = filepath.substring(filepath.lastIndexOf("\\")+1);
		fileName = URLEncoder.encode(fileName, "UTF-8");
		response.setHeader("Content-Disposition", "attachment;fileName" + fileName);
		//读写数据
		int len = 0;
		byte[] b = new byte[1024];
		while((len = fis.read(b)) != -1) {
			sos.write(b, 0, len);
		}
		//关闭流
		sos.close();
		fis.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
