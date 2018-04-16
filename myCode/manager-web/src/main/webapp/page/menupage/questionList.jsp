<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">
		<title>题目列表</title>
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
			var toolbar = [{
				id: 'button-exit',
				text: '修改',
				iconCls: 'icon-edit',
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
			}];

			// 定义标题栏
			var columns = [
				[{
						field: 'quesId',
						title: '题目编号',
						width: 100
					},
					{
						field: 'quesLevel',
						title: '题目等级',
						width: 75
					},
					{
						field: 'quesContent',
						title: '题目内容',
						width: 300
					}, {
						field: 'chOptiona',
						title: '选项a',
						width: 200
					}, {
						field: 'chOptionb',
						title: '选项b',
						width: 200
					}, {
						field: 'chOptionc',
						title: '选项c',
						width: 200
					}, {
						field: 'chOptiond',
						title: '选项d',
						width: 200
					}, {
						field: 'juAnswer',
						title: '判断题答案',
						width: 75
					}, {
						field: 'chAnswer',
						title: '选择题答案',
						width: 75
					},
					{
						field: 'state',
						title: '题目状态',
						width: 75
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
					pageList: [30, 50, 100],
					pagination: true,
					toolbar: toolbar,
					url: "/manager-web/adminExam/showQuestions",
					idField: 'quesId',
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
				window.location.href = "/manager-web/page/menupage/question_add.jsp";
			}

			function doExit() {
				var questionList = $('#grid').datagrid('getSelected');
				console.info(questionList);
				window.location.href = "/manager-web/page/menupage/question_exit.jsp?quesId=" + questionList.quesId + "&quesLevel=" + questionList.quesLevel + "&quesContent=" + questionList.quesContent + 
				"&chOptiona=" + questionList.chOptiona + "&chOptionb=" + questionList.chOptionb + "&chOptionc=" + questionList.chOptionc + "&chOptiond=" + questionList.chOptiond + "&juAnswer=" + 
				questionList.juAnswer + "&chAnswer=" + questionList.chAnswer + "&state=" + questionList.state;
			}

			function doDelete() {
				var ids = [];
				var items = $('#grid').datagrid('getSelections');
				console.log(items)
				if(items.length == 0) {
					$.messager.alert("警告", "删除用户必须选中一条以上数据", "warning");
				} else {
					for(var i = 0; i < items.length; i++) {
						ids.push(items[i].quesId);
					}

					window.location.href = "/manager-web/adminExam/deleteQuestions?ids=" + ids;
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