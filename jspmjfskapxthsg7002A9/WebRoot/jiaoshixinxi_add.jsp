<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    
    <title>��ʦ��Ϣ</title>
	<!--bixanjxiqxi-->
	<LINK href="css.css" type=text/css rel=stylesheet>
    <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	   
  </head>
<%
//xuxyaxodenxglxu
  String id="";
 //islbd1q id=request.getParameter("id");
 //islbd1q HashMap mlbdq = new CommDAO().getmap(id,"melieibaoduqubiaoiguo");
 //islbd2q HashMap mlbdq = new CommDAO().getmaps("hsgzhujian",(String)request.getSession().getAttribute("username"),"melieibaoduqubiaoiguo");
 //islbdq gogogogogo
 //islbdq lelelelelele

   %>
<script language="javascript">

function gow()
{
	document.location.href="jiaoshixinxi_add.jsp?id=<%=id%>";
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
new CommDAO().insert(request,response,"jiaoshixinxi",ext,true,false,""); 
%>

  <body >
 <form  action="jiaoshixinxi_add.jsp?f=f&id=<%=id%>"  method="post" name="form1"  onsubmit="return checkform();">
  ��ӽ�ʦ��Ϣ:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">
		<tr><td  width="200">��ʦ�ţ�</td><td><input name='jiaoshihao' type='text' id='jiaoshihao' onblur='checkform()' style='border:solid 1px #000000; color:#666666' value=''  />&nbsp;*<label id='clabeljiaoshihao' /></td></tr>
		<tr><td  width="200">���룺</td><td><input name='mima' type='text' id='mima' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelmima' /></td></tr>
		<tr><td  width="200">��ʦ������</td><td><input name='jiaoshixingming' type='text' id='jiaoshixingming' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabeljiaoshixingming' /></td></tr>
		<tr><td>�Ա�</td><td><select name='xingbie' id='xingbie'><option value="��">��</option><option value="Ů">Ů</option></select>&nbsp;*<label id='clabelxingbie' /></td></tr>
		<tr><td width="200">�������£�</td><td><input name='chushengnianyue' type='text' id='chushengnianyue' value='' onblur='checkform()' readonly='readonly' onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" style='width:100px; height:16px; border:solid 1px #000000; color:#666666'/>&nbsp;*<label id='clabelchushengnianyue' /></td></tr>
		<tr><td  width="200">���䣺</td><td><input name='gongling' type='text' id='gongling' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelgongling' /></td></tr>
		<tr><td>ְ�ƣ�</td><td><select name='zhicheng' id='zhicheng'><option value="�߼�">�߼�</option><option value="�м�">�м�</option><option value="����">����</option></select>&nbsp;*<label id='clabelzhicheng' /></td></tr>
		<tr><td  width="200">�ֻ���</td><td><input name='shouji' type='text' id='shouji' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelshouji' /></td></tr>
		<tr><td  width="200">���䣺</td><td><input name='youxiang' type='text' id='youxiang' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelyouxiang' /></td></tr>
		<tr><td  width="200">��ע��</td><td><textarea name='beizhu' cols='50' rows='5' id='beizhu' onblur='' style='border:solid 1px #000000; color:#666666' ></textarea></td></tr>
		
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="�ύ"  style='border:solid 1px #000000; color:#666666' />
      <input type="reset" name="Submit2" value="����" style='border:solid 1px #000000; color:#666666' /></td>
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
 
	var jiaoshihaoobj = document.getElementById("jiaoshihao"); if(jiaoshihaoobj.value==""){document.getElementById("clabeljiaoshihao").innerHTML="&nbsp;&nbsp;<font color=red>�������ʦ��</font>";return false;}else{document.getElementById("clabeljiaoshihao").innerHTML="  "; } 
	var jiaoshihaoobj = document.getElementById("jiaoshihao");  
if(jiaoshihaoobj.value!=""){  
var ajax = new AJAX();
ajax.post("factory/checkno.jsp?table=jiaoshixinxi&col=jiaoshihao&value="+jiaoshihaoobj.value+"&checktype=insert&ttime=<%=Info.getDateStr()%>") 
var msg = ajax.getValue();
if(msg.indexOf('Y')>-1){
document.getElementById("clabeljiaoshihao").innerHTML="&nbsp;&nbsp;<font color=red>��ʦ���Ѵ���</font>";  
return false;
}else{document.getElementById("clabeljiaoshihao").innerHTML="  ";  
}  
} 
	var mimaobj = document.getElementById("mima"); if(mimaobj.value==""){document.getElementById("clabelmima").innerHTML="&nbsp;&nbsp;<font color=red>����������</font>";return false;}else{document.getElementById("clabelmima").innerHTML="  "; } 
	var jiaoshixingmingobj = document.getElementById("jiaoshixingming"); if(jiaoshixingmingobj.value==""){document.getElementById("clabeljiaoshixingming").innerHTML="&nbsp;&nbsp;<font color=red>�������ʦ����</font>";return false;}else{document.getElementById("clabeljiaoshixingming").innerHTML="  "; } 
	var xingbieobj = document.getElementById("xingbie"); if(xingbieobj.value==""){document.getElementById("clabelxingbie").innerHTML="&nbsp;&nbsp;<font color=red>�������Ա�</font>";return false;}else{document.getElementById("clabelxingbie").innerHTML="  "; } 
	var chushengnianyueobj = document.getElementById("chushengnianyue"); if(chushengnianyueobj.value==""){document.getElementById("clabelchushengnianyue").innerHTML="&nbsp;&nbsp;<font color=red>�������������</font>";return false;}else{document.getElementById("clabelchushengnianyue").innerHTML="  "; } 
	var gonglingobj = document.getElementById("gongling"); if(gonglingobj.value==""){document.getElementById("clabelgongling").innerHTML="&nbsp;&nbsp;<font color=red>�����빤��</font>";return false;}else{document.getElementById("clabelgongling").innerHTML="  "; } 
	var gonglingobj = document.getElementById("gongling"); if(gonglingobj.value!=""){ if(/^(\+|-)?(0|[1-9]\d*)(\.\d*[1-9])?$/.test(gonglingobj.value)){document.getElementById("clabelgongling").innerHTML=""; }else{document.getElementById("clabelgongling").innerHTML="&nbsp;&nbsp;<font color=red>����������</font>"; return false;}}  
    var zhichengobj = document.getElementById("zhicheng"); if(zhichengobj.value==""){document.getElementById("clabelzhicheng").innerHTML="&nbsp;&nbsp;<font color=red>������ְ��</font>";return false;}else{document.getElementById("clabelzhicheng").innerHTML="  "; } 
	var shoujiobj = document.getElementById("shouji"); if(shoujiobj.value==""){document.getElementById("clabelshouji").innerHTML="&nbsp;&nbsp;<font color=red>�������ֻ�</font>";return false;}else{document.getElementById("clabelshouji").innerHTML="  "; } 
	var shoujiobj = document.getElementById("shouji"); if(shoujiobj.value!=""){ if(/^1[3|4|5|8][0-9]\d{4,8}$/.test(shoujiobj.value)){document.getElementById("clabelshouji").innerHTML=""; }else{document.getElementById("clabelshouji").innerHTML="&nbsp;&nbsp;<font color=red>�����ֻ���ʽ</font>"; return false;}}  
    var youxiangobj = document.getElementById("youxiang"); if(youxiangobj.value==""){document.getElementById("clabelyouxiang").innerHTML="&nbsp;&nbsp;<font color=red>����������</font>";return false;}else{document.getElementById("clabelyouxiang").innerHTML="  "; } 
	var youxiangobj = document.getElementById("youxiang"); if(youxiangobj.value!=""){ if(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/.test(youxiangobj.value)){document.getElementById("clabelyouxiang").innerHTML=""; }else{document.getElementById("clabelyouxiang").innerHTML="&nbsp;&nbsp;<font color=red>���������ʽ</font>"; return false;}}  
    


return true;   
}   
popheight=450;
</script>  


