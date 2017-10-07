<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>找回密码2</title>
</head>
<body>
<h2 ><s:actionerror/></h2>
<form action="user_findpassword2" method="post">
    回答密保问题：${finduser.question}<br/>
   答案：<input type="text" name="answer" ><br />
    <input type="submit" value="提交" /><br />
</form>
<br />
	<a href="index.jsp">登录</a>
</body>
</html>