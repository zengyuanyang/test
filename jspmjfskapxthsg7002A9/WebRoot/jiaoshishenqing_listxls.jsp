<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=jiaoshishenqing.xls");
%>
<html>
  <head>
    <title>��ʦ����</title>
  </head>

  <body >
  <p>���н�ʦ�����б�</p>
  

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td bgcolor='#CCFFFF'>�������</td>    <td bgcolor='#CCFFFF'>��������</td>    <td bgcolor='#CCFFFF'>��ʦ��</td>    <td bgcolor='#CCFFFF'>��ʦ����</td>    <td bgcolor='#CCFFFF' width='65' align='center'>ʹ������</td>    <td bgcolor='#CCFFFF'>�ظ�</td>    <td bgcolor='#CCFFFF' width='80' align='center'>�Ƿ����</td>
    <td width="138" align="center" bgcolor="CCFFFF">���ʱ��</td>
    

  </tr>
  <% 

    String url = "jiaoshishenqing_list.jsp?1=1"; 
    String sql =  "select * from jiaoshishenqing where 1=1";
    sql+=" order by id desc";
	ArrayList<HashMap> list = PageManager.getPages(url,15,sql, request); 
	int i=0;
	for(HashMap map:list){ 
	i++;

     %>
  <tr>
    <td width="30" align="center"><%=i %></td>
    <td><%=map.get("jifangbianhao") %></td>    <td><%=map.get("jifangmingcheng") %></td>    <td><%=map.get("jiaoshihao") %></td>    <td><%=map.get("jiaoshixingming") %></td>    <td><%=map.get("shiyongriqi") %></td>    <td><%=map.get("huifu") %></td>    <td align='center'><a href="sh.jsp?id=<%=map.get("id")%>&yuan=<%=map.get("issh")%>&tablename=jiaoshishenqing" onclick="return confirm('��ȷ��Ҫִ�д˲�����')"><%=map.get("issh")%></a></td>
    <td width="138" align="center"><%=map.get("addtime") %></td>
  </tr>
  	<%
  }
   %>
</table>

<br>
�������ݹ�<%=i %>��
  </body>
</html>

