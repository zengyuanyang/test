<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="util.Info"%>
<%@page import="dao.CommDAO"%>
<%@page import="util.PageManager"%>
<html>
  <head>
    <title>教师申请详细</title>
    <LINK href="css.css" type=text/css rel=stylesheet>

  </head>

<body>
	<table width="100%" border="1" align="center" cellpadding="3"
		cellspacing="1" bordercolor="#00FFFF"
		style="border-collapse: collapse">
		<p>临时机房安排登记：</p>
		<td>&nbsp;
			<form name="form1" id="form1" method="post" action="">
				教师号：<input name="jiaoshihao" type="text" id="jiaoshihao"
					style='border: solid 1px #000000; color: #666666' size="12" />
				教师姓名：<input name="jiaoshixingming" type="text" id="jiaoshixingming"
					style='border: solid 1px #000000; color: #666666' size="12" />
				课程号：<input name="kechenghao" type="text" id="kechenghao"
					style='border: solid 1px #000000; color: #666666' size="12" />
				课程名称：<input name="kechengmingcheng" type="text" id="kechengmingcheng"
					style='border: solid 1px #000000; color: #666666' size="12" /> 
				<input type="submit" name="Submit" value="提交" onclick="return check();">
			</form>
		</td>
	</table>

</body>
</html>
