<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>������Ϣ</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
  </head>

<!--hxsglxiangdxongjxs-->
  <body >
  <p>���л�����Ϣ�б�</p>
  <form name="form1" id="form1" method="post" action="">
   ����:  ��<input name="start_week" type="text" id="start_week" style='border:solid 1px #000000; color:#666666' size="12" />
   �ܵ�<input name="end_week" type="text" id="end_week" style='border:solid 1px #000000; color:#666666' size="12" />��
   ����<select name="day" id="day">
    <option value="1">1</option>
  	<option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
   </select>
   ��<select name="jieshu" id="jieshu">
    <option value="1">1</option>
  	<option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
   </select>��
   <input type="submit" name="Submit" value="����" style='border:solid 1px #000000; color:#666666' /> <input type="button" name="Submit2" value="����EXCEL" style='border:solid 1px #000000; color:#666666' onClick="javascript:location.href='jifangxinxi_listxls.jsp';" />
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td align="center" bgcolor='#CCFFFF'>������</td>
    <td align="center" bgcolor='#CCFFFF'>��������</td>
    <td align="center" bgcolor='#CCFFFF'>����</td>
  
    <td width="60" align="center" bgcolor="CCFFFF">����</td>
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
    <td width="60" align="center"><a href="jiaoshishenqing_add.jsp?id=<%=map.get("id")%>">�������</a></td>
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