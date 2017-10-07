<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/manager/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/manager/css/main.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/manager/js/libs/modernizr.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="main-wrap">

		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index.html">首页</a><span
					class="crumb-step">&gt;</span><span class="crumb-name">订单管理</span>&gt;<span
					class="crumb-name">修改订单</span>
			</div>
		</div>

		<div class="result-wrap">
			<form name="myform" id="myform" method="post">

				<div class="result-content">
					<table class="result-tab" width="100%">
						<tr>

							<th>订单ID</th>
							<th>订单户名</th>
							<th>订单名称</th>
							<th>单价</th>
							<th>数量</th>
							<th>联系方式</th>
							<th>地址</th>
							<th>状态</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${dingdan}" var="order">
							<tr>
								<td>${order.id}</td>
								<td>${order.user.username}</td>
								<td>${order.book.bookname}</td>
								<td>${order.book.price}</td>
								<td>${order.number}</td>
								<td>${order.phone}</td>
								<td>${order.address}</td>
								<td>${order.zhuangtai}</td>

								<td><a class="link-update" href="orderManager_updatejsp?id=${order.id}">修改</a>&nbsp;
									<a class="link-del" href="orderManager_delete?id=${order.id}">删除</a></td>
							</tr>
						</c:forEach>
					</table>
					<div class="list-page">1 页</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>