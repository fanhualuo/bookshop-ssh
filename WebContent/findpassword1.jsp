<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>找回密码1</title>
</head>
<body>
	<h2>
		<s:actionerror />
	</h2>
	<form action="user_findpassword1" method="post">
		要找回的用户名：<input type="text" name="username" /><br /> <input
			type="submit" value="提交" /><br />
	</form>

	<br />
	<a href="index.jsp">登录</a>
	<br />
	<br />
</body>
</html>