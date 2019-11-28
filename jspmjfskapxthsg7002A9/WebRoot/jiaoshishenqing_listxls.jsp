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
    <title>教师申请</title>
  </head>

  <body >
  <p>已有教师申请列表：</p>
  

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF'>机房编号</td>    <td bgcolor='#CCFFFF'>机房名称</td>    <td bgcolor='#CCFFFF'>教师号</td>    <td bgcolor='#CCFFFF'>教师姓名</td>    <td bgcolor='#CCFFFF' width='65' align='center'>使用日期</td>    <td bgcolor='#CCFFFF'>回复</td>    <td bgcolor='#CCFFFF' width='80' align='center'>是否审核</td>
    <td width="138" align="center" bgcolor="CCFFFF">添加时间</td>
    

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
    <td><%=map.get("jifangbianhao") %></td>    <td><%=map.get("jifangmingcheng") %></td>    <td><%=map.get("jiaoshihao") %></td>    <td><%=map.get("jiaoshixingming") %></td>    <td><%=map.get("shiyongriqi") %></td>    <td><%=map.get("huifu") %></td>    <td align='center'><a href="sh.jsp?id=<%=map.get("id")%>&yuan=<%=map.get("issh")%>&tablename=jiaoshishenqing" onclick="return confirm('您确定要执行此操作？')"><%=map.get("issh")%></a></td>
    <td width="138" align="center"><%=map.get("addtime") %></td>
  </tr>
  	<%
  }
   %>
</table>

<br>
以上数据共<%=i %>条
  </body>
</html>

