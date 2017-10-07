<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书显示</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/manager/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/manager/css/main.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/manager/js/libs/modernizr.min.js"></script>



</head>
<body>

	<div class="main-wrap">

		<div class="crumb-wrap">
			<div class="crumb-list">
				&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="${pageContext.request.contextPath}/order_show">${user.username}的个人信息</a>
				&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/user_logon">退出</a>
				<div
					style="display: inline; width: 100%; font-size: 20px; margin-left: 200px; text-align: center;">查询图书</div>
			</div>
		</div>
		<div class="search-wrap">
			<div class="search-content">
				<table class="search-tab">
					<tr>
						<th width="90">分类查询:</th>
						<form action="book_findtype" method="post">
							<td><s:select theme="simple" name="booktype1"
									list="booktypes" listKey="id" listValue="booktype"
									headerKey="1" headerValue="请--选--择">
								</s:select></td>

							<td><input class="btn btn-primary btn2" type="submit"
								value="查找"></td>
						</form>

						<th width="70">关键字:</th>
						<form action="book_findname" method="post">

							<td><input placeholder="关键字查询" name="bookname" type="text"></td>
							<td><input class="btn btn-primary btn2" name="sub"
								value="查询" type="submit"></td>

						</form>


						<td><a class="btn btn-primary btn2" href="book_findall">查询所有图书</a>
						</td>
						<td><a class="btn btn-primary btn2"
							href="${pageContext.request.contextPath}/gouwuche_show">显示购物车</a></td>
					</tr>
				</table>
			</div>
		</div>
		<div class="result-wrap">
			<form name="myform" id="myform" method="post">
				<br />
				<div class="result-content">
					<table class="result-tab" width="100%">
						<tr>
							<th>标签ID</th>
							<th>名称</th>
							<th>分类</th>
							<th>价格</th>
							<th>库存</th>
							<th>封面</th>
							<th>下载封面</th>
							<th>加入购物车</th>
						</tr>
						<tr>

							<s:iterator value="books" var="book">
								<tr>
									<th><s:property value="#book.id" /></th>
									<th><s:property value="#book.bookname" /></th>
									<th><s:property value="#book.booktype.booktype" /></th>
									<th><s:property value="#book.price" /></th>
									<th><s:property value="#book.stock" /></th>
									<th><img id="img" style="height: 180px; width: 300px;" src="${pageContext.request.contextPath}/file/<s:property value="#book.img"/>">
									</th>
									<th><a href="javascript:void(0)" onclick="button2('${book.img}')" class="link-update">下载封面</a></th>
									<th><a href="javascript:void(0)" onclick="button1('${book.id}','${book.bookname}' )" class="link-update">加入购物车</a></th>
								</tr>
							</s:iterator>


						</tr>

					</table>
					<div class="list-page">1 页</div>
				</div>
			</form>
		</div>
	</div>

	<script type="text/javascript">
		function button1(bookid, bookname) {
			alert("《" + bookname + "》已经加入购物车");
			//form.action = "gouwuche_save?bookid=" + bookid + " ";
			var f = document.forms[0];
			f.action = "gouwuche_save?bookid=" + bookid + " ";
			f.submit();
		}

		function CheckImgExists(imgurl) {
			var ImgObj = new Image(); //判断图片是否存在  
			ImgObj.src = imgurl;
			//没有图片，则返回-1  
			if (ImgObj.fileSize > 0 || (ImgObj.width > 0 && ImgObj.height > 0)) {
				return true;
			} else {
				return false;
			}
		}

		function button2(img) {
			if (!CheckImgExists("${pageContext.request.contextPath}/file/"
					+ img + "")) { //如果图片不存在
				location.href = "downLoad_download?fileFileName=default.jpeg";
			} else {
				location.href = "downLoad_download?fileFileName=" + img + "";
			}

		}
	</script>

</body>
</html>