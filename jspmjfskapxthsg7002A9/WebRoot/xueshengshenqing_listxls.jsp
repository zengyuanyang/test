<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=xueshengshenqing.xls");
%>
<html>
  <head>
    <title>学生申请</title>
  </head>

  <body >
  <p>已有学生申请列表：</p>
  

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF'>机房编号</td>    <td bgcolor='#CCFFFF'>机房名称</td>    <td bgcolor='#CCFFFF'>学号</td>    <td bgcolor='#CCFFFF'>姓名</td>    <td bgcolor='#CCFFFF'>班级</td>    <td bgcolor='#CCFFFF' width='65' align='center'>使用日期</td>    <td bgcolor='#CCFFFF'>申请座位</td>    <td bgcolor='#CCFFFF'>回复</td>    <td bgcolor='#CCFFFF' width='80' align='center'>是否审核</td>
    <td width="138" align="center" bgcolor="CCFFFF">添加时间</td>
    

  </tr>
  <% 

    String url = "xueshengshenqing_list.jsp?1=1"; 
    String sql =  "select * from xueshengshenqing where 1=1";
    sql+=" order by id desc";
	ArrayList<HashMap> list = PageManager.getPages(url,15,sql, request); 
	int i=0;
	for(HashMap map:list){ 
	i++;

     %>
  <tr>
    <td width="30" align="center"><%=i %></td>
    <td><%=map.get("jifangbianhao") %></td>    <td><%=map.get("jifangmingcheng") %></td>    <td><%=map.get("xuehao") %></td>    <td><%=map.get("xingming") %></td>    <td><%=map.get("banji") %></td>    <td><%=map.get("shiyongriqi") %></td>    <td><%=map.get("shenqingzuowei") %></td>    <td><%=map.get("huifu") %></td>    <td align='center'><a href="sh.jsp?id=<%=map.get("id")%>&yuan=<%=map.get("issh")%>&tablename=xueshengshenqing" onclick="return confirm('您确定要执行此操作？')"><%=map.get("issh")%></a></td>
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

