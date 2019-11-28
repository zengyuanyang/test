<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>学生申请</title>
	
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>
<script language="javascript">

function hsgxia2shxurxu(nstr,nwbk)
{
	if (eval("form1."+nwbk).value.indexOf(nstr)>=0)
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value.replace(nstr+"；", "");
	}
	else
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value+nstr+"；";
	}
}
</script>

  <body >
   <% 

String id = request.getParameter("id"); 

HashMap ext = new HashMap(); 

new CommDAO().update(request,response,"xueshengshenqing",ext,true,false,""); 
HashMap mmm = new CommDAO().getmap(id,"xueshengshenqing"); 

%>
  <form  action="xueshengshenqing_updt.jsp?f=f&id=<%=mmm.get("id")%>"  method="post" name="form1"  onsubmit="return checkform();">
  修改学生申请:
  <br><br>
 
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
          <tr><td>机房编号：</td><td><input name='jifangbianhao' type='text' id='jifangbianhao' value='<%= mmm.get("jifangbianhao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>机房名称：</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' value='<%= mmm.get("jifangmingcheng")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>学号：</td><td><input name='xuehao' type='text' id='xuehao' value='<%= mmm.get("xuehao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>姓名：</td><td><input name='xingming' type='text' id='xingming' value='<%= mmm.get("xingming")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>班级：</td><td><input name='banji' type='text' id='banji' value='<%= mmm.get("banji")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>使用日期：</td><td><input name='shiyongriqi' type='text' id='shiyongriqi' value='<%= mmm.get("shiyongriqi")%>' onclick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" readonly='readonly'  /></td></tr>     <tr><td>申请座位：</td><td><select name='shenqingzuowei' id='shenqingzuowei'><option value="1号">1号</option><option value="2号">2号</option><option value="3号">3号</option><option value="4号">4号</option><option value="5号">5号</option><option value="6号">6号</option><option value="7号">7号</option><option value="8号">8号</option><option value="9号">9号</option><option value="10号">10号</option><option value="11号">11号</option><option value="12号">12号</option></select></td></tr><script language="javascript">document.form1.shenqingzuowei.value='<%=mmm.get("shenqingzuowei")%>';</script>     <tr style='display:none'><td>回复：</td><td><input name='huifu' type='text' id='huifu' size='50' value='<%=mmm.get("huifu")%>' style='border:solid 1px #000000; color:#666666'/></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onClick="return checkform();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


