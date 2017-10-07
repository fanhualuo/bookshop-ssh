<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/manager/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/manager/css/main.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/manager/js/libs/modernizr.min.js"></script>

<title></title>
</head>
<body>
	<div class="main-wrap">

		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="index.html">首页</a><span
					class="crumb-step">&gt;</span><span class="crumb-name">图书分类管理</span>
			</div>
		</div>

		<div class="result-wrap">
			<form name="myform" id="myform" method="post">

				<div class="result-content">
					<table class="result-tab" width="100%">
						<tr>

							<th>图书分类ID</th>
							<th>分类名称</th>
							<th>操作</th>
						</tr>


						<c:forEach items="${booktypes}" var="booktype">
							<tr>								
									
									
									<td>${booktype.id}</td>
									
									<td>${booktype.booktype}</td>
										
									<td><a class="link-update" href="bookTypeManager_updatejsp?id=${booktype.id}">修改</a>
									<a class="link-del" href="bookTypeManager_delete?id=${booktype.id}">删除</a></td>
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