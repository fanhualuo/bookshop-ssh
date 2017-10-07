<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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
				<i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span
					class="crumb-step">&gt;</span><a class="crumb-name"
					href="/jscss/admin/design/">订单管理</a><span class="crumb-step">&gt;</span><span>修改订单</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">
				<s:form action="orderManager_update" method="post" namespace="/"
					theme="simple">
					<s:hidden name="id" value="%{model.id}" />
					<s:hidden name="book.id" value="%{model.book.id}"></s:hidden>
					<s:hidden name="user.id" value="%{model.user.id}"></s:hidden>
					<table class="insert-tab" width="100%">
						<tbody>

							<tr>
								<th width="120"><i class="require-red">*</i>订单用户名：</th>
								<td>
									<s:property  value="%{model.user.username}" />
									</td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>订单图书：</th>
								<td><s:property value="%{model.book.bookname}" /></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>联系方式：</th>
								<td><s:textfield class="common-text required" size="50" name="phone" value="%{model.phone}"></s:textfield></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>地址：</th>
								<td><s:textfield class="common-text required" size="50" name="address" value="%{model.address}"></s:textfield></td>
							</tr>

							<tr>
								<th><i class="require-red">*</i>状态：</th>
								<td><s:textfield class="common-text required" size="50" name="zhuangtai" value="%{model.zhuangtai}"></s:textfield></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>数量：</th>
								<td> <s:textfield class="common-text required" size="50" name="number" value="%{model.number}"></s:textfield></td>
							</tr>

							<tr>
								<th></th>
								<td><input class="btn btn-primary btn6 mr10" value="发布"
									type="submit"> <input class="btn btn6"
									onclick="history.go(-1)" value="返回" type="button"></td>
							</tr>
						</tbody>
					</table>
				</s:form>
			</div>
		</div>

	</div>
</body>
</html>