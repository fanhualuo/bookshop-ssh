<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/manager/css/common.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/manager/css/main.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/manager/js/libs/modernizr.min.js"></script>
<title></title>
</head>
<body>

	<div class="main-wrap">

		<div class="crumb-wrap">
			<div class="crumb-list">
				<i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span
					class="crumb-step">&gt;</span><a class="crumb-name"
					href="/jscss/admin/design/">用户管理</a><span class="crumb-step">&gt;</span><span>用户修改</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">

				<table class="insert-tab" width="100%">
					<tbody>
						<s:form action="userManager_update" method="post" namespace="/"
							theme="simple">
							<s:hidden name="id" value="%{model.id}" />

							<tr>
								<th width="120"><i class="require-red">*</i>用户名：</th>
								<td><s:textfield size="50" class="common-text required"
										name="username" value="%{model.username}"></s:textfield></td>
							</tr>

							<tr>
								<th><i class="require-red">*</i>密码：</th>
								<td><s:textfield size="50" class="common-text required"
										name="password" value="%{model.password}"></s:textfield></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>密保问题：</th>
								<td><s:textfield size="50" class="common-text required"
										name="question" value="%{model.question}"></s:textfield></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>密保答案：</th>
								<td><s:textfield size="50" class="common-text required"
										name="answer" value="%{model.answer}"></s:textfield></td>
							</tr>

							<tr>
								<th><i class="require-red">*</i>权限：</th>
								<td><s:textfield size="50" class="common-text required"
										name="quanxian" value="%{model.quanxian}"></s:textfield></td>
							</tr>

							<tr>
								<th></th>
								<td><input class="btn btn-primary btn6 mr10" value="发布"
									type="submit"> <input class="btn btn6"
									onclick="history.go(-1)" value="返回" type="button"></td>
							</tr>
						</s:form>
					</tbody>
				</table>

			</div>
		</div>

	</div>
</body>
</html>