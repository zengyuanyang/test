<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>学生申请详细</title>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

  <body >
  <%
	String id=request.getParameter("id");
	HashMap m = new CommDAO().getmap(id,"xueshengshenqing");
     %>
  学生申请详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>机房编号：</td><td width='39%'><%=m.get("jifangbianhao")%></td><td width='11%'>机房名称：</td><td width='39%'><%=m.get("jifangmingcheng")%></td></tr><tr><td width='11%'>学号：</td><td width='39%'><%=m.get("xuehao")%></td><td width='11%'>姓名：</td><td width='39%'><%=m.get("xingming")%></td></tr><tr><td width='11%'>班级：</td><td width='39%'><%=m.get("banji")%></td><td width='11%'>使用日期：</td><td width='39%'><%=m.get("shiyongriqi")%></td></tr><tr><td width='11%'>申请座位：</td><td width='39%'><%=m.get("shenqingzuowei")%></td><td width='11%'>回复：</td><td width='39%'><%=m.get("huifu")%></td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>


