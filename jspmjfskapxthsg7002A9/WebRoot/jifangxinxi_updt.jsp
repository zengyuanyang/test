<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>������Ϣ</title>
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
new CommDAO().update(request,response,"jifangxinxi",ext,true,false,""); 
HashMap mmm = new CommDAO().getmap(id,"jifangxinxi"); 
//lixanxdoxngcxhaxifxen
%>
  <form  action="jifangxinxi_updt.jsp?f=f&id=<%=mmm.get("id")%>"  method="post" name="form1"  onsubmit="return checkform();">
  �޸Ļ�����Ϣ:
  <br><br>
 
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
     
     <tr><td>������ţ�</td><td><input name='jifangbianhao' type='text' id='jifangbianhao' value='<%= mmm.get("jifangbianhao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>�������ƣ�</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' size='50' value='<%=mmm.get("jifangmingcheng")%>' style='border:solid 1px #000000; color:#666666'/></td></tr>
     <tr><td>������</td><td><input name='rongliang' type='text' id='rongliang' value='<%= mmm.get("rongliang")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>״̬��</td><td><select name='zhuangtai' id='zhuangtai'><option value="����">����</option><option value="ԤԼ">ԤԼ</option></select></td></tr><script language="javascript">document.form1.zhuangtai.value='<%=mmm.get("zhuangtai")%>';</script>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="�ύ" onClick="return check();" />
      <input type="reset" name="Submit2" value="����" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


