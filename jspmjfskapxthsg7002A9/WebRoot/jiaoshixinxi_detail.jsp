<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>��ʦ��Ϣ��ϸ</title>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

  <body >
  <%
	String id=request.getParameter("id");
	HashMap m = new CommDAO().getmap(id,"jiaoshixinxi");
     %>
  ��ʦ��Ϣ��ϸ:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>��ʦ�ţ�</td><td width='39%'><%=m.get("jiaoshihao")%></td><td width='11%'>���룺</td><td width='39%'><%=m.get("mima")%></td></tr><tr><td width='11%'>��ʦ������</td><td width='39%'><%=m.get("jiaoshixingming")%></td><td width='11%'>�Ա�</td><td width='39%'><%=m.get("xingbie")%></td></tr><tr><td width='11%'>�������£�</td><td width='39%'><%=m.get("chushengnianyue")%></td><td width='11%'>���䣺</td><td width='39%'><%=m.get("gongling")%></td></tr><tr><td width='11%'>ְ�ƣ�</td><td width='39%'><%=m.get("zhicheng")%></td><td width='11%'>�ֻ���</td><td width='39%'><%=m.get("shouji")%></td></tr><tr><td width='11%'>���䣺</td><td width='39%'><%=m.get("youxiang")%></td><td width='11%'>��ע��</td><td width='39%'><%=m.get("beizhu")%></td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=���� onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=��ӡ onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>


