<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
</head>
<body>
	<form method="get" action="/Cookie_Session/sessiondemo2">
		用户名：<input type="text" name="userName"/><br/><br/>
		密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="userPwd"/><br/>
		验证码：<input type="text" name="validateCode"/><img style="border: solid" src="/Cookie_Session/sessiondemo1"/><br/>
		<input type="submit" name="submit" value="提交"/>
	</form>
</body>
</html>