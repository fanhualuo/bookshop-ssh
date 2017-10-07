<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码3</title>
</head>
<body>
	<h2>
		<s:actionerror />${date}
	</h2>
	
	<form action="user_findpassword3" method="post">
		修改密码：<input type="password" name="password"><br /> <input
			type="submit" value="提交" /><br />
	</form>
	<br />
	<a href="index.jsp">登录</a>
</body>
</html>