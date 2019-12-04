package com.mine.request;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.mine.pojo.User;

/**
 * request的几种获取数据的方式
 * @author 曾远洋
 * @time 2019年11月28日下午1:12:07
 * @version V1.0
 */
public class MyRequest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getParam1(request, response);
		//getParam2(request, response);
		//getParam3(request, response);
		getParam4(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	/**
	 * 用getParameter()方法获取数据并封装数据
	 * @param request
	 * @param response
	 * @throws UnsupportedEncodingException
	 */
	public void getParam1(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		User user = new User();
		System.out.println("封装前：" + user.toString());
		//user.setUserName(new String(request.getParameter("userName").getBytes("ISO-8859-1"), "UTF-8"));
		/* get方式提交数据：
		 * tomcat7及以前的默认服务器编码为ISO-8859-1
		 * tomcat8及以后的默认服务器编码为UTF-8
		 * 若服务器编码格式为ISO-8859-1，那么服务器在接收中文数据时，应先将中文按ISO-8859-1的格式转为字节，然后再按UTF-8的格式转为字符（操作如上，该方式不能批量处理）
		 * post方式提交数据：
		 * request.setCharacterEncoding("UTF-8");(批量处理)
		 */
		
		user.setUserName(request.getParameter("userName"));
		user.setUserPwd(request.getParameter("userPwd"));
		user.setUserSex(request.getParameter("userSex"));
		user.setUserHobby(request.getParameterValues("userHobby"));
		user.setUserCity(request.getParameter("userCity"));
		System.out.println("封装后：" + user.toString());
	}
	
	/**
	 * 用getParameterNames()、getParameterValues()方法获取并封装数据
	 * @param request
	 * @param response
	 */
	public void getParam2(HttpServletRequest request, HttpServletResponse response) {
		User user = new User();
		System.out.println("封装前：" + user.toString());
		Enumeration names = request.getParameterNames();
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			String[] values = request.getParameterValues(name);
			if(name.equals("userName") && values != null) {
				user.setUserName(values[0]);
			}else if(name.equals("userPwd") && values != null) {
				user.setUserPwd(values[0]);
			}else if(name.equals("userSex") && values != null) {
				user.setUserSex(values[0]);
			}else if(name.equals("userHobby") && values != null) {
				user.setUserHobby(values);
			}else if(name.equals("userCity") && values != null) {
				user.setUserCity(values[0]);
			}
		}
		System.out.println("封装后：" + user.toString());
	}
	
	/**
	 * 用getParameterMap()方法获取并封装数据
	 * @param request
	 * @param response
	 * @throws IntrospectionException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public void getParam3(HttpServletRequest request, HttpServletResponse response) {
		User user = new User();
		System.out.println("封装前：" + user.toString());
		Map<String,String[]> map = request.getParameterMap();
		for (Map.Entry<String, String[]> m : map.entrySet()) {
			String name = m.getKey();
			String[] value = m.getValue();
			PropertyDescriptor pd;
			try {
				pd = new PropertyDescriptor(name, User.class);
				Method method = pd.getWriteMethod();
				if(value.length == 1) {
					if("setUserHobby".equals(method.getName())) {
						method.invoke(user, (Object)value);
					}else {
						method.invoke(user, value[0]);
					}
				}else {
					method.invoke(user, (Object)value);
				}
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("封装后：" + user.toString());
	}
	
	/**
	 * 利用beanutil架包获取并封装数据
	 * @param request
	 * @param response
	 */
	public void getParam4(HttpServletRequest request, HttpServletResponse response) {
		User user = new User();
		System.out.println("封装前：" + user.toString());
		try {
			BeanUtils.populate(user, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("封装后：" + user.toString());
	}
}
