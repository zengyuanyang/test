<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>排课</title>
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
new CommDAO().update(request,response,"paike",ext,true,false,""); 
HashMap mmm = new CommDAO().getmap(id,"paike"); 
//lixanxdoxngcxhaxifxen
%>
  <form  action="paike_updt.jsp?f=f&id=<%=mmm.get("id")%>"  method="post" name="form1"  onsubmit="return checkform();">
  修改排课:
  <br><br>
 
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
     
     <tr><td>课程编号：</td><td><input name='kechengbianhao' type='text' id='kechengbianhao' value='<%= mmm.get("kechengbianhao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>课程名称：</td><td><input name='kechengmingcheng' type='text' id='kechengmingcheng' size='50' value='<%=mmm.get("kechengmingcheng")%>' style='border:solid 1px #000000; color:#666666'/></td></tr>
     <tr><td>专业：</td><td><input name='zhuanye' type='text' id='zhuanye' value='<%= mmm.get("zhuanye")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>机房编号：</td><td><input name='jifangbianhao' type='text' id='jifangbianhao' value='<%= mmm.get("jifangbianhao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>机房名称：</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' value='<%= mmm.get("jifangmingcheng")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>星期：</td><td><select name='xingqi' id='xingqi'><option value="周一">周一</option><option value="周二">周二</option><option value="周三">周三</option><option value="周四">周四</option><option value="周五">周五</option><option value="周六">周六</option><option value="周日">周日</option></select></td></tr><script language="javascript">document.form1.xingqi.value='<%=mmm.get("xingqi")%>';</script>
     <tr><td>时段：</td><td><select name='shiduan' id='shiduan'>
       <option value="8:00-9:40">8:00-9:40</option>
       <option value="10:00-11:40">10:00-11:40</option>
       <option value="14:00-15:40">14:00-15:40</option>
       <option value="16:00-17:40">16:00-17:40</option>
       <option value="19:00-20:40">19:00-20:40</option>
     </select></td></tr><script language="javascript">document.form1.shiduan.value='<%=mmm.get("shiduan")%>';</script>
     <tr><td>教师号：</td><td><input name='jiaoshihao' type='text' id='jiaoshihao' value='<%= mmm.get("jiaoshihao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
     <tr><td>教师姓名：</td><td><input name='jiaoshixingming' type='text' id='jiaoshixingming' value='<%= mmm.get("jiaoshixingming")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onClick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


