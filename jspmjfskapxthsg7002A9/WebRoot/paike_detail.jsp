<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>�ſ���ϸ</title>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

  <body >
  <%
	String id=request.getParameter("id");
	HashMap m = new CommDAO().getmap(id,"paike");
     %>
  �ſ���ϸ:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>�γ̱�ţ�</td><td width='39%'><%=m.get("kechengbianhao")%></td><td width='11%'>�γ����ƣ�</td><td width='39%'><%=m.get("kechengmingcheng")%></td></tr><tr><td width='11%'>רҵ��</td><td width='39%'><%=m.get("zhuanye")%></td><td width='11%'>������ţ�</td><td width='39%'><%=m.get("jifangbianhao")%></td></tr><tr><td width='11%'>�������ƣ�</td><td width='39%'><%=m.get("jifangmingcheng")%></td><td width='11%'>���ڣ�</td><td width='39%'><%=m.get("xingqi")%></td></tr><tr><td width='11%'>ʱ�Σ�</td><td width='39%'><%=m.get("shiduan")%></td><td width='11%'>��ʦ�ţ�</td><td width='39%'><%=m.get("jiaoshihao")%></td></tr><tr><td width='11%'>��ʦ������</td><td width='39%'><%=m.get("jiaoshixingming")%></td><td>&nbsp;</td><td>&nbsp;</td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=���� onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=��ӡ onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>


