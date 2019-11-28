<%@page import="com.mine.servlet.Goods"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>男装</title>
</head>
<body>
	<div style="width: 80%;margin:0 auto;text-align: center">
	<%
		List<Goods> list = (List<Goods>)this.getServletContext().getAttribute("goods");
		for(int i = 0;i < list.size();i++){
	%>
	
		<div style="width: 30%;margin:0 auto;display: inline-block;background-color:#F0F0F0">
			<table width="100%">
				<tr style="border: solid">
					<td colspan="3"><img src="<%=list.get(i).getImg() %>"/></td>
				</tr>
				<tr>
					<td colspan="3"><%=list.get(i).getDesc() %></td>
				</tr>
				<tr>
					<td colspan="2"><%=list.get(i).getPrice() %></td>
					<td>包邮</td>
				</tr>
			</table>
		</div>
		
		<%}%>
	</div>
</body>
</html>