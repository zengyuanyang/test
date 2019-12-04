<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath }/css/calendar.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/css/calendar.js"></script>
<title>用户注册</title>
</head>
<body>
	<div style="border:solid;width:30%;margin:0 auto">
		<form action="${pageContext.request.contextPath }/registerservlet.action" method="post">
			<label>用户名：</label><input type="text" name="userName" /><br/>
			<label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label><input type="password" name="userPwd" /><br/>
			<label>性&nbsp;&nbsp;&nbsp;&nbsp;别：</label><input type="radio" name="userSex" value="1"/>男<input type="radio" name="userSex" value="0"/>女<br/>
			<label>生&nbsp;&nbsp;&nbsp;&nbsp;日：</label><input type="text"  name="userBirthday" id="birthday" onclick="return showCalendar('birthday', 'y-mm-dd');"/><br/>
			<label>邮&nbsp;&nbsp;&nbsp;&nbsp;箱：</label><input type="text" name="userEmail"/><br/>
			<div style="text-align: center">
				<input type="submit" value="注册"/>
			</div>
		</form>
	</div>
</body>
</html>