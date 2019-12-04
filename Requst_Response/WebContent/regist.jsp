<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
	<div style="border:solid;width:30%;margin:0 auto">
	<form action="/Requst_Response/request" method="get">
		<label>用户名：</label><input type="text" name="userName" /><br/>
		<label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label><input type="password" name="userPwd" /><br/>
		<label>性&nbsp;&nbsp;&nbsp;&nbsp;别：</label><input type="radio" name="userSex" value="男"/>男<input type="radio" name="userSex" value="女"/>女<br/>
		<label>爱&nbsp;&nbsp;&nbsp;&nbsp;好：</label>
			<input type="checkbox" name="userHobby" value="唱歌"/>唱歌
			<input type="checkbox" name="userHobby" value="跳舞"/>跳舞
			<input type="checkbox" name="userHobby" value="运动"/>运动
			<input type="checkbox" name="userHobby" value="喝酒"/>喝酒<br/>
		<label>城&nbsp;&nbsp;&nbsp;&nbsp;市：</label>
			<select name="userCity">
				<option value="成都">成都</option>
				<option value="射洪">射洪</option>
				<option value="上海">上海</option>
				<option value="绵阳">绵阳</option>
			</select><br/>
		<div style="text-align: center">
			<input type="submit" value="提交"/>
		</div>
	</form>
	</div>
</body>
</html>