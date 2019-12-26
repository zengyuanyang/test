<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/admin/css/left.css" rel="stylesheet" type="text/css">
</head>
<body>
<table width="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="12"></td>
  </tr>
</table>
<table width="100%" border="0">
  <tr>
    <td>
<div class="dtree">

	<a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>
	<link rel="StyleSheet" href="${pageContext.request.contextPath}/admin/css/dtree.css" type="text/css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/admin/js/dtree.js"></script>
	<script type="text/javascript">
		//1.创建一个dTree对象
		d = new dTree("d");
		//第一个参数：当前节点ID。第二个参数：父级节点 -1根节点。 第三个参数：节点名称
		d.add(0,-1,'系统菜单');
		d.add(1,0,"商品管理");
		//第一个参数：当前节点ID。第二个参数：父级节点 -1根节点。 第三个参数：节点名称
		//第四个参数：访问地址  第五个参数：提示信息。第六个参数：目标位置
		d.add(1.1,1,"显示所有商品",'${pageContext.request.contextPath}/admin/products/servlet/showAllProducts.action','点击查看','mainFrame');
		d.add(1.2,1,"添加商品",'${pageContext.request.contextPath}/admin/products/servlet/showCategory.action','点击查看','mainFrame');
		d.add(1.3,1,"修改商品",'${pageContext.request.contextPath}/admin/products/servlet/showAllProducts.action','点击查看','mainFrame');
		d.add(1.4,1,"批量删除",'${pageContext.request.contextPath}/admin/products/batchDel.jsp','点击查看','mainFrame');
		d.add(2,0,"类型管理");
		d.add(2.1,2,"显示所有类型",'${pageContext.request.contextPath}/admin/category/servlet/showAllCategory.action','点击查看','mainFrame');
		d.add(2.2,2,"添加类型",'${pageContext.request.contextPath}/admin/category/add.jsp','点击查看','mainFrame');
		d.add(2.3,2,"修改类型",'${pageContext.request.contextPath}/admin/category/servlet/showAllCategory.action','点击查看','mainFrame');
		d.add(2.4,2,"批量删除",'${pageContext.request.contextPath}/admin/category/batchDel.jsp','点击查看','mainFrame');
		document.write(d);
	</script>
</div>	
</td>
  </tr>
</table>
</body>
</html>
