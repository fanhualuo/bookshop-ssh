<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/manager/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/manager/css/main.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/manager/js/libs/modernizr.min.js"></script>
<title>用户管理</title>
</head>
<body>
	<div class="main-wrap">

		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index.html">首页</a><span
					class="crumb-step">&gt;</span><span class="crumb-name">用户管理</span>
			</div>
		</div>

		<div class="result-wrap">
			<form name="myform" id="myform" method="post">

				<div class="result-content">
					<table class="result-tab" width="100%">
						<tr>

							<th>用户ID</th>
							<th>用户名</th>
							<th>密码</th>
							<th>密保问题</th>
							<th>密保答案</th>
							<th>权限</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${users}" var="user">
							<tr>
								<td>${user.id}</td>
								<td>${user.username}</td>
								<td>${user.password}</td>
								<td>${user.question}</td>
								<td>${user.answer}</td>
								<td>${user.quanxian}</td>
								<td><a class="link-del" href="orderManager_find_user?user.id=${user.id}">用户订单</a>&nbsp; <a
									class="link-update" href="userManager_updatejsp?id=${user.id}">修改</a>&nbsp; <a
									class="link-del" href="userManager_delete?id=${user.id}">删除</a></td>
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