<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<c:if test="${user != null}">
		<label>欢迎您：${user.userName}</label><a href="${pageContext.request.contextPath }/exituserservlet.action">退出</a>
	</c:if>
	<c:if test="${user == null }">
		<a href="${pageContext.request.contextPath }/login.jsp">登录</a>|<a href="${pageContext.request.contextPath }/register.jsp">注册</a>
	</c:if>
	<table>
		<thead>
			<th>编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>邮箱</th>
			<th>生日</th>
			<th>编辑</th>
		</thead>
		<tbody>
		<c:forEach var="user" items="${allUser }">
			<tr>
				<td>${user.userId }</td>
				<td>${user.userName }</td>
				<td>${user.userSex }</td>
				<td>${user.userEmail }</td>
				<td>${user.userBirthday }</td>
				<td>
					<a href="${pageContext.request.contextPath }/updatereadyservlet.action?userId=${user.userId}">修改</a>|
					<a href="${pageContext.request.contextPath }/deleteuserservlet.action?userId=${user.userId}">删除</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>