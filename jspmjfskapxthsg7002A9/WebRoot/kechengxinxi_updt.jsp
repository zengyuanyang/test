<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>�γ���Ϣ</title>
	<!--bixanjxiqxi-->
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

<!--hxsglxiangdxongjxs-->
  <body >
   <% 

String id = request.getParameter("id"); 

HashMap ext = new HashMap(); 
//wxfladd
new CommDAO().update(request,response,"kechengxinxi",ext,true,false,""); 
HashMap mmm = new CommDAO().getmap(id,"kechengxinxi"); 
//lixanxdoxngcxhaxifxen
%>
  <form  action="kechengxinxi_updt.jsp?f=f&id=<%=mmm.get("id")%>"  method="post" name="form1"  onsubmit="return checkform();">
  �޸Ŀγ���Ϣ:
  <br><br>
 
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
          <tr><td>�γ̱�ţ�</td><td><input name='kechengbianhao' type='text' id='kechengbianhao' value='<%= mmm.get("kechengbianhao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>�γ����ƣ�</td><td><input name='kechengmingcheng' type='text' id='kechengmingcheng' size='50' value='<%=mmm.get("kechengmingcheng")%>' style='border:solid 1px #000000; color:#666666'/></td></tr>     <tr><td>רҵ��</td><td><input name='zhuanye' type='text' id='zhuanye' value='<%= mmm.get("zhuanye")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>�γ̽��ܣ�</td><td><textarea name='kechengjieshao' cols='50' rows='5' id='kechengjieshao' style='border:solid 1px #000000; color:#666666'><%=mmm.get("kechengjieshao")%></textarea></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="�ύ" onclick="return check();" />
      <input type="reset" name="Submit2" value="����" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


