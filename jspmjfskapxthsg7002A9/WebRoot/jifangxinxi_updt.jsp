<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>机房信息</title>
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
  修改机房信息:
  <br><br>
 
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
     
     <tr><td>机房编号：</td><td><input name='jifangbianhao' type='text' id='jifangbianhao' value='<%= mmm.get("jifangbianhao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>机房名称：</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' size='50' value='<%=mmm.get("jifangmingcheng")%>' style='border:solid 1px #000000; color:#666666'/></td></tr>
     <tr><td>容量：</td><td><input name='rongliang' type='text' id='rongliang' value='<%= mmm.get("rongliang")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>状态：</td><td><select name='zhuangtai' id='zhuangtai'><option value="空闲">空闲</option><option value="预约">预约</option></select></td></tr><script language="javascript">document.form1.zhuangtai.value='<%=mmm.get("zhuangtai")%>';</script>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onClick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


