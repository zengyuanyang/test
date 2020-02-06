<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("input[type='button']").click(function(){
			alert(123);
		});
	});
</script>
</head>
<body>
	<form action="javascript:void(0)">
		<input type="text" name="userName" id="userName" />
		<input type="password" name="userPwd" id="userPwd" />
		<input type="text" name="userAge" id="userAge" />
		<input type="button" value="点击" />
	</form>
</body>
</html>