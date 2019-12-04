<%@page import="com.mine.pojo.Goods"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>您的足迹</title>
</head>
<body>
	<div style="width: 80%;margin:0 auto;text-align: center">
	<h1>您的足迹</h1>
	<%	
		String value = "";
		Cookie[] cookies = request.getCookies();
		if(cookies == null){
	%>
		<h1>sorry，您暂无浏览记录</h1>
	<%
		}else{
			boolean found = false;
			for(int i = 0;i < cookies.length;i++){
				if("history".equals(cookies[i].getName())){
					value = cookies[i].getValue();
					found = true;
				}
			}
			if(!found){
	%>
		<h1>sorry，您暂无浏览记录</h1>
	<%
			}
		}
		if(!"".equals(value)){
			String[] id = value.split("&");
			List<Goods> list = (List<Goods>)this.getServletContext().getAttribute("goods");
			for(int j = 0;j < id.length;j++){
				for(int k = 0;k < list.size();k++){
					if(id[j].equals(list.get(k).getId()+"")){
	%>
						<div style="width: 30%;margin:0 auto;display: inline-block;background-color:#F0F0F0">
							<table width="100%">
								<tr style="border: solid">
									<td colspan="3"><img src="<%=list.get(k).getImg() %>"/></td>
								</tr>
								<tr>
									<td colspan="3"><a href="/Cookie_Session/desc.jsp?id=<%=list.get(k).getId() %>"><%=list.get(k).getDesc() %></a></td>
								</tr>
								<tr>
									<td colspan="2"><%=list.get(k).getPrice() %></td>
									<td>包邮</td>
								</tr>
							</table>
						</div>
	<%
					}
				}
			}
		}
	%>
		<br/>
		<a href="/Cookie_Session/index.jsp">返回男装首页</a>
	</div>
</body>
</html>