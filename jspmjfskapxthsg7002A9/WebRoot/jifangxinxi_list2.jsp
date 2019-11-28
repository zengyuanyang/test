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
  <p>已有机房信息列表：</p>
  <form name="form1" id="form1" method="post" action="">
   搜索:  第<input name="start_week" type="text" id="start_week" style='border:solid 1px #000000; color:#666666' size="12" />
   周到<input name="end_week" type="text" id="end_week" style='border:solid 1px #000000; color:#666666' size="12" />周
   星期<select name="day" id="day">
    <option value="1">1</option>
  	<option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
   </select>
   第<select name="jieshu" id="jieshu">
    <option value="1">1</option>
  	<option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
   </select>节
   <input type="submit" name="Submit" value="查找" style='border:solid 1px #000000; color:#666666' /> <input type="button" name="Submit2" value="导出EXCEL" style='border:solid 1px #000000; color:#666666' onClick="javascript:location.href='jifangxinxi_listxls.jsp';" />
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align="center" bgcolor='#CCFFFF'>机房号</td>
    <td align="center" bgcolor='#CCFFFF'>机房名称</td>
    <td align="center" bgcolor='#CCFFFF'>容量</td>
  
    <td width="60" align="center" bgcolor="CCFFFF">操作</td>
  </tr>
  <% 

  	 new CommDAO().delete(request,"jifangxinxi"); 
    String url = "jifangxinxi_list2.jsp?1=1"; 
    String sql =  "select * from jifangxinxi where 1=1";
	
if(request.getParameter("start_week")=="" ||request.getParameter("start_week")==null )
{}else{
	sql=sql+" and (WEEK BETWEEN '"+request.getParameter("start_week")+"'";
	}
if(request.getParameter("end_week")=="" ||request.getParameter("end_week")==null )
{}else{
	sql=sql+" and '"+request.getParameter("end_week")+"')";
	}
if(request.getParameter("day")=="" ||request.getParameter("day")==null )
{}else{
	sql=sql+" and DAY like '"+request.getParameter("day")+"'";
	}
if(request.getParameter("jieshu")=="" ||request.getParameter("jieshu")==null )
{}else{
	sql=sql+" and jieshu like '"+request.getParameter("jieshu")+"'";
	}
    sql+=" and kechenghao = '0' GROUP by jifanghao ,jifangmingcheng,rongliang order by id desc";
	ArrayList<HashMap> list = PageManager.getPages(url,15,sql, request); 
	int i=0;
	for(HashMap map:list){ 
	i++;

     %>
  <tr>
    <td width="30" align="center"><%=i %></td>
    <td><%=map.get("jifanghao") %></td>
    <td><%=map.get("jifangmingcheng") %></td>
    <td><%=map.get("rongliang") %></td>
    <td width="60" align="center"><a href="jiaoshishenqing_add.jsp?id=<%=map.get("id")%>">申请机房</a></td>
  </tr>
  	<%
  }
   %>
</table>
<br>

${page.info }

  <%
//yoxutixinxg if(kucddduntx>0)
//yoxutixinxg{
//yoxutixinxg tsgehxdhdm
//yoxutixinxg}
%>
  </body>
</html>