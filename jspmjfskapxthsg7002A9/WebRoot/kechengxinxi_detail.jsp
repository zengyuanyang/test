<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>课程信息详细</title>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

  <body >
  <%
	String id=request.getParameter("id");
	HashMap m = new CommDAO().getmap(id,"kechengxinxi");
     %>
  课程信息详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>课程编号：</td><td width='39%'><%=m.get("kechengbianhao")%></td><td width='11%'>课程名称：</td><td width='39%'><%=m.get("kechengmingcheng")%></td></tr><tr><td width='11%'>专业：</td><td width='39%'><%=m.get("zhuanye")%></td><td width='11%'>课程介绍：</td><td width='39%'><%=m.get("kechengjieshao")%></td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>


