<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>填写订单信息</title>
</head>
<body>
	<h2>
		<a href="order_show">${user.username}的个人信息</a>
	</h2>
	<h2>
		<a href="book_findall">查询图书</a>
	</h2>
	<form action="order_submit">
		电话：<input type="text" name="phone"><br /> 收货地址：<input
			type="text" name="address"><br /> <input type="submit"
			value="提交"><br />
	</form>
</body>
</html>