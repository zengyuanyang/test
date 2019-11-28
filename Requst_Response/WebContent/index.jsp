<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="/Requst_Response/response5">
		用户名：<input type="text" name="username"/><br/>
		密&nbsp&nbsp&nbsp&nbsp码：<input type="password" name="pwd"/><br/>
		验证码：<input type="text" name="validatecode"/><img style="border: solid" src="/Requst_Response/response4"/><br/>
		<input type="submit" name="submit" value="提交"/>
	</form>
</body>
</html>