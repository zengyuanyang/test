<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>ѧ����Ϣ��ϸ</title>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

  <body >
  <%
	String id=request.getParameter("id");
	HashMap m = new CommDAO().getmap(id,"xueshengxinxi");
     %>
  ѧ����Ϣ��ϸ:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>ѧ�ţ�</td><td width='39%'><%=m.get("xuehao")%></td><td width='11%'>���룺</td><td width='39%'><%=m.get("mima")%></td></tr><tr><td width='11%'>������</td><td width='39%'><%=m.get("xingming")%></td><td width='11%'>�Ա�</td><td width='39%'><%=m.get("xingbie")%></td></tr><tr><td width='11%'>�������ڣ�</td><td width='39%'><%=m.get("chushengriqi")%></td><td width='11%'>�༶��</td><td width='39%'><%=m.get("banji")%></td></tr><tr><td width='11%'>Ժϵ��</td><td width='39%'><%=m.get("yuanxi")%></td><td width='11%'>רҵ��</td><td width='39%'><%=m.get("zhuanye")%></td></tr><tr><td width='11%'>��ϵ�绰��</td><td width='39%'><%=m.get("lianxidianhua")%></td><td>&nbsp;</td><td>&nbsp;</td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=���� onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=��ӡ onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>


