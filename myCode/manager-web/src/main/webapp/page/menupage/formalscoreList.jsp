<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">
		<title>自测试题列表</title>
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
			// 工具栏
			/*var toolbar = [{
				id: 'button-view',
				text: '查看',
				iconCls: 'icon-search',
				handler: doView
			}, {
				id: 'button-exit',
				text: '修改',
				iconCls: 'icon-ok',
				handler: doExit
			}, {
				id: 'button-add',
				text: '新增',
				iconCls: 'icon-add',
				handler: doAdd
			}, {
				id: 'button-delete',
				text: '删除',
				iconCls: 'icon-cancel',
				handler: doDelete
			}];*/

			// 定义标题栏
			var columns = [
				[{
						field: 'userId',
						title: '考生学号',
						width: 200
					},
					{
						field: 'userName',
						title: '考生姓名',
						width: 200
					},
					{
						field: 'score',
						title: '考试成绩',
						width: 200
					},
					{
						field: 'examDate',
						title: '考试时间',
						width: 200
					},
					{
						field: 'state',
						title: '状态',
						width: 200
					}
				]
			];
			$(function() {
				// 初始化 datagrid
				// 创建grid
				$('#grid').datagrid({
					iconCls: 'icon-forward',
					fit: true,
					border: false,
					rownumbers: true,
					striped: true,
					pageList: [30,50,100],
					pagination : true,
					toolbar: toolbar,
					url: "/manager-web/adminScore/showFormalScore",
					idField: 'id',
					columns: columns,
					onClickRow: onClickRow,
					onDblClickRow: doDblClickRow
				});

				$("body").css({
					visibility: "visible"
				});

			});
			// 双击
			function doDblClickRow(rowIndex, rowData) {
				var items = $('#grid').datagrid('selectRow', rowIndex);
				doView();
			}
			// 单击
			function onClickRow(rowIndex) {

			}

			function doAdd() {
				window.location.href = "/manager-web/page/menupage/user_add.jsp";
			}

			function doView() {
				var userList = $('#grid').datagrid('getSelected');
				console.info(userList);
				window.location.href = "/manager-web/page/menupage/user_exit.jsp?userid=" + userList.id + "&loginName=" + userList.loginName + "&name=" + userList.name + "&password=" + userList.password + "&state=" + userList.state;
			}

			function doExit() {
				var userList = $('#grid').datagrid('getSelected');
				console.info(userList);
				window.location.href = "/manager-web/page/menupage/user_exit.jsp?userid=" + userList.id + "&loginName=" + userList.loginName + "&name=" + userList.name + "&password=" + userList.password + "&state=" + userList.state;
			}

			function doDelete() {
				var ids = [];
				var items = $('#grid').datagrid('getSelections');
				if(items.length == 0) {
					$.messager.alert("警告", "删除用户必须选中一条以上数据", "warning");
				} else {
					for(var i = 0; i < items.length; i++) {
						ids.push(items[i].id);
					}

					window.location.href = "/manager-web/admin/deleteUser?ids=" + ids;
				}

			}
		</script>
	</head>

	<body class="easyui-layout" style="visibility:hidden;">
		<div region="center" border="false">
			<table id="grid"></table>
		</div>
	</body>

</html>