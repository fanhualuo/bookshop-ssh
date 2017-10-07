<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>注册</title>

<link rel="stylesheet" href="assets/css/login.css" />
<style>
.header {
	text-align: center;
}

.header h1 {
	font-size: 200%;
	color: #333;
	margin-top: 30px;
}

.header p {
	font-size: 14px;
}
</style>


</head>
<body>
	<div class="header">
		<div class="am-g">
			<h1>注册</h1>
			
		</div>
		<hr />
	</div>
	<div class="am-g">
		<div style="width: 30%; margin: auto;">
			

			<form action="user_zhuce" class="am-form" method="post">
				<label>账号:</label> <input type="text" name="username"> <br>
				<label>密码:</label> <input type="password" name="password"> <br>
				<label>密保问题:</label> <input type="text" name="question"> <br>
				<label>答案:</label> <input type="text" name="answer"> <br>
				<br />
				<div class="am-cf">
					<input type="submit" name="" value="注册"
						class="am-btn am-btn-primary am-btn-sm am-fl"> 
						<a href="index.jsp" class="am-btn am-btn-default am-btn-sm am-fr">登录</a> 

				</div>
			</form>
			<hr>
			<p>${date}</p>
		</div>
	</div>
</body>
</html>
