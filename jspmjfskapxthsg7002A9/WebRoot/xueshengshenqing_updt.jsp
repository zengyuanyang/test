<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>ѧ������</title>
	
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>
<script language="javascript">

function hsgxia2shxurxu(nstr,nwbk)
{
	if (eval("form1."+nwbk).value.indexOf(nstr)>=0)
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value.replace(nstr+"��", "");
	}
	else
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value+nstr+"��";
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
  �޸�ѧ������:
  <br><br>
 
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
          <tr><td>������ţ�</td><td><input name='jifangbianhao' type='text' id='jifangbianhao' value='<%= mmm.get("jifangbianhao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>�������ƣ�</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' value='<%= mmm.get("jifangmingcheng")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>ѧ�ţ�</td><td><input name='xuehao' type='text' id='xuehao' value='<%= mmm.get("xuehao")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>������</td><td><input name='xingming' type='text' id='xingming' value='<%= mmm.get("xingming")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>�༶��</td><td><input name='banji' type='text' id='banji' value='<%= mmm.get("banji")%>' style='border:solid 1px #000000; color:#666666' /></td></tr>     <tr><td>ʹ�����ڣ�</td><td><input name='shiyongriqi' type='text' id='shiyongriqi' value='<%= mmm.get("shiyongriqi")%>' onclick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" readonly='readonly'  /></td></tr>     <tr><td>������λ��</td><td><select name='shenqingzuowei' id='shenqingzuowei'><option value="1��">1��</option><option value="2��">2��</option><option value="3��">3��</option><option value="4��">4��</option><option value="5��">5��</option><option value="6��">6��</option><option value="7��">7��</option><option value="8��">8��</option><option value="9��">9��</option><option value="10��">10��</option><option value="11��">11��</option><option value="12��">12��</option></select></td></tr><script language="javascript">document.form1.shenqingzuowei.value='<%=mmm.get("shenqingzuowei")%>';</script>     <tr style='display:none'><td>�ظ���</td><td><input name='huifu' type='text' id='huifu' size='50' value='<%=mmm.get("huifu")%>' style='border:solid 1px #000000; color:#666666'/></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="�ύ" onClick="return checkform();" />
      <input type="reset" name="Submit2" value="����" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


