<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    
    <title>ѧ������</title>
	
	<LINK href="css.css" type=text/css rel=stylesheet>
    <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	   
  </head>
<%
  String id="";
  id=request.getParameter("id");
 HashMap mlbdq = new CommDAO().getmap(id,"jifangxinxi");
 String jifangbianhao="";  	String jifangmingcheng="";  	
 jifangbianhao=(String)mlbdq.get("jifangbianhao");  	jifangmingcheng=(String)mlbdq.get("jifangmingcheng");  	 
 

 HashMap mssdq = new CommDAO().getmaps("xuehao",(String)request.getSession().getAttribute("username"),"xueshengxinxi");
 String xuehao="";  	String xingming="";  	String banji="";  	
 xuehao=(String)mssdq.get("xuehao");  	xingming=(String)mssdq.get("xingming");  	banji=(String)mssdq.get("banji");  	
   %>
<script language="javascript">

function gow()
{
	document.location.href="xueshengshenqing_add.jsp?id=<%=id%>";
}
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

 <% 
HashMap ext = new HashMap(); 
if(request.getParameter("f")!=null){



ext.put("issh","��");



new CommDAO().insert(request,response,"xueshengshenqing",ext,true,false,""); 

}

%>

  <body >
 <form  action="xueshengshenqing_add.jsp?f=f&id=<%=id%>"  method="post" name="form1"  onsubmit="return checkform();">
  ���ѧ������:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">
		<tr><td  width="200">������ţ�</td><td><input name='jifangbianhao' type='text' id='jifangbianhao' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.jifangbianhao.value='<%=jifangbianhao%>';document.form1.jifangbianhao.setAttribute("readOnly",'true');</script>		<tr><td  width="200">�������ƣ�</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.jifangmingcheng.value='<%=jifangmingcheng%>';document.form1.jifangmingcheng.setAttribute("readOnly",'true');</script>		<tr><td  width="200">ѧ�ţ�</td><td><input name='xuehao' type='text' id='xuehao' onblur='' style='border:solid 1px #000000; color:#666666' value='<%=request.getSession().getAttribute("username")%>' readonly="readonly" /></td></tr><script language="javascript">document.form1.xuehao.value='<%=xuehao%>';document.form1.xuehao.setAttribute("readOnly",'true');</script>		<tr><td  width="200">������</td><td><input name='xingming' type='text' id='xingming' value='' onblur='' style='border:solid 1px #000000; color:#666666' /></td></tr><script language="javascript">document.form1.xingming.value='<%=xingming%>';document.form1.xingming.setAttribute("readOnly",'true');</script>		<tr><td  width="200">�༶��</td><td><input name='banji' type='text' id='banji' value='' onblur='' style='border:solid 1px #000000; color:#666666' /></td></tr><script language="javascript">document.form1.banji.value='<%=banji%>';document.form1.banji.setAttribute("readOnly",'true');</script>		<tr><td width="200">ʹ�����ڣ�</td><td><input name='shiyongriqi' type='text' id='shiyongriqi' value='' onblur='' readonly='readonly' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" style='width:100px; height:16px; border:solid 1px #000000; color:#666666'/></td></tr>		<tr><td>������λ��</td><td><select name='shenqingzuowei' id='shenqingzuowei'><option value="1��">1��</option><option value="2��">2��</option><option value="3��">3��</option><option value="4��">4��</option><option value="5��">5��</option><option value="6��">6��</option><option value="7��">7��</option><option value="8��">8��</option><option value="9��">9��</option><option value="10��">10��</option><option value="11��">11��</option><option value="12��">12��</option></select></td></tr>		<tr style='display:none'><td  width="200">�ظ���</td><td><input name='huifu' type='text' id='huifu' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666' /></td></tr>		
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="�ύ"  style='border:solid 1px #000000; color:#666666' />
      <input type="reset" name="Submit2" value="����" style='border:solid 1px #000000; color:#666666' /></td>
    </tr>
  </table>
</form>

  </body>
</html>




<script language=javascript src='js/ajax.js'></script>

<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.HashMap"%> 

<script language=javascript >  
 
 function checkform(){  
 
	


return true;   
}   
popheight=450;
</script>  


