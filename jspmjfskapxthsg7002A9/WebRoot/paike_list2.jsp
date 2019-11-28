<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>排课</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
  </head>

<!--hxsglxiangdxongjxs-->
  <body >
  <p>已有排课列表：</p>
  <form name="form1" id="form1" method="post" action="">
   搜索:  课程编号：<input name="kechengbianhao" type="text" id="kechengbianhao" style='border:solid 1px #000000; color:#666666' size="12" />  课程名称：<input name="kechengmingcheng" type="text" id="kechengmingcheng" style='border:solid 1px #000000; color:#666666' size="12" />  机房编号：<input name="jifangbianhao" type="text" id="jifangbianhao" style='border:solid 1px #000000; color:#666666' size="12" /> 星期：<select name='xingqi' id='xingqi' style='border:solid 1px #000000; color:#666666;'><option value="">所有</option><option value="周一">周一</option><option value="周二">周二</option><option value="周三">周三</option><option value="周四">周四</option><option value="周五">周五</option><option value="周六">周六</option><option value="周日">周日</option></select> 时段：<select name='shiduan' id='shiduan' style='border:solid 1px #000000; color:#666666;'><option value="">所有</option><option value="上午">上午</option><option value="中午">中午</option><option value="晚上">晚上</option></select>
   <input type="submit" name="Submit" value="查找" style='border:solid 1px #000000; color:#666666' /> <input type="button" name="Submit2" value="导出EXCEL" style='border:solid 1px #000000; color:#666666' onClick="javascript:location.href='paike_listxls.jsp';" />
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF'>课程编号</td>
    <td bgcolor='#CCFFFF'>课程名称</td>
    <td bgcolor='#CCFFFF'>专业</td>
    <td bgcolor='#CCFFFF'>机房编号</td>
    <td bgcolor='#CCFFFF'>机房名称</td>
    <td bgcolor='#CCFFFF'>星期</td>
    <td bgcolor='#CCFFFF'>时段</td>
    <td bgcolor='#CCFFFF'>教师号</td>
    <td bgcolor='#CCFFFF'>教师姓名</td>
    
	<!--dpinglun1-->
    <td width="138" align="center" bgcolor="CCFFFF">添加时间</td>
    
    <td width="60" align="center" bgcolor="CCFFFF">操作</td>
  </tr>
  <% 
  	//difengysfiqfgieuheze
//youzuiping1
//txixixngdy
  	 new CommDAO().delete(request,"paike"); 
    String url = "paike_list2.jsp?1=1"; 
    String sql =  "select * from paike where jiaoshihao='"+request.getSession().getAttribute("username")+"' ";
	
if(request.getParameter("kechengbianhao")=="" ||request.getParameter("kechengbianhao")==null ){}else{sql=sql+" and kechengbianhao like '%"+request.getParameter("kechengbianhao")+"%'";}
if(request.getParameter("kechengmingcheng")=="" ||request.getParameter("kechengmingcheng")==null ){}else{sql=sql+" and kechengmingcheng like '%"+request.getParameter("kechengmingcheng")+"%'";}
if(request.getParameter("jifangbianhao")=="" ||request.getParameter("jifangbianhao")==null ){}else{sql=sql+" and jifangbianhao like '%"+request.getParameter("jifangbianhao")+"%'";}
if(request.getParameter("xingqi")=="" ||request.getParameter("xingqi")==null ){}else{sql=sql+" and xingqi like '%"+request.getParameter("xingqi")+"%'";}
if(request.getParameter("shiduan")=="" ||request.getParameter("shiduan")==null ){}else{sql=sql+" and shiduan like '%"+request.getParameter("shiduan")+"%'";}
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
    <td><%=map.get("kechengbianhao") %></td>
    <td><%=map.get("kechengmingcheng") %></td>
    <td><%=map.get("zhuanye") %></td>
    <td><%=map.get("jifangbianhao") %></td>
    <td><%=map.get("jifangmingcheng") %></td>
    <td><%=map.get("xingqi") %></td>
    <td><%=map.get("shiduan") %></td>
    <td><%=map.get("jiaoshihao") %></td>
    <td><%=map.get("jiaoshixingming") %></td>
    
	<!--dpinglun2-->
    <td width="138" align="center"><%=map.get("addtime") %></td>
    <td width="60" align="center">
	
	<a href="paike_detail.jsp?id=<%=map.get("id")%>">详细</a> </td>
  </tr>
  	<%
  }
   %>
</table>
<br>
<!--yoxugonxgzitoxnxgjxi--> <!--youzuiping3--> 
${page.info }

  <%
//yoxutixinxg if(kucddduntx>0)
//yoxutixinxg{
//yoxutixinxg tsgehxdhdm
//yoxutixinxg}
%>
  </body>
</html>

