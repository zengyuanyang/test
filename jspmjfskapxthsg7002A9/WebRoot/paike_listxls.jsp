<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=paike.xls");
%>
<html>
  <head>
    <title>排课</title>
  </head>

  <body >
  <p>已有排课列表：</p>
  

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF'>课程编号</td>    <td bgcolor='#CCFFFF'>课程名称</td>    <td bgcolor='#CCFFFF'>专业</td>    <td bgcolor='#CCFFFF'>机房编号</td>    <td bgcolor='#CCFFFF'>机房名称</td>    <td bgcolor='#CCFFFF'>星期</td>    <td bgcolor='#CCFFFF'>时段</td>    <td bgcolor='#CCFFFF'>教师号</td>    <td bgcolor='#CCFFFF'>教师姓名</td>    
    <td width="138" align="center" bgcolor="CCFFFF">添加时间</td>
    

  </tr>
  <% 
  	//difengysfiqfgieuheze
//youzuiping1
//txixixngdy
    String url = "paike_list.jsp?1=1"; 
    String sql =  "select * from paike where 1=1";
    sql+=" order by id desc";
	ArrayList<HashMap> list = PageManager.getPages(url,15,sql, request); 
	int i=0;
	for(HashMap map:list){ 
	i++;
	//wxflzhistri
	//zoxngxetxoxngjxvi
//txixgihxngjs
//youzuiping2
     %>
  <tr>
    <td width="30" align="center"><%=i %></td>
    <td><%=map.get("kechengbianhao") %></td>    <td><%=map.get("kechengmingcheng") %></td>    <td><%=map.get("zhuanye") %></td>    <td><%=map.get("jifangbianhao") %></td>    <td><%=map.get("jifangmingcheng") %></td>    <td><%=map.get("xingqi") %></td>    <td><%=map.get("shiduan") %></td>    <td><%=map.get("jiaoshihao") %></td>    <td><%=map.get("jiaoshixingming") %></td>    
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

