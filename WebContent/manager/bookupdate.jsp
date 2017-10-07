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
					href="/jscss/admin/design/">图书管理</a><span class="crumb-step">&gt;</span><span>修改图书</span>
			</div>
		</div>
		<div class="result-wrap">
			<div class="result-content">


				<table class="insert-tab" width="100%">
					<tbody>
						<s:form action="bookManager_update" method="post" namespace="/"
							theme="simple">
							<s:hidden name="id" value="%{model.id}" />
							<s:hidden name="img" value="%{model.img}" />
							<tr>
								<th width="120"><i class="require-red">*</i>分类：</th>
								<td><s:select theme="simple" name="booktype.id"
										value="%{model.booktype.id}" list="booktypes" listKey="id"
										listValue="booktype">
									</s:select></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>图书名称：</th>
								<td><s:textfield name="bookname"
										class="common-text required" size="50"
										value="%{model.bookname}"></s:textfield></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>图书单价：</th>
								<td><s:textfield name="price" value="%{model.price}"></s:textfield></td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>图书库存：</th>
								<td><s:textfield name="stock" value="%{model.stock}"></s:textfield></td>
							</tr>
							<tr>
								<th>图书封面：</th>
								<td><img style="height: 180px; width: 300px;"
									src="${pageContext.request.contextPath}/file/<s:property value="%{model.img}"/>"></td>
							</tr>


							<tr>
								<th></th>
								<td><input class="btn btn-primary btn6 mr10" value="发布"
									type="submit"> <input class="btn btn6"
									onclick="history.go(-1)" value="返回" type="button"></td>
							</tr>
							<tr>
							<th>&nbsp;</th>
							<td>&nbsp;</td>
						</tr>
							
						</s:form>

						<form action="upload_upload" method="post" enctype="multipart/form-data">
							
							<s:hidden name="id" value="%{model.id}" />
								
							
						<tr>
							<th>修改图书封面:</th>
							<td>
							
									<input  type="file" name="file">
									<input class="btn btn-primary btn6 mr10" value="修改图书封面"
									type="submit"> 
							
							</td>
						</tr>

						</form>
					</tbody>
				</table>



			</div>
		</div>
	</div>
</body>
</html>