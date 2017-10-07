<%@page import="java.util.List"%>
<%@page import="com.bean.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
</head>
<body>
<h2><a href="order_show">${user.username}的个人信息</a></h2>
<h2><a href="book_findall">查询图书</a></h2>
	<h1>我的购物车</h1>
	<table border="1px">
		<tr>
			<th>图书编号</th>
			<th>名称</th>
			<th>单价</th>
			<th>数量</th>
		</tr>
		<c:forEach items="${gouwuche}" var="order">
			<tr>
				<th>${order.book.id}</th>
				<th>${order.book.bookname}</th>
				<th>${order.book.price}</th>
				<th>${order.number}</th>
				<th><a href="gouwuche_delete?bookid=${order.book.id}">删除</a></th>
			</tr>
		</c:forEach>
	</table>
	<br />
	<%
		if (session.getAttribute("orders") != null&&((List<Order>)session.getAttribute("orders")).size()!=0) {
	%>
	<a href="${pageContext.request.contextPath}/user/ordersubmit.jsp">结算购买</a>
	<%
		}
	%>

</body>
</html>