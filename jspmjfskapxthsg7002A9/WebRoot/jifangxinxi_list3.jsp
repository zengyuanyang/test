<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>机房信息</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
  </head>

<!--hxsglxiangdxongjxs-->
  <body >
  <p>今日已使用机房信息列表：</p>
<table width="100%" border="1" align="center" cellpadding="6" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF'>机房编号</td>
    <td bgcolor='#CCFFFF'>机房名称</td>
    <td bgcolor='#CCFFFF'>容量</td>
    <td bgcolor='#CCFFFF'>课程名称</td>
    <td bgcolor='#CCFFFF'>上机时段</td>
    <td bgcolor='#CCFFFF'>教师姓名</td>
    <td bgcolor='#CCFFFF'>联系方式</td>
  </tr>
  <% 
  	 new CommDAO().delete(request,"jifangxinxi"); 
    String url = "jifangxinxi_list2.jsp?1=1"; 
    String sql =  "select * from jifangxinxi where 1=1";
	
if(request.getParameter("jifangbianhao")=="" ||request.getParameter("jifangbianhao")==null ){}else{sql=sql+" and jifangbianhao like '%"+request.getParameter("jifangbianhao")+"%'";}
if(request.getParameter("jifangmingcheng")=="" ||request.getParameter("jifangmingcheng")==null ){}else{sql=sql+" and jifangmingcheng like '%"+request.getParameter("jifangmingcheng")+"%'";}
    sql+=" order by id desc";
	ArrayList<HashMap> list = PageManager.getPages(url,15,sql, request); 
	int i=0;
	for(HashMap map:list){ 
	i++;
     %>
  <tr>
    <td width="30" align="center"><%=i %></td>
    <td><%=map.get("jifangbianhao") %></td>
    <td><%=map.get("jifangmingcheng") %></td>
    <td><%=map.get("rongliang") %></td>
 	<td><%=map.get("kechengmingcheng") %></td>
 	<td><%=map.get("jieshu") %></td>
    <td><%=map.get("jiaoshixingming") %></td>
    <td><%=map.get("shouji") %></td>
  </tr>
  	<%
  }
   %>
</table>
<br>

${page.info }


  </body>
</html>
