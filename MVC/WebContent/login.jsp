<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
</head>
<body>
	<div style="border:solid;width:30%;margin:0 auto">
		<form action="${pageContext.request.contextPath }/loginservlet.action" method="post">
			<label>用户名：</label><input type="text" name="userName" /><br/>
			<label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label><input type="password" name="userPwd" /><br/>
			<div style="text-align: center">
				<input type="submit" value="登录"/>
			</div>
		</form>
</body>
</html>