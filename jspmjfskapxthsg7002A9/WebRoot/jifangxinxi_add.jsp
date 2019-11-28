<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    
    <title>机房信息</title>
	<!--bixanjxiqxi-->
	<LINK href="css.css" type=text/css rel=stylesheet>
    <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	   
  </head>
<%
  String id="";


   %>
<script language="javascript">

function gow()
{
	document.location.href="jifangxinxi_add.jsp?id=<%=id%>";
}
</script>
<!--hxsglxiangdxongjxs-->
 <% 
HashMap ext = new HashMap(); 
if(request.getParameter("f")!=null){
//wxfladd
//qiuji
//youshenhe
//youzhifu
//jitihuan

}
new CommDAO().insert(request,response,"jifangxinxi",ext,true,false,""); 
%>

  <body >
 <form  action="jifangxinxi_add.jsp?f=f&id=<%=id%>"  method="post" name="form1"  onsubmit="return checkform();">
  添加机房信息:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">
		<tr><td  width="200">机房编号：</td><td><input name='jifangbianhao' type='text' id='jifangbianhao' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabeljifangbianhao' /></td></tr>
		<tr><td  width="200">机房名称：</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' value='' onblur='checkform()' size='50' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabeljifangmingcheng' /></td></tr>
		<tr><td  width="200">容量：</td><td><input name='rongliang' type='text' id='rongliang' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelrongliang' /></td></tr>
		
		
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交"  style='border:solid 1px #000000; color:#666666' />
      <input type="reset" name="Submit2" value="重置" style='border:solid 1px #000000; color:#666666' /></td>
    </tr>
  </table>
</form>

  </body>
</html>

<!--suxilxatxihuxan-->


<script language=javascript src='js/My97DatePicker/WdatePicker.js'></script>
<script language=javascript src='js/ajax.js'></script>

<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.HashMap"%> 

<script language=javascript >  
 
 function checkform(){  
 
	var jifangbianhaoobj = document.getElementById("jifangbianhao"); if(jifangbianhaoobj.value==""){document.getElementById("clabeljifangbianhao").innerHTML="&nbsp;&nbsp;<font color=red>请输入机房编号</font>";return false;}else{document.getElementById("clabeljifangbianhao").innerHTML="  "; } 
	var jifangbianhaoobj = document.getElementById("jifangbianhao");  
if(jifangbianhaoobj.value!=""){  
var ajax = new AJAX();
ajax.post("factory/checkno.jsp?table=jifangxinxi&col=jifangbianhao&value="+jifangbianhaoobj.value+"&checktype=insert&ttime=<%=Info.getDateStr()%>") 
var msg = ajax.getValue();
if(msg.indexOf('Y')>-1){
document.getElementById("clabeljifangbianhao").innerHTML="&nbsp;&nbsp;<font color=red>机房编号已存在</font>";  
return false;
}else{document.getElementById("clabeljifangbianhao").innerHTML="  ";  
}  
} 
	var jifangmingchengobj = document.getElementById("jifangmingcheng"); if(jifangmingchengobj.value==""){document.getElementById("clabeljifangmingcheng").innerHTML="&nbsp;&nbsp;<font color=red>请输入机房名称</font>";return false;}else{document.getElementById("clabeljifangmingcheng").innerHTML="  "; } 
	var rongliangobj = document.getElementById("rongliang"); if(rongliangobj.value==""){document.getElementById("clabelrongliang").innerHTML="&nbsp;&nbsp;<font color=red>请输入容量</font>";return false;}else{document.getElementById("clabelrongliang").innerHTML="  "; } 
	var zhuangtaiobj = document.getElementById("zhuangtai"); if(zhuangtaiobj.value==""){document.getElementById("clabelzhuangtai").innerHTML="&nbsp;&nbsp;<font color=red>请输入状态</font>";return false;}else{document.getElementById("clabelzhuangtai").innerHTML="  "; } 
	


return true;   
}   
popheight=450;
</script>  


