<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'adminyanzheng.jsp' starting page</title>
    

  </head>
  
  <body>
  <%

if (request.getSession().getAttribute("cx").equals("值班人员"))
{
	response.sendRedirect("left3.jsp");
}

if (request.getSession().getAttribute("cx").equals("教师"))
{
	response.sendRedirect("left2.jsp");
}
if (request.getSession().getAttribute("cx").equals("超级管理员"))
{
	response.sendRedirect("left.jsp");
}
 %>
  </body>
</html>

