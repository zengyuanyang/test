<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>�ſ�</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
  </head>

<!--hxsglxiangdxongjxs-->
  <body >
  <p>�����ſ��б�</p>
  <form name="form1" id="form1" method="post" action="">
   ����:  �γ̱�ţ�<input name="kechengbianhao" type="text" id="kechengbianhao" style='border:solid 1px #000000; color:#666666' size="12" />  �γ����ƣ�<input name="kechengmingcheng" type="text" id="kechengmingcheng" style='border:solid 1px #000000; color:#666666' size="12" />  ������ţ�<input name="jifangbianhao" type="text" id="jifangbianhao" style='border:solid 1px #000000; color:#666666' size="12" /> ���ڣ�<select name='xingqi' id='xingqi' style='border:solid 1px #000000; color:#666666;'><option value="">����</option><option value="��һ">��һ</option><option value="�ܶ�">�ܶ�</option><option value="����">����</option><option value="����">����</option><option value="����">����</option><option value="����">����</option><option value="����">����</option></select> ʱ�Σ�<select name='shiduan' id='shiduan' style='border:solid 1px #000000; color:#666666;'><option value="">����</option><option value="����">����</option><option value="����">����</option><option value="����">����</option></select>
   <input type="submit" name="Submit" value="����" style='border:solid 1px #000000; color:#666666' /> <input type="button" name="Submit2" value="����EXCEL" style='border:solid 1px #000000; color:#666666' onClick="javascript:location.href='paike_listxls.jsp';" />
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td bgcolor='#CCFFFF'>�γ̱��</td>
    <td bgcolor='#CCFFFF'>�γ�����</td>
    <td bgcolor='#CCFFFF'>רҵ</td>
    <td bgcolor='#CCFFFF'>�������</td>
    <td bgcolor='#CCFFFF'>��������</td>
    <td bgcolor='#CCFFFF'>����</td>
    <td bgcolor='#CCFFFF'>ʱ��</td>
    <td bgcolor='#CCFFFF'>��ʦ��</td>
    <td bgcolor='#CCFFFF'>��ʦ����</td>
    
	<!--dpinglun1-->
    <td width="138" align="center" bgcolor="CCFFFF">���ʱ��</td>
    
    <td width="60" align="center" bgcolor="CCFFFF">����</td>
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
	
	<a href="paike_detail.jsp?id=<%=map.get("id")%>">��ϸ</a> </td>
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

