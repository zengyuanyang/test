<%@page import="java.util.ArrayList"%>
<%@page import="com.mine.pojo.Goods"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>您的购物车</title>
</head>
<body>
	<div style="width: 80%;margin:0 auto;text-align: center">
		<h1>您的购物车</h1>
		<%
		List<Goods> contextList = (List<Goods>)this.getServletContext().getAttribute("goods");
		if(request.getParameter("id") == null){
			List<Goods> list = (List<Goods>)request.getSession().getAttribute("shopcar");
			if(list == null){
		%>
				<h2>您还未添加任何商品</h2>
		<%
			}else{
				for(Goods goods : list){
		%>
					<div style="width: 30%;margin:0 auto;display: inline-block;background-color:#F0F0F0">
					<table width="100%">
						<tr style="border: solid">
							<td colspan="3"><img src="<%=goods.getImg() %>"/></td>
						</tr>
						<tr>
							<td colspan="3"><a href="/Cookie_Session/desc.jsp?id=<%=goods.getId() %>"><%=goods.getDesc() %></a></td>
						</tr>
						<tr>
							<td colspan="2"><%=goods.getPrice() %></td>
							<td>数量：<%=goods.getCount() %></td>
						</tr>
					</table>
				</div>
		<%
				}
			}
		}else{
			List<Goods> list2 = (List<Goods>)request.getSession().getAttribute("shopcar");
			if(list2 == null){
				list2 = new ArrayList<Goods>();
				for(Goods goods : contextList){
					if(request.getParameter("id").equals(goods.getId()+"")){
						list2.add(goods);
					}
				}
			}else{
				boolean had = false;
				for(Goods goods : list2){
					if(request.getParameter("id").equals(goods.getId()+"")){
						had = true;
						goods.setCount(goods.getCount()+1);
					}
				}
				if(!had){
					for(Goods goods : contextList){
						if(request.getParameter("id").equals(goods.getId()+"")){
							list2.add(goods);
						}
					}
				}
			}
			request.getSession().setAttribute("shopcar", list2);
			for(Goods goods : list2){
		%>
					<div style="width: 30%;margin:0 auto;display: inline-block;background-color:#F0F0F0">
						<table width="100%">
							<tr style="border: solid">
								<td colspan="3"><img src="<%=goods.getImg() %>"/></td>
							</tr>
							<tr>
								<td colspan="3"><a href="/Cookie_Session/desc.jsp?id=<%=goods.getId() %>"><%=goods.getDesc() %></a></td>
							</tr>
							<tr>
								<td colspan="2"><%=goods.getPrice() %></td>
								<td>数量：<%=goods.getCount() %></td>
							</tr>
						</table>
					</div>
		<%
			}
		}
		%>
		<br/>
		<a href="index.jsp">返回商城首页</a>
	</div>
</body>
</html>