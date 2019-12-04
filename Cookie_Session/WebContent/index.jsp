<%@page import="com.mine.pojo.Goods"%>
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
					<td colspan="3"><a href="/Cookie_Session/shopcar.jsp?id=<%=list.get(i).getId() %>"><img src="<%=list.get(i).getImg() %>"/></a></td>
				</tr>
				<tr>
					<td colspan="3"><a href="/Cookie_Session/desc.jsp?id=<%=list.get(i).getId() %>"><%=list.get(i).getDesc() %></a></td>
				</tr>
				<tr>
					<td colspan="2"><%=list.get(i).getPrice() %></td>
					<td>包邮</td>
				</tr>
			</table>
		</div>
		
		<%}%>
		<div style="text-align: center">
			<a href="history.jsp">查看浏览记录</a>
			<a href="shopcar.jsp">查看购物车</a>
		</div>
	</div>
</body>
</html>