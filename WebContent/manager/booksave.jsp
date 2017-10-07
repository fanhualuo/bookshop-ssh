<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
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
				<i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span
					class="crumb-step">&gt;</span><a class="crumb-name"
					href="/jscss/admin/design/">图书管理</a><span class="crumb-step">&gt;</span><span>新增图书</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<form action="bookManager_save" method="post">
					<table class="insert-tab" width="100%">
						<tbody>
							<tr>
								<th width="120"><i class="require-red">*</i>分类：</th>
								<td>
								 
								
								<s:select theme="simple" name="booktype.id" class="required" list="booktypes" listKey="id" listValue="booktype" headerValue="----请选择----" headerKey="1"></s:select>
								
								</td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>图书名称：</th>
								<td><input class="common-text required" size="50" type="text" name="bookname" /></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>图书单价：</th>
								<td><input class="common-text required" size="50" type="text" name="price"  /></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>图书库存：</th>
								<td><input class="common-text required" size="50" type="text" name="stock" /></td>
							</tr>
							<tr>
								<th>图书简介：</th>
								<td><textarea name="content" class="common-textarea"
										id="content" cols="30" style="width: 98%;" rows="10"></textarea></td>
							</tr>
							<tr>
								<th></th>
								<td><input class="btn btn-primary btn6 mr10" value="发布"
									type="submit"> <input class="btn btn6"
									onclick="history.go(-1)" value="返回" type="button"></td>
							</tr>
						</tbody>
					</table>
				</form>
			</div>
		</div>

	</div>
</body>
</html>