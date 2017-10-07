<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>
</head>
<body>
	<form action="user_update" method="post">
	<input type="hidden" value="${user.quanxian}">
		用户名：<input type="text" name="username" value="${user.username}" /><br />
		密码：<input type="password" name="password" value="${user.password}" /><br />
		密保问题：<input type="text" name="question" value="${user.question}" /><br />
		答案：<input type="text" name="answer" value="${user.answer}" /><br /> <input
			type="submit" value="提交" /><br />
	</form>

</body>
</html>