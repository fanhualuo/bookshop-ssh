<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>登录</title>

  <link rel="stylesheet" href="assets/css/login.css"/>
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
    <h1>欢迎使用图书商城系统</h1>
    <p>管理端登陆</p>
  </div>
  <hr />
</div>
<div class="am-g">   
    <div style="width:30%;margin:auto;">
        <h2 style="text-align:center;">登录</h2>

        <form action="userManager_login" class="am-form" method="post">
            <label>账号:</label>
            <input type="text" name="username">
            <br>
            <label>密码:</label>
            <input type="password" name="password">
            <br>
            <br />
            <div class="am-cf">
                <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">

            </div>
        </form>
        <hr>
        <p><s:actionerror/></p>
    </div>
</div>
</body>
</html>
