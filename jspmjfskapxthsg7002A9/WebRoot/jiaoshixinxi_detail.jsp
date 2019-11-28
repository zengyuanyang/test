<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>教师信息详细</title>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

  <body >
  <%
	String id=request.getParameter("id");
	HashMap m = new CommDAO().getmap(id,"jiaoshixinxi");
     %>
  教师信息详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>教师号：</td><td width='39%'><%=m.get("jiaoshihao")%></td><td width='11%'>密码：</td><td width='39%'><%=m.get("mima")%></td></tr><tr><td width='11%'>教师姓名：</td><td width='39%'><%=m.get("jiaoshixingming")%></td><td width='11%'>性别：</td><td width='39%'><%=m.get("xingbie")%></td></tr><tr><td width='11%'>出生年月：</td><td width='39%'><%=m.get("chushengnianyue")%></td><td width='11%'>工龄：</td><td width='39%'><%=m.get("gongling")%></td></tr><tr><td width='11%'>职称：</td><td width='39%'><%=m.get("zhicheng")%></td><td width='11%'>手机：</td><td width='39%'><%=m.get("shouji")%></td></tr><tr><td width='11%'>邮箱：</td><td width='39%'><%=m.get("youxiang")%></td><td width='11%'>备注：</td><td width='39%'><%=m.get("beizhu")%></td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>


