<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>数据备份</title>
    

  </head>
  
  <body>
  <%
 
if (request.getSession().getAttribute("cx").equals("超级管理员"))
{

// String sql="";
//   sql="backup database jspmjfskapxthsg7002A9 to disk='D:/jspmjfskapxthsg7002A9.dat'";
	  	
// new CommDAO().commOper(sql);
Info in = new Info();
in.backup();
out.print("<script>alert('操作成功!!，您的数据库已成功备份于D:/jspmjfskapxthsg7002A9.dat');location.href='sy.jsp';</script>");
  	  
}
else
{
out.print("<script>alert('对不起,您没有该权限');location.href='sy.jsp';</script>");
}

 %>
  </body>
</html>


