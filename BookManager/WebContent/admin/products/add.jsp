<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/admin/css/Style.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/add.js"></script>

</HEAD>

<body>
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/products/servlet/addBook.action" method="post"
		enctype="application/x-www-form-urlencoded" onsubmit="return checkForm()">
		&nbsp;
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>添加商品</STRONG> </strong>
				</td>
			</tr>


			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01" >商品名称：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="bookName" id="bookName" class="bg"/>
					<span id="errorName" style="color:red; font-size: 12px;display:none">商品名3-12位</span>
				</td>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品价格：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="bookPrice" id="bookPrice"
					class="bg" />
					<span id="errorPrice" style="color:red; font-size: 12px;display:none">商品价格精确到小数点后两位</span>
				</td>
			</tr>
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品数量：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="bookNum" id="bookNum"
					class="bg" />
					<span id="errorNum" style="color:red; font-size: 12px;display:none">商品数量为正整数</span>
				</td>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品类别：</td>
				<td class="ta_01" bgColor="#ffffff">
				<!-- 改为动态显示图书类型 -->
				<!-- begin 2019-12-06 显示类型 WANGLEI  -->
				<select name="categoryId"
					id="category">
						<option value="0" selected="selected">--选择商品类加--</option>
						<c:forEach var="category" items="${listCategory}">
							<option value="${category.categoryId}">${category.categoryName}</option>
						</c:forEach>
						
				</select>
				<!-- end 2019-12-06 显示类型 WANGLEI  -->
				</td>
			</tr>


			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品图片：</td>
				<td class="ta_01" bgColor="#ffffff" colSpan="3">
				<input
					type="file" name="bookImage" size="30" value="bookcover/fish.jpg"/>
				</td>
			</tr>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">商品描述：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea
						name="bookDescription" cols="30" rows="3" 
						style="WIDTH: 96%"></textarea>
				</TD>
			</TR>
			<TR>
				<td align="center" colSpan="4" class="sep1"><img
					src="${pageContext.request.contextPath}/admin/images/shim.gif">
				</td>
			</TR>


			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe" colSpan="4">
					
					
						
					<input type="submit" class="button_ok" value="确定">	
						
					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					
					
					
					<input type="reset" value="重置" class="button_cancel">

					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT> <INPUT
					class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
					<span id="Label1">
					
					</span>
				</td>
			</tr>
		</table>
	</form>
</body>
</HTML>