<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<style type="text/css">
div {
	height: 50px;
	line-height: 50px;
	font-weight: 600;
	font-size: 20px;
}

.lefttext {
	float: left;
	width: 216px;
	margin-left: 24px;
}

.left {
	float: left;
}

.right {
	
}

.r1 {
	width: 70%;
	float: left;
	text-align: center;
}

.r2 {
	float: left;
}

a {
	color: #fff;
	text-decoration: none;
}
</style>
</head>
<body style="border: 0px; margin: 0; padding: 0; background-color: #808080; color: #fff;">

	<div class="left">
		<span class="lefttext" style="">欢迎用户</span>
	</div>
	<div class="right">
		<div class="r1">
			<span>欢迎使用图书商城系统后台管理系统</span>
		</div>
		<div class="r2">
			<span><a href="${pageContext.request.contextPath}/user_logon" target="_top">退出</a></span>
		</div>
	</div>

</body>
</html>



