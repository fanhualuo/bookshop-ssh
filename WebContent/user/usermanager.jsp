<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息</title>
</head>
<body>
<h2><a href="book_findall">查询图书</a>&nbsp;&nbsp;&nbsp;&nbsp;

<a href="${pageContext.request.contextPath}/user/updateuser.jsp">修改个人信息</a>&nbsp;&nbsp;&nbsp;&nbsp;

<a href="${pageContext.request.contextPath}/user_logon">退出</a>
</h2>


<h1>我的信息</h1> 
	<table border="1px">
		<tr>
			<th>用户编号：</th><th>${user.id}</th>
			<th>用户名</th><th>${user.username}</th>
		</tr>


	</table>
	
	<h1>我的订单</h1>
	<table border="1px">
		<tr>
			<th>图书编号</th>
			<th>名称</th>
			<th>价格</th>
			<th>数量</th>
			<th>收货地址</th>
			<th>状态</th>
		</tr>
		<c:forEach items="${dingdan}" var="order">
			<tr>
				<th>${order.book.id}</th>
				<th>${order.book.bookname}</th>
				<th>${order.book.price}</th>
				<th>${order.number}</th>
				<th>${order.address}</th>
				<th>${order.zhuangtai}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>