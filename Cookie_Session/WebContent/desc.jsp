<%@page import="com.mine.pojo.Goods"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品描述</title>
</head>
<body>
	<%
	List<Goods> list = (List<Goods>)this.getServletContext().getAttribute("goods");
	for(int i = 0;i < list.size();i++){
		if(request.getParameter("id").equals(list.get(i).getId() + "")){
	%>
	当前页面的描述信息为：<%=list.get(i).getDesc() %>
	<%
		}
	}		
			boolean found = false;
			Cookie[] cookies = request.getCookies();
			for(int j = 0;cookies != null && j < cookies.length;j++){
				if("history".equals(cookies[j].getName())){
					found = true;
					boolean foundId =false;
					for(int k = 0;k < cookies[j].getValue().split("&").length;k++){
						if(request.getParameter("id").equals(cookies[j].getValue().split("&")[k])){
							foundId = true;
						}
					}
					if(!foundId){
						Cookie cookie = new Cookie("history",cookies[j].getValue() + "&" + request.getParameter("id"));
						cookie.setPath("/");
						cookie.setMaxAge(60*60*24);
						response.addCookie(cookie);
					}
					//cookies[j].setValue(cookies[j].getValue() + "&" + request.getParameter("id"));
				}
			}
			if(!found){
				Cookie cookie = new Cookie("history", request.getParameter("id"));
				cookie.setPath("/");
				cookie.setMaxAge(60*60*24);
				response.addCookie(cookie);
			}
		
	%>
	<br/>
	<a href="/Cookie_Session/index.jsp">返回男装首页</a>
</body>
</html>