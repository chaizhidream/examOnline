<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>普通用户修改</title>
		<!-- 导入jquery核心类库 -->
		<script type="text/javascript" src="/manager-web/js/jquery-1.8.3.js"></script>
		<!-- 导入easyui类库 -->
		<link rel="stylesheet" type="text/css" href="/manager-web/js/easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="/manager-web/js/easyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="/manager-web/js/easyui/ext/portal.css">
		<link rel="stylesheet" type="text/css" href="/manager-web/css/default.css">
		<script type="text/javascript" src="/manager-web/js/easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="/manager-web/js/easyui/ext/jquery.portal.js"></script>
		<script type="text/javascript" src="/manager-web/js/easyui/ext/jquery.cookie.js"></script>
		<script src="/manager-web/js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(function(){
				// 点击保存
				$('#save').click(function(){
					if($("#menuForm").form('validate')){
						// 通过校验 
						$("#menuForm").submit();
					}
				});
			});
		</script>
	</head>

	<body class="easyui-layout">
		<div data-options="region:'north'">
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true">更改</a>
			</div>
		</div>
		<div data-options="region:'center'">
			<form id="menuForm" method="post" action="/manager-web/admin/exitUser">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">用户信息</td>
					</tr>
					<tr>
						<td>学号</td>
						<td>
							<input type="text" name="id" class="easyui-validatebox" value="<%=request.getParameter("userid")%>" data-options="required:true" readonly="readonly"/>
						</td>
					</tr>
					<tr>
						<td>姓名</td>
						<td>
							<input type="text" name="name" class="easyui-validatebox" value="<%=request.getParameter("name")%>" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>密码</td>
						<td>
							<input type="text" name="password" class="easyui-validatebox" value="<%=request.getParameter("password")%>" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>登陆名</td>
						<td>
							<input type="text" name="loginName" class="easyui-validatebox" value="<%=request.getParameter("loginName")%>" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>备注</td>
						<td>
							<input type="text" name="state" class="easyui-validatebox" value="<%=request.getParameter("state")%>" data-options="required:true"/>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>

</html>