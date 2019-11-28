<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    
    <title>教师申请</title>
	
	<LINK href="css.css" type=text/css rel=stylesheet>
    <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	   
  </head>
<%
  String id="";
  id=request.getParameter("id");
 HashMap mlbdq = new CommDAO().getmap(id,"jifangxinxi");
 String jifanghao="";
  	String jifangmingcheng="";
  	
 jifanghao=(String)mlbdq.get("jifanghao");
  	jifangmingcheng=(String)mlbdq.get("jifangmingcheng");
  	 
 

 HashMap mssdq = new CommDAO().getmaps("jiaoshihao",(String)request.getSession().getAttribute("username"),"jiaoshixinxi");
 String jiaoshihao="";
  	String jiaoshixingming="";
  	
 jiaoshihao=(String)mssdq.get("jiaoshihao");
  	jiaoshixingming=(String)mssdq.get("jiaoshixingming");
  	
   %>
<script language="javascript">

function gow()
{
	document.location.href="jiaoshishenqing_add.jsp?id=<%=id%>";
}
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

 <% 
HashMap ext = new HashMap(); 
if(request.getParameter("f")!=null){



ext.put("issh","否");



new CommDAO().insert(request,response,"jiaoshishenqing",ext,true,false,""); 

}

%>

  <body >
 <form  action="jiaoshishenqing_add.jsp?f=f&id=<%=id%>"  method="post" name="form1"  onsubmit="return checkform();">
  添加教师申请:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">
		<tr><td  width="200">机房编号：</td><td><input name='jifanghao' type='text' id='jifanghao' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.jifanghao.value='<%=jifanghao%>';document.form1.jifanghao.setAttribute("readOnly",'true');</script>
		<tr><td  width="200">机房名称：</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.jifangmingcheng.value='<%=jifangmingcheng%>';document.form1.jifangmingcheng.setAttribute("readOnly",'true');</script>
		<tr><td  width="200">教师号：</td><td><input name='jiaoshihao' type='text' id='jiaoshihao' onblur='' style='border:solid 1px #000000; color:#666666' value='<%=request.getSession().getAttribute("username")%>' readonly="readonly" /></td></tr><script language="javascript">document.form1.jiaoshihao.value='<%=jiaoshihao%>';document.form1.jiaoshihao.setAttribute("readOnly",'true');</script>
		<tr><td  width="200">教师姓名：</td><td><input name='jiaoshixingming' type='text' id='jiaoshixingming' value='' onblur='' style='border:solid 1px #000000; color:#666666' /></td></tr><script language="javascript">document.form1.jiaoshixingming.value='<%=jiaoshixingming%>';document.form1.jiaoshixingming.setAttribute("readOnly",'true');</script>
		<tr><td width="200">使用日期：</td><td><input name='shiyongriqi' type='text' id='shiyongriqi' value='' onblur='' readonly='readonly' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" style='width:100px; height:16px; border:solid 1px #000000; color:#666666'/></td></tr>
		<tr style='display:none'><td  width="200">回复：</td><td><input name='huifu' type='text' id='huifu' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666' /></td></tr>
		
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交"  style='border:solid 1px #000000; color:#666666' />
      <input type="reset" name="Submit2" value="重置" style='border:solid 1px #000000; color:#666666' /></td>
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