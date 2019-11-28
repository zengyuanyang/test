<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    
    <title>排课</title>
	<!--bixanjxiqxi-->
	<LINK href="css.css" type=text/css rel=stylesheet>
    <script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	   
  </head>
<%
//xuxyaxodenxglxu
  String id="";
  id=request.getParameter("id");
  HashMap mlbdq = new CommDAO().getmap(id,"kechengxinxi");
 //islbd2q HashMap mlbdq = new CommDAO().getmaps("kechengbianhao",(String)request.getSession().getAttribute("username"),"kechengxinxi");
  String kechengbianhao="";
  	String kechengmingcheng="";
  	String zhuanye="";
  	
  kechengbianhao=(String)mlbdq.get("kechengbianhao");
  	kechengmingcheng=(String)mlbdq.get("kechengmingcheng");
  	zhuanye=(String)mlbdq.get("zhuanye");
  	

   %>
   
   <%
  
String sql3=  "select * from paike where kechengbianhao='"+request.getParameter("kechengbianhao")+"' and jiaoshihao='"+request.getParameter("jiaoshihao")+"' and xingqi='"+request.getParameter("xingqi")+"' and shiduan='"+request.getParameter("shiduan")+"' ";
CommDAO dao = new CommDAO();
  List<HashMap> userlist1 = dao.select(sql3);

  if(userlist1.size()==1)
{
	out.print("<script>alert('对不起,此时间段已经排好了!');location.href='sy.jsp';</script>");
	return;
}


   %>

<script language="javascript">

function gow()
{
	document.location.href="paike_add.jsp?id=<%=id%>&jifangbianhao="+document.form1.jifangbianhao.value+"&jiaoshihao="+document.form1.jiaoshihao.value;
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
new CommDAO().insert(request,response,"paike",ext,true,false,""); 
%>

  <body >
 <form  action="paike_add.jsp?f=f&id=<%=id%>"  method="post" name="form1"  onsubmit="return checkform();">
  添加排课:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">
		<tr><td  width="200">课程编号：</td><td><input name='kechengbianhao' type='text' id='kechengbianhao' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666'  readonly='readonly' />&nbsp;*<label id='clabelkechengbianhao' /></td></tr><script language="javascript">document.form1.kechengbianhao.value='<%=kechengbianhao%>';</script>
		<tr><td  width="200">课程名称：</td><td><input name='kechengmingcheng' type='text' id='kechengmingcheng' value='' onblur='checkform()' size='50' style='border:solid 1px #000000; color:#666666'  readonly='readonly' />&nbsp;*<label id='clabelkechengmingcheng' /></td></tr><script language="javascript">document.form1.kechengmingcheng.value='<%=kechengmingcheng%>';</script>
		<tr><td  width="200">专业：</td><td><input name='zhuanye' type='text' id='zhuanye' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.zhuanye.value='<%=zhuanye%>';</script>
		<tr><td>机房编号：</td><td><%=Info.getselectsl("jifangbianhao","jifangxinxi","jifangbianhao")%></td></tr>
		<tr><td  width="200">机房名称：</td><td><input name='jifangmingcheng' type='text' id='jifangmingcheng' style='border:solid 1px #000000; color:#666666' ></td></tr>
		<tr><td>星期：</td><td><select name='xingqi' id='xingqi'><option value="周一">周一</option><option value="周二">周二</option><option value="周三">周三</option><option value="周四">周四</option><option value="周五">周五</option><option value="周六">周六</option><option value="周日">周日</option></select>&nbsp;*<label id='clabelxingqi' /></td></tr>
		<tr><td>时段：</td><td><select name='shiduan' id='shiduan'>
		  <option value="8:00-9:40">8:00-9:40</option>
		  <option value="10:00-11:40">10:00-11:40</option>
		  <option value="14:00-15:40">14:00-15:40</option>
		  <option value="16:00-17:40">16:00-17:40</option>
		  <option value="19:00-20:40">19:00-20:40</option>
		</select>&nbsp;*<label id='clabelshiduan' /></td></tr>
		<tr><td>教师号：</td><td><%=Info.getselectsl("jiaoshihao","jiaoshixinxi","jiaoshihao")%></td></tr>
		<tr><td  width="200">教师姓名：</td><td><input name='jiaoshixingming' type='text' id='jiaoshixingming' style='border:solid 1px #000000; color:#666666' ></td></tr>
		
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交"  style='border:solid 1px #000000; color:#666666' />
      <input type="reset" name="Submit2" value="重置" style='border:solid 1px #000000; color:#666666' /></td>
    </tr>
  </table>
</form>

  </body>
</html>

<%
if(request.getParameter("jifangbianhao")==null || request.getParameter("jifangbianhao").equals("")){}else{

HashMap mmm = new CommDAO().getmaps("jifangbianhao",request.getParameter("jifangbianhao"),"jifangxinxi"); 
%>
<script language="javascript">
document.form1.jifangbianhao.value="<%=mmm.get("jifangbianhao")%>";
document.form1.jifangmingcheng.value="<%=mmm.get("jifangmingcheng")%>";
//suilafuzhi

</script>
<%
}
%>
<%
if(request.getParameter("jiaoshihao")==null || request.getParameter("jiaoshihao").equals("")){}else{

HashMap mmm = new CommDAO().getmaps("jiaoshihao",request.getParameter("jiaoshihao"),"jiaoshixinxi"); 
%>
<script language="javascript">
document.form1.jiaoshihao.value="<%=mmm.get("jiaoshihao")%>";
document.form1.jiaoshixingming.value="<%=mmm.get("jiaoshixingming")%>";
//suilafuzhi

</script>
<%
}
%>
<!--suxilxatxihuxan-->


<script language=javascript src='js/My97DatePicker/WdatePicker.js'></script>
<script language=javascript src='js/ajax.js'></script>

<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.HashMap"%> 

<script language=javascript >  
 
 function checkform(){  
 
	var kechengbianhaoobj = document.getElementById("kechengbianhao"); if(kechengbianhaoobj.value==""){document.getElementById("clabelkechengbianhao").innerHTML="&nbsp;&nbsp;<font color=red>请输入课程编号</font>";return false;}else{document.getElementById("clabelkechengbianhao").innerHTML="  "; } 
	var kechengmingchengobj = document.getElementById("kechengmingcheng"); if(kechengmingchengobj.value==""){document.getElementById("clabelkechengmingcheng").innerHTML="&nbsp;&nbsp;<font color=red>请输入课程名称</font>";return false;}else{document.getElementById("clabelkechengmingcheng").innerHTML="  "; } 
	var xingqiobj = document.getElementById("xingqi"); if(xingqiobj.value==""){document.getElementById("clabelxingqi").innerHTML="&nbsp;&nbsp;<font color=red>请输入星期</font>";return false;}else{document.getElementById("clabelxingqi").innerHTML="  "; } 
	var shiduanobj = document.getElementById("shiduan"); if(shiduanobj.value==""){document.getElementById("clabelshiduan").innerHTML="&nbsp;&nbsp;<font color=red>请输入时段</font>";return false;}else{document.getElementById("clabelshiduan").innerHTML="  "; } 
	


return true;   
}   
popheight=450;
</script>  


