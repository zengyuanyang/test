<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>ѧ������</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
  </head>


  <body >
  <p>����ѧ�������б�</p>
  <form name="form1" id="form1" method="post" action="">
   ����:  ������ţ�<input name="jifangbianhao" type="text" id="jifangbianhao" style='border:solid 1px #000000; color:#666666' size="12" />  �������ƣ�<input name="jifangmingcheng" type="text" id="jifangmingcheng" style='border:solid 1px #000000; color:#666666' size="12" />  ѧ�ţ�<input name="xuehao" type="text" id="xuehao" style='border:solid 1px #000000; color:#666666' size="12" />  ʹ�����ڣ�<input name="shiyongriqi1" type="text" id="shiyongriqi1"  value='' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" style='width:80px; height:20px; border:solid 1px #000000; color:#666666' />-<input name="shiyongriqi2" type="text" id="shiyongriqi2"  value='' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" style='width:80px; height:20px; border:solid 1px #000000; color:#666666' />
   <input type="submit" name="Submit" value="����" style='border:solid 1px #000000; color:#666666' /> <input type="button" name="Submit2" value="����EXCEL" style='border:solid 1px #000000; color:#666666' onClick="javascript:location.href='xueshengshenqing_listxls.jsp';" />
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td bgcolor='#CCFFFF'>�������</td>
    <td bgcolor='#CCFFFF'>��������</td>
    <td bgcolor='#CCFFFF'>ѧ��</td>
    <td bgcolor='#CCFFFF'>����</td>
    <td bgcolor='#CCFFFF'>�༶</td>
    <td bgcolor='#CCFFFF' width='65' align='center'>ʹ������</td>
    <td bgcolor='#CCFFFF'>������λ</td>
    <td bgcolor='#CCFFFF'>�ظ�</td>
    <td bgcolor='#CCFFFF' width='80' align='center'>�Ƿ����</td>
	
    <td width="138" align="center" bgcolor="CCFFFF">���ʱ��</td>
    
    <td width="60" align="center" bgcolor="CCFFFF">����</td>
  </tr>
  <% 
  	


  	 new CommDAO().delete(request,"xueshengshenqing"); 
    String url = "xueshengshenqing_list.jsp?1=1"; 
    String sql =  "select * from xueshengshenqing where 1=1";
	
if(request.getParameter("jifangbianhao")=="" ||request.getParameter("jifangbianhao")==null ){}else{sql=sql+" and jifangbianhao like '%"+request.getParameter("jifangbianhao")+"%'";}
if(request.getParameter("jifangmingcheng")=="" ||request.getParameter("jifangmingcheng")==null ){}else{sql=sql+" and jifangmingcheng like '%"+request.getParameter("jifangmingcheng")+"%'";}
if(request.getParameter("xuehao")=="" ||request.getParameter("xuehao")==null ){}else{sql=sql+" and xuehao like '%"+request.getParameter("xuehao")+"%'";}
if (request.getParameter("shiyongriqi1")==""  ||request.getParameter("shiyongriqi1")==null ) {}else{sql=sql+" and shiyongriqi >= '"+request.getParameter("shiyongriqi1")+"'";}
if (request.getParameter("shiyongriqi2")==""  ||request.getParameter("shiyongriqi2")==null ) {}else {sql=sql+" and shiyongriqi <= '"+request.getParameter("shiyongriqi2")+"'";}
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
    <td><%=map.get("xuehao") %></td>
    <td><%=map.get("xingming") %></td>
    <td><%=map.get("banji") %></td>
    <td><%=map.get("shiyongriqi") %></td>
    <td><%=map.get("shenqingzuowei") %></td>
    <td><%=map.get("huifu") %></td>
    <td align='center'><a href="sh.jsp?id=<%=map.get("id")%>&yuan=<%=map.get("issh")%>&tablename=xueshengshenqing" onClick="return confirm('��ȷ��Ҫִ�д˲�����')"><%=map.get("issh")%></a></td>
	
    <td width="138" align="center"><%=map.get("addtime") %></td>
    <td width="60" align="center"><a href="xueshengshenqing_updtlb.jsp?id=<%=map.get("id")%>">�ظ�</a>  <a href="xueshengshenqing_list.jsp?scid=<%=map.get("id") %>" onClick="return confirm('���Ҫɾ����')">ɾ��</a> <a href="xueshengshenqing_detail.jsp?id=<%=map.get("id")%>">��ϸ</a> </td>
  </tr>
  	<%
  }
   %>
</table>
<br>
  
${page.info }


  </body>
</html>

