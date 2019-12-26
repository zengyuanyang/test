<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/admin/css/Style.css"
	type="text/css" rel="stylesheet">
<script language="javascript"
	src="${pageContext.request.contextPath}/admin/js/public.js"></script>
<script language="javascript"
	src="${pageContext.request.contextPath}/admin/js/check.js"></script>

</HEAD>
<script type="text/javascript">
	//设置类别的默认值
	function setProductCategory(t) {
		var category = document.getElementById("category");

		var ops = category.options;
		for ( var i = 0; i < ops.length; i++) {

			if (ops[i].value == t) {
				ops[i].selected = true;
				return;
			}
		}

	};
</script>
<body>
	<form id="userAction_save_do" name="Form1"
		action="${pageContext.request.contextPath}/admin/products/servlet/edit.action" method="post">
		<input type="hidden" name="bookId" value="${requestScope.book.bookId}">
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>编辑商品</STRONG> </strong></td>
			</tr>


			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品名称：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="bookName" class="bg" value="${requestScope.book.bookName}"  /></td>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品价格：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="bookPrice" class="bg" value="${requestScope.book.bookPrice}"  /></td>
			</tr>
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品数量：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="bookNum" class="bg"  value="${requestScope.book.bookNum}"/></td>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品类别：</td>
				
				<td class="ta_01" bgColor="#ffffff"><select name="categoryId"
					id="category">
						<option value="0">--选择商品类加--</option>
						
						<c:forEach var="category" items="${listCategory}">
							<c:if test="${category.categoryId==requestScope.book.category.categoryId}">
								<option value="${category.categoryId}"  selected="selected">${category.categoryName}</option>
							</c:if>
							<c:if test="${category.categoryId!=requestScope.book.category.categoryId}">
								<option value="${category.categoryId}">${category.categoryName}</option>
							</c:if>
							
						</c:forEach>
				</select></td>
			</tr>


			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">商品图片：</td>
				<td class="ta_01" bgColor="#ffffff" colSpan="3"><input
					type="file" name="bookImage" size="30" value="" /></td>
			</tr>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">商品描述：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3"><textarea
						name="bookDescription"  cols="30" rows="3" style="WIDTH: 96%">${requestScope.book.bookDescription}</textarea>
				</TD>
			</TR>
			<TR>
				<td align="center" colSpan="4" class="sep1"><img
					src="${pageContext.request.contextPath}/admin/images/shim.gif">
				</td>
			</TR>


			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe" colSpan="4"><input type="submit"
					class="button_ok" value="确定"> <FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>



					<input type="reset" value="重置" class="button_cancel"> <FONT
					face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT> <INPUT
					class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
					<span id="Label1"> </span></td>
			</tr>
		</table>
	</form>




</body>
</HTML>