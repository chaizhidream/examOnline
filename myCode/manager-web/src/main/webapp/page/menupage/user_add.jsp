<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>普通用户添加</title>
		<!-- 导入jquery核心类库 -->
		<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
		<!-- 导入easyui类库 -->
		<link rel="stylesheet" type="text/css" href="../../js/easyui/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="../../js/easyui/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="../../js/easyui/ext/portal.css">
		<link rel="stylesheet" type="text/css" href="../../css/default.css">
		<script type="text/javascript" src="../../js/easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="../../js/easyui/ext/jquery.portal.js"></script>
		<script type="text/javascript" src="../../js/easyui/ext/jquery.cookie.js"></script>
		<script src="../../js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(function(){
				// 点击保存
				$('#save').click(function(){
					if($("#menuForm").form('validate')){
						// 通过校验 
						$("#menuForm").submit();
					}
				});
				$("#userid").focusout(function() {
					var quesId = $("#userid").val();
					if(quesId != null && quesId != '') {
						checkName(quesId);
					}
				});

				function checkName(userid) {
					$.ajax({
						url: '/manager-web/check/checkUserId',
						type: "post",
						dataType: 'JSON',
						data: {
							userid: userid
						},
						success: function(result) {
							//已经存在该名字提示用户
							if(result == "false") {
								$("#errorMsg").html("<font color='red'>该学号已经存在,请重新输入!</font>");
							}else{
								$("#errorMsg").html("");
							}
						}
					});
				}
				$("#loginName").focusout(function() {
					var quesId = $("#loginName").val();
					if(quesId != null && quesId != '') {
						checkName2(quesId);
					}
				});

				function checkName2(loginName) {
					$.ajax({
						url: '/manager-web/check/checkLoginName',
						type: "post",
						dataType: 'JSON',
						data: {
							loginName: loginName
						},
						success: function(result) {
							//已经存在该名字提示用户
							if(result == "false") {
								$("#errorMsg2").html("<font color='red'>该登陆名已经存在,请重新输入!</font>");
							}else{
								$("#errorMsg2").html("");
							}
						}
					});
				}
			});
		</script>
	</head>

	<body class="easyui-layout">
		<div data-options="region:'north'">
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true">保存</a>
			</div>
		</div>
		<div data-options="region:'center'">
			<form id="menuForm" method="post" action="/manager-web/admin/addUser">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">用户信息</td>
					</tr>
					<tr>
						<td>学号</td>
						<td>
							<input type="text" id="userid" name="id" class="easyui-numberbox" data-options="required:true" />
							<span id='errorMsg'>
						</td>
					</tr>
					<tr>
						<td>姓名</td>
						<td>
							<input type="text" name="name" class="easyui-validatebox" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>密码</td>
						<td>
							<input type="text" name="password" class="easyui-validatebox" data-options="required:true" />
						</td>
					</tr>
					<tr>
						<td>登陆名</td>
						<td>
							<input type="text" id="loginName" name="loginName" class="easyui-validatebox" data-options="required:true" />
							<span id='errorMsg2'>
						</td>
					</tr>
					<tr>
						<td>备注</td>
						<td>
							<input type="text" name="state" class="easyui-validatebox" data-options="required:true"/>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>

</html>