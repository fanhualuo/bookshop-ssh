<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书商城系统后台管理</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/manager/css/common.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/manager/css/main.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/manager/js/libs/modernizr.min.js"></script>
</head>
<frameset rows="50,*" frameborder="no" >
    <frame src="shang.jsp" name="top" scrolling="no">
        <frameset cols="300,*">
            <frame src="zuo.html" name="zuo" scrolling="no">
            <frame src="userManager_find" name="right" scrolling="no">
        </frameset>
</frameset>
</html>